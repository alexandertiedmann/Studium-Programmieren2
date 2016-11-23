public class QuadraticMatrix extends Matrix{
    /**
     * Konstruktor fuer Quadratische Matrix
     * @param ma Quadtratische MAtrix (nxn)
     */
    public QuadraticMatrix(float[][] ma){
        super(ma);
        if (getRows() != getColumns()){
            System.out.println("Zeilen und Spalten muessen gleich sein");
        }
    }

    /**
     * Berechnet das n-Fache Produkt der Matrix
     * @param n wie oft die Matrix mit sich selbst multipliziert wird
     * @return Ergebnismatrix
     */
    public float[][] pow(int n){
        float[][] erg = emptyMatrix();
        if (n==0) return erg;
        QuadraticMatrix tmp = new QuadraticMatrix(getMatrix());
        for (int l=1;l<n;l++){
            tmp.setMatrix(tmp.multiply(this));
        }
        erg = tmp.getMatrix();
        return erg;
    }

    /**
     * erzeugt eine Matrix mit 0en
     * @return Leere Matrix
     */
    private float[][] emptyMatrix(){
        float[][] neu = new float[getRows()][getColumns()];
        for (int i=0;i<neu.length;i++){
            for (int j=0;j<neu[0].length;j++){
                neu[i][j]=0;
            }
        }
        return neu;
    }

    /**
     * Gibt alle Werte der Matrix in einem String zureuck
     * @return Alle Werte der Matrix
     */
    public String toString(){
        String line = new String();
        line = super.toString();
        line = "QuadratischeMatrix: \n" + line;
        return line;
    }
}
