DROP table IF EXISTS empleado;

/*Creamos la tabla empleado*/
CREATE table empleado(
	id int auto_increment primary key,
    nombre varchar(50),
    trabajo ENUM('Programador','Soporte','Analista'),
    salario decimal(10,2)
);

/*Insertamos los los datos del empleado*/
INSERT INTO empleado (nombre, trabajo,salario) VALUES ('Alberto', 'Programador',0);
INSERT INTO empleado (nombre, trabajo,salario) VALUES ('Tamy', 'Analista',0);
INSERT INTO empleado (nombre, trabajo,salario) VALUES ('Hugo', 'Soporte',0);