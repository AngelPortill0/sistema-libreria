package miniproyecto;

public class Autor extends Persona {
  private String bio;
  private int numeroDePublicaciones;

  public Autor(
      String nombre,
      String apellido,
      String fechaDeNacimiento,
      String bio,
      int numeroDePublicaciones) {
    super(nombre, apellido, fechaDeNacimiento);
    this.bio = setBio(bio);
    this.numeroDePublicaciones = setNumeroDePublicaciones(numeroDePublicaciones);
  }

  private String setBio(String bio) {
      
    return bio;
  }

  private int setNumeroDePublicaciones(int numeroDePublicaciones) {
      
    return numeroDePublicaciones;
  }

  public String getBio() {
      
    return bio;
  }

  public int getNumeroDePublicaciones() {
      
    return numeroDePublicaciones;
  }
}
