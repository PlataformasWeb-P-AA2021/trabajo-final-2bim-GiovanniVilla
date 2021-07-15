
package paquete2;

public class Persona {
    private String nombre;
    private String apellido;
    private String identificacion;
    
    public Persona(String n, String a, String i){
        nombre = n;
        apellido = a;
        identificacion = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String i) {
        this.identificacion = i;
    }
    
}
