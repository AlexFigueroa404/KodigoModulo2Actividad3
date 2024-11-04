package Sistema.repositorios.impl;

import Sistema.modelos.ReservaAuto;
import Sistema.modelos.ReservaHotel;
import java.util.List;

public interface ReservaAutoRepositorio {

  List<ReservaAuto> mostrarReserva();

  void guardar(ReservaAuto reservaAuto);
}
