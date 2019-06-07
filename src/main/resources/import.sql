INSERT INTO genre VALUES (1,'dragon');
INSERT INTO genre VALUES (2,'communiste');
INSERT INTO genre VALUES (3,'fantaisie');

INSERT INTO utilisateur (id_utilisateur, prenom, nom, date_creation, sexe, pseudo, mot_de_passe, email, age) VALUES (1,'louis','nardot','1970-01-19T01:17:07.530+0000','M','Louis','louis1234','louis@gmail.com',20);

INSERT INTO utilisateur (id_utilisateur, prenom, nom, date_creation, sexe, pseudo, mot_de_passe, email, age) VALUES (2,'robin','fredon','1970-01-19T01:17:07.530+0000','M','robin','bonjour','robin@hotmail.com',21);

INSERT INTO utilisateur (id_utilisateur, prenom, nom, date_creation, sexe, pseudo, mot_de_passe, email, age) VALUES (3,'nicolas','ferreira','1970-01-19T01:17:07.530+0000','M','nico','nuit','nico@hotmail.com',25);

INSERT INTO utilisateur (id_utilisateur, prenom, nom, date_creation, sexe, pseudo, mot_de_passe, email, age) VALUES (4,'vincent','rizzetto','1970-01-19T01:17:07.530+0000','M','vins','moto','vincent@hotmail.com',25);

INSERT INTO idee VALUES (1,'07/06/2019','le boxeur qui boxe tout','Rocky',1,null,1);

INSERT INTO idee VALUES (2,'07/06/2019','Au lieu d\'utiliser un trou de verre il se teleporte','interstelar',1,null,1);

INSERT INTO personnage (id_personnage, age, biographie, nom, prenom, sexe, surnom, utilisateur) VALUES (1,30,'Le tireur qui tire plus vite que son ombre','lucky','luck','F','luckyne',1);