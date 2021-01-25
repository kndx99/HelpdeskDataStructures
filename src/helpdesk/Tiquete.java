package helpdesk;

public class Tiquete {

    private String nombreEmpleado;
    private int IdEmpleado;
    private int telefono;
    private String email;
    private String descripcionProblema;
    private int Prioridad = 0;
    private String estado = "Creado";
    private int numTiquete = 0;

    public Tiquete(String nombreEmpleado, int IdEmpleado, int telefono, String email, String descripcionProblema) {
        this.nombreEmpleado = nombreEmpleado;
        this.IdEmpleado = IdEmpleado;
        this.telefono = telefono;
        this.email = email;
        this.descripcionProblema = descripcionProblema;
    }

    public Tiquete() {
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumTiquete() {
        return numTiquete;
    }

    public void setNumTiquete(int numTiquete) {
        this.numTiquete = numTiquete;
    }
    
    @Override
    public String toString() {
        return "ID Empleado: " + IdEmpleado + " \n "
                + " Nombre Empleado: " + nombreEmpleado + " \n "
                + " Telefono: " + telefono + " \n "
                + " Email: " + email + " \n "
                + " Detalles: " + descripcionProblema + " \n ";
    }
    
    public String toStringDetallado() {
        return "ID Empleado: " + IdEmpleado + " \n "
                + " Nombre Empleado: " + nombreEmpleado + " \n "
                + " Telefono: " + telefono + " \n "
                + " Email: " + email + " \n "
                + " Detalles: " + descripcionProblema + " \n "
                + " Prioridad:" + Prioridad + " \n " 
                + " Estado: " + estado;
    }

}
