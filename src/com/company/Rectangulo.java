package com.company;

public class Rectangulo {
    public float ancho = 1.0f;
    public float alto = 1.0f;

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    public float calcularArea(float ancho,float alto){
        return alto*ancho;
    }
    public  float calcularPerimetro(float ancho,float alto){
        return 2*calcularArea(ancho,alto);
    }

}
