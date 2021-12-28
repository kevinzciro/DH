select count(*) from musimundos.clientes
where pais = 'Brazil';

select id_genero, count(*) from musimundos.canciones
group by id_genero;

select sum(total) from musimundos.facturas;

select id_album, avg(milisegundos) from musimundos.canciones
group by id_album;

select min(bytes) from musimundos.canciones;

select id_cliente, sum(total) from musimundos.facturas
group by id_cliente
having sum(total) >= 45;