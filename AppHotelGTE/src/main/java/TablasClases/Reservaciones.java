/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="Reservaciones")
public class Reservaciones implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_Reserva")
    private int id_Reserva;
    @Basic
    private String nombre_Cliente;
    @Basic
    private String telefono_Cliente;
    @Basic
    private Date check_in;
    @Basic
    private Date check_out;
    @Basic 
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id_Cliente")
    private Cliente ClienteRe;
    
     @OneToMany(mappedBy ="reservacion")
    List<Habitaciones> habitaciones;

    public Reservaciones() {
    }

    public Reservaciones(int id_Reserva, String nombre_Cliente, String telefono_Cliente, Date check_in, Date check_out, String estado, Cliente ClienteRe, List<Habitaciones> habitaciones) {
        this.id_Reserva = id_Reserva;
        this.nombre_Cliente = nombre_Cliente;
        this.telefono_Cliente = telefono_Cliente;
        this.check_in = check_in;
        this.check_out = check_out;
        this.estado = estado;
        this.ClienteRe = ClienteRe;
        this.habitaciones = habitaciones;
    }

    public int getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(int id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public String getNombre_Cliente() {
        return nombre_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }

    public String getTelefono_Cliente() {
        return telefono_Cliente;
    }

    public void setTelefono_Cliente(String telefono_Cliente) {
        this.telefono_Cliente = telefono_Cliente;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getClienteRe() {
        return ClienteRe;
    }

    public void setClienteRe(Cliente ClienteRe) {
        this.ClienteRe = ClienteRe;
    }

    public List<Habitaciones> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitaciones> habitaciones) {
        this.habitaciones = habitaciones;
    }

   
}
