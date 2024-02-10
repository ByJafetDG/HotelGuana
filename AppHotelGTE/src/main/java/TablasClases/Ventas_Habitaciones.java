/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasClases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ventas_Habitaciones")
public class Ventas_Habitaciones implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Venta")
    private int id_Venta;
    @Basic
    private int id_Cliente;
    @Basic
    private String nombre;
    @Basic 
    private int apellido;
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
    @Basic 
    private Date fecha_Venta;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MonedaTipoCambio monedaTipoCambio;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal total_Venta;
    
    @ManyToOne
    @JoinColumn(name = "id_Habitacion")
    private Habitaciones habitacionesV;

    public Ventas_Habitaciones() {
    }

    public Ventas_Habitaciones(int id_Venta, int id_Cliente, String nombre, int apellido, String identificacion, String correo, Date check_in, Date check_out, String telefono, String direccion, String placa, String observacion, Date fecha_Venta, MonedaTipoCambio monedaTipoCambio, BigDecimal total_Venta, Habitaciones habitacionesV) {
        this.id_Venta = id_Venta;
        this.id_Cliente = id_Cliente;
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
        this.fecha_Venta = fecha_Venta;
        this.monedaTipoCambio = monedaTipoCambio;
        this.total_Venta = total_Venta;
        this.habitacionesV = habitacionesV;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getApellido() {
        return apellido;
    }

    public void setApellido(int apellido) {
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

    public Date getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(Date fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public MonedaTipoCambio getMonedaTipoCambio() {
        return monedaTipoCambio;
    }

    public void setMonedaTipoCambio(MonedaTipoCambio monedaTipoCambio) {
        this.monedaTipoCambio = monedaTipoCambio;
    }

    public BigDecimal getTotal_Venta() {
        return total_Venta;
    }

    public void setTotal_Venta(BigDecimal total_Venta) {
        this.total_Venta = total_Venta;
    }

    public Habitaciones getHabitacionesV() {
        return habitacionesV;
    }

    public void setHabitacionesV(Habitaciones habitacionesV) {
        this.habitacionesV = habitacionesV;
    }

   
}
