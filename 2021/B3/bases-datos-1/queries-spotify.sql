# 1
select * from Proyecto_Spotify.cancion
where titulo like '%Z%';

# 2
select * from Proyecto_Spotify.cancion
where titulo like '_A%S';

# 3
select titulo as 'Titulo', Fechacreacion as 'Fecha de creacion', cantcanciones as 'Cantidad de canciones' from Proyecto_Spotify.playlist
order by  cantcanciones desc
limit 1;

# 4
select * from Proyecto_Spotify.usuario
order by fecha_nac desc
limit 10
offset 5;

# 5
select * from Proyecto_Spotify.cancion
order by cantreproduccion desc 
limit 5;

# 6
select * from Proyecto_Spotify.album
order by titulo asc;

# 7
select * from Proyecto_Spotify.album
where imagenportada is null
order by titulo asc;

# 8
INSERT INTO `Proyecto_Spotify`.`usuario`
(`idUsuario`,
`nombreusuario`,
`nyap`,
`fecha_nac`,
`sexo`,
`CP`,
`password`,
`Pais_idPais`,
`IdTipoUsuario`)
VALUES
(20, 'nuevousuariodespotify@gmail.com', 'Elmer Gomez', '1991-11-15', 'M', 'B4129ATF','S4321m', 2, 3);

# 9
select * from genero
where Genero = 'Pop';

select * from generoxcancion
where idgenero = 9;

delete from generoxcancion
where idgenero = 9;

alter table Proyecto_Spotify.cancion drop constraint IdAlbum;
alter table Proyecto_Spotify.generoxcancion drop foreign key IdCancion;

delete from Proyecto_Spotify.cancion
where idCancion in (18, 19, 20, 21, 22, 23, 24, 25, 79, 85, 130, 133);

SET FOREIGN_KEY_CHECKS=1;

ALTER TABLE `Proyecto_Spotify`.`generoxcancion` 
ADD CONSTRAINT `Cancion`
  FOREIGN KEY (`IdCancion`)
  REFERENCES `Proyecto_Spotify`.`cancion` (`idCancion`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

select * from cancion
where idCancion in (18, 19, 20, 21, 22, 23, 24, 25, 79, 85, 130, 133);




