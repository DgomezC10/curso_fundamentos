
import java.util.Scanner;
public class Propiedad{
    private String condicion;
    private int visitas;
    public Propiedad(String c){
        condicion = c;
        visitas = 0;
    }

    public String getCondicion(){
        return this.condicion;   
    }

    public int getVisitas(){
        return this.visitas;  
    }

    public void setCondicion(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("ingrese una condicion");
            String pal =scan.next();
            if((pal.equals("nueva")) || (pal.equals("usada"))){
                condicion = pal;
                break;
            }

        }
    }

    public void aumentarVisitas(){
        if(condicion.equals("nueva")){
            visitas = visitas + 2;
        }else{
            visitas++;
        }
    }
}

