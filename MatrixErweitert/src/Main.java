public class Main {
    public static void main(String[] args) {
        //Testvektor
        System.out.println("-----Vektor Test-----");
        float[][] ma = new float[3][1];
        ma[0][0]=1;
        ma[1][0]=2;
        ma[2][0]=3;
        Vektor v1 = new Vektor(ma);
        System.out.println(v1.toString());
        System.out.println(v1.length());

        //Test QuadraticMatrix
        System.out.println("-----Quadratische Matrix Test-----");
        float[][] qa = new float[2][2];
        qa[0][0]=1;
        qa[0][1]=2;
        qa[1][0]=3;
        qa[1][1]=4;
        QuadraticMatrix q1 = new QuadraticMatrix(qa);
        System.out.println(q1.toString());
        float[][] test=q1.pow(3);
        System.out.println(printMatrix(test));

        //Test Einheitsmatrix
        System.out.println("-----Einheitsmatrix Test-----");
        float[][] em = new float[4][4];
        IdentityMatrix i1 = new IdentityMatrix(em);
        System.out.println(i1.toString());
    }

    /**
     * Gibt eine Matrix als Striing zurueck
     * @param ma auszugebende Matrix
     * @return String mit der Matrix
     */
    private static String printMatrix(float[][] ma){
        String line = new String();
        String mat = new String();
        line = "Rows: " + ma.length + ", Columns: " + ma[0].length;
        for (int row=0; row < ma.length; row++){
            mat = mat + ma[row][0];
            for (int col = 1; col < ma[row].length;col++){
                mat = mat + " " + ma[row][col];
            }
            mat = mat + "\n";
        }
        line = "Matrix: \n" + mat + line;
        return line;
    }
}
