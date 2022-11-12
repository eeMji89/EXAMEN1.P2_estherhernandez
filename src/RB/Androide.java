
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

    public Androide(int altura, int peso, String Id, int x, int y, boolean estado, String fabricacion) {
        super(Id, x, y, estado, fabricacion);
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

    @Override
    public void validar() {
        
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
    public int rot(int deg, char or) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            
}
