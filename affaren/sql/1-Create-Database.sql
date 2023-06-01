drop database if exists storen;
create database storen;
use storen;

create table customers (id integer not null, name varchar(255), person_nr
                       varchar(255), primary key (id)) engine=InnoDB;
create table customers_seq (next_val bigint) engine=InnoDB;
insert into customers_seq  values ( 1 );

create table items (id integer not null, name varchar(255), pris
                       varchar(255), primary key (id)) engine=InnoDB;
create table items_seq (next_val bigint) engine=InnoDB;
insert into items_seq  values ( 1 );

create table orders (id integer not null, date varchar(255), primary key (id)) engine=InnoDB;
create table orders_seq (next_val bigint) engine=InnoDB;
insert into orders_seq  values ( 1 );