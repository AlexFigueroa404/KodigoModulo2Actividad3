package Sistema.modelos;

import Sistema.Pagos.EstrategiaPago;

public class ReservaVuelo {

  private Usuario usuario;
  private EstrategiaPago estrategiaPago;
  private boolean seguro;

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public EstrategiaPago getEstrategiaPago() {
    return estrategiaPago;
  }

  public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
    this.estrategiaPago = estrategiaPago;
  }

  public boolean isSeguro() {
    return seguro;
  }

  public void setSeguro(boolean seguro) {
    this.seguro = seguro;
  }

  @Override
  public String toString() {
    return "ReservaVuelo{" +
        "usuario=" + usuario +
        ", estrategiaPago=" + estrategiaPago +
        ", seguro=" + seguro +
        '}';
  }
}
