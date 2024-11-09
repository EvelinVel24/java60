package main.java.com;

import com.biblioteca.models.Autor;
import com.biblioteca.models.Editorial;
import com.biblioteca.models.Libro;
import com.biblioteca.services.Bibliotecario;
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
        // Ejemplo de ejecución según el enunciado
        Autor autor = new Autor("Gabriel", "García Márquez");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Argentina");

        Libro libro1 = new Libro(1, "Cien años de soledad", autor, editorial, 471, "Novela", true);
        bibliotecario.agregarUnLibro(libro1);

        // Añadir más libros, cambiar disponibilidad, solicitar todos los libros, buscar un libro por frase
    }
}
