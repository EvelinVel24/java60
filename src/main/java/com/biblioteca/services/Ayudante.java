package main.java.com.biblioteca.services;

import main.java.com.biblioteca.models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Ayudante implements IAyudante {
    @Autowired
    private Biblioteca biblioteca;

    @Override
    public List<Libro> buscarLibro(String frase) {
        return biblioteca.buscarLibros(frase);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return biblioteca.obtenerLibros();
    }

    @Override
    public void agregarLibro(Libro libro) {
        biblioteca.agregarLibro(libro);
    }

    @Override
    public Libro cambiarDisponibilidad(int id) {
        return biblioteca.cambiarDisponibilidad(id);
    }
}
