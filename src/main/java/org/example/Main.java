package org.example;

import database.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect(); // Intenta conectarse a la base de datos
        db.disconnect(); // Luego cierra la conexión
    }
}