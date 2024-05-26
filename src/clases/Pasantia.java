package clases;

public class Pasantia {

    int codigo;
    String nombre_empresa;
    String fecha_inicio;
    String fecha_finalizacion;
    int numero_pasantes;
    String descripcion;
    String numero_convenio;
    boolean estado = false;

    public Pasantia(int codigo, String nombre_empresa, String fecha_inicio, String fecha_finalizacion, int numero_pasantes, String descripcion, String numero_convenio, boolean estado) {
        this.codigo = codigo;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.numero_pasantes = numero_pasantes;
        this.descripcion = descripcion;
        this.numero_convenio = numero_convenio;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Pasantia() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(String fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public int getNumero_pasantes() {
        return numero_pasantes;
    }

    public void setNumero_pasantes(int numero_pasantes) {
        this.numero_pasantes = numero_pasantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumero_convenio() {
        return numero_convenio;
    }

    public void setNumero_convenio(String numero_convenio) {
        this.numero_convenio = numero_convenio;
    }

}
