package Sistema.Usuarios;

public class Usuario implements Observador {                                // Clase Usuario implementa la interfaz Observador
    private String nombre;                                                  // Se declara la variable nombre

    public Usuario(String nombre) {                                         // Constructor de la clase Usuario
        this.nombre = nombre;                                               // Se asigna el nombre
    }

    public String getNombre() {                                             // Método para obtener el nombre
        return nombre;                                                      // Se retorna el nombre
    }

    public void setNombre(String nombre) {                                  // Método para asignar el nombre
        this.nombre = nombre;                                               // Se asigna el nombre
    }

    @Override
    public void actualizar(String mensaje) {                                // Método para actualizar
        System.out.println(nombre + " recibió notificación: " + mensaje);   // Se imprime el mensaje
    }
}
