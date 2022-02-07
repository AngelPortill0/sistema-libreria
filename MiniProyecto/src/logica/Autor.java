package logica;

public class Autor extends Persona {
  private String biografia;
  private int publicaciones;
  private String fnacimiento;

  public Autor(
      String nombre, String apellido, String fnacimiento, String biografia, int publicaciones) {
    super(nombre, apellido, fnacimiento);
    this.biografia = setBiografia(biografia);
    this.publicaciones = setPublicaciones(publicaciones);
    this.fnacimiento = setFnacimiento(fnacimiento);
  }

  private String setBiografia(String biografia) {
    return biografia;
  }

  private int setPublicaciones(int publicaciones) {
    return publicaciones;
  }

  private String setFnacimiento(String fnacimiento) {
    return fnacimiento;
  }

  public String getBiografia() {
    return biografia;
  }

  public int getPublicaciones() {
    return publicaciones;
  }

  public String getFnacimiento() {
    return fnacimiento;
  }
}
