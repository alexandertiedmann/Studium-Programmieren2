public class Vektor{
    private int dimension;
    private float[] komponenten;
    private boolean istZeilenvektor=true;

    /**
     * Konstruiert den Vektor (die Länge des Arrays bestimmt die Dimension)
     * @param zahlen (Werte des Vektors)
     */
    public Vektor (float[] zahlen){
        komponenten = zahlen;
        dimension = komponenten.length;
    }

    /**
     * Macht aus einem Zeilenvektor einen Spaltenvektor und anders herum
     */
    public void transponiere() {
        if (istZeilenvektor) {
            istZeilenvektor = false;
        } else {
            istZeilenvektor = true;
        }
    }

    /**
     * Berechnet das Skalarprodukt zweier Vektoren bei ungleichen Dimensionen wird 0 zurück gegeben
     * @param vektor2 2. Vektor zum errechnen des Skalarproduktes
     * @return Skalarprodukt der beiden Vektoren
     */
    public float skalarProdukt(float[] vektor2){
        float erg=0;
        //check ob die beiden Vektoren identische Dimensionen haben
        if (vektor2.length == dimension) {
            for (int i =0;i < vektor2.length; i++) {
                erg = erg + vektor2[i] * komponenten[i];
            }
        }else{
            //Fehlerausgabe bei ungleichen Dimensionen
            System.out.println("Man kann aus diesen beiden Vektoren nicht das Skalarprodukt bilden");
            return 0;
        }
        return erg;
        }

    /**
     * Ausgabe des Vektors (mit Formatierung für Zeilen und Spaltenvektoren)
     * @return Ausgabe des Vektors mit Formatierung
     */
    public String toString() {
        String ausgabe = new String();
        ausgabe = "Vektor: \n";
        if (istZeilenvektor){
            //Ausgabe für Zeilenvektor
            ausgabe = ausgabe + "(";
            for (int i=0; i < komponenten.length; i++) {
                ausgabe = ausgabe + komponenten[i] + " ";
            }
            ausgabe = ausgabe + ")\n";
        } else {
            //Ausgabe für Spaltenvektor
            for (int i=0; i < komponenten.length; i++) {
                ausgabe = ausgabe + "(" + komponenten[i] + ")\n";
            }
        }
        return ausgabe;
    }
}