/*Primero ponemos un DROP para que elimine y vuelva a cargar la base de datos 
en caso de que ya exista*/
DROP DATABASE IF EXISTS data;

/*Creamos la base de datos*/
CREATE DATABASE data;

/*Entramos en la base de datos*/
USE data;

/*Creamos la tabla empleado*/
CREATE table empleado(
	id int auto_increment primary key,
    nombre varchar(50),
    trabajo ENUM('Programador','Soporte','Analista'),
    salario decimal(10,2)
);

/*Insertamos los los datos del empleado*/
insert into empleado(nombre, trabajo, salario)values('Alberto','Programador',2000);
insert into empleado(nombre, trabajo, salario)values('Andrea','Analista',1800);
insert into empleado(nombre, trabajo, salario)values('Camilo','Soporte',2500);

