package main.java.com.biblioteca.services;

import main.java.com.biblioteca.models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bibliotecario {
    @Autowired
    private IAyudante ayudante;

    // Método para obtener todos los libros y mostrarlos
    public void solicitanTodosLosLibros() {
        List<Libro> libros = ayudante.obtenerLibros();
        System.out.println("Lista de todos los libros:");
        libros.forEach(System.out::println);
    }

    // Método para agregar un libro y confirmar su adición
    public void agregarUnLibro(Libro libro) {
        ayudante.agregarLibro(libro);
        System.out.println("Libro agregado: " + libro);
    }

    // Método para cambiar la disponibilidad de un libro y mostrar el estado actualizado
    public void devolucionOPrestamoDeLibro(int id) {
        Libro libro = ayudante.cambiarDisponibilidad(id);
        if (libro != null) {
            System.out.println("Disponibilidad cambiada para el libro: " + libro);
        } else {
            System.out.println("Libro con ID " + id + " no encontrado.");
        }
    }

    // Método para buscar libros por una frase y mostrar los resultados
    public void buscarLibro(String frase) {
        List<Libro> resultados = ayudante.buscarLibro(frase);
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron libros que coincidan con: \"" + frase + "\"");
        } else {
            System.out.println("Resultados de búsqueda para \"" + frase + "\":");
            resultados.forEach(System.out::println);
        }
    }
}
