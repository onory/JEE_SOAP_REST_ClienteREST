//esta clase recibe y envia el objeto persona


package domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // comvierte a XML y hace proseso de marshali
public class Persona {
 
//atributos
    
    private int idpersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

//constructores    
    public Persona(){
        
    }
    
    public Persona (int idpersona){
    
    this.idpersona = idpersona;
}

    //Gets y Sets
    
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
    
}
