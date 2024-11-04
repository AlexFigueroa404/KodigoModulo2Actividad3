package Sistema.repositorios.impl;

import Sistema.modelos.ReservaVuelo;
import java.util.ArrayList;
import java.util.List;

public class ReservaVueloRepositorioImpl implements Sistema.repositorios.impl.ReservaVueloRepositorio {


  List<ReservaVuelo> reservaVuelos = new ArrayList<>();


  @Override
  public List<ReservaVuelo> mostrarReserva() {
    return reservaVuelos;
  }

  @Override
  public void guardar(ReservaVuelo reservaVuelo) {

    this.reservaVuelos.add(reservaVuelo);
  }
}
