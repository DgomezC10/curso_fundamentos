import java.util.Scanner;
public class Estrellas{
    public static void main(String[] args){
        int cero = 0;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int inv = 0;
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num >= 0){
            switch(num){
                case 0:
                cero++;
                break;
                case 1:
                uno++;
                break;
                case 2:
                dos++;
                break;
                case 3:
                tres++;
                break;
                case 4:
                cuatro ++;
                break;
                case 5 :
                cinco++;
                break;
                default:
                inv++;
                break;

            }
            cont++;
            num = scan.nextInt();
        }
        System.out.printf("0(%d)  *(%d)  **(%d)  ***(%d)  ****(%d)  *****(%d)%n", cero, uno, dos, tres, cuatro, cinco);
        System.out.println("Total: " + cont + " Invalidas: " + inv);
    }
}

