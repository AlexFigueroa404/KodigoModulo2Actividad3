package Sistema.Pagos;

public class Pagos {                                                                            // Clase Reserva
    private EstrategiaPago estrategiaPago;                                                      // Se declara la variable estrategiaPago
    private String metodoPago;

                                                                                                // Método para definir la estrategia de pago
    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {                              // Se recibe la estrategia de pago
        this.estrategiaPago = estrategiaPago;                                                   // Se asigna la estrategia de pago
    }

    public void setMetodoPago(String metodoPago) {                                              // Método para definir el método de pago
        this.metodoPago = metodoPago;                                                           // Se asigna el método de pago
    }

    public String getMetodoPago() {                                                             // Método para obtener el método de pago
        return metodoPago;                                                                      // Se retorna el método de pago
    }
                                                                                                // Método para procesar el pago
    public void procesarPago(double monto) {                                                    // Se recibe el monto a pagar
        if (estrategiaPago == null) {                                                           // Si la estrategia de pago no ha sido seleccionada
            throw new IllegalStateException("La estrategia de pago no ha sido seleccionada.");  // Se lanza una excepción
        }
        estrategiaPago.pagar(monto);                                                            // Se llama al método pagar de la estrategia de pago
    }
}
