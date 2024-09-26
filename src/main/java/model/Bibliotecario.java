package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.DatabaseConnection;

public class Bibliotecario {
    private int id;

    // Constructor
    public Bibliotecario(int id) {
        this.id = id;
    }

    // Método para registrar un bibliotecario
    public void registrarBibliotecario() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Bibliotecario (id) VALUES (?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Bibliotecario registrado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar bibliotecario: " + e.getMessage());
        }
    }
}

