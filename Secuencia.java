import java.util.Scanner;
public class Secuencia{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            if(num < 0 ){
                System.out.println(num);
            }else if (num == 0){
                break;
            }

        }
    }
}

