public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int anoPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String editorial, int anoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
