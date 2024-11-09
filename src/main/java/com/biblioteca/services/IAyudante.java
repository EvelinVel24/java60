package main.java.com.biblioteca.services; 

import java.util.List;

public interface IAyudante {
    List<Libro> buscarLibro(String frase);
    List<Libro> obtenerLibros();
    void agregarLibro(Libro libro);
    Libro cambiarDisponibilidad(int id);
}
