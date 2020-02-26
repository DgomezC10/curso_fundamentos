import java.util.Scanner;
public class Objeto1{
    public static void main(String[] args){
        Propiedad ob1 = new Propiedad("nueva");
        ob1.aumentarVisitas();
        ob1.aumentarVisitas();
        ob1.aumentarVisitas();
        ob1.setCondicion();
        ob1.aumentarVisitas();
        ob1.aumentarVisitas();
        ob1.aumentarVisitas();
        System.out.println(ob1.getVisitas());
        
    }
}

