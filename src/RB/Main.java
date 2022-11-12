/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RB;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            char [][]mapa = new char [8][8];
            Robots.add(new Androide(5,12,"4321",0,0,false,"2007"));
            switch (opcion) {
                case 1:
                    Robot rb = new Androide();
                    boolean f1 = false;
                    String Id="";
                     while (f1==false) {
                    System.out.println("Ingrese el ID del robot:");
                    Id = lea.next();
                    boolean f2 = false;
                    if (Robots.isEmpty()==false) {        
                        for (int i = 0; i < Robots.size(); i++) {
                            if (Id.equals(((Robot)Robots.get(i)).getId())) {
                                f2 = true;
                            }
                        }   
                        if (f2==true) {
                             System.out.println("EL ID ya existe, intente denuevo");
                             System.out.println("");
                        }
                        else{
                            f1=true;
                        }                          
                        }
                    else{
                        f1=true;
                    }}
                     boolean f4 = false;
                     boolean f5 = false;
                     int x=0,y =0;
                     
                     System.out.println("Ingrese la posicion inicial");
                     while(f4 == false){
                     System.out.println("Ingrese x: ");
                     x = lea.nextInt();
                     try{
                         rb.setX(x);
                         f4 = true;
                     }
                     catch(Miexcepcion e){
                         System.out.println(e.getMessage());
                     }}
                     while(f5==false){
                    System.out.println("Ingrese y: ");
                    y = lea.nextInt();
                    try{
                         rb.setY(y);
                         f5=true;
                     }
                     catch(Miexcepcion e){
                         System.out.println(e.getMessage());
  
                     }}
                    
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
                            boolean f7= true;
                            Robot rm = new Movilpesados();
                            int cap =0;
                            System.out.println("Ingrese el peso: ");
                            int p = lea.nextInt();
                            while(f7==true){
                            try{
                            System.out.println("Ingrese la capacidad maxima(mayor que cinco):");
                            cap = lea.nextInt();
                            ((Movilpesados)rm).setCapacidad(cap);
                            f7=false;
                            }
                            catch(Miexcepcion e){
                                System.out.println(e.getMessage());
                            }
                            }
                
                 
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
                    System.out.println("Seleccione el robot: ");
                    System.out.println(Listr(Robots));
                    int r= lea.nextInt();
                    if (r<= Robots.size()) {
                        if (Robots.get(r) instanceof Robot) {
                            int x1 = Robots.get(r).getX();
                            int y1 = Robots.get(r).getY();
                             mapa = generarMapa(mapa,x1,y1);
                             IMPMAP(mapa);
                             
                        String cmd ="";
                          System.out.println("Usar los siguientes comandos:"
                                + "\nu= arriba\na = abajo\n r = derecha\n l = izquierda \n "
                                  + "p= recoger cargo\n b = dejar cargo \nsepararlos por coma");
                        cmd = lea.nextLine();  
                        cmd = lea.next();
                  
                    char [] ins = cmd.toCharArray();
                    int x2=0;
                    int y2=0;
                            for (int i = 0; i < ins.length; i++) {
                                if (ins[i]=='u') {
                                    x2= x1-1;
                                    y2= y1;
                                }
                                else if(ins[i]=='a'){
                                    x2= x1+1;
                                    y2= y1;
                                }
                                else if(ins[i]=='r'){
                                    x2= x1;
                                    y2= y1+1;
                                }
                                else if(ins[i]=='l'){
                                    x2= x1;
                                    y2= y1-1;
                                }
                                else if(ins[i]=='p'){
                                    
                                    
                                }else if(ins[i]=='b'){
                                    
                                }
                            }
                    }
                    }
                    else{
                        System.out.println("Intente de nuevo");
                    }
                    
                   
                    
                    break;
                case 4:
                     System.out.println("Seleccione el robot: ");
                    System.out.println(Listr(Robots));
                    int rr= lea.nextInt();
                    if (rr<= Robots.size()) {
                        if (Robots.get(rr) instanceof Robot) {
                            int x1 = Robots.get(rr).getX();
                            int y1 = Robots.get(rr).getY();
                             mapa = generarMapa(mapa,x1,y1);
                             IMPMAP(mapa);
                             
                        }
                        System.out.println("Usar los siguientes comandos:"
                                + "\nu= arriba\na = abajo\n r = derecha\n l = izquierda \n separarlos por coma");
                        String cmd = lea.next();  
                        
                        
                    }
                    
                    
                    else{
                        System.out.println("Intente de nuevo");
                    }
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
                System.out.print("["+map[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static char [][] generarMapa(char [][]map,int x, int y){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j]=' ';
                if (j == 0) {
                    if (i==3||i==4||i==5||i==6||i==7) {
                        map[i][j]='X';
                    }
                }
                if (j == 2) {
                    if (i==0||i==1||i==2||i==3||i==6||i==7) {
                        map[i][j]='X';
                    }
                }
                if (j==4) {
                     if (i==3||i==4) {
                        map[i][j]='X';
                    }
                }
                if (j==5) {
                    if (i==0||i==1) {
                        map[i][j]='X';
                    }
                }
                if (j==6) {
                    if (i==1||i==2||i==3||i==5||i==6||i==7) {
                        map[i][j]='X';
                    }
                }
                if (j==7&&i==7) {
                   map[i][j]='D';
                }
                if(i==x&&j==y){
                    map[i][j]='R';
                }
                     map[3][3]='C';
                     map[4][2]='C';
                     map[4][5]='C';
                
            }
        }
        return map;
    }
    
}
