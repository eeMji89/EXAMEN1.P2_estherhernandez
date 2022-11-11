
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

    public Movilagil(int llantas, double velocidad, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
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

    @Override
    public void validar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public char[][] mov(int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public char[][] mnt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public char[][] unmnt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public char[][] rot(int deg, char or) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
