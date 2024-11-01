package Sistema.ServiciosExtras;

import Sistema.Reservas.Reserva;

public class SeguroAutoReserva extends ReservaDecorator {                                  // Clase SeguroAutoReserva
    public SeguroAutoReserva(Reserva reserva) {                                            // Constructor de la clase
        super(reserva);                                                                    // Se llama al constructor de la clase padre
    }

    @Override
    public void reservar() {                                                                // Método para reservar
        super.reservar();                                                                   // Se llama al método reservar de la clase padre
        System.out.println("Seguro de auto agregado a la reserva.");                        // Se imprime un mensaje
    }

    @Override
    public void getTipoReserva() {                                                          // Método para obtener el tipo de reserva
        System.out.print("    -    Tipo de reserva: Reserva de Auto con seguro incluido");  // Se imprime un mensaje
    }

    @Override
    public void getUsuario(String usuario) {                                                // Método para obtener el usuario
        System.out.print("Usuario: " + usuario);                                            // Se imprime el usuario
    }
}
