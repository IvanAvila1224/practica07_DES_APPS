/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa07b;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ivan
 */
@Entity
@Table(name = "detalleventa")
public class DetalleVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalleventa")
    private Long idDetalleventa;
    
    @Column(name = "idproducto")
    private long claveproducto;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "precio")
    private double precio;
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "subtotal")
    private double subtotal;
    
    @ManyToOne
    @JoinColumn(name ="venta_detalleventa", nullable = false)
    private Venta venta;
    
    public Long getIdDetalleventa() {
        return idDetalleventa;
    }

    public void setIdDetalleventa(Long idDetalleventa) {
        this.idDetalleventa = idDetalleventa;
    }
    
    public long getClaveproducto() {
        return claveproducto;
    }

    public void setClaveproducto(long claveproducto) {
        this.claveproducto = claveproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
}