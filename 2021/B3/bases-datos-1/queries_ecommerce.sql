# Parte 1, Categorias y productos

# 1
select * from EMarket.Categorias;

# 2
select CategoriaNombre, Descripcion from EMarket.Categorias;

# 3
select * from EMarket.Productos;

# 4
select * from EMarket.Productos
where Discontinuado = 1;

# 5
select * from EMarket.Productos
where ProveedorID = 8;

# 6
select * from EMarket.Productos
where PrecioUnitario between 10 and 22;

# 7
select * from EMarket.Productos
where UnidadesStock<NivelReorden;

# 8
select * from EMarket.Productos
where UnidadesStock<NivelReorden and UnidadesPedidas=0;

# Clientes

#1
select Contacto, Compania, Titulo, Pais from EMarket.Clientes
order by Pais;

# 2
select * from EMarket.Clientes
where Titulo = 'Owner';

# 3
select Contacto from EMarket.Clientes
where Contacto like 'C%';

# Facturas

#1
select * from EMarket.Facturas
order by FechaFactura asc;

# 2
select * from EMarket.Facturas
where PaisEnvio = 'USA' and EnvioVia != 3;

# 3
select * from EMarket.Facturas
where ClienteID = 'GOURL';


# 4
select * from EMarket.Facturas
where EmpleadoID in (3, 5, 8, 9)
limit 800;

# Parte 2, Productos

# 1 
select * from EMarket.Productos
order by PrecioUnitario desc;

# 2
select * from EMarket.Productos
order by PrecioUnitario desc
limit 5;

# 3
select * from EMarket.Productos
order by UnidadesStock desc
limit 10;

# FacturaDetalle

# 1
select FacturaID, ProductoID, Cantidad from EMarket.FacturaDetalle;

# 2
select FacturaID, ProductoID, Cantidad from EMarket.FacturaDetalle
order by Cantidad desc;

# 3
select FacturaID, ProductoID, Cantidad from EMarket.FacturaDetalle
where Cantidad between 50 and 100;

#4
select FacturaID as NroFactura, ProductoID as Producto, PrecioUnitario*Cantidad as Total from EMarket.FacturaDetalle;

# Extras

# 1
select * from EMarket.Clientes
where pais in ('Mexico', 'Brazil') or Titulo like 'Sales%';

# 2
select * from EMarket.Clientes
where Compania like 'A%';

# 3 
select Ciudad, Contacto as 'Apellido y Nombre', Titulo as 'Puesto' from EMarket.Clientes
where Ciudad = 'Madrid';

# 4
select * from EMarket.Facturas
where FacturaID between 10000 and 10500;

# 5
select * from EMarket.Facturas
where FacturaID between 10000 and 10500 or ClienteID like 'B%';

# 6
select * from EMarket.Facturas
where CiudadEnvio = 'Vancouver' or EnvioVia = 3;

# 7 
select EmpleadoID from EMarket.Empleados
where Apellido = 'Buchanan' or Nombre = 'Buchanan';

# 8
select * from EMarket.Facturas
where EmpleadoID = 5;


