package miniproyecto;

public class Libro {

  private String titulo;
  private String fechaDePublicacion;
  private String isbn;
  private int numeroDePaginas;
  private int puntuacion;
  private String descripcion;
  private Autor autor;

  Libro(
      String titulo,
      String fechaDePublicacion,
      String isbn,
      int numeroDePaginas,
      int puntuacion,
      String descripcion,
      String nombreAutor,
      String apellidoAutor,
      String fechaDeNacimientoAutor,
      String bioAutor,
      int numeroDePublicacionesAutor) {

    this.titulo = setTitulo(titulo);
    this.fechaDePublicacion = setFechaDePubicacion(fechaDePublicacion);
    this.isbn = setIsbn(isbn);
    this.numeroDePaginas = setNumeroDePaginas(numeroDePaginas);
    this.puntuacion = setPuntuacion(puntuacion);
    this.descripcion = setDescripcion(descripcion);
    autor =
        new Autor(
            nombreAutor,
            apellidoAutor,
            fechaDeNacimientoAutor,
            bioAutor,
            numeroDePublicacionesAutor);
  }

  private String setTitulo(String titulo) {

    return titulo;
  }

  private String setFechaDePubicacion(String fechaDePublicacion) {

    return fechaDePublicacion;
  }

  private String setIsbn(String isbn) {

    return isbn;
  }

  private int setNumeroDePaginas(int numeroDePaginas) {

    return numeroDePaginas;
  }

  private int setPuntuacion(int puntuacion) {

    return puntuacion;
  }

  private String setDescripcion(String descripcion) {

    return descripcion;
  }

  private String setAutor(String autor) {

    return autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getFechaDePublicacion() {
    return fechaDePublicacion;
  }

  public String getIsbn() {
    return isbn;
  }

  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }

  public int getPuntuacion() {
    return puntuacion;
  }

  public String getDescripcion() {
    return descripcion;
  }
}
