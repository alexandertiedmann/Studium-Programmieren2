import java.util.Arrays;
public class Matrix {
    private int columns,rows;
    private float[][] matrix;
    /**
     * Konstruktor fuer die Matrix
     * @param ma ein zwei-dimensionales float-Array
     */
    public Matrix (float[][] ma){
        matrix = ma;
        setColumns(ma);
        setRows(ma);
    }
    /**
     *Ginbt zurueck ob zwei Matrizen gleich sind
     * @param matrix1 Eingabematrix
     * @return Gleich oder nicht gleich
     */
    public boolean equals(Matrix matrix1){
        if ( Arrays.deepEquals(matrix1.getMatrix(),matrix) ){
            return true;
        }else {
            return false;
        }
    }
    /**
     * Addiert die Eingabematrix mit der Matrix und liefert das Ergebnis
     * @param matrix1 Eingabematrix
     * @return Ergebnismatrix
     */
    public float[][] add(Matrix matrix1){
        //wenn die Matrizen unterschiedliche Dimensionen haben wird eine Fehlermatrix zurueckgegeben
        if (isSameDimension(matrix1)){
            float[][] ergmatrix = new float[rows][columns];
            for (int i = 0; i < rows;i++){
                for (int j = 0; j < columns; j++){
                    ergmatrix[i][j] = matrix[i][j] + matrix1.getMatrix()[i][j];
                }
            }
            return ergmatrix;
        }else{
            //zurueckgeben der Fehlermatrix
            return getFehlermatrix();
        }
    }
    /**
     * Multipliziert die Matrix mit einem Skalar und gibt die Ergebnismatrix zurueck
     * @param skalar Skalar zum mutliplizieren
     * @return Ergebnisnmatrix
     */
    public float[][] multiplyScalar(float skalar){
        //Wenn die Zeilen null sind (wenn die Spalten in den Zeilen unterschiedlich sind) dann Fehlermatrix zurueckgeben
        if (columns != 0) {
            float[][] ergmatrix = new float[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    ergmatrix[i][j] = matrix[i][j] * skalar;
                }
            }
            return ergmatrix;
        }else{
            //zurueckgegben der Fehlermatrix
            return getFehlermatrix();
        }
    }
    /**
     * Multipliziert zwei Matrizen und gibt die Ergebnismatrix zurueck
     * @param matrix1 Eingabematrix
     * @return Ergebnismatrix
     */
    public float[][] multiply(Matrix matrix1){
        //Wenn die Spalten der Matrix ungleich der Zeilen der Eingabematrix sind wird eine Fehlermatrix zurueck gegeben
        if ( columns == matrix1.getRows()){
            float[][] ergebnis = new float[rows][matrix1.getColumns()];
            for (int i = 0; i < rows;i++){
                for (int j = 0; j < matrix1.getColumns();j++){
                    for (int k = 0; k < columns;k++){
                        ergebnis[i][j] += matrix[i][k] * matrix1.getMatrix()[k][j];
                    }
                }
            }
            return ergebnis;
        }else{
            return getFehlermatrix();
        }
    }
    /**
     * gibt die Anzahl an Spalten zurueck
     * @return Spaltenanzahl
     */
    public int getColumns(){
        return columns;
    }
    /**
     * Gibt die Anzahl der Zeilen zurueck
     */
    public int getRows(){
        return rows;
    }
    /**
     * Setzt die Anzahl der Zeilen
     * @param ma Matrix fuer die die Zeilenanzahl bestimmt wird
     */
    private void setRows(float[][] ma){
        rows = ma.length;
    }
    /**
     * Setzt die Anzahl der Spalten
     * bei Fehler wird eine 0 gesetzt
     * @param ma Matrix fuer die die Spaltenanzahl gesetzt wird
     */
    private void setColumns(float[][] ma){
        if (checkSameRowLength(ma)) {
            columns = ma[0].length;
        }else{
            columns = 0;
        }
    }
    /**
     * Setzt die Matrix
     * @param ma zu setzende Matrix
     */
    public void setMatrix(float[][] ma){ matrix = ma; }
    /**
     * Gibt die Matrix zurueck
     * @return Matrix
     */
    public float[][] getMatrix(){
        return matrix;
    }

    /**
     * erzeugt eine Fehlermatrix und gibt diese zurueck
     * @return Fehlermatrix
     */
    private float[][] getFehlermatrix(){
        float[][] erg = new float[1][2];
        erg[0][0] = 0;
        erg[0][1] = 0;
        return erg;
    }
    /**
     * Gibt an ob die Matrix die selbe Dimension hat wie die Eingabematrix
     * @param matrix1 Eingabematrix
     * @return Ist gleich oder ist nicht gleich
     */
    private boolean isSameDimension(Matrix matrix1){
        if ( rows == matrix1.getRows()){
            if ( columns == matrix1.getColumns()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    /**
     * prueft ob eine Matrix gleich lange Zeilen hat
     * @param ma zu pruefende Matrix
     * @return gleich lange Zeilen oder nicht
     */
    private boolean checkSameRowLength(float[][] ma) {
        boolean wahr = true;
        for (float[] zeile : ma) {
            if (zeile.length != ma[0].length) {
                wahr = false;
            }
        }
        return wahr;
    }
    /**
     * Alle Werte der MAtrix in einen String
     * @return Alle Werte der Matrix
     */
    public String toString(){
        String line = new String();
        String mat = new String();
        line = "Rows: " + getRows() + ", Columns: " + getColumns();
        for (int row=0; row < getMatrix().length; row++){
            mat = mat + getMatrix()[row][0];
            for (int col = 1; col < getMatrix()[row].length;col++){
                mat = mat + " " + getMatrix()[row][col];
            }
            mat = mat + "\n";
        }
        line = mat + line;
        return line;
    }
}
