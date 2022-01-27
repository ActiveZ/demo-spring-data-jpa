create table plat (
    id int(11) not null primary key auto_increment,
    nom varchar(100) not null unique,
    prix int(7) not null
);

insert into plat (id, nom, prix) values (1, 'Magret de canard', 1300);
insert into plat (id, nom, prix) values (2, 'Moules-frites', 1300);
insert into plat (id, nom, prix) values (3, 'Couscous', 1600);
insert into plat (id, nom, prix) values (4, 'Blanquette de veau', 1500);
insert into plat (id, nom, prix) values (5, 'Côte de boeuf', 1100);
insert into plat (id, nom, prix) values (6, 'Gigot d''agneau', 2500);
