drop table if exists compte;
create table compte (
    id integer not null auto_increment,
    login varchar(50) not null unique,
    password varchar(50),
    name varchar(50),
    lastName varchar(50),
    primary key (id),
    unique (login)
) ENGINE=InnoDB;


insert into compte (login, password, name, lastName) values("loginTest","passwordTest","nameTest","lastNameTest");
commit;
