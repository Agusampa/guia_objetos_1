package com.company;

public class Empleado {
    public int dni;
    public String nombre;
    public String apellido;
    public float salario;

    public Empleado(int dni, String nombre, String apellido, float salario) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalarioAnual(float salario){
        return salario*12;
    }
    public void aumentarSalarioPorPorcentaje(float porcentajeAumentado){
        this.salario=this.salario+(this.salario*porcentajeAumentado);
    }
    public void mostrarEmpleado(){
        System.out.println("Empleado[dni = "+this.dni +", nombre = "+this.nombre+", apellido = "+this.apellido+", salario = "+this.salario+" ]");
    }

}
