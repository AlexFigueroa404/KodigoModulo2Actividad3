package Sistema;

import Sistema.Pagos.*;                                                                 // importar paquete de pagos
import Sistema.Reservas.*;                                                              // importar paquete de reservas
import Sistema.Reservas.Reserva;                                                        // importar clase Reserva
import Sistema.ServiciosExtras.*;                                                       // importar paquete de servicios extras
import Sistema.Usuarios.*;                                                              // importar paquete de usuarios

import java.util.Scanner;                                                               // importar scanner

public class Main {

    public static void main(String[] args) {
        SistemaReservas sistema = SistemaReservas.getInstance();                        // instancia del sistema de reservas
        Manager admin = new Manager();                                                  // instancia del administrador de reservas
        ReservaFactory reservaFactory;                                                  // instancia de la fabrica de reservas
        Scanner scanner = new Scanner(System.in);                                       // instancia del scanner
        Pagos pagos = new Pagos();                                                      // instancia del sistema de pagos
        String metodoPago;                                                              // metodo de pago
        int monto;                                                                      // monto de la reserva
                                                                                        // menu de opciones
        mostrarMenu();                                                                  // mostrar menu
        int opcion = scanner.nextInt();                                                 // leer opcion
                                                                                        // bucle para seleccionar opciones
        while ( opcion != 5 ) {                                                         // mientras la opcion no sea 5
            if (opcion == 1) {                                                          // si la opcion es 1
                String nombre = IngresarNombre();                                       // ingresar nombre
                Usuario usuario = new Usuario(nombre);                                  // crear usuario
                ReservaNotificacion notificacion = new ReservaNotificacion();           // crear notificacion
                reservaFactory = new HotelReservaFactory();                             // crear fabrica de reservas
                Reserva reservaHotel = reservaFactory.crearReserva();                   // crear reserva de hotel
                monto = 100;                                                            // monto de la reserva
                                                                                        // bucle para seleccionar opciones
                while (true) {                                                          // mientras sea verdadero
                    menuDesayuno();                                                     // menu para agregar desayuno
                    int opcionDesayuno = scanner.nextInt();                             // opcion para agregar desayuno
                    if (opcionDesayuno == 1) {                                          // si se elige agregar desayuno
                        reservaHotel = new DesayunoReserva(reservaHotel);               // Agregar desayuno
                        monto += 30;                                                    // aumentar el monto
                        break;                                                          // salir del bucle
                    } else if (opcionDesayuno == 2) {                                   // si no se elige agregar desayuno
                        System.out.println("No se agregará desayuno a la reserva.");    // no agregar desayuno
                        break;                                                          // salir del bucle
                    } else {                                                            // si se ingresa una opcion no valida
                        System.out.println("Opción no válida.");                        // mostrar mensaje de error
                    }
                }
                                                                                        // seleccionar metodo de pago
                metodoPago = DefinirPago(scanner, pagos);                               // definir metodo de pago
                sistema.realizarReserva(reservaHotel);                                  // realizar reserva
                notificacion.agregarObservador(usuario);                                // agregar observador
                admin.agregarReserva(usuario, reservaHotel, metodoPago, monto);         // agregar reserva al administrador
                notificacion.cambiarEstadoReserva("Confirmada");             // cambiar estado de la reserva
                pagos.procesarPago(monto);                                              // procesar pago
                mostrarMenu();                                                          // mostrar menu
                opcion = scanner.nextInt();                                             // leer opcion
            }
            else if (opcion == 2) {                                                     // si la opcion es 2
                String nombre = IngresarNombre();                                       // ingresar nombre
                Usuario usuario = new Usuario(nombre);                                  // crear usuario
                ReservaNotificacion notificacion = new ReservaNotificacion();           // crear notificacion
                reservaFactory = new VueloReservaFactory();                             // crear fabrica de reservas
                Reserva reservaVuelo = reservaFactory.crearReserva();                   // crear reserva de vuelo
                monto = 300;                                                            // monto de la reserva
                                                                                        // bucle para seleccionar opciones
                while (true) {                                                          // mientras sea verdadero
                    menuSeguro();                                                       // menu para agregar seguro
                    int opcionSeguro = scanner.nextInt();                               // opcion para agregar seguro
                    if (opcionSeguro == 1) {                                            // si se elige agregar seguro
                        reservaVuelo = new SeguroVueloReserva(reservaVuelo);            // Agregar seguro
                        monto += 50;                                                    // aumentar el monto
                        break;                                                          // salir del bucle
                    } else if (opcionSeguro == 2) {                                     // si no se elige agregar seguro
                        System.out.println("No se agregará seguro a la reserva.");      // no agregar seguro
                        break;                                                          // salir del bucle
                    } else {                                                            // si se ingresa una opcion no valida
                        System.out.println("Opción no válida.");                        // mostrar mensaje de error
                    }
                }
                                                                                        // seleccionar metodo de pago
                metodoPago = DefinirPago(scanner, pagos);                               // definir metodo de pago
                sistema.realizarReserva(reservaVuelo);                                  // realizar reserva
                notificacion.agregarObservador(usuario);                                // agregar observador
                admin.agregarReserva(usuario, reservaVuelo, metodoPago, monto);         // agregar reserva al administrador
                notificacion.cambiarEstadoReserva("Confirmada");             // cambiar estado de la reserva
                pagos.procesarPago(monto);                                              // procesar pago
                mostrarMenu();                                                          // mostrar menu
                opcion = scanner.nextInt();                                             // leer opcion
            }
            else if (opcion == 3) {                                                     // si la opcion es 3
                String nombre = IngresarNombre();                                       // ingresar nombre
                Usuario usuario = new Usuario(nombre);                                  // crear usuario
                ReservaNotificacion notificacion = new ReservaNotificacion();           // crear notificacion
                reservaFactory = new AutoReservaFactory();                              // crear fabrica de reservas
                Reserva reservaAuto = reservaFactory.crearReserva();                    // crear reserva de auto
                monto = 200;                                                            // monto de la reserva
                                                                                        // bucle para seleccionar opciones
                while (true) {                                                          // mientras sea verdadero
                    menuSeguro();                                                       // menu para agregar seguro
                    int opcionSeguro = scanner.nextInt();                               // opcion para agregar seguro
                    if (opcionSeguro == 1) {                                            // si se elige agregar seguro
                        reservaAuto = new SeguroAutoReserva(reservaAuto);               // Agregar seguro
                        monto += 50;                                                    // aumentar el monto
                        break;                                                          // salir del bucle
                    } else if (opcionSeguro == 2) {                                     // si no se elige agregar seguro
                        System.out.println("No se agregará seguro a la reserva.");      // no agregar seguro
                        break;                                                          // salir del bucle
                    } else {                                                            // si se ingresa una opcion no valida
                        System.out.println("Opción no válida.");                        // mostrar mensaje de error
                    }
                }
                                                                                        // seleccionar metodo de pago
                metodoPago = DefinirPago(scanner, pagos);                               // definir metodo de pago
                sistema.realizarReserva(reservaAuto);                                   // realizar reserva
                notificacion.agregarObservador(usuario);                                // agregar observador
                admin.agregarReserva(usuario, reservaAuto, metodoPago, monto);          // agregar reserva al administrador
                notificacion.cambiarEstadoReserva("Confirmada");             // cambiar estado de la reserva
                pagos.procesarPago(monto);                                              // procesar pago
                mostrarMenu();                                                          // mostrar menu
                opcion = scanner.nextInt();                                             // leer opcion
            }
            else if (opcion == 4) {                                                     // si la opcion es 4
                admin.mostrarReservas();                                                // mostrar reservas
                mostrarMenu();                                                          // mostrar menu
                opcion = scanner.nextInt();                                             // leer opcion
            }
            else {                                                                      // si se ingresa una opcion no valida
                System.out.println("Opción no válida.");                                // mostrar mensaje de error
                mostrarMenu();                                                          // mostrar menu
                opcion = scanner.nextInt();                                             // leer opcion
            }
        }
    }

