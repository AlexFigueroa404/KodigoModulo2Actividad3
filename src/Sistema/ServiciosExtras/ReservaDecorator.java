package Sistema.ServiciosExtras;

import Sistema.Reservas.Reserva;

public abstract class ReservaDecorator implements Reserva { // Clase ReservaDecorator
    protected Reserva reservaDecorada;                      // Se declara la variable reservaDecorada

    public ReservaDecorator(Reserva reserva) {              // Constructor de la clase
        this.reservaDecorada = reserva;                     // Se asigna la reserva
    }

    @Override
    public void reservar() {                                // Método para reservar
        reservaDecorada.reservar();                         // Se llama al método reservar de la reserva decorada
    }
}