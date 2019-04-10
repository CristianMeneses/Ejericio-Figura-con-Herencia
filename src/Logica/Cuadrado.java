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
public class Cuadrado extends Figura {

        int Lado;
    public void calcularArea() {
        Lado = origen.calcularDistancia(fin);
        Area = Lado * Lado;
        
    }
    public void calcularPerimetro() {
        int lado = origen.calcularDistancia(fin);
        Perimetro = 4 * Lado;
    }
  

}
