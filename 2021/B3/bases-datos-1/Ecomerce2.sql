# Clientes

# 1
select count(*) from Clientes;

# 2
select Ciudad, count(*) 'Cantidad de clientes' from Clientes
group by Ciudad;

# Facturas

# 1
select sum(Transporte) as 'Total transporte' from Facturas;

# 2
select sum(Transporte) as 'Total transporte' from Facturas
where EnvioVia = 1;

# 3
select ClienteID, count(*) 'Cantidad facturas' from Facturas
group by ClienteID
order by count(*) desc;

#4
select ClienteID, count(*) 'Cantidad faturas' from Facturas
group by ClienteID
order by count(*) desc
limit 5;

# 5
select PaisEnvio, count(*) 'Cantidad facturas' from Facturas
group by PaisEnvio
order by count(*) asc
limit 1;

# 6
select EmpleadoID, count(*) 'Cantidad facturas' from Facturas
group by EmpleadoID
order by count(*) desc
limit 1;

# Facturas Detalle

# 1
select ProductoID, count(*) 'Cantidad facturas' from FacturaDetalle
group by ProductoID
order by count(*) desc
limit 1;

# 2
select sum(PrecioUnitario*Cantidad) 'Total facturado' from FacturaDetalle;

# 3
select ProductoID, sum(PrecioUnitario*Cantidad) 'Total facturado' from FacturaDetalle
group by ProductoID
having ProductoID between 30 and 50;

# 4
select ProductoID, avg(PrecioUnitario*Cantidad) 'Promedio facturado' from FacturaDetalle
group by ProductoID;

# 5
select ProductoID, PrecioUnitario from FacturaDetalle
order by PrecioUnitario desc
limit 1;

select max(PrecioUnitario) from FacturaDetalle;

# Join 

# 1
Select concat(emp.Nombre, ' ',emp.Apellido) 'Nombre completo', fac.FacturaID 
from Facturas fac
join  Empleados emp on emp.EmpleadoID = fac.EmpleadoID
where emp.EmpleadoID = 5;

# 2
Select cor.Compania, fac.FacturaID 
from Facturas fac
join  Correos cor on cor.CorreoID = fac.EnvioVia 
where cor.CorreoID = 1;

# 3
Select concat(emp.Nombre, ' ',emp.Apellido) 'Nombre completo', fac.FacturaID 
from Facturas fac
join  Empleados emp on emp.EmpleadoID = fac.EmpleadoID;

# 4
Select cli.Compania, fac.FacturaID 
from Facturas fac
join  Clientes cli on cli.ClienteID = fac.ClienteID 
where cli.Titulo = 'Owner' and fac.PaisEnvio = 'USA';

# 5
select concat(emp.Nombre, ' ',emp.Apellido) 'Nombre completo',  det.*, fac.*
from Facturas fac
join Empleados emp on emp.EmpleadoID = fac.EmpleadoID 
join FacturaDetalle  det on fac.FacturaID = det.FacturaID
where emp.Apellido = 'Leverling' or det.ProductoID = 42;

# 6
select concat(emp.Nombre, ' ',emp.Apellido) 'Nombre completo',  det.*, fac.*
from Facturas fac
join Empleados emp on emp.EmpleadoID = fac.EmpleadoID 
join FacturaDetalle  det on fac.FacturaID = det.FacturaID
where emp.Apellido = 'Leverling' or det.ProductoID = 42 or det.ProductoID = 80;

# 7
select Compania 'Compañia', sum(det.PrecioUnitario*det.Cantidad) 'Importes de
compras total'
from Facturas fac
join Clientes cli on cli.ClienteID = fac.ClienteID
join FacturaDetalle  det on fac.FacturaID = det.FacturaID
group by Compania
order by sum(det.PrecioUnitario*det.Cantidad) desc
limit 5;

# 8
select Contacto 'Clientes',
Compania 'Compañia', 
fac.FacturaID 'Factura nro', 
fac.FechaFactura 'Fecha de factura', 
fac.PaisEnvio 'Pais de envio', 
sum(det.PrecioUnitario*det.Cantidad*(1-det.Descuento)) 'Total'
from Facturas fac
join Clientes cli on cli.ClienteID = fac.ClienteID
join FacturaDetalle  det on fac.FacturaID = det.FacturaID
group by fac.FacturaID
order by fac.FechaFactura desc
limit 10;



