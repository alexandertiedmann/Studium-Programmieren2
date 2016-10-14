//Präsensübung
public class Vektor2D {
    private float delX, delY;
    private Punkt anker;

    public Vektor2D(float delX, float delY,Punkt anker) {
        this.delX = delX;
        this.delY = delY;
        this.anker = anker;
    }

    public void add(Vektor2D vektor) {
        delX = delX + vektor.delX;
        delY = delY + vektor.delY;
    }

    public float betrag() {
        return ((float) Math.sqrt(delX*delX + delY*delY));
    }

    public static float betragKlasse(float x, float y){
        return ((float) Math.sqrt(x*x + y*y));
    }

    public void verschiebeAnker(Vektor2D schieb) {
        anker.verschiebe(schieb.delX, schieb.delY);
    }

    public static String verschiebeAnkerKlasse(Vektor2D schieb, Punkt anker){
        anker.verschiebe(schieb.getdelX(), schieb.getdelY());
        return "(" + schieb.delX + ", " + schieb.delY + ")" + " anker: " + anker.toString();
    }

    public String toString(){
        return "(" + delX + ", " + delY + ")" + " anker: " + anker.toString();
    }

    public float getdelX(){
        return delX;
    }

    public float getdelY(){
        return delY;
    }
}
