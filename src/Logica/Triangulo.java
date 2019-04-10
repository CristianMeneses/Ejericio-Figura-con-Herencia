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
public class Triangulo extends Figura {

    public void calcularArea() {
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        Area = (base*altura)/2;
    }

    public void calcularPerimetro() {
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int c1 = temp.calcularDistancia(fin);
        int c2 = origen.calcularDistancia(temp);
        temp.setX(origen.getX());
        temp.setY(origen.getY());
        int h = fin.calcularDistancia(temp);
        Perimetro = c1 + c2 + h;
    }

}
