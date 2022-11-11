
package RB;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Manorobotica extends Robot {
    private int Capacidad;
    private int motores;

    public Manorobotica() {
        super();
    }

    public Manorobotica(int Capacidad, int motores) {
        this.Capacidad = Capacidad;
        this.motores = motores;
    }

    public Manorobotica(int motores, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
        this.motores = motores;
    }
    

    public Manorobotica(int Capacidad, int motores, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
        this.Capacidad = Capacidad;
        this.motores = motores;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    @Override
    public String toString() {
        return super.toString()+"Manorobotica{"  + ", motores=" + motores + '}';
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
