package Sistema.modelos;


public class Usuario {                                // Clase Usuario implementa la interfaz Observador

  private String nombre;                                                  // Se declara la variable nombre

  public Usuario() {
  }

  public Usuario(
      String nombre) {                                         // Constructor de la clase Usuario
    this.nombre = nombre;                                               // Se asigna el nombre
  }

  public String getNombre() {                                             // Método para obtener el nombre
    return nombre;                                                      // Se retorna el nombre
  }

  public void setNombre(
      String nombre) {                                  // Método para asignar el nombre
    this.nombre = nombre;                                               // Se asigna el nombre
  }

  @Override
  public String toString() {
    return "Usuario{" +
        "nombre='" + nombre + '\'' +
        '}';
  }
}
