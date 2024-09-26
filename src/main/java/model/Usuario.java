package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.DatabaseConnection;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private int prestamos;

    // Constructor
    public Usuario(int id, String nombre, String apellido, int prestamos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = prestamos;
    }

    // Método para registrar un usuario
    public void registrarUsuario() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Usuario (id, nombre, apellido, prestamos) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setInt(4, prestamos);
            pstmt.executeUpdate();
            System.out.println("Usuario registrado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }
}

