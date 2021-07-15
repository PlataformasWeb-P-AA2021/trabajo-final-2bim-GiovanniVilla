package paquete2;

public abstract class PlanCelular {

    protected Persona propietario;
    protected String ciudadPropietario;
    protected String marcaCell;
    protected String modeloCell;
    protected int numeroCell;
    protected double pagoMensual;

    public PlanCelular(Persona p, String c, String m, String md, int nc) {
        propietario = p;
        ciudadPropietario = c;
        marcaCell = m;
        modeloCell = md;
        numeroCell = nc;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona p) {
        this.propietario = p;
    }

    public String getCiudadPropietario() {
        return ciudadPropietario;
    }

    public void setCiudadPropietario(String c) {
        this.ciudadPropietario = c;
    }

    public String getMarcaCell() {
        return marcaCell;
    }

    public void setMarcaCell(String m) {
        this.marcaCell = m;
    }

    public String getModeloCell() {
        return modeloCell;
    }

    public void setModeloCell(String m) {
        this.modeloCell = m;
    }

    public int getNumeroCell() {
        return numeroCell;
    }

    public void setNumeroCell(int n) {
        this.numeroCell = n;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public abstract void setPagoMensual();

}
