package Sistema.Reservas;

public class AutoReserva implements Reserva {                                   // Cambio de clase a pública

    @Override
    public void reservar() {                                                    // Cambio de metodo a publico
        System.out.println("Reserva de auto realizada.");                       // muestra mensaje de reserva de auto
    }

    @Override
    public void getTipoReserva() {                                              // Cambio de metodo a publico
        System.out.print("    -    Tipo de reserva: Reserva de auto");          // muestra mensaje de tipo de reserva
    }

    @Override
    public void getUsuario(String usuario) {                                    // Cambio de metodo a publico
        System.out.print("Usuario: " + usuario);                                // muestra mensaje de usuario
    }
}