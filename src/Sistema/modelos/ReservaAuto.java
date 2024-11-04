package Sistema.modelos;

import Sistema.Pagos.EstrategiaPago;

public class ReservaAuto {

  private Usuario usuario;
  private EstrategiaPago estrategiaPago;
  private boolean seguro;

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public boolean isSeguro() {
    return seguro;
  }

  public void setSeguro(boolean seguro) {
    this.seguro = seguro;
  }

  public EstrategiaPago getEstrategiaPago() {
    return estrategiaPago;
  }

  public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
    this.estrategiaPago = estrategiaPago;
  }

  @Override
  public String toString() {
    return "ReservaAuto{" +
        "usuario=" + usuario +
        ", estrategiaPago=" + estrategiaPago +
        ", seguro=" + seguro +
        '}';
  }
}
