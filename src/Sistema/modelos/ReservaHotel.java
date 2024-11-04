package Sistema.modelos;

import Sistema.Pagos.EstrategiaPago;

public class ReservaHotel {


  private Usuario usuario;
  private EstrategiaPago estrategiaPago;
  private boolean desayuno;

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

  public boolean isDesayuno() {
    return desayuno;
  }

  public void setDesayuno(boolean desayuno) {
    this.desayuno = desayuno;
  }

  @Override
  public String toString() {
    return "ReservaHotel{" +
        "usuario=" + usuario +
        ", estrategiaPago=" + estrategiaPago +
        ", desayuno=" + desayuno +
        '}';
  }
}
