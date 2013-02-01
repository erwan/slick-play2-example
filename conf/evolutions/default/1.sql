# First database schema

# --- !Ups

create table users(
    id         bigint not null,
    name       varchar(255) not null
);

# --- !Downs

drop table users;

