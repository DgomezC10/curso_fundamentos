import java.util.Scanner;
public class Problema2{
    public static void main(String[] args){
        int puntaje = 0;
        int suma = 0;
        int cont = 0;
        int mayor = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el puntaje");
        puntaje = scan.nextInt();

        while (puntaje != -1){

            suma = suma + puntaje;
            if(puntaje > mayor){
                mayor = puntaje;
            }
            cont++;
            System.out.println("Ingrese el puntaje");
            puntaje = scan.nextInt();

        }
        System.out.println("promedio: " + suma/cont);
        System.out.println("puntaje mas alto: " + mayor);
    }
}

