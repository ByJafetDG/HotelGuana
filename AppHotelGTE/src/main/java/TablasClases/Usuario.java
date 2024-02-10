/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasClases;

import java.io.Serializable;
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
@Table(name = "Usuario")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Usuario")
    private int id;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    private String correo;
    @Basic
    private  byte contrasena;
    @ManyToOne
    @JoinColumn(name = "sucursal_id_Sucursal")
    private Sucursal sucursalU;
    
    @OneToMany(mappedBy = "usuarioEmpleado")
    private List<Empleado> empleados;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String correo, byte contrasena, Sucursal sucursalU, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.sucursalU = sucursalU;
        this.empleados = empleados;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte getContrasena() {
        return contrasena;
    }

    public void setContrasena(byte contrasena) {
        this.contrasena = contrasena;
    }

    public Sucursal getSucursalU() {
        return sucursalU;
    }

    public void setSucursalU(Sucursal sucursalU) {
        this.sucursalU = sucursalU;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

  
}
