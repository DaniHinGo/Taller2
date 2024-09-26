package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.DatabaseConnection;

public class Prestamo {
    private int id;
    private int libroId;
    private int usuarioId;
    private String fechaPrestamo;
    private String fechaDevolucion;

    // Constructor
    public Prestamo(int id, int libroId, int usuarioId, String fechaPrestamo, String fechaDevolucion) {
        this.id = id;
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Método para registrar un préstamo
    public void registrarPrestamo() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Prestamo (libro_id, usuario_id, fecha_prestamo) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, libroId);
            pstmt.setInt(2, usuarioId);
            pstmt.setString(3, fechaPrestamo);
            pstmt.executeUpdate();
            System.out.println("Préstamo registrado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar préstamo: " + e.getMessage());
        }
    }

    // Método para registrar la devolución de un libro
    public void registrarDevolucion() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Prestamo SET fecha_devolucion = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, fechaDevolucion);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Devolución registrada exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar devolución: " + e.getMessage());
        }
    }
}