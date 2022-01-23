CREATE DATABASE messages;

USE messages;

CREATE TABLE MESSAGES (
    id int NOT NULL,
    text varchar(1024),
    CONSTRAINT PK_MESSAGES PRIMARY KEY (id)
);

INSERT INTO MESSAGES (id, text)
	VALUES (1, 'Do not worry about what anybody else is going to do. The best way to predict the future is to invent it.');
INSERT INTO MESSAGES (id, text) 
	VALUES (2, 'Premature optimization is the root of all evil (or at least most of it) in programming.');
INSERT INTO MESSAGES (id, text) 
	VALUES (3, 'No problem should ever have to be solved twice.');
INSERT INTO MESSAGES (id, text) 
	VALUES (4, 'Attitude is no substitute for competence.');
INSERT INTO MESSAGES (id, text) 
	VALUES (5, 'A year spent in artificial intelligence is enough to make one believe in God.');
INSERT INTO MESSAGES (id, text) 
	VALUES (6, 'Within a computer natural language is unnatural.');
INSERT INTO MESSAGES (id, text) 
	VALUES (7, 'The best way to learn to live with our limitations is to know them.');
INSERT INTO MESSAGES (id, text) 
	VALUES (8, 'Lisp programmers know the value of everything but the cost of nothing.');
