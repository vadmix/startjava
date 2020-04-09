-- CREATE DATABASE AND TABLE

CREATE DATABASE  startjava_db;

\c startjava_db

CREATE TABLE Jaggers (
	id SERIAL,
	modelName VARCHAR(100),
	mark INTEGER,
	height NUMERIC(4,2),
	weight NUMERIC(4,2),
	status VARCHAR(100),
	origin VARCHAR(200),
	launch DATE,
	kaijuKill INTEGER
);