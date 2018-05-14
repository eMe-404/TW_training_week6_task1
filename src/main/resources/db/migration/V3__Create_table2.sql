CREATE TABLE Employee2(
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10)
) engine=InnoDB DEFAULT CHARSET = utf8;