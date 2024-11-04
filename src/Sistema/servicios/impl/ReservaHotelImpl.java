package Sistema.servicios.impl;

import Sistema.Pagos.EstrategiaPago;
import Sistema.Pagos.PagoPayPal;
import Sistema.Pagos.PagoTarjetaCredito;
import Sistema.Pagos.PagoTransferenciaBancaria;
import Sistema.modelos.ReservaAuto;
import Sistema.modelos.ReservaHotel;
import Sistema.modelos.Usuario;
import Sistema.repositorios.impl.ReservaHotelRepositorio;
import Sistema.servicios.ReservaHotelService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservaHotelImpl implements ReservaHotelService {

  private final ReservaHotelRepositorio reservaHotelRepositorio;

  private final Scanner scanner = new Scanner(System.in);

  private final ReservaHotel reservaHotel = new ReservaHotel();

  private final Usuario usuario = new Usuario();

  public ReservaHotelImpl(ReservaHotelRepositorio reservaHotelRepositorio) {
    this.reservaHotelRepositorio = reservaHotelRepositorio;
  }

  @Override
  public void mostrarReserva() {
    for (ReservaHotel reserva : reservaHotelRepositorio.mostrarReserva()) {

      System.out.println(reserva);
    }
  }

  @Override
  public void guardar() {
    System.out.println("Ingrese su nombre: ");
    usuario.setNombre(scanner.nextLine());
    reservaHotel.setUsuario(usuario);

    System.out.println("Desea agregar desayuno a la reserva? \n1. Si \n2. No");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    reservaHotel.setDesayuno(opcion == 1);

    System.out.println(
        "Seleccione metodo de pago \n1. Tarjeta de credito \n2. Transferencia bancaria \n3. PayPal");
    int opcionPago = scanner.nextInt();
    scanner.nextLine();

    EstrategiaPago estrategiaPago = switch (opcionPago) {
      case 1 -> new PagoTarjetaCredito(100);
      case 2 -> new PagoTransferenciaBancaria(100);
      case 3 -> new PagoPayPal(100);
      default -> null;
    };

    reservaHotel.setEstrategiaPago(estrategiaPago);

    reservaHotelRepositorio.guardar(reservaHotel);

    System.out.println("Datos de la reserva de hotel");

    System.out.println("Usuario: " + usuario.getNombre());
    System.out.println("Seguro: " + reservaHotel.isDesayuno());
    System.out.println("Pago: " + estrategiaPago);
    System.out.println("Reserva de auto guardada exitosamente");


  }
}
