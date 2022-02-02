package miniproyecto;

public class Cliente extends Persona {
  private String direccion;
  private int numero_de_telefono;
  private int cedula_de_identidad;

  public Cliente(
      String nombre,
      String apellido,
      String fechaDeNacimiento,
      String direccion,
      int numero_de_telefono,
      int cedula_de_identidad) {
    super(nombre, apellido, fechaDeNacimiento);
    this.direccion = setDireccion(direccion);
    this.numero_de_telefono = setNumero_de_telefono(numero_de_telefono);
    this.cedula_de_identidad = setCedula_de_indentidad(cedula_de_identidad);
  }

  private String setDireccion(String direccion) {

    return direccion;
  }

  private int setNumero_de_telefono(int numero_de_telefono) {

    return numero_de_telefono;
  }

  private int setCedula_de_indentidad(int cedula_de_identidad) {

    return cedula_de_identidad;
  }

  public String getDireccion() {

    return direccion;
  }

  public int getNumero_de_telefono() {

    return numero_de_telefono;
  }

  public int setCedula_de_indentidad() {

    return cedula_de_identidad;
  }
}
