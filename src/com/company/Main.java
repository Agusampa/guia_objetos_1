package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ejecutar: 1 - 2 - 3 - 4 - 5 ");
        int ejercicio = sc.nextInt();

        switch (ejercicio) {

            case 1:
                System.out.println("///////////////1///////////////");

                Rectangulo Ejercicio1 = new Rectangulo();

                System.out.println("Ancho = " + Ejercicio1.ancho + " Ancho = " + Ejercicio1.alto);

                System.out.println("El area es: " + Ejercicio1.calcularArea(Ejercicio1.ancho, Ejercicio1.alto) + " y el perimetro es: " + Ejercicio1.calcularPerimetro(Ejercicio1.ancho, Ejercicio1.alto));


                System.out.println("Ingrese el ancho del rectangulo");
                Ejercicio1.ancho = sc.nextFloat();
                System.out.println("Ingrese el alto del rectangulo");
                Ejercicio1.alto = sc.nextFloat();

                System.out.println("Ancho = " + Ejercicio1.ancho + " Ancho = " + Ejercicio1.alto);

                System.out.println("El area es: " + Ejercicio1.calcularArea(Ejercicio1.ancho, Ejercicio1.alto) + " y el perimetro es: " + Ejercicio1.calcularPerimetro(Ejercicio1.ancho, Ejercicio1.alto));

                Rectangulo Ejercicio1a = new Rectangulo();

                System.out.println("Ancho = " + Ejercicio1.ancho + " Ancho = " + Ejercicio1.alto);

                System.out.println("El area es: " + Ejercicio1.calcularArea(Ejercicio1.ancho, Ejercicio1.alto) + " y el perimetro es: " + Ejercicio1.calcularPerimetro(Ejercicio1.ancho, Ejercicio1.alto));


                System.out.println("Ancho = " + Ejercicio1a.ancho + " Ancho = " + Ejercicio1a.alto);

                System.out.println("El area es: " + Ejercicio1a.calcularArea(Ejercicio1a.ancho, Ejercicio1a.alto) + " y el perimetro es: " + Ejercicio1a.calcularPerimetro(Ejercicio1a.ancho, Ejercicio1a.alto));

            break;

            case 2:
                System.out.println("///////////////2///////////////");

                Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutierrez", 25000f);
                Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);


                empleado1.mostrarEmpleado();
                empleado2.mostrarEmpleado();

                empleado1.aumentarSalarioPorPorcentaje(0.15f);

                System.out.println("El salario aumentado es = " + empleado1.salario);
                break;

            case 3:
                System.out.println("///////////////3///////////////");

                Venta Objeto1 = new Venta(1,"Cadena de oro",10,10000);
                Objeto1.mostrarObjeto();

                break;

            case 4:

                System.out.println("///////////////4///////////////");

                cuentaBanco cuenta1 = new cuentaBanco(1,"Pepito Pistolero",15000f);

                cuenta1.credito(2500f);

                cuenta1.debito(1500f);

                cuenta1.debito(30000f);

                cuenta1.mostrarCuentaBanco();

                break;

            case 5:
                System.out.println("///////////////5///////////////");

                Hora hora = new Hora(10,11,21);
                hora.mostrarHoraC();
                hora.avanceUnSegundo();
                hora.mostrarHoraC();
                hora.retrocedeUnSegundo();
                hora.mostrarHoraC();

                break;
            }
        }
    }


