package Sistema.ServiciosExtras;

import Sistema.Reservas.Reserva;

public class DesayunoReserva extends ReservaDecorator {                                         // Clase DesayunoReserva
    public DesayunoReserva(Reserva reserva) {                                                   // Constructor de la clase
        super(reserva);                                                                         // Se llama al constructor de la clase padre
    }

    @Override
    public void reservar() {                                                                    // Método para reservar
        super.reservar();                                                                       // Se llama al método reservar de la clase padre
        System.out.println("Desayuno incluido en la reserva.");                                 // Se imprime un mensaje
    }

    @Override
    public void getTipoReserva() {                                                              // Método para obtener el tipo de reserva
        System.out.print("    -    Tipo de reserva: Reserva de Hotel con desayuno incluido");   // Se imprime un mensaje
    }

    @Override
    public void getUsuario(String usuario) {                                                    // Método para obtener el usuario
        System.out.print("Usuario: " + usuario);                                                // Se imprime el usuario
    }
}