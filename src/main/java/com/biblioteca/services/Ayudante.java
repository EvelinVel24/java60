package main.java.com.biblioteca.services;

import com.biblioteca.models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Ayudante implements IAyudante {
    @Autowired
    private Biblioteca biblioteca;

    @Override
    public List<Libro> buscarLibro(String frase) {
        // Lógica para buscar libros
    }

    @Override
    public List<Libro> obtenerLibros() {
        return biblioteca.getLibros();
    }

    @Override
    public void agregarLibro(Libro libro) {
        biblioteca.getLibros().add(libro);
    }

    @Override
    public Libro cambiarDisponibilidad(int id) {
        // Lógica para cambiar disponibilidad
    }
}
