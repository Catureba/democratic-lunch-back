create table users (
    id bigserial not null primary key ,
    name varchar(100) not null,
    email varchar(100) not null unique,
    password varchar (255) not null
);