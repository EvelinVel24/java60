package main.java.com.biblioteca.services;

import main.java.com.biblioteca.models.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para obtener todos los libros de la biblioteca
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    // Método para buscar libros por frase en el título, autor o género
    public List<Libro> buscarLibros(String frase) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(frase.toLowerCase()) ||
                libro.getAutor().getNombre().toLowerCase().contains(frase.toLowerCase()) ||
                libro.getAutor().getApellido().toLowerCase().contains(frase.toLowerCase()) ||
                libro.getGenero().toLowerCase().contains(frase.toLowerCase())) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    // Método para cambiar la disponibilidad de un libro por ID
    public Libro cambiarDisponibilidad(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                libro.setDisponible(!libro.isDisponible());
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }
}
