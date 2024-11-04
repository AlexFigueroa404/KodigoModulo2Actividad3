package Sistema;

import Sistema.comandos.Comando;
import Sistema.comandos.CrearReservacionAuto;
import Sistema.comandos.CrearReservacionHotel;
import Sistema.comandos.CrearReservacionVuelo;
import Sistema.comandos.MostrarReservaciones;
import Sistema.servicios.ReservaAutoService;
import Sistema.servicios.ReservaHotelService;
import Sistema.servicios.ReservaVueloService;
import java.util.Scanner;

public class Menu {


  Scanner scanner = new Scanner(System.in);

  private final ReservaHotelService reservaHotelService;
  private final ReservaAutoService reservaAutoService;
  private final ReservaVueloService reservaVueloService;

  public Menu(ReservaHotelService reservaHotelService, ReservaAutoService reservaAutoService, ReservaVueloService reservaVueloService) {
    this.reservaHotelService = reservaHotelService;
    this.reservaAutoService = reservaAutoService;
    this.reservaVueloService = reservaVueloService;
  }

  public void mostrarMenu() {


    while (true){
      System.out.println("1. Crear reservación de hotel");
      System.out.println("2. Crear reservación de auto");
      System.out.println("3. Crear reservación de vuelo");
      System.out.println("4. Mostrar reservaciones");
      System.out.println("5. Salir");

      int opcion = scanner.nextInt();
      scanner.nextLine();

      Comando comando = null;

      switch (opcion) {
        case 1:
          comando = new CrearReservacionHotel(reservaHotelService);
          break;
        case 2:
          comando = new CrearReservacionAuto(reservaAutoService);
          comando.ejecutar();
          break;
        case 3:
          comando = new CrearReservacionVuelo(reservaVueloService);
          break;
        case 4:
          comando = new MostrarReservaciones(reservaHotelService, reservaAutoService, reservaVueloService);
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Opción no válida");
          continue;
      }

      comando.ejecutar();


    }

  }





}
