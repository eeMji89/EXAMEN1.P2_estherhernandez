
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
    public String rot(int deg, char or) {
        int rot = 0;
        String r = rot +";"+or;
        if (deg ==90){
            if (or=='U') {
                 rot=0;
            }
            else if(or=='D'){
                rot = 2;
            }
            else if(or=='R'){
                rot = 1;
            }
            else if(or=='L'){
                rot = 3;
            }
            or ='U';
        }
        else if(deg ==180){
            if (or=='U') {
                 rot=1;
            }
            else if(or=='D'){
                rot = 3;
            }
            else if(or=='R'){
                rot = 2;
            }
            else if(or=='L'){
                rot = 0;
            }
            or ='R';
        }
        
        
        else if(deg == 270){
            if (or=='U') {
                 rot=2;
            }
            else if(or=='D'){
                rot = 0;
            }
            else if(or=='R'){
                rot = 3;
            }
            else if(or=='L'){
                rot = 1;
            }
            or ='D';
        }
        return r;
    }
    
            
}
