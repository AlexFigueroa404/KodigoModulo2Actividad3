package Sistema.Usuarios;

import java.util.ArrayList;                                                             // Se importa la clase ArrayList
import java.util.List;                                                                  // Se importa la clase List

public class ReservaNotificacion {                                                      // Clase ReservaNotificacion
    private final List<Observador> observadores = new ArrayList<>();                    // Se declara la lista de observadores
    public void agregarObservador(Observador observador) {                              // Método para agregar un observador
        observadores.add(observador);                                                   // Se agrega el observador a la lista de observadores
    }
                                                                                        // Método para notificar a los observadores
    public void notificarObservadores(String mensaje) {                                 // Se recibe el mensaje a notificar
        for (Observador observador : observadores) {                                    // Se recorre la lista de observadores
            observador.actualizar(mensaje);                                             // Se llama al método actualizar del observador
        }
    }
                                                                                        // Método para cambiar el estado de la reserva
    public void cambiarEstadoReserva(String nuevoEstado) {                              // Se recibe el nuevo estado de la reserva
        notificarObservadores("La reserva ha cambiado a: " + nuevoEstado);      // Se notifica a los observadores
    }
}