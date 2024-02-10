package TablasClases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Habitaciones")
public class Habitaciones implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Habitacion")
    private int id_Habitacion;
    @Basic
    private String tipo_Habitacion;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoEn estadoEn;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_1P;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_2P;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_3P;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_4P;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_5P;
    @Basic
    @Column(precision = 10, scale = 4)
    private BigDecimal precio_6P;
    @Basic
    @Column(length = 50)
    private String descripcion;
    @Basic
    @Column(length = 50)
    private String observacion;
    @ManyToOne
    @JoinColumn(name = "reservaciones_id_Reserva")
    private Reservaciones reservacion;
    @OneToMany(mappedBy = "habitacionesV")
    List<Ventas_Habitaciones> ventas_Habitaciones;

    public Habitaciones() {
    }

    public Habitaciones(int id_Habitacion, String tipo_Habitacion, EstadoEn estadoEn, BigDecimal precio_1P, BigDecimal precio_2P, BigDecimal precio_3P, BigDecimal precio_4P, BigDecimal precio_5P, BigDecimal precio_6P, String descripcion, String observacion, Reservaciones reservacion, List<Ventas_Habitaciones> ventas_Habitaciones) {
        this.id_Habitacion = id_Habitacion;
        this.tipo_Habitacion = tipo_Habitacion;
        this.estadoEn = estadoEn;
        this.precio_1P = precio_1P;
        this.precio_2P = precio_2P;
        this.precio_3P = precio_3P;
        this.precio_4P = precio_4P;
        this.precio_5P = precio_5P;
        this.precio_6P = precio_6P;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.reservacion = reservacion;
        this.ventas_Habitaciones = ventas_Habitaciones;
    }

    public int getId_Habitacion() {
        return id_Habitacion;
    }

    public void setId_Habitacion(int id_Habitacion) {
        this.id_Habitacion = id_Habitacion;
    }

    public String getTipo_Habitacion() {
        return tipo_Habitacion;
    }

    public void setTipo_Habitacion(String tipo_Habitacion) {
        this.tipo_Habitacion = tipo_Habitacion;
    }

    public EstadoEn getEstadoEn() {
        return estadoEn;
    }

    public void setEstadoEn(EstadoEn estadoEn) {
        this.estadoEn = estadoEn;
    }

    public BigDecimal getPrecio_1P() {
        return precio_1P;
    }

    public void setPrecio_1P(BigDecimal precio_1P) {
        this.precio_1P = precio_1P;
    }

    public BigDecimal getPrecio_2P() {
        return precio_2P;
    }

    public void setPrecio_2P(BigDecimal precio_2P) {
        this.precio_2P = precio_2P;
    }

    public BigDecimal getPrecio_3P() {
        return precio_3P;
    }

    public void setPrecio_3P(BigDecimal precio_3P) {
        this.precio_3P = precio_3P;
    }

    public BigDecimal getPrecio_4P() {
        return precio_4P;
    }

    public void setPrecio_4P(BigDecimal precio_4P) {
        this.precio_4P = precio_4P;
    }

    public BigDecimal getPrecio_5P() {
        return precio_5P;
    }

    public void setPrecio_5P(BigDecimal precio_5P) {
        this.precio_5P = precio_5P;
    }

    public BigDecimal getPrecio_6P() {
        return precio_6P;
    }

    public void setPrecio_6P(BigDecimal precio_6P) {
        this.precio_6P = precio_6P;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Reservaciones getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservaciones reservacion) {
        this.reservacion = reservacion;
    }

    public List<Ventas_Habitaciones> getVentas_Habitaciones() {
        return ventas_Habitaciones;
    }

    public void setVentas_Habitaciones(List<Ventas_Habitaciones> ventas_Habitaciones) {
        this.ventas_Habitaciones = ventas_Habitaciones;
    }

   
   
}
