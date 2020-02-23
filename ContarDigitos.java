
import java.util.Scanner;
public class ContarDigitos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num >= 0){ 
            if(num >= 1000){
                int n1 = num%10;
                num = num/10;
                int n2= num%10;
                num = num/10;
                int n3 = num%10;
                int n4 = num/10;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n4);
                System.out.println("num digitos: 4");

            }else if(num >= 100){
                int n1 = num%10;
                num = num/10;
                int n2= num%10;

                int n3 = num/10;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                System.out.println("num digitos: 3");
            }else if(num >= 10){
                int n1 = num%10;
                num = num/10;
                int n2= num/10;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println("num digitos: 2");
            }else if(num >= 0){
                System.out.println(num);
                System.out.println("num digitos: 1");
            }
            num = scan.nextInt();
        }
    }
}

