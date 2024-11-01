package Sistema.Pagos;

public class PagoTarjetaCredito implements EstrategiaPago {                     // Se implementa la interfaz EstrategiaPago
    @Override
    public void pagar(double monto) {                                           // Se implementa el método pagar
        System.out.println("Pagando " + monto + " con tarjeta de crédito.");    // Se imprime el mensaje de pago con tarjeta de crédito
    }
}
