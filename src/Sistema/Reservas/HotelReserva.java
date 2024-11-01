package Sistema.Reservas;

public class HotelReserva implements Reserva {                              // Cambio de clase a pública

    @Override
    public void reservar() {                                                // Cambio de metodo a publico
        System.out.println("Reserva de hotel realizada.");                  // muestra mensaje de reserva de hotel
    }

    @Override
    public void getTipoReserva() {                                          // Cambio de metodo a publico
        System.out.print("    -    Tipo de reserva: Reserva de hotel");     // muestra mensaje de tipo de reserva
    }

    @Override
    public void getUsuario(String usuario) {                                // Cambio de metodo a publico
        System.out.print("Usuario: " + usuario);                            // muestra mensaje de usuario
    }
}