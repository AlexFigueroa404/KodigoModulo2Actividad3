package Sistema.servicios.impl;

import Sistema.Pagos.EstrategiaPago;
import Sistema.Pagos.PagoPayPal;
import Sistema.Pagos.PagoTarjetaCredito;
import Sistema.Pagos.PagoTransferenciaBancaria;
import Sistema.modelos.ReservaHotel;
import Sistema.modelos.ReservaVuelo;
import Sistema.modelos.Usuario;
import Sistema.repositorios.impl.ReservaVueloRepositorio;
import Sistema.servicios.ReservaVueloService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservaVueloImpl implements ReservaVueloService {


  private final ReservaVueloRepositorio reservaVueloRepositorio;

  private final Scanner scanner = new Scanner(System.in);
  private final Usuario usuario = new Usuario();
  private final ReservaVuelo reservaVuelo = new ReservaVuelo();

  public ReservaVueloImpl(ReservaVueloRepositorio reservaVueloRepositorio) {
    this.reservaVueloRepositorio = reservaVueloRepositorio;
  }

  @Override
  public void mostrarReserva() {

    for (ReservaVuelo reserva : reservaVueloRepositorio.mostrarReserva()) {

      System.out.println(reserva);
    }

  }

  @Override
  public void guardar() {
    System.out.println("Ingrese su nombre: ");
    usuario.setNombre(scanner.nextLine());
    reservaVuelo.setUsuario(usuario);

    System.out.println("Desea agregar seguro a la reserva? \n1. Si \n2. No");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    reservaVuelo.setSeguro(opcion == 1);

    System.out.println(
        "Seleccione metodo de pago \n1. Tarjeta de credito \n2. Transferencia bancaria \n3. PayPal");
    int opcionPago = scanner.nextInt();
    scanner.nextLine();

    EstrategiaPago estrategiaPago = switch (opcionPago) {
      case 1 -> new PagoTarjetaCredito(300);
      case 2 -> new PagoTransferenciaBancaria(300);
      case 3 -> new PagoPayPal(300);
      default -> null;
    };

    reservaVuelo.setEstrategiaPago(estrategiaPago);

    reservaVueloRepositorio.guardar(reservaVuelo);

    System.out.println("Datos de la reserva de Vuelo");

    System.out.println("Usuario: " + usuario.getNombre());
    System.out.println("Seguro: " + reservaVuelo.isSeguro());
    System.out.println("Pago: " + estrategiaPago);
    System.out.println("Reserva de Vuelo guardada exitosamente");

  }
}
