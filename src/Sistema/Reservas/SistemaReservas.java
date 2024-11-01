package Sistema.Reservas;

public class SistemaReservas {

    private static SistemaReservas instancia;                           // Declaramos una instancia de la clase

    private SistemaReservas() {}                                        // Constructor privado

    public static synchronized SistemaReservas getInstance() {          // Método para obtener la instancia de la clase
        if (instancia == null) {                                        // Si la instancia es nula
            instancia = new SistemaReservas();                          // Creamos una nueva instancia
        }
        return instancia;                                               // Retornamos la instancia
    }

    public void realizarReserva(Reserva reserva) {                      // Lógica para gestionar una reserva
        reserva.reservar();                                             // Llamamos al método reservar de la clase Reserva
    }
}
