# Realizar una consulta de la facturación de e-market. Incluir la siguiente información:
# Id de la factura
# fecha de la factura
# nombre de la empresa de correo
# nombre del cliente
# categoría del producto vendido
# nombre del producto
# precio unitario
# cantidad

select f.FacturaID, 
f.FechaFactura, 
c.Compania as `Empresa envio` , 
cli.Contacto,
cat.CategoriaNombre,
p.ProductoNombre,
p.PrecioUnitario,
fd.Cantidad
from Facturas as f
inner join Correos as c on c.CorreoID = f.EnvioVia
inner join Clientes as cli on cli.ClienteID = f.ClienteID
inner join FacturaDetalle as fd on fd.FacturaID = f.FacturaID
inner join Productos as p on p.ProductoID = fd.ProductoID
inner join Categorias as cat on cat.CategoriaID = p.CategoriaID;

# 1. Listar todas las categorías junto con información de sus productos. 
# Incluir todas las categorías aunque no tengan productos.

select cat.CategoriaNombre, p.* 
from Categorias as cat
left join Productos as p on p.CategoriaID = cat.CategoriaID;

# 2. Listar la información de contacto de los clientes que no hayan comprado nunca en emarket.

select c.Contacto, f.FacturaID from Facturas as f
right join Clientes as c on c.ClienteID = f.ClienteID
where isnull(f.FacturaID);

# 3. Realizar un listado de productos. Para cada uno indicar su nombre, 
# categoría, y la información de contacto de su proveedor. 
# Tener en cuenta que puede haber productos para los cuales no se indicó quién es el proveedor.

select p.ProductoNombre, p.CategoriaID, pro.Contacto 
from Productos as p
left join Proveedores as pro on pro.ProveedorID = p.ProveedorID;

# 4. Para cada categoría listar el promedio del precio unitario de sus productos.

select cat.CategoriaNombre, avg(fd.PrecioUnitario) as 'Promedio' from Categorias as cat
inner join Productos as p on p.CategoriaID = cat.CategoriaID
inner join FacturaDetalle as fd on fd.ProductoID = p.ProductoID
group by cat.CategoriaNombre;

# 5. Para cada cliente, indicar la última factura de compra.
# Incluir a los clientes que nunca hayan comprado en e-market.


select 
	c.Compania as 'Compañia',
	c.Contacto 'Contacto de la compañia',
    c.ClienteID 'Id de cliente',
	max(f.FacturaID) as 'Ultima factura',
	Max(f.FechaFactura) as 'Fecha ultima factura'
from Clientes as c 
left join Facturas as f on f.ClienteID = c.ClienteID
group by c.ClienteID;

/* 
select 
	c.Compania as 'Compañia',
	c.Contacto 'Contacto de la compañia',
    c.ClienteID 'Id de cliente',
	f.IDMax as 'Id ultima factura',
    f.FechaMax as 'Fecha ultima factura'
from Clientes as c 
left join 
	(# Esto es una subquery, una tabla generada con un select para usarla dentro de otra query.
    # La primera parte del ejercicio esta resulto en el select del subquery, pero 
    # uso subqueries para agregar los nombres de la compania, el contacto y 
    # los clientes sin facturas con el left join.
	select 
		max(FacturaID) as 'IDMax',
        ClienteID,
		Max(FechaFactura) as 'FechaMax'
	from Facturas
    group by ClienteID ) as f
    on f.ClienteID = c.ClienteID;
*/

# Todas las facturas tienen una empresa de correo asociada (enviovia). 
# Generar un listado con todas las empresas de correo, y la cantidad de 
# facturas correspondientes. Realizar la consulta utilizando RIGHT JOIN.

select co.Compania, count(*) as 'Total facturas'
from Facturas as f
right join Correos as co on co.CorreoID = f.EnvioVia
group by co.Compania;
