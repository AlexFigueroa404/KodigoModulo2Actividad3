package Sistema.Pagos;

public class PagoPayPal implements EstrategiaPago {                 // Clase para el pago con PayPal
    @Override
    public void pagar(double monto) {                               // Método para pagar
        System.out.println("Pagando " + monto + " con PayPal.");    // Se imprime el mensaje de pago con PayPal
    }
}
