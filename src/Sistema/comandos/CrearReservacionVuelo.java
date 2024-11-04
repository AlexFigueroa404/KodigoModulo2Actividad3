package Sistema.comandos;

import Sistema.servicios.ReservaVueloService;

public class CrearReservacionVuelo implements Comando {


  private final ReservaVueloService reservaVueloService;

  public CrearReservacionVuelo(ReservaVueloService reservaVueloService) {
    this.reservaVueloService = reservaVueloService;
  }

  @Override
  public void ejecutar() {
    reservaVueloService.guardar();
  }

}
