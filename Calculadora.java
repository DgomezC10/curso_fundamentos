
public class Calculadora{
    public static void main(String[] args){
        System.out.println("Multiplication table");
        System.out.println("      1    2   3   4   5   6   7   8   9");
        System.out.println("..........................................");
        for(int i = 1; i < 10; i++){
            System.out.printf(i + " |");
            for(int j = 1; j < 10; j++){
                int a = i*j;
                System.out.printf("  %03d/n" + a);
            }
            System.out.println("");
        }
    }
    
}
