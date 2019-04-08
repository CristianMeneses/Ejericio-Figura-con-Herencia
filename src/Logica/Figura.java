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
public abstract class Figura {

    protected Punto origen;
    protected Punto fin;
    protected int Area;
    protected int Perimetro;

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

}
