# Parte 1

# 1. Crear una vista para poder organizar los envíos de las facturas.
# Indicar número de factura, fecha de la factura y fecha de envío, 
# ambas en formato dd/mm/yyyy, valor del transporte formateado con dos decimales, 
# y la información del domicilio del destino incluyendo dirección, ciudad, 
# código postal y país, en una columna llamada Destino. 

create view v_Envios as
select FacturaID, 
	date_format(FechaFactura, '%d/%c/%Y') 'Fecha_Factura', 
    date_format(FechaEnvio, '%d/%c/%Y') 'Fecha_Envio',
    round(Transporte, 2) 'Costo_Transporte', 
    concat(DireccionEnvio, ', ', CiudadEnvio, ', ', CodigoPostalEnvio, ', ', PaisEnvio) 'Destino'
from Facturas;

# 2. Realizar una consulta con todos los correos y el detalle de las facturas que usaron ese correo. 
# Utilizar la vista creada. 

select c.*, v_E.* from v_Envios v_E
inner join Facturas f on f.FacturaID = v_E.FacturaID
inner join Correos c on c.CorreoID = f.EnvioVia;
#inner join  FacturaDetalle fd on f.FacturaID = fd.FacturaID;

# 3. ¿Qué dificultad o problema encontrás en esta consigna? Proponer alguna alternativa o solución.
# La dificultad esta en que los correosID no estan en la vista, toca agregarlos mediante un join
# con la tabla de Facturas, lo cual es redundante ya que se puede hacer la consulta
# sin la vista solo con la tabla de Facturas.


# Parte 2



# 1. Crear una vista con un detalle de los productos en stock. Indicar id, nombre del producto, 
# nombre de la categoría y precio unitario. 

create view v_ProductosStock as
select p.ProductoID, p.ProductoNombre, c.CategoriaNombre, p.PrecioUnitario from Productos p
inner join Categorias c on p.CategoriaID = c.CategoriaID
where UnidadesStock > 0;

# 2. Escribir una consulta que liste el nombre y la categoría de todos los productos vendidos.
# Utilizar la vista creada. 






