package com.taller3.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "libro_id", nullable = false)
    private Libro libro;

    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;

    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }

    public Date getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(Date fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }

    public Date getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(Date fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
}

