package Sistema.Pagos;

public class PagoTarjetaCredito implements EstrategiaPago {                     // Se implementa la interfaz EstrategiaPago
  private int pago;


    public PagoTarjetaCredito(int pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "PagoTarjetaCredito{" +
            "pago=" + pago +
            '}';
    }
}
