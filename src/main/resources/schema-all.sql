DROP TABLE person IF EXISTS;

CREATE TABLE person  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_Name VARCHAR(20),
    last_Name VARCHAR(20)
);
