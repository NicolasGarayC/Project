package com.proj.project.articulo;

public class Articulo {
    private String codigo_articulo;
    private String nombre_articulo;
    private String marca;
    private String modelo;
    private String color;
    private String unidad_medida;
    private int stock;
    private int codigo_categoria;

    public Articulo() {
    }
    public Articulo(String codigo_articulo, String nombre_articulo, String marca, String modelo, String color, String unidad_medida, int stock, int codigo_categoria) {
        this.codigo_articulo = codigo_articulo;
        this.nombre_articulo = nombre_articulo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.unidad_medida = unidad_medida;
        this.stock = stock;
        this.codigo_categoria = codigo_categoria;
    }

    public Articulo(String nombre_articulo, String marca, String modelo, String color, String unidad_medida, int stock, int codigo_categoria) {
        this.nombre_articulo = nombre_articulo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.unidad_medida = unidad_medida;
        this.stock = stock;
        this.codigo_categoria = codigo_categoria;
    }

    public String getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(String codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo_articulo='" + codigo_articulo + '\'' +
                ", nombre_articulo='" + nombre_articulo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", unidad_medida='" + unidad_medida + '\'' +
                ", stock=" + stock +
                ", codigo_categoria=" + codigo_categoria +
                '}';
    }
}
