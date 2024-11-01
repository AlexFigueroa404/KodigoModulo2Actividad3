package Sistema.Usuarios;

import Sistema.Reservas.Reserva;                                                                            // Se importa la clase Reserva

import java.util.ArrayList;                                                                                 // Se importa la clase ArrayList
import java.util.List;                                                                                      // Se importa la clase List

public class Manager {
    private final List<Reserva> reservas = new ArrayList<>();                                               // Se declara la lista de reservas
    private final List<Usuario> usuarios = new ArrayList<>();                                               // Se declara la lista de usuarios
    private final List<String> metodos = new ArrayList<>();                                                 // Se declara la lista de métodos de pago
    private final List<Integer> montos = new ArrayList<>();                                                 // Se declara la lista de montos

                                                                                                            // agregar una reserva a la lista de reservas
    public void agregarReserva(Usuario usuario, Reserva reserva, String metodo, int monto) {                // Se recibe el usuario, la reserva, el método de pago y el monto
        usuarios.add(usuario);                                                                              // Se agrega el usuario a la lista de usuarios
        reservas.add(reserva);                                                                              // Se agrega la reserva a la lista de reservas
        metodos.add(metodo);                                                                                // Se agrega el método de pago a la lista de métodos de pago
        montos.add(monto);                                                                                  // Se agrega el monto a la lista de montos
    }
                                                                                                            // mostrar la lista de reservas en consola
    public void mostrarReservas() {                                                                         // Método para mostrar las reservas
        System.out.println("Reservas:");                                                                    // Se imprime el título
         for (Reserva reserva : reservas) {                                                                 // Se recorre la lista de reservas
             Usuario usuario = usuarios.get(reservas.indexOf(reserva));                                     // Se obtiene el usuario de la reserva
             reserva.getUsuario(usuario.getNombre());                                                       // Se obtiene el nombre del usuario
             reserva.getTipoReserva();                                                                      // Se obtiene el tipo de reserva
             System.out.print("    -    Método de pago: " + metodos.get(reservas.indexOf(reserva)));        // Se imprime el método de pago
             System.out.println("    -    Monto: $" + montos.get(reservas.indexOf(reserva)) + ".00 USD");   // Se imprime el monto
         }
    }
}
