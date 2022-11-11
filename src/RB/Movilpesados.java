
package RB;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Movilpesados extends Robot {
    private int capacidad;
    private int peso;

    public Movilpesados(){
        super();
    }

    public Movilpesados(int capacidad, int peso) {
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public Movilpesados(int capacidad, int peso, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Movilpesados{" +super.toString()+ "capacidad=" + capacidad + ", peso=" + peso + '}';
    }

    
    
    
    
}
