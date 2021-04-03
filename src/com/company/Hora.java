package com.company;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    //constructores
    public Hora(){
    }
    public  Hora(int hora, int minuto, int segundo){
        if (hora<25&&hora>=0&&minuto<60&&minuto>=0&&segundo<60&&segundo>=0){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }else
            System.out.println("Error");
    }
    //setters y getters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    //Metodos
    /*public void mostrarHora(){
        if(this.hora<10&&this.minuto>=10&&this.segundo>=10){
            System.out.println("0"+this.hora+":"+this.minuto+":"+this.segundo);
        }else{
            if(this.hora>=10&&this.minuto<10&&this.segundo>=10){
                System.out.println(this.hora+":0"+this.minuto+":"+this.segundo);
            }else {
                if (this.hora>=10&&this.minuto>=10&&this.segundo<10){
                    System.out.println(this.hora+":"+this.minuto+":0"+this.segundo);
                }else{
                    System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
                }
            }
        }
    }*/
    public void mostrarHoraC(){
        if(this.hora<10){
            System.out.print("0"+this.hora);
        }else{
            System.out.print(this.hora);
        }
        if (this.minuto<10){
            System.out.print(":0"+this.minuto);
        }else{
            System.out.print(":"+this.minuto);
        }
        if(this.segundo<10){
            System.out.print(":0"+this.segundo);
        }else{
            System.out.print(":"+this.segundo+"\n");
        }
    }
    public int avanceUnSegundo(){
        return this.segundo=++this.segundo;
    }
    public int retrocedeUnSegundo(){
        return this.segundo=--this.segundo;
    }
}
