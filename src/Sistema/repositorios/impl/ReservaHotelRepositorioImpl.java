package Sistema.repositorios.impl;

import Sistema.modelos.ReservaHotel;
import java.util.ArrayList;
import java.util.List;

public class ReservaHotelRepositorioImpl implements Sistema.repositorios.impl.ReservaHotelRepositorio {

  List<ReservaHotel> reservaHoteles = new ArrayList<>();

  @Override
  public List<ReservaHotel> mostrarReserva() {
    return reservaHoteles;
  }

  @Override
  public void guardar(ReservaHotel reservaHotel) {

    this.reservaHoteles.add(reservaHotel);


  }
}
