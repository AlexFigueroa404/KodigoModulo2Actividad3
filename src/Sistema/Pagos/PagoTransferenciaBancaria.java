package Sistema.Pagos;

public class PagoTransferenciaBancaria implements EstrategiaPago {                      // Se implementa la interfaz EstrategiaPago
    @Override
    public void pagar(double monto) {                                                   // Se implementa el método pagar
        System.out.println("Pagando " + monto + " mediante transferencia bancaria.");   // Se imprime el mensaje de pago
    }
}
