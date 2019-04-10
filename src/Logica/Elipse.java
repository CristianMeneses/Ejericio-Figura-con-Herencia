/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Elipse extends Figura {

    public void calcularPerimetro() {

        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        double a = temp.calcularDistancia(fin);
        double b = temp.calcularDistancia(origen);

        Perimetro = (int) ((2 * Math.PI) * (Math.sqrt(((Math.pow(a, 2) + Math.pow(b, 2))) / 2)));

    }

    public void calcularArea() {

        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        double a = temp.calcularDistancia(fin);
        double b = temp.calcularDistancia(origen);
        
        Area = (int)((a*b)*(Math.PI));
    }

}
