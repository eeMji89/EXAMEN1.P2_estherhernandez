/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RB;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Androide extends Robot {
    private int Capacidad;
    private int altura;
    private int peso;

    public Androide() {
        super();
    }

    public Androide(int Capacidad, int altura, int peso) {
        this.Capacidad = Capacidad;
        this.altura = altura;
        this.peso = peso;
    }

    public Androide(int Capacidad, int altura, int peso, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
        this.Capacidad = Capacidad;
        this.altura = altura;
        this.peso = peso;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Androide{" +super.toString()+  ", altura=" + altura + ", peso=" + peso + '}';
    }
    
            
}
