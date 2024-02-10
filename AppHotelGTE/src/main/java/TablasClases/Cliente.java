package TablasClases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
    @Id
    @Column(name="id_Cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    @Column(unique = true)
    private String identificacion;
    @Basic 
    private String correo;
    @Basic
    private Date check_in;
    @Basic
    private Date check_out;
    @Basic
    private String telefono;
    @Basic 
    private String direccion;
    @Basic
    private String placa;
    @Basic 
    private String observacion;
   @ManyToOne
   @JoinColumn(name = "sucursal_id_Sucursal")
   private Sucursal sucursal;
   
   @OneToMany(mappedBy = "ClienteRe")
   List<Reservaciones> reservaciones;

    public Cliente(int id, String nombre, String apellido, String identificacion, String correo, Date check_in, Date check_out, String telefono, String direccion, String placa, String observacion, Sucursal sucursal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.correo = correo;
        this.check_in = check_in;
        this.check_out = check_out;
        this.telefono = telefono;
        this.direccion = direccion;
        this.placa = placa;
        this.observacion = observacion;
        this.sucursal = sucursal;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
   
    
 
}
