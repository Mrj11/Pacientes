/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  alumno
 * Created: 16-nov-2018
 */

create database pacientes;
use pacientes;

create table paciente (
idpaciente int auto_increment,
nombre varchar (40),
apellido varchar (40),
tipodoc varchar (20),
nrodoc int,
telefono int,
email varchar (60),
constraint pk_idpaciente primary key (idpaciente));

create table provincia(
idprovincia int,
nombre varchar (50),
constraint pk_idprov primary key (idprovincia)
);  

create table localidad(
idlocalidad int,
nombre varchar (50),
fkprovincia int,
constraint pk_idloc primary key (idlocalidad),
constraint fk_provincia1 foreign key (fkprovincia) references provincia(idprovincia)
);


create table domicilio(
id_domicilio int auto_increment,
calle varchar (40),
numero int,
codpostal int,
piso int,
dpto int,
fklocalidad int,
fkprovincia int,
fkidpaciente int,
constraint pk_iddomicilio primary key (id_domicilio),
constraint fk_idpac foreign key (fkidpaciente) references paciente(idpaciente),
constraint fk_local foreign key (fklocalidad) references localidad(idlocalidad),
constraint fk_prov foreign key (fkprovincia) references provincia(idprovincia)
);

insert into provincia
values (1,'Buenos Aires');
insert into provincia
values (2, 'Catamarca');
insert into provincia
values (3,'Chaco');
insert into provincia
values (4, 'Chubut');
insert into provincia
values (5, 'Cordoba');
insert into provincia
values (6, 'Corrientes');
insert into provincia
values (7, 'Entre Rios');
insert into provincia
values (8, 'Formosa');
insert into provincia
values (9, 'Jujuy');
insert into provincia
values (10, 'La Pampa');
insert into provincia
values (11, 'La Rioja');
insert into provincia
values (12, 'Mendoza');
insert into provincia
values (13, 'Misiones');
insert into provincia
values (14, 'Neuquen');
insert into provincia
values (15, 'Rio Negro');
insert into provincia
values (16, 'Salta');
insert into provincia
values (17,'San Juan');
insert into provincia
values (18, 'San Luis');
insert into provincia
values (19, 'Santa Cruz');
insert into provincia
values (20, 'Santa Fe');
insert into provincia
values (21, 'Santiago del Estero');
insert into provincia
values (22, 'Tierra del Fuego');
insert into provincia
values (23, 'Tucuman');
