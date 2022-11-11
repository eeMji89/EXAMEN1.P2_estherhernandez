/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RB;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Main {
static Scanner lea = new Scanner(System.in);
static ArrayList<Robot> Robots = new ArrayList();
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
                    System.out.println("Ingrese el ID del robot:");
                    String Id = lea.next();
                    System.out.println("Ingrese la posicion inicial");
                    System.out.println("Ingrese x: ");
                    int x = lea.nextInt();
                    System.out.println("Ingrese y: ");
                    int y = lea.nextInt();
                    System.out.println("Ingrese el año de fabricacion");
                    String year = lea.next();
                    System.out.println("Eliga que tipo de robot es: ");
                    System.out.println("a. Androide\n"
                            + "b. Manos roboticas\n"
                            + "c. Robot Moviles ágiles\n"
                            + "d. Robot Moviles Pesados");
                    char op = lea.next().charAt(0);
                    switch(op){
                        case 'a':
                            System.out.println("Ingrese la altura:");
                            int altura = lea.nextInt();
                            System.out.println("Ingrese el peso: ");
                            int peso = lea.nextInt();
                            Robots.add(new Androide(altura, peso, Id, x, y, false, year));
                            System.out.println("Robot agregado exitosamente ");
                            break;
                        case 'b':
                            System.out.println("Ingrese el numero de motores: ");
                            int motor = lea.nextInt();
                            Robots.add(new Manorobotica(motor, Id, x, y, false, year));
                            System.out.println("Robot agregado exitosamente");
                            break;
                        case 'c':
                            System.out.println("Ingrese la cantidad de llantas que tiene: ");
                            int llanta = lea.nextInt();
                            System.out.println("Ingrese la velocidad punta:");
                            double vel = lea.nextDouble();
                            Robots.add(new Movilagil(llanta, vel, Id, x, y, false, year));
                            System.out.println("Robot creado exitosamente.");
                            break;
                        case 'd':
                            System.out.println("Ingrese la capacidad maxima(mayor que cinco):");
                            int cap = lea.nextInt();
                            System.out.println("Ingrese el peso: ");
                            int p = lea.nextInt();
                            Robots.add(new Movilpesados(cap, p, Id, x, y, false, year));
                            System.out.println("Robot creado exitosamente. ");
                            break;
                            
                        default:
                            System.out.println("Opcion no valida, intente denuevo");
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("ROBOTS");
                    System.out.println(Listr(Robots));
                    break;
                case 3:
                    int [][]mapa = new int [8][8];
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
    public static String Listr(ArrayList robot){
        String Listar = "";
        for (int i = 0; i < robot.size(); i++) {
            Listar = i+"-"+ robot.get(i)+"\n";
        }
        return Listar;
    }
    public static void IMPMAP(char [][]map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.println("["+map[i][j]+"]");
            }
        }
    }
    public static char [][] generarMapa(char [][]map,Robot r){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j]=' ';
                if (j == 0) {
                    
                }
                if (j == 2) {
                    
                }
            }
        }
        return map;
    }
    
}
