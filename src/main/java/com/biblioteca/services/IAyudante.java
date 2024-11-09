package main.java.com.biblioteca.services;

import main.java.com.biblioteca.models.Libro;
import java.util.List;

public interface IAyudante {
    List<Libro> buscarLibro(String frase);
    List<Libro> obtenerLibros();
    void agregarLibro(Libro libro);
    Libro cambiarDisponibilidad(int id);
}
