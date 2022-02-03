package logica;

public class Cliente extends Persona {
  private String direccion;
  private int numeroDeTelefono;
  private int cedulaDeIdentidad;

  public Cliente(
      String nombre,
      String apellido,
      String fechaDeNacimiento,
      String direccion,
      int numeroDeTelefono,
      int cedulaDeIdentidad) {
    super(nombre, apellido, fechaDeNacimiento);
    this.direccion = setDireccion(direccion);
    this.numeroDeTelefono = setNumeroDeTelefono(numeroDeTelefono);
    this.cedulaDeIdentidad = setCedulaDeIndentidad(cedulaDeIdentidad);
  }

  private String setDireccion(String direccion) {

    return direccion;
  }

  private int setNumeroDeTelefono(int numeroDeTelefono) {

    return numeroDeTelefono;
  }

  private int setCedulaDeIndentidad(int cedulaDeIdentidad) {

    return cedulaDeIdentidad;
  }

  public String getDireccion() {

    return direccion;
  }

  public int getNumeroDeTelefono() {

    return numeroDeTelefono;
  }

  public int setCedulaDeIndentidad() {

    return cedulaDeIdentidad;
  }
}
