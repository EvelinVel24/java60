package main.java.com.biblioteca.services;

import com.biblioteca.models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bibliotecario {
    @Autowired
    private IAyudante ayudante;

    public void solicitanTodosLosLibros() {
        System.out.println(ayudante.obtenerLibros());
    }

    public void agregarUnLibro(Libro libro) {
        ayudante.agregarLibro(libro);
        System.out.println("Libro agregado: " + libro);
    }

    public void devolucionOPrestamoDeLibro(int id) {
        Libro libro = ayudante.cambiarDisponibilidad(id);
        System.out.println("Disponibilidad cambiada: " + libro);
    }

    public void buscarLibro(String frase) {
        System.out.println(ayudante.buscarLibro(frase));
    }
}
