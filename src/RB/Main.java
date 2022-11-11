/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RB;
import java.util.Scanner;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Main {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = false;
        while (flag== false) {            
            System.out.println("MENU");
            System.out.println("1. Crear Robot");
            System.out.println("2. Listar Robot");
            System.out.println("3. Simular automaticamente");
            System.out.println("4. Actuar Manualmente");
            System.out.println("5. Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    
}
