package Sistema;


import Sistema.repositorios.impl.ReservaAutoRepositorioImpl;
import Sistema.repositorios.impl.ReservaHotelRepositorioImpl;
import Sistema.repositorios.impl.ReservaVueloRepositorioImpl;
import Sistema.servicios.ReservaAutoService;
import Sistema.servicios.ReservaHotelService;
import Sistema.servicios.ReservaVueloService;
import Sistema.servicios.impl.ReservaAutoImpl;
import Sistema.servicios.impl.ReservaHotelImpl;
import Sistema.servicios.impl.ReservaVueloImpl;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    ReservaVueloRepositorioImpl reservaVueloRepositorio = new ReservaVueloRepositorioImpl();
    ReservaAutoRepositorioImpl reservaAutoRepositorio = new ReservaAutoRepositorioImpl();
    ReservaHotelRepositorioImpl reservaHotelRepositorio = new ReservaHotelRepositorioImpl();

    ReservaVueloService reservaVueloService = new ReservaVueloImpl(reservaVueloRepositorio);
    ReservaAutoService reservaAutoService = new ReservaAutoImpl(reservaAutoRepositorio);
    ReservaHotelService reservaHotelService = new ReservaHotelImpl(reservaHotelRepositorio);

    Menu menu = new Menu(reservaHotelService, reservaAutoService, reservaVueloService);

    menu.mostrarMenu();


  }
}