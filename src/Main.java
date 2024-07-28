import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", 1605, 1000);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Editorial B", 1967, 500);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@example.com", "123456789");
        Usuario usuario2 = new Usuario("Ana", "García", "ana.garcia@example.com", "987654321");
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar préstamos
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, LocalDate.now(), LocalDate.now().plusDays(14));
        Prestamo prestamo2 = new Prestamo(libro2, usuario2, LocalDate.now(), LocalDate.now().plusDays(14));
        biblioteca.realizarPrestamo(prestamo1);
        biblioteca.realizarPrestamo(prestamo2);

        // Listar préstamos
        System.out.println("Préstamos realizados:");
        for (Prestamo prestamo : biblioteca.listarPrestamos()) {
            System.out.println(prestamo);
        }

        // Devolver libros
        biblioteca.devolverLibro(prestamo1);
        biblioteca.devolverLibro(prestamo2);

        // Listar préstamos después de las devoluciones
        System.out.println("Préstamos después de las devoluciones:");
        for (Prestamo prestamo : biblioteca.listarPrestamos()) {
            System.out.println(prestamo);
        }
    }
}
