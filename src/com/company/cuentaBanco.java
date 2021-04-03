package com.company;

import javax.print.attribute.standard.PresentationDirection;

public class cuentaBanco {
    private int id;
    private String nombreCompleto;
    private float balance;

    //contructores
    public cuentaBanco(){
    }
    public cuentaBanco(int id,String nombreCompleto,float balance){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.balance=balance;
    }

    //setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    //Metodos
    public float credito(float deposito){
        return this.balance = this.balance + deposito;
    }
    public float debito(float sustraccion) {
        if (this.balance > sustraccion)
            return this.balance = this.balance - sustraccion;
        else
            this.mensajeErrorDebito();
        return 0;
    }
    public void mensajeErrorDebito(){
        System.out.println("La cuenta posee menos dinero que el que desea sustraer");
    }
    public void mostrarCuentaBanco(){
        System.out.println("id:"+this.id+"\nNombre completo:"+this.nombreCompleto+"\nBalance: $"+this.balance);
    }
}
