package main;

import model.Libro;
import model.Usuario;
import model.Bibliotecario;
import model.Prestamo;

public class Main {
    public static void main(String[] args) {
        // Crear y agregar un libro
        Libro libro1 = new Libro();
        libro1.agregarLibro();

        // Actualizar un libro
        libro1 = new Libro();
        libro1.actualizarLibro();

        // Listar todos los libros
        Libro.listarLibros();

        // Eliminar un libro
        libro1.eliminarLibro();

        // Registrar un usuario
        Usuario usuario1 = new Usuario(1, "Juan", "Pérez", 0);
        usuario1.registrarUsuario();

        // Registrar un bibliotecario
        Bibliotecario bibliotecario1 = new Bibliotecario(1);
        bibliotecario1.registrarBibliotecario();

        // Registrar un préstamo
        Prestamo prestamo1 = new Prestamo(1, 1, 1, "2024-09-26", null);
        prestamo1.registrarPrestamo();

        // Registrar una devolución
        prestamo1 = new Prestamo(1, 1, 1, "2024-09-26", "2024-10-01");
        prestamo1.registrarDevolucion();
    }
}