package Sistema.comandos;

import Sistema.servicios.ReservaHotelService;

public class CrearReservacionHotel implements Comando {


  private final ReservaHotelService reservaHotelService;

  public CrearReservacionHotel(ReservaHotelService reservaHotelService) {
    this.reservaHotelService = reservaHotelService;
  }

  @Override
  public void ejecutar() {
    reservaHotelService.guardar();
  }
}
