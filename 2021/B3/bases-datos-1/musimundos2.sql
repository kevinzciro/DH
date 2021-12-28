# 1. Listar las canciones cuya duración sea mayor a 2 minutos.
select nombre 'Nombre', milisegundos/(1000*60) 'Duracion minutos' 
from canciones
where milisegundos/(1000*60) > 2;

# 2. Listar las canciones cuyo nombre comience con una vocal.
select nombre 'Nombre' 
from canciones
where nombre like 'a%' 
or nombre like 'e%' 
or nombre like 'i%' 
or nombre like 'o%' 
or nombre like 'u%';

# 3.  Listar las canciones ordenadas por compositor en forma descendente.
# Luego, por nombre en forma ascendente. Incluir únicamente aquellas
# canciones que tengan compositor.
select nombre 'Nombre', compositor 'Compositor' 
from canciones
order by nombre desc;

select nombre 'Nombre', compositor 'Compositor' 
from canciones
order by nombre asc;

select nombre 'Nombre', compositor 'Compositor' 
from canciones
where compositor is not null
order by nombre;

# 4. a) Listar la cantidad de canciones de cada compositor.
select compositor 'Compositor', count(*) 'Cantidad canciones'
from canciones
group by compositor;

# b) Modificar la consulta para incluir únicamente los compositores que tengan más de 10 canciones.
select compositor 'Compositor', count(*) 'Cantidad canciones'
from canciones
group by compositor
having count(*)>10;


# 5. a) Listar el total facturado agrupado por ciudad.
select ciudad_de_facturacion 'Ciudad', sum(total) 'Total'
from facturas
group by  ciudad_de_facturacion;

# b) Modificar el listado del punto (a) mostrando únicamente las ciudades de Canadá.
select ciudad_de_facturacion 'Ciudad', sum(total) 'Total'
from facturas
where ciudad_de_facturacion = 'Madrid';

# c) Modificar el listado del punto (a) mostrando únicamente las ciudades con una facturación mayor a 38.
select ciudad_de_facturacion 'Ciudad', sum(total) 'Total'
from facturas
group by ciudad_de_facturacion
having Total > 38;

# d) Modificar el listado del punto (a) agrupando la facturación por país, y luego por ciudad.
select pais_de_facturacion 'Pais', sum(total) 'Total'
from facturas
group by  Pais;

# 6. a) Listar la duración mínima, máxima y promedio de las canciones.
select  min(milisegundos/(1000*60)) 'Duracion minima', 
max(milisegundos/(1000*60)) 'Duracion maxima', 
avg(milisegundos/(1000*60)) 'Duracion promedio'
from canciones;

# b) Modificar el punto (a) mostrando la información agrupada por género.
select  gen.nombre,
min(can.milisegundos/(1000*60)) 'Duracion minima', 
max(can.milisegundos/(1000*60)) 'Duracion maxima', 
avg(can.milisegundos/(1000*60)) 'Duracion promedio'
from canciones as can
inner join generos as gen on can.id_genero = gen.id
group by gen.nombre;













