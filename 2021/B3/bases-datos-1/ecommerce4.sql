use EMarket;

# Parte 1

# Clientes

# 1. Crear una vista con los siguientes datos de los clientes: ID, contacto, y el
# Fax. En caso de que no tenga Fax, colocar el teléfono, pero aclarándolo. Por
# ejemplo: “TEL: (01) 123-4567”.
create view faxClientes as 
select ClienteID, Contacto,
case
	when isnull(Fax) or Fax like '' then concat('TEL: ', Telefono)
    when Fax is not null then Fax
end as 'FAX'
from Clientes;


# 2. Se necesita listar los números de teléfono de los clientes que no tengan
# fax. Hacerlo de dos formas distintas:
# a. Consultando la tabla de clientes.

select Telefono, ClienteID from Clientes
where Fax is null  or Fax like ''; 

# b. Consultando la vista de clientes.

select * from faxClientes
where FAX like 'TEL%';

# Proveedores

# 1. Crear una vista con los siguientes datos de los proveedores: ID,
# contacto, compañía y dirección. Para la dirección tomar la dirección,
# ciudad, código postal y país.

create view provedorDir as
select 
	ProveedorID, 
	Contacto, 
    Compania, 
    concat(Direccion, ', ',  Ciudad, ', ', CodigoPostal, ', ', Pais) as 'Dir'
from Proveedores;

# 2. Listar los proveedores que vivan en la calle Americanas en Brasil. Hacerlo
# de dos formas distintas:
# a. Consultando la tabla de proveedores.

select * from Proveedores
where Direccion like '%americanas%' and Pais = 'Brazil';

# b. Consultando la vista de proveedores.
select * from provedorDir 
where Dir like '%americanas%Brazil%';

# Parte 2

# 1. Crear una vista de productos que se usará para control de stock. Incluir el ID
# y nombre del producto, el precio unitario redondeado sin decimales, las
# unidades en stock y las unidades pedidas. Incluir además una nueva
# columna PRIORIDAD con los siguientes valores:
# ■ BAJA: si las unidades pedidas son cero.
# ■ MEDIA: si las unidades pedidas son menores que las unidades en stock.
# ■ URGENTE: si las unidades pedidas no duplican el número de unidades.
# ■ SUPER URGENTE: si las unidades pedidas duplican el número de unidades en caso contrario.

create view prioridad as
select ProductoID, ProductoNombre, round(PrecioUnitario,0) as 'PrecioUnidad', UnidadesStock, UnidadesPedidas,
case
	when UnidadesPedidas = 0 then 'Baja'
    when UnidadesPedidas < UnidadesStock then 'Media'
    when UnidadesPedidas <= 2*UnidadesStock then 'Urgente'
    when UnidadesPedidas > 2*UnidadesStock then 'Super Urgente'
end as 'Prioridad'
from Productos;


# 2. Se necesita un reporte de productos para identificar problemas de stock.
# Para cada prioridad indicar cuántos productos hay y su precio promedio.
# No incluir las prioridades para las que haya menos de 5 productos.

select 
	Prioridad, 
    count(*) as `Cantidad Productos`, 
    round(avg(PrecioUnidad), 2) `Precio Promedio Producto` 
from prioridad
group by Prioridad
having count(*)>5;


