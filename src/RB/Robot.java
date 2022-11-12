
package RB;



/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public abstract class Robot implements CM {
   private String Id;
   private int x;
   private int y;
   private boolean estado;
   private String fabricacion;

    public Robot() {
    }

    public Robot(String Id, int x, int y, boolean estado, String fabricacion) {
        this.Id = Id;
        this.x = x;
        this.y = y;
        this.estado = estado;
        this.fabricacion = fabricacion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getX() {
       
        return x;
    }

    public void setX(int x) throws Miexcepcion {
        if(x >=0 && x <8){
            this.x = x;
        }
        else{
            throw new Miexcepcion("x debe estar entre 0 y 7, Ingrese denuevo");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Miexcepcion{
        if(y >=0 && y <8){
            this.y = y;
        }
        else{
            throw new Miexcepcion("y debe estar entre 0 y 7");
        }
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }
    
    

    @Override
    public String toString() {
        return "Robot{" + "Id=" + Id + ", x=" + x + ", y=" + y + ", estado=" + estado + ", fabricacion=" + fabricacion + '}';
    }
   
   
}
