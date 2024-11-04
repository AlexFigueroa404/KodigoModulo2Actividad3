package Sistema.repositorios.impl;

import Sistema.modelos.ReservaHotel;
import Sistema.modelos.ReservaVuelo;
import java.util.List;

public interface ReservaVueloRepositorio {

  List<ReservaVuelo> mostrarReserva();
  void guardar(ReservaVuelo reservaVuelo);
}
