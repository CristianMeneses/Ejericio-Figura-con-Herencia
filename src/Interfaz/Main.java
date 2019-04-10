/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Circulo;
import Logica.Cuadrado;
import Logica.Elipse;
import Logica.Figura;
import Logica.Punto;
import Logica.Rectangulo;
import Logica.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Punto origen = new Punto();
        Punto fin = new Punto();
        Figura f;
        System.out.println("1. Cuadrado.");
        System.out.println("2. Rectangulo.");
        System.out.println("3. Triángulo.");
        System.out.println("4. Circulo.");
        System.out.println("5. Elipse.");

        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Trabajando con Cuadrado: ");
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);
                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 2:
                System.out.println("Trabajando con Rectánculo: ");
                f = new Rectangulo();

                origen.setX(0);
                origen.setY(5);
                fin.setX(10);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 3:
                System.out.println("Trabajando con Triángulo: ");
                f = new Triangulo();
                origen.setX(0);
                origen.setY(4);
                fin.setX(3);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 4:
                System.out.println("Trabajando con Circulo: ");
                f = new Circulo();
                origen.setX(0);
                origen.setY(0);
                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 5:
                System.out.println("Trabajando con Elipse: ");
                f = new Elipse();
                origen.setX(0);
                origen.setY(3);
                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);
                
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void mostrar(Figura f, Punto origen, Punto fin) {
        f.setOrigen(origen);
        f.setFin(fin);
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("Area = " + f.getArea());
        System.out.println("Perimetro = " + f.getPerimetro());
    }

}
