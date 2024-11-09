package main.java.com;

import main.java.com.biblioteca.models.Autor;
import main.java.com.biblioteca.models.Editorial;
import main.java.com.biblioteca.models.Libro;
import main.java.com.biblioteca.services.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private Bibliotecario bibliotecario;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear instancias de Autor y Editorial
        Autor autor1 = new Autor("Gabriel", "García Márquez");
        Editorial editorial1 = new Editorial("Editorial Sudamericana", "Argentina");

        Autor autor2 = new Autor("J.K.", "Rowling");
        Editorial editorial2 = new Editorial("Bloomsbury", "Reino Unido");

        // Crear y agregar libros
        Libro libro1 = new Libro(1, "Cien años de soledad", autor1, editorial1, 471, "Novela", true);
        Libro libro2 = new Libro(2, "Harry Potter y la piedra filosofal", autor2, editorial2, 223, "Fantasía", true);
        Libro libro3 = new Libro(3, "Harry Potter y la cámara secreta", autor2, editorial2, 251, "Fantasía", true);
        Libro libro4 = new Libro(4, "El amor en los tiempos del cólera", autor1, editorial1, 368, "Romance", true);

        bibliotecario.agregarUnLibro(libro1);
        bibliotecario.agregarUnLibro(libro2);
        bibliotecario.agregarUnLibro(libro3);
        bibliotecario.agregarUnLibro(libro4);

        // Cambiar disponibilidad de algunos libros
        bibliotecario.devolucionOPrestamoDeLibro(2);
        bibliotecario.devolucionOPrestamoDeLibro(3);

        // Solicitar todos los libros
        bibliotecario.solicitanTodosLosLibros();

        // Buscar un libro por frase
        bibliotecario.buscarLibro("Harry Potter");
    }
}

