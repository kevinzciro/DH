# 1. Obtener los artistas que han actuado en una o más películas.
select concat(ar.nombre, ' ', ar.apellido) Artistas from artista ar
inner join artista_x_pelicula axp on ar.id = axp.artista_id
inner join pelicula pel on axp.pelicula_id = pel.id
group by Artistas;

# 2. Obtener las películas donde han participado más de un artista según nuestra base de datos.
select pel.titulo '2 artistas o mas' from artista_x_pelicula axp
inner join pelicula pel on axp.pelicula_id = pel.id
group by axp.pelicula_id
having count(axp.pelicula_id) >= 2;

# 3. Obtener aquellos artistas que han actuado en alguna película, incluso 
# aquellos que aún no lo han hecho, según nuestra base de datos.
select concat(ar.nombre, ' ', ar.apellido) Artistas from artista ar
left join artista_x_pelicula axp on ar.id = axp.artista_id
group by Artistas;

# 4. Obtener las películas que no se le han asignado artistas en nuestra base de datos.
select pel.titulo 'Sin artistas' from artista_x_pelicula axp
right join pelicula pel on axp.pelicula_id = pel.id
where isnull(axp.artista_id);

# 5. Obtener aquellos artistas que no han actuado en alguna película, según
# nuestra base de datos.
select concat(ar.nombre, ' ', ar.apellido) Artistas from artista_x_pelicula axp
right join artista ar on axp.artista_id = ar.id
where isnull(axp.pelicula_id);

# 6. Obtener aquellos artistas que han actuado en dos o más películas según
# nuestra base de datos.
select concat(ar.nombre, ' ', ar.apellido) Artistas from artista_x_pelicula axp
inner join artista ar on axp.artista_id = ar.id
group by axp.artista_id
having count(axp.pelicula_id) >= 2;

# 7. Obtener aquellas películas que tengan asignado uno o más artistas, incluso
# aquellas que aún no le han asignado un artista en nuestra base de datos.
select pel.titulo from pelicula pel
left join artista_x_pelicula axp on pel.id = axp.pelicula_id
group by pel.titulo;
