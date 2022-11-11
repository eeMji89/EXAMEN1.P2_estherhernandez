/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RB;



/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Robot {
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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
