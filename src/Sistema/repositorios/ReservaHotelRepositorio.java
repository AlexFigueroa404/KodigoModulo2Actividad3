package Sistema.repositorios.impl;

import Sistema.modelos.ReservaHotel;
import java.util.List;

public interface ReservaHotelRepositorio {

  List<ReservaHotel> mostrarReserva();

  void guardar(ReservaHotel reservaHotel);
}
