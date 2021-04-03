package com.company;

public class Venta {
    public int id;
    public String descripcion;
    public int cantidad;
    public float pUnitario;
    public float pTotal;

    public Venta(){

    }

    public Venta (int id, String descripcion, int cantidad, float pUnitario){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.pUnitario=pUnitario;
        this.pTotal=cantidad*pUnitario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getpUnitario() {
        return this.pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public float getpTotal() {
        return this.pTotal;
    }

    public void setpTotal(float pTotal) {
        this.pTotal = pTotal;
    }

    //Metodos
    public float calculoPrecioTotal(){
        return this.pUnitario*this.cantidad;
    }
    public void mostrarObjeto(){
        System.out.println("ItemVenta[id="+this.id+", descripción="+this.descripcion+", cantidad="+this.cantidad+", pUnitario="+this.pUnitario+", pTotal="+this.calculoPrecioTotal()+"]");
    }
}
