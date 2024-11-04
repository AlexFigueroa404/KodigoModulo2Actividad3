package Sistema.servicios.impl;

import Sistema.Pagos.EstrategiaPago;
import Sistema.Pagos.PagoPayPal;
import Sistema.Pagos.PagoTarjetaCredito;
import Sistema.Pagos.PagoTransferenciaBancaria;
import Sistema.modelos.ReservaAuto;
import Sistema.modelos.Usuario;
import Sistema.repositorios.impl.ReservaAutoRepositorio;
import Sistema.servicios.ReservaAutoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservaAutoImpl implements ReservaAutoService {


  private final ReservaAutoRepositorio reservaAutoRepositorio;
  private final Usuario usuario = new Usuario();
  private final Scanner scanner = new Scanner(System.in);
  private final ReservaAuto reservaAuto = new ReservaAuto();

  public ReservaAutoImpl(ReservaAutoRepositorio reservaAutoRepositorio) {
    this.reservaAutoRepositorio = reservaAutoRepositorio;
  }

  @Override

  public void mostrarReserva() {

    for (ReservaAuto reserva : reservaAutoRepositorio.mostrarReserva()) {

      System.out.println(reserva);
    }

  }

  @Override
  public void guardar() {
    System.out.println("Ingrese su nombre: ");
    usuario.setNombre(scanner.nextLine());
    reservaAuto.setUsuario(usuario);

    System.out.println("Desea agregar seguro a la reserva? \n1. Si \n2. No");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    reservaAuto.setSeguro(opcion == 1);

    System.out.println(
        "Seleccione metodo de pago \n1. Tarjeta de credito \n2. Transferencia bancaria \n3. PayPal");
    int opcionPago = scanner.nextInt();
    scanner.nextLine();

    EstrategiaPago estrategiaPago = switch (opcionPago) {
      case 1 -> new PagoTarjetaCredito(200);
      case 2 -> new PagoTransferenciaBancaria(200);
      case 3 -> new PagoPayPal(200);
      default -> null;
    };

    reservaAuto.setEstrategiaPago(estrategiaPago);

    reservaAutoRepositorio.guardar(reservaAuto);

    System.out.println("Datos de la reserva de auto");

    System.out.println("Usuario: " + usuario.getNombre());
    System.out.println("Seguro: " + reservaAuto.isSeguro());
    System.out.println("Pago: " + estrategiaPago);
    System.out.println("Reserva de auto guardada exitosamente");

  }
}
