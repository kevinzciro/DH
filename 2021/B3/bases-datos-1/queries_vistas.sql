use sakila;

# 1. a) Crear una vista denominada “vista_mostrar_pais” que devuelva un reporte de los países.

create view vista_mostrar_pais as
select country 
from country;

# b) Invocar la vista creada.

select * from vista_mostrar_pais;

# 2. a) Crear una vista que devuelva un resumen con el apellido y nombre (en una
# sola columna denominada “artista”) de los artistas y la cantidad de
# filmaciones que tienen. Traer solo aquellos que tengan más de 25
# filmaciones y ordenarlos por apellido.

create view artistas_films as
select ac.actor_id 'ID_de_artista',
concat(ac.last_name, ' ', ac.first_name) 'Artista',
count(fxa.film_id) 'Cantidad_films'
from actor ac
inner join film_actor fxa on fxa.actor_id = ac.actor_id
group by(ac.actor_id)
having count(fxa.film_id) > 25
order by ac.last_name;

# b) Invocar la vista creada.

select * from artistas_films;

# c) En la misma invocación de la vista, traer aquellos artistas que tienen
# menos de 33 filmaciones.

select * from artistas_films where Cantidad_films < 33;

# d) Con la misma sentencia anterior, ahora, mostrar el apellido y nombre de
# los artistas en minúsculas y traer solo aquellos artistas cuyo apellido
# comience con la letra "a".

select lcase(Artista) 'Artista', Cantidad_films 
from artistas_films 
where Cantidad_films < 33 and Artista like 'a%';

# e) Eliminar la vista creada.

drop view artistas_films;

# 3. a) Crear una vista que devuelva un reporte del título de la película, el apellido
# y nombre (en una sola columna denominada “artista”) de los artistas y el
# costo de reemplazo. Traer solo aquellas películas donde su costo de
# reemplazo es entre 15 y 27 dólares, ordenarlos por costo de reemplazo.

create view costo_film as
select f.title,
concat(ac.last_name, ' ', ac.first_name) 'Artista',
f.replacement_cost 'Costo reemplazo'
from film f
inner join film_actor fxa on fxa.film_id = f.film_id
inner join actor ac on fxa.actor_id = ac.actor_id
where f.replacement_cost between 15 and 27
order by f.replacement_cost;

# b) Invocar la vista creada.

select * from costo_film;

# c) En la misma invocación de la vista, traer aquellas películas que comienzan
# con la letra "b".

select * from costo_film
where title like 'b%';

# d) Modificar la vista creada agregando una condición que traiga los artistas
# cuyo nombre termine con la letra "a" y ordenarlos por mayor costo de
# reemplazo.

alter view costo_film as
select f.title,
concat(ac.last_name, ' ', ac.first_name) 'Artista',
f.replacement_cost 'Costo reemplazo'
from film f
inner join film_actor fxa on fxa.film_id = f.film_id
inner join actor ac on fxa.actor_id = ac.actor_id
where ac.first_name like '%a' and f.replacement_cost between 15 and 27
order by f.replacement_cost desc;

# e) Invocar la vista creada.

select * from costo_film;