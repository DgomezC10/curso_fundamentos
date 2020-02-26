import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args){
        int suma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un n: ");
        
        for( int n = scan.nextInt() ; n > 0; n--){
            System.out.println("Ingrese un numero");
            int num = scan.nextInt();
            suma = suma + num;
        }
        System.out.println("el total es : " + suma);
    }
}
