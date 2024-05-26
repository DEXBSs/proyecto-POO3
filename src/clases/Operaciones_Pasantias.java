package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class Operaciones_Pasantias {

    private ArrayList<Pasantia> pasantias;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<ConvenioMacro> convenios;

    public void ModificarPasantia(int codigoPasantia, String nuevoNombreEmpresa, String nuevaFechaInicio, String nuevaFechaFinalizacion, int nuevosPasantes, String nuevaDescripcion, String nuevoNumeroConvenio, String nuevoEstado) {
        Pasantia pasantia = buscarPasantia(codigoPasantia);
        if (pasantia != null) {
            pasantia.setNombre_empresa(nuevoNombreEmpresa);
            pasantia.setFecha_inicio(nuevaFechaInicio);
            pasantia.setFecha_finalizacion(nuevaFechaFinalizacion);
            pasantia.setNumero_pasantes(nuevosPasantes);
            pasantia.setDescripcion(nuevaDescripcion);
            pasantia.setNumero_convenio(nuevoNumeroConvenio);
            pasantia.setEstado(true);

            System.out.println("¡Datos de la Pasantia Actualizados!");
        } else {
            System.out.println("¡Pasantia no encontrada!.");
        }
    }

    public void InactivarPasantia(int codigoPasantia, String EstadoPasantia) {
        Pasantia pasantia = buscarPasantia(codigoPasantia);
        if (pasantia != null) {
            pasantia.setEstado(true);
            System.out.println("¡Pasantia desactivada!");
        }
    }

    public void ModificarConvenio(int codigoConvenio, String nuevaEmpresa, String nuevaFechaInicial, String nuevaFechaFin, String nuevoCorreoRepresentante, byte[] nuevoArchivo) {
        ConvenioMacro convenio = buscarConvenio(codigoConvenio);
        if (convenio != null) {
            convenio.setFachaInicio(nuevaFechaInicial);
            convenio.setFechaFinalizacion(nuevaFechaFin);
            convenio.setNombreEmpresa(nuevaEmpresa);
            convenio.setCorreoRepresentante(nuevoCorreoRepresentante);

            if (nuevoArchivo != null) {
                convenio.setArchivoConvenio(nuevoArchivo);
            }
            System.out.println("¡Datos del convenio Actualizados!");
        } else {
            System.out.println("¡Convenio no encontrado!");
        }
    }

    public void PublicarPasantia() {
        for (Pasantia pasantia : pasantias) {
            System.out.println("Pasantias Disponibles:\n");
            System.out.println("Codigo: " + pasantia.getCodigo());
            System.out.println("Empresa: " + pasantia.getNombre_empresa());
            System.out.println("Fecha de Inicio: " + pasantia.getFecha_inicio());
            System.out.println("Feha de Finalizacion: " + pasantia.getFecha_finalizacion());
            System.out.println("Numero de Pasantes: " + pasantia.getNumero_pasantes());
            System.out.println("Descripcion: " + pasantia.getDescripcion());
            System.out.println("Numero de Convenio: " + pasantia.getNumero_convenio());
            System.out.println("Estado: " + pasantia.isEstado());
            System.out.println("\n");
        }

    }

    public Pasantia buscarPasantia(int codigoPasantia) {
        for (Pasantia pasantia : pasantias) {
            if (pasantia.getCodigo() == codigoPasantia) {
                return pasantia;
            }
        }
        return null; // Pasantia no encontrada
    }

    public ConvenioMacro buscarConvenio(int codigoConvenio) {
        for (ConvenioMacro convenioMacro : convenios) {
            if (convenioMacro.getNumeroConvenio() == codigoConvenio) {
                return convenioMacro;
            }
        }
        return null; // Convenio no encontrado
    }

    public void agregarPasantia(Pasantia pasantia) {
        pasantias = new ArrayList<>();
        pasantias.add(pasantia);
        System.out.println("Pasantia agregada exitosamente.");
        System.out.println("\n");
    }

    public void CrearConvenio(ConvenioMacro convenio) {
        convenios = new ArrayList<>();
        convenios.add(convenio);
        System.out.println("Convenio creado exitosamente.");
        System.out.println("\n");
    } //Metodo para crear convenio

    public void RegistrarJuicio() {
        Pasantia pasantia = new Pasantia();
        if (pasantia.isEstado() == true) {

        } else {

        }
    }

    public void ModificarJuicio() {

    }

    public void cargarArchivo(int codigoConvenio) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try {
                byte[] archivoBytes = Files.readAllBytes(file.toPath());
                ConvenioMacro convenio = buscarConvenio(codigoConvenio);
                if (convenio != null) {
                    convenio.setArchivoConvenio(archivoBytes);
                    System.out.println("Archivo Cargado: " + file.getAbsolutePath());
                }else{
                    System.out.println("Archvo no encontrado");
                }
            } catch (IOException e) {
                System.out.println("Error al leer archvo: " + e.getMessage());
            }
        }
    }

    public void verPDFs() {
        for (ConvenioMacro convenio : convenios) {
            System.out.println("Convenio #" + convenio.getNumeroConvenio() + ": " + convenio.getArchivoConvenio());
        }
    }

}
