/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Cuadrado;
import Logica.Figura;
import Logica.Punto;
import Logica.Rectangulo;
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
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);
                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);
                break;
            case 2:
                f = new Rectangulo();

                origen.setX(0);
                origen.setY(5);
                fin.setX(10);
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
        System.out.println("area = " + f.getArea());
        System.out.println("perimetro = " + f.getPerimetro());
    }

}
