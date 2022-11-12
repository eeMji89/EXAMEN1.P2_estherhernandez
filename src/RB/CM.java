/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RB;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public interface CM {
    
    public abstract void validar();
    public abstract char[][] mov(int x1,int y1,int x2,int y2);
    public abstract char[][] mnt();
    public abstract char[][] unmnt();
    public abstract int rot(int deg,char or);
     
}
