UPDATE universolector.socio
SET direccion = 'Monroe 860'
WHERE codigo=3;

UPDATE universolector.telefono_Socio
SET NroTelefono = '011-5263-7400'
WHERE codigo_socio=3;

UPDATE universolector.editorial
SET telefono = '011-5415-2575'
WHERE razon_social = 'Editorial Salamandra';
