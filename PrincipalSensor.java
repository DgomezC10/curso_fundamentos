import java.util.Scanner;
public class PrincipalSensor{
    public static void main(String[] args){
        SensorLuz sl1 = new SensorLuz(18, 40);
        Scanner scan = new Scanner(System.in);
        System.out.println(" ingrese duplicar, asignarint o salir");
        String pal = scan.next();
        while(!pal.equals("salir")){
            switch(pal){
                case "duplicar":
                System.out.println(sl1.getIntensidad());
                System.out.println(sl1.duplicarIntensidad());
                break;
                case "asignarint":
                System.out.println("ingrese un i: ");
                sl1.setIntensidad(scan.nextInt());
                break;
                default: 
                break;
          
        }
        System.out.println(" ingrese duplicar, asignarint o salir");
        pal = scan.next();
    }
    System.out.println("Fin del programa");
}
}

