package Sistema.Reservas;

public class AutoReservaFactory extends ReservaFactory {    // Fabrica concreta
    @Override
    public Reserva crearReserva() {                         // Metodo de fabricacion
        return new AutoReserva();                           // Producto concreto
    }
}