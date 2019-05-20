package Modelos;
// Generated 15-may-2019 12:11:04 by Hibernate Tools 4.3.1



/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer idclientes;
     private String nombre;
     private String apellidos;
     private String identificacion;
     private String direccion;
     private String poblacion;
     private Integer codPostal;
     private Integer telefono;
     private String email;
     private String tipoCliente;

    public Clientes() {
    }

    public Clientes(String nombre, String apellidos, String identificacion, String direccion, String poblacion, Integer codPostal, Integer telefono, String email, String tipoCliente) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.identificacion = identificacion;
       this.direccion = direccion;
       this.poblacion = poblacion;
       this.codPostal = codPostal;
       this.telefono = telefono;
       this.email = email;
       this.tipoCliente = tipoCliente;
    }
   
    public Integer getIdclientes() {
        return this.idclientes;
    }
    
    public void setIdclientes(Integer idclientes) {
        this.idclientes = idclientes;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public Integer getCodPostal() {
        return this.codPostal;
    }
    
    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }




}


