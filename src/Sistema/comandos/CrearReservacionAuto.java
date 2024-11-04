package Sistema.comandos;

import Sistema.servicios.ReservaAutoService;

public class CrearReservacionAuto implements Comando {


  private final ReservaAutoService reservaAutoService;

  public CrearReservacionAuto(ReservaAutoService reservaAutoService) {
    this.reservaAutoService = reservaAutoService;
  }


  @Override
  public void ejecutar() {

    reservaAutoService.guardar();

  }

}
