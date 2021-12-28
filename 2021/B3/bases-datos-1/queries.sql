INSERT INTO spotify.usuario
VALUES
(default, 'pepito@gmail.com', '1234', '1990-01-01', 1, '091329', 'Colombia', '2015-03-10'),
(default, 'camila@gmail.com', '1234', '1998-02-05', 0, '846352', 'Argentina', NOW()),
(default, 'joaquin@gmail.com', '1234', '1980-05-15', 1, '123127', 'Colombia', '2013-03-10');

INSERT INTO spotify.artista
VALUES
(default, 'nombre 1', 'apellido', 'direccion imagen'),
(default, 'nombre 2', 'apellido', 'direccion imagen'),
(default, 'nombre 3', 'apellido', 'direccion imagen');

INSERT INTO spotify.discografia
VALUES
(default, 'nombre 1', 'pais'),
(default, 'nombre 2', 'pais'),
(default, 'nombre 3', 'pais');


INSERT INTO spotify.album
VALUES
(default, 'album 1', 2014, 'direccion imagen', 1, 1),
(default, 'album 2', 2015, 'direccion imagen', 1, 2),
(default, 'album 3', 2016, 'direccion imagen', 3, 3);


INSERT INTO spotify.canciones
VALUES
(default, 'cancion 1', 5.3, 100, 200, 1),
(default, 'cancion 2', 10.3, 100, 200, 2),
(default, 'cancion 3', 5.3, 100, 200, 3);