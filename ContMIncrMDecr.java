import java.util.Scanner;
public class ContMIncrMDecr{
    public static void main(String[] args){
        double  cont = 0;
        Scanner scan = new Scanner(System.in);
        double num1 = 0;
        double num2 = scan.nextDouble();
        while(num2 !=0){
            
            if ( num2 >= num1){
                System.out.println("+1");
                cont++;
            }else if(num2 < num1) {
                System.out.println("-1");
                cont--;
            }
            
            num1 = num2;
            num2 = scan.nextDouble();
        }
        System.out.println(cont);
    }
}