    private static String DefinirPago(Scanner scanner, Pagos pagos) {
        menuPago();                                                             // menu de pagos
        int opcionPago = scanner.nextInt();                                     // opcion de pago
        String metodoPago;                                                      // metodo de pago
        if (opcionPago == 1) {                                                  // si se elige tarjeta de credito
            pagos.setEstrategiaPago(new PagoTarjetaCredito());                  // se elige la estrategia de pago
            metodoPago = "Tarjeta de credito";                                  // se define el metodo de pago
        } else if (opcionPago == 2) {                                           // si se elige transferencia bancaria
            pagos.setEstrategiaPago(new PagoTransferenciaBancaria());           // se elige la estrategia de pago
            metodoPago = "Transferencia bancaria";                              // se define el metodo de pago
        } else if (opcionPago == 3) {                                           // si se elige paypal
            pagos.setEstrategiaPago(new PagoPayPal());                          // se elige la estrategia de pago
            metodoPago = "PayPal";                                              // se define el metodo de pago
        } else {                                                                // si se ingresa una opcion no valida
            System.out.println("Opción no válida.");                            // mostrar mensaje de error
            metodoPago = "No se ha seleccionado un método de pago";             // se define el metodo de pago
        }
        return metodoPago;                                                      // retornar el metodo de pago
    }

    public static void mostrarMenu() {
        System.out.println("Menu.");
        System.out.println("1. Hotel");
        System.out.println("2. Vuelo");
        System.out.println("3. Auto");
        System.out.println("4. Mostrar reservas");
        System.out.println("5. Salir");
        System.out.println("Ingrese el número de la opción deseada: ");
    }

    public static void menuDesayuno() {
        System.out.println("¿Desea agregar desayuno a la reserva?");
        System.out.println("1. Sí");
        System.out.println("2. No");
    }

    public static void menuSeguro() {
        System.out.println("¿Desea agregar seguro a la reserva?");
        System.out.println("1. Sí");
        System.out.println("2. No");
    }

    static String IngresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        return scanner.next();
    }

    // menu de pagos
    public static void menuPago() {
        System.out.println("Seleccione metodo de pago");
        System.out.println("1. Tarjeta de credito");
        System.out.println("2. Transferencia bancaria");
        System.out.println("3. PayPal");
    }
}