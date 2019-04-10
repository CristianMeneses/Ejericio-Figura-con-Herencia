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
public class Circulo extends Figura {

    public void calcularPerimetro() {

        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        double radio = origen.calcularDistancia(fin);
        Perimetro = (int)((2 * Math.PI) * radio);
        
   
    }

    public void calcularArea() {

        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        double radio = origen.calcularDistancia(fin);
        Area = (int)((Math.PI)* (Math.pow(radio, 2)));
        
        
    }

}
