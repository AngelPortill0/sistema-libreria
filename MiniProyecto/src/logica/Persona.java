package logica;

public class Persona {
  private String nombre;
  private String apellido;
  private String fechaDeNacimiento;

  Persona(String nombre, String apellido, String fechaDeNacimiento) {
    this.nombre = setNombre(nombre);
    this.apellido = setApellido(apellido);
    this.fechaDeNacimiento = setFechaDeNacimiento(fechaDeNacimiento);
  }

  private String setNombre(String nombre) {
    // put some logic here
    return nombre;
  }

  private String setApellido(String apellido) {
    // put some logic here
    return apellido;
  }

  private String setFechaDeNacimiento(String fechaDeNacimiento) {
    // put some logic here
    return fechaDeNacimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getFechaDeNacimiento() {
    return fechaDeNacimiento;
  }
}
