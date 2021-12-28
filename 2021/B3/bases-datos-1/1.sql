INSERT INTO `DHtube`.`reacciones`
(`id_reaccion`,
`nombre_reaccion`)
VALUES
(1, 'Like'),
(2, 'Dislike'),
(3, 'Me encanta');

INSERT INTO `DHtube`.`paises`
(`id_pais`,
`nombre`)
VALUES
(1 , 'Colombia'),
(2 , 'Argentina');

INSERT INTO `DHtube`.`avatares`
(`id_avatares`,
`nombre`,
`direccion`)
VALUES
(1 , '/Avatar/1'),
(2 , '/Avatar/2');

INSERT INTO `DHtube`.`tipo_usuario`
(`idtipo_usuario`,
`premium`)
VALUES
(1 , 0),
(2 , 1);

SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO `DHtube`.`usuario`
(`id_usuario`,
`correo`,
`contrasena`,
`nombre`,
`fecha_nacimiento`,
`codigo_postal`,
`avatares_id_avatares`,
`paises_id_pais`,
`tipo_usuario_idtipo_usuario`)
VALUES
(1 , 'usuario1@correo.com', '12345', 'usuario 1', '1990-10-19', '1234', 1, 1, 1),
(2 , 'usuario2@correo.com', 'abcde', 'usuario 2', '1980-11-23', '4321', 2, 2, 2);

INSERT INTO `DHtube`.`videos`
(`id_videos`,
`titulo`,
`descripcion`,
`tamano`,
`nombre_video`,
`duracion`,
`imagen`,
`reproducciones`,
`likes`,
`dislikes`,
`publico`,
`fecha_publicacion`,
`usuarios_id_usuario`)
VALUES
(1, 'Titulo 1', 'Descripcion 1', 3000, 'Nombre 1', 500, '/Direccion/1', 1000, 10, 11, 1, '2020-12-31', 1),
(2, 'Titulo 2', 'Descripcion 2', 313200, 'Nombre 2', 5000, '/Direccion/2', 0, 0, 11, 1, '2021-06-15', 2);

delete from DHtube.usuarios_reacciones_videos;


INSERT INTO `DHtube`.`usuarios_reacciones_videos`
(`id_usuarios_reacciones`,
`usuario_id_usuario`,
`reacciones_id_reaccion`,
`videos_id_videos`,
`fecha_creacion`)
VALUES
(1, 1, 1, 1, '2021-09-03'),
(2, 1, 2, 1, '2021-09-04');

select nombre, nombre_reaccion, fecha_creacion, nombre_video from usuario, usuarios_reacciones_videos, videos, reacciones
where id_usuario = usuario_id_usuario and videos_id_videos = id_videos and id_reaccion=reacciones_id_reaccion





