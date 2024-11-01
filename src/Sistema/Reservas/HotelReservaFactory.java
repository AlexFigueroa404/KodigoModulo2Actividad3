package Sistema.Reservas;

public class HotelReservaFactory extends ReservaFactory {   // Fabrica concreta
    @Override
    public Reserva crearReserva() {                         // Metodo de fabricacion
        return new HotelReserva();                          // Producto concreto
    }
}