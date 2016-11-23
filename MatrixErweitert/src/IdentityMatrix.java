public class IdentityMatrix extends QuadraticMatrix{
    /**
     * Erstellt eine Einheitsmatrix anhand der Groesse der uebergebenen Matrix
     */
    public IdentityMatrix(float[][] ma){
        super(ma);
        float[][] tmp=new float[getRows()][getColumns()];
        for (int i=0;i<getRows();i++){
            for (int j=0;j<getColumns();j++){
                if (i==j){
                    tmp[i][j]=1;
                }else{
                    tmp[i][j]=0;
                }
            }
        }
        setMatrix(tmp);
    }
}
