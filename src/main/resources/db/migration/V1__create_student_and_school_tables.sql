CREATE TABLE Student
(
    id BIGINT AUTO_INCREMENT,
    first_name nvarchar(50) NOT NULL,
    last_name nvarchar(50) NOT NULL,
    email nvarchar(100) NOT NULL,
    age INT NOT NULL,
    grade INT NOT NULL,
    CONSTRAINT PK_Student PRIMARY KEY (id)
);

CREATE TABLE School
(
    id BIGINT AUTO_INCREMENT,
    name nvarchar(50) NOT NULL,
    students_count INT NOT NULL,
    CONSTRAINT PK_School PRIMARY KEY (id)
);

