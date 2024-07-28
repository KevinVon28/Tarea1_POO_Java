import java.util.*;

public class Biblioteca {
    private List<Libro> libros;
    private Map<String, Usuario> usuarios;
    private Queue<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
        prestamos = new LinkedList<>();
    }

    // Métodos para gestionar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros);
    }

    // Métodos para gestionar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public Usuario consultarUsuario(String numeroIdentificacion) {
        return usuarios.get(numeroIdentificacion);
    }

    // Métodos para gestionar préstamos
    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public List<Prestamo> listarPrestamos() {
        return new ArrayList<>(prestamos);
    }

    public List<Prestamo> generarInformePrestamos() {
        return listarPrestamos();
    }
}
