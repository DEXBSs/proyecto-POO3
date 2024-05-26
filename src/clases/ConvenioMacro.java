package clases;

public class ConvenioMacro {

    int numeroConvenio;
    String fachaInicio;
    String FechaFinalizacion;
    String nombreEmpresa;
    String correoRepresentante;
    byte[] archivoConvenio;

    public ConvenioMacro(int numeroConvenio, String fachaInicio, String FechaFinalizacion, String nombreEmpresa, String correoRepresentante) {
        this.numeroConvenio = numeroConvenio;
        this.fachaInicio = fachaInicio;
        this.FechaFinalizacion = FechaFinalizacion;
        this.nombreEmpresa = nombreEmpresa;
        this.correoRepresentante = correoRepresentante;

    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getFachaInicio() {
        return fachaInicio;
    }

    public void setFachaInicio(String fachaInicio) {
        this.fachaInicio = fachaInicio;
    }

    public String getFechaFinalizacion() {
        return FechaFinalizacion;
    }

    public void setFechaFinalizacion(String FechaFinalizacion) {
        this.FechaFinalizacion = FechaFinalizacion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCorreoRepresentante() {
        return correoRepresentante;
    }

    public void setCorreoRepresentante(String correoRepresentante) {
        this.correoRepresentante = correoRepresentante;
    }

    public byte[] getArchivoConvenio() {
        return archivoConvenio;
    }

    public void setArchivoConvenio(byte[] archivoConvenio) {
        this.archivoConvenio = archivoConvenio;
    }

    public ConvenioMacro() {
    }
}
