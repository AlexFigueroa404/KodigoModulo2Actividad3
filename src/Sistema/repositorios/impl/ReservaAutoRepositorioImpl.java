package Sistema.repositorios.impl;

import Sistema.modelos.ReservaAuto;
import java.util.ArrayList;
import java.util.List;

public class ReservaAutoRepositorioImpl implements Sistema.repositorios.impl.ReservaAutoRepositorio {


  List<ReservaAuto> reservaAutos = new ArrayList<>();


  @Override

  public List<ReservaAuto> mostrarReserva() {
    return reservaAutos;
  }

  @Override
  public void guardar(ReservaAuto reservaAuto) {

    this.reservaAutos.add(reservaAuto);
  }
}
