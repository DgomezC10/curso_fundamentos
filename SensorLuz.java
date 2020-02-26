
public class SensorLuz{
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;
    public SensorLuz(int min, int max){
        this.intensidadMax = max;
        this.intensidadMin = min;
        this.intensidad = min;

    }

    public int getIntensidad(){
        return this.intensidad;
    }

    public void setIntensidad(int i){
        if(i >= intensidadMin && i <= intensidadMax){
            this.intensidad = i;
        }
    }

    public int duplicarIntensidad(){
        if((this.intensidad * 2) >= intensidadMin && (this.intensidad * 2) <= intensidadMax){
            return this.intensidad = intensidad * 2;
        }else{
            return this.intensidad = intensidad;
        }
    }
}

