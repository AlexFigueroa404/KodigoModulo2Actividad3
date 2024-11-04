package Sistema.comandos;

import Sistema.servicios.ReservaAutoService;
import Sistema.servicios.ReservaHotelService;
import Sistema.servicios.ReservaVueloService;

public class MostrarReservaciones implements Comando {


  private final ReservaHotelService reservaHotelService;
  private final ReservaAutoService reservaAutoService;
  private final ReservaVueloService reservaVueloService;

  public MostrarReservaciones(ReservaHotelService reservaHotelService,
      ReservaAutoService reservaAutoService, ReservaVueloService reservaVueloService) {
    this.reservaHotelService = reservaHotelService;
    this.reservaAutoService = reservaAutoService;
    this.reservaVueloService = reservaVueloService;
  }


  @Override
  public void ejecutar() {
    reservaHotelService.mostrarReserva();
    reservaAutoService.mostrarReserva();
    reservaVueloService.mostrarReserva();

  }

}
