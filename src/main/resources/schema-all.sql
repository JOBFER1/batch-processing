DROP TABLE person IF EXISTS;

CREATE TABLE person  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    firstName VARCHAR(20),
    lastName VARCHAR(20)
);
