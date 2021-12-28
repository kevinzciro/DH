# Parte 1

# 1. Obtener el nombre y apellido de los primeros 5 actores disponibles. Utilizar
# alias para mostrar los nombres de las columnas en español.

select concat(first_name, ' ', last_name) as 'Nombre completo' from actor
limit 5;

# 2. Obtener un listado que incluya nombre, apellido y correo electrónico de los
# clientes (customers) inactivos. Utilizar alias para mostrar los nombres de las columnas en español.

select concat(first_name, ' ', last_name) as 'Nombre completo', email 'Correo' from customer
where active = 0;

# 3. Obtener un listado de films incluyendo título, año y descripción de los films
# que tienen un rental_duration mayor a cinco. Ordenar por rental_duration de
# mayor a menor. Utilizar alias para mostrar los nombres de las columnas en
# español.

select title 'Titulo', 
release_year 'Año lanzamiento', 
description 'Descripcion' 
from film
where rental_duration > 5
order by rental_duration desc;

# 4. Obtener un listado de alquileres (rentals) que se hicieron durante el mes de
# mayo de 2005, incluir en el resultado todas las columnas disponibles.

select * 
from rental
where rental_date like '2005-05-%';

# Parte 2

# 1. Obtener la cantidad TOTAL de alquileres (rentals). Utilizar un alias para
# mostrarlo en una columna llamada “cantidad”.

select count(*) 'Cantidad' from rental;

# 2. Obtener la suma TOTAL de todos los pagos (payments). Utilizar un alias para
# mostrarlo en una columna llamada “total”, junto a una columna con la
# cantidad de alquileres con el alias “Cantidad” y una columna que indique el
# “Importe promedio” por alquiler.

select sum(pay.amount) 'Total', 
count(ren.rental_id) 'Cantidad', 
avg(pay.amount) 'Importe promedio'  
from payment pay
inner join rental ren on ren.rental_id = pay.rental_id;

# 3. Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes
# que más dinero gastan y en cuántos alquileres lo hacen?

select concat(cus.first_name, ' ', cus.last_name) 'Nombre completo', 
sum(pay.amount) 'Total', 
count(ren.rental_id) 'Cantidad'
from payment pay
inner join customer cus on cus.customer_id = pay.customer_id
inner join rental ren on ren.rental_id = pay.rental_id
group by pay.customer_id
order by Total desc
limit 10;

# 4. Generar un reporte que indique: ID de cliente, cantidad de alquileres y monto
# total para todos los clientes que hayan gastado más de 150 dólares en
# alquileres.

select cus.customer_id 'ID de cliente', 
sum(pay.amount) 'Total', 
count(ren.rental_id) 'Cantidad'
from payment pay
inner join customer cus on cus.customer_id = pay.customer_id
inner join rental ren on ren.rental_id = pay.rental_id
group by pay.customer_id
having Total > 150;

# 5. Generar un reporte que muestre por mes de alquiler (rental_date de tabla
# rental), la cantidad de alquileres y la suma total pagada (amount de tabla
# payment) para el año de alquiler 2005 (rental_date de tabla rental).

select extract(month from ren.rental_date) 'Mes de renta',
sum(pay.amount) 'Total',
count(ren.rental_id) 'Cantidad'
from rental ren
inner join payment pay on ren.rental_id = pay.payment_id
where extract(year from ren.rental_date) = 2005
group by extract(month from ren.rental_date);

# 6. Generar un reporte que responda a la pregunta: ¿cuáles son los 5
# inventarios más alquilados? (columna inventory_id en la tabla rental). Para
# cada una de ellas indicar la cantidad de alquileres.

select inv.inventory_id 'ID de inventario',
count(ren.inventory_id) 'Cantidad'
from inventory inv
inner join rental ren on ren.inventory_id = inv.inventory_id
group by inv.inventory_id
order by Cantidad desc
limit 5;