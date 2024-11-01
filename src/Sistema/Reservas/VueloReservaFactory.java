package Sistema.Reservas;

public class VueloReservaFactory extends ReservaFactory {   // Fabrica concreta
    @Override
    public Reserva crearReserva() {                         // Metodo de fabricacion
        return new VueloReserva();                          // Producto concreto
    }
}