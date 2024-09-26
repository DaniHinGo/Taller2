-- Script SQL para insertar registros en las tablas del sistema de gestión de biblioteca

-- Inserciones en la tabla Persona
INSERT INTO Persona (nombre, apellido, tipo) VALUES ('Juan', 'Pérez', 'Usuario');
INSERT INTO Persona (nombre, apellido, tipo) VALUES ('Ana', 'García', 'Usuario');
INSERT INTO Persona (nombre, apellido, tipo) VALUES ('Luis', 'Martínez', 'Usuario');
INSERT INTO Persona (nombre, apellido, tipo) VALUES ('María', 'Rodríguez', 'Bibliotecario');
INSERT INTO Persona (nombre, apellido, tipo) VALUES ('Pedro', 'López', 'Bibliotecario');

-- Inserciones en la tabla Usuario
INSERT INTO Usuario (id, prestamos) VALUES (1, 2);  -- Juan Pérez
INSERT INTO Usuario (id, prestamos) VALUES (2, 1);  -- Ana García
INSERT INTO Usuario (id, prestamos) VALUES (3, 0);  -- Luis Martínez

-- Inserciones en la tabla Bibliotecario
INSERT INTO Bibliotecario (id) VALUES (4);  -- María Rodríguez
INSERT INTO Bibliotecario (id) VALUES (5);  -- Pedro López

-- Inserciones en la tabla Libro
INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES ('Cien años de soledad', 'Gabriel García Márquez', '256985, TRUE);
INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES ('Don Quijote de la Mancha', 'Miguel de Cervantes', '7854256', TRUE);
INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES ('El amor en los tiempos del cólera', 'Gabriel García Márquez', '9658745', TRUE);
INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES ('1984', 'George Orwell', '965874', TRUE);
INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES ('La sombra del viento', 'Carlos Ruiz Zafón', '97884856', TRUE);
