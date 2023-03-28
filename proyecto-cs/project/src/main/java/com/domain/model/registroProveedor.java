package com.domain.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class registroProveedor {
    
    private Long id;
    
    private String nombre;
    
    private String direccion;
    
    private String telefono;
    
    private String correoElectronico;
    
    private String tipoProducto;
    
    private int plazoEntrega;
    
    private int cantidadMinimaPedido;
    
    private double precioPorUnidad;

    // getters y setters
    
    // Constructor vacío requerido por JPA
    public registroProveedor() {
    }
    
    // Constructor con parámetros
    public registroProveedor(String nombre, String direccion, String telefono, String correoElectronico, String tipoProducto, int plazoEntrega, int cantidadMinimaPedido, double precioPorUnidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipoProducto = tipoProducto;
        this.plazoEntrega = plazoEntrega;
        this.cantidadMinimaPedido = cantidadMinimaPedido;
        this.precioPorUnidad = precioPorUnidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    public int getCantidadMinimaPedido() {
        return cantidadMinimaPedido;
    }

    public void setCantidadMinimaPedido(int cantidadMinimaPedido) {
        this.cantidadMinimaPedido = cantidadMinimaPedido;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
}
