package Sistema.Pagos;

public class PagoPayPal implements EstrategiaPago {                 // Clase para el pago con PayPal
 private int pago;

    public PagoPayPal(int pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "PagoPayPal{" +
            "pago=" + pago +
            '}';
    }
}
