package Sistema.Pagos;

public class PagoTransferenciaBancaria implements EstrategiaPago {                      // Se implementa la interfaz EstrategiaPago

    private int pago;

    public PagoTransferenciaBancaria(int pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "PagoTransferenciaBancaria{" +
            "pago=" + pago +
            '}';
    }
}
