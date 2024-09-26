package model;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Libro {

    public void agregarLibro(String titulo, String autor, String isbn, boolean disponible) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            String sql = "INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setString(3, isbn);
                stmt.setBoolean(4, disponible);
                stmt.executeUpdate();
                System.out.println("Libro agregado con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al agregar el libro: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
        }
    }

    public void actualizarLibro(int id, String nuevoTitulo) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            String sql = "UPDATE Libro SET titulo = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nuevoTitulo);
                stmt.setInt(2, id);
                stmt.executeUpdate();
                System.out.println("Libro actualizado con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al actualizar el libro: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
        }
    }

    public void eliminarLibro(int id) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            String sql = "DELETE FROM Libro WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Libro eliminado con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al eliminar el libro: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
        }
    }

    public static void listarLibros() {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            String sql = "SELECT * FROM Libro";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                            ", Título: " + rs.getString("titulo") +
                            ", Autor: " + rs.getString("autor"));
                }
            } catch (SQLException e) {
                System.out.println("Error al listar los libros: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
        }
    }

    public void agregarLibro() {
    }

    public void actualizarLibro() {
    }

    public void eliminarLibro() {
    }
}
