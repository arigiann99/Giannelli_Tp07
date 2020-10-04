package tp.pkg07;

public class Cliente {

    private long dni;

    private String apellido;

    private String nombre;

    private String ciudad;

    private String domicilio;

    public Cliente(long dni, String apellido, String nombre, String ciudad, String domicilio) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    
    
}
