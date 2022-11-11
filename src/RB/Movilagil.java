
package RB;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Movilagil extends Robot {
    private int Capacidad;
    private int llantas;
    private double velocidad;

    public Movilagil() {
        super();
    }

    public Movilagil(int Capacidad, int llantas, double velocidad) {
        this.Capacidad = Capacidad;
        this.llantas = llantas;
        this.velocidad = velocidad;
    }

    public Movilagil(int Capacidad, int llantas, double velocidad, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
        this.Capacidad = Capacidad;
        this.llantas = llantas;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Movilagil{" +super.toString() + "llantas=" + llantas + ", velocidad=" + velocidad + '}';
    }
    
    
}
