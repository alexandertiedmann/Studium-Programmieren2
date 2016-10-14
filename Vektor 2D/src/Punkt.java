//Präsensübung
public class Punkt {
    private float x;
    private float y;

    public Punkt(float u, float v){
        x = u; y = v;
    }

    public float getX(){
        return x;
    }

    public void verschiebe(float vx, float vy){
        x = x + vx;
        y = y + vy;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}