public class Vektor extends Matrix{
    /**
     * Konstruktor fuer einen Vektor
     * @param ma Vektorwerte (nx1 Matrix)
     */
    public Vektor(float[][] ma){
        super(ma);
        if (getColumns() != 1) {
            System.out.println("Fuer einen Vektor nur 1 Spalte");
            System.exit(1);
        }
    }

    /**
     * berechnet den Betrag des Vektors
     * @return Betrag
     */
    public double length(){
        double erg = 0;
        double sum = 0;
        for (int i = 0; i < getRows(); i++){
            sum = sum + Math.pow((getMatrix()[i][0]),2);
        }
        erg = Math.sqrt(sum);
        return erg;
    }

    /**
     * Gibt alle Werte des Vektors zurueck
     * @return Alle Werte des Vektors
     */
    public String toString(){
        String line = new String();
        line = super.toString();
        line = "Vektor: \n" + line + ", Betrag: " + length();
        return line;
    }
}
