create database Colab;
use Colab;
create table usuario(
nome varchar(120) Not null,
matricula int Not null,
choraria int,
Primary Key (matricula)


);

create table sala(
nome varchar(150) Not null,
numero int Not null,
codusu int,
codserv int,
Primary key (numero) ,
foreign key (codusu) references usuario (matricula)
);

create table servidor (
nome varchar (120) not null,
matricula int not null,
autorizacao boolean not null,
primary key (matricula)

);

alter table sala add foreign key (codserv) references servidor (matricula);