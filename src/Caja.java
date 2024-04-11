public class Caja {
    private String codigo;
    private String nombreEmpresa;
    private String contenido;

    @Override
    public String toString() {
        return  "Codigo = " + codigo +
                "\nNombre Empresa = " + nombreEmpresa +
                "\ncontenido = " + contenido;
    }

    public Caja(String codigo, String nombreEmpresa, String contenido) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.contenido = contenido;
    }

    public Caja() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
