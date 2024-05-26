package clases;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones_Pasantias operaciones = new Operaciones_Pasantias();
        boolean salir = false;
        while (!salir) {
            System.out.println("=====BIENVENIDO========");
            System.out.println("Elija una opción:");
            System.out.println("=======================");
            System.out.println("1. Agregar Pasantia");
            System.out.println("2. Buscar Pasantia");
            System.out.println("3. Modificar Pasantia");
            System.out.println("4. Inactivar Pasantia");
            System.out.println("5. Modificar Convenio");
            System.out.println("6. Buscar Convenio");
            System.out.println("7. Publicar Pasantia");
            System.out.println("8. Crear Convenio");
            System.out.println("9. Salir");
            System.out.print("Opcion: ");
            System.out.println("=======================");
            System.out.println("\n");
            String opcion = (scanner.next());
            scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el codigo de la pasantia: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nombre = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha de inicio: ");
                    String fechaInicio = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha de finalizacion de la pasantia: ");
                    String fechaFinalizacion = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese el numero de pasantes requeridos: ");
                    int numeroPasantes = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese la descripcion de la pasantia: ");
                    String descripcion = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese el numero de convenio: ");
                    String numeroConvenio = scanner.next();
                    scanner.nextLine();
                    System.out.println("\n");

                    boolean estado = true;

                    Pasantia nuevaPasantia = new Pasantia(codigo, nombre, fechaInicio, fechaFinalizacion, numeroPasantes, descripcion, numeroConvenio, estado);
                    operaciones.agregarPasantia(nuevaPasantia);

                    break;
                case "2":
                    System.out.println("Ingrese el número de la pasantia a buscar: ");
                    int codigoPasantia = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    Pasantia pasantiaEncontrada = operaciones.buscarPasantia(codigoPasantia);
                    if (pasantiaEncontrada != null) {
                        System.out.println("Pasantia encontrada:\n");
                        System.out.println("Codigo: " + pasantiaEncontrada.getCodigo());
                        System.out.println("Empresa: " + pasantiaEncontrada.getNombre_empresa());
                        System.out.println("Fecha de Inicio: " + pasantiaEncontrada.getFecha_inicio());
                        System.out.println("Feha de Finalizacion: " + pasantiaEncontrada.getFecha_finalizacion());
                        System.out.println("Numero de Pasantes: " + pasantiaEncontrada.getNumero_pasantes());
                        System.out.println("Descripcion: " + pasantiaEncontrada.getDescripcion());
                        System.out.println("Numero de Convenio: " + pasantiaEncontrada.getNumero_convenio());
                        System.out.println("Estado: " + pasantiaEncontrada.isEstado());
                        System.out.println("\n");
                    } else {
                        System.out.println("Pasantia no encontrada.");
                    }
                    break;

                case "3":
                    System.out.print("Ingrese el número de la pasantia para modificar: ");
                    int codigoPasantiaModificar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nuevoNombre = scanner.nextLine();

                    System.out.print("Ingrese la fecha de inicio: ");
                    String nuevafechaInicio = scanner.nextLine();

                    System.out.print("Ingrese la fecha de finalizacion: ");
                    String nuevafechaFinalizacion = scanner.nextLine();

                    System.out.print("Ingrese el numero de pasantes: ");
                    int nuevosPasantes = scanner.nextInt();

                    System.out.print("Ingrese la descripcion de la pasantia: ");
                    String nuevaDescripcion = scanner.nextLine();

                    System.out.print("Ingrese el  numero de convenio: ");
                    String nuevoNumeroConvenio = scanner.nextLine();

                    System.out.print("Ingrese el estado de la pasantia: ");
                    String nuevoEstado = scanner.nextLine();

                    operaciones.ModificarPasantia(codigoPasantiaModificar, nuevoNombre, nuevafechaInicio, nuevafechaFinalizacion, nuevosPasantes, nuevaDescripcion, nuevoNumeroConvenio, nuevoEstado);

                    break;

                case "4":
                    System.out.print("Ingrese el número de la pasantia para Inactivar: ");
                    int codigoPasantiaInactivar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();

                    String EstadoPasantia = "No disponible";

                    operaciones.InactivarPasantia(codigoPasantiaInactivar, EstadoPasantia);

                    break;

                case "5":
                    System.out.print("Ingrese el codigo del convenio para modificar: ");
                    int codigoConvenioModificar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nuevaEmpresa = scanner.nextLine();

                    System.out.print("Ingrese la fecha de inicio: ");
                    String nuevaFechaInicial = scanner.nextLine();

                    System.out.print("Ingrese la fecha de finalizacion: ");
                    String nuevaFechaFin = scanner.nextLine();

                    System.out.print("Ingrese el correo del representante pasantes: ");
                    String nuevoCorreoRepresentante = scanner.nextLine();

                    System.out.print("Seleccione el Archivo: ");
                    String filePath = scanner.nextLine();
                    byte[] nuevoArchvo = null;
                    if (!filePath.isEmpty()) {
                        ConvenioMacro convenio = operaciones.buscarConvenio(codigoConvenioModificar);
                    }

                    operaciones.ModificarConvenio(codigoConvenioModificar, nuevaEmpresa, nuevaFechaInicial, nuevaFechaFin, nuevoCorreoRepresentante, nuevoArchvo);

                    break;

                case "6":
                    System.out.println("Ingrese el número de convenio a buscar: ");
                    int codigo_Convenio = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    ConvenioMacro convenioEncontrado = operaciones.buscarConvenio(codigo_Convenio);
                    if (convenioEncontrado != null) {
                        System.out.println("Pasantia encontrada:\n");
                        System.out.println("Numero de Convenio: " + convenioEncontrado.getNumeroConvenio());
                        System.out.println("Fecha de Inicio: " + convenioEncontrado.getFachaInicio());
                        System.out.println("Feha de Finalizacion: " + convenioEncontrado.getFechaFinalizacion());
                        System.out.println("Empresa del Convenio: " + convenioEncontrado.getNombreEmpresa());
                        System.out.println("Correo del Representante: " + convenioEncontrado.getCorreoRepresentante());
                        System.out.println("Archivo de Convenio: " + convenioEncontrado.getArchivoConvenio());
                        System.out.println("\n");
                    } else {
                        System.out.println("¡Convenio no encontrada!");
                    }
                    break;

                case "7":
                    operaciones.PublicarPasantia();
                    break;

                case "8":
                    System.out.print("Ingrese el codigo del convenio: ");
                    int codigoConvenio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String empresaConvenio = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha de inicio: ");
                    String fechaInicioConvenio = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha de finalizacion del convenio: ");
                    String fechaFinalizacionConvenio = scanner.next();
                    scanner.nextLine();

                    System.out.print("Ingrese el correo del representante: ");
                    String correoRepresentante = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("\n");

                    ConvenioMacro nuevoConvenio = new ConvenioMacro(codigoConvenio, fechaInicioConvenio, fechaFinalizacionConvenio, empresaConvenio, correoRepresentante);
                    operaciones.CrearConvenio(nuevoConvenio);
                    break;

                case "9":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}
