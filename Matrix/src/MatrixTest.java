import static org.junit.Assert.*;

public class MatrixTest {
    private Matrix ma1;
    private Matrix ma2;
    private Matrix ma3;
    private Matrix ma4;
    private Matrix ma5;
    private Matrix ma6;
    private Matrix ma7;
    /**
     * setzten der Werte fuer die Matrizen
     * Matrix1 und 3 sind gleich
     * Matrix1,3 und 4 haben die gleiche Dimension
     * Matrix2 hat eine andere Dimension als alle anderen
     * Matrix5 hat ungleich lange Zeilen und eine Zeile mehr als die anderen
     * @throws Exception
     */
    @org.junit.Before
    public void setUp() throws Exception {
        float[][] matrix1 = new float[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;
        ma1 = new Matrix(matrix1);

        float[][] matrix2 = new float[2][1];
        matrix2[0][0] = 5;
        matrix2[1][0] = 6;
        ma2 = new Matrix(matrix2);


        float[][] matrix3 = new float[2][2];
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[1][0] = 3;
        matrix3[1][1] = 4;
        ma3 = new Matrix(matrix3);


        float[][] matrix4 = new float[2][2];
        matrix4[0][0] = 1;
        matrix4[0][1] = 1;
        matrix4[1][0] = 1;
        matrix4[1][1] = 1;
        ma4 = new Matrix(matrix4);


        float[][] matrix5 = new float[3][];
        matrix5[0] = new float[2];
        matrix5[1] = new float[1];
        matrix5[2] = new float[2];
        matrix5[0][0] = 1;
        matrix5[0][1] = 2;
        matrix5[1][0] = 3;
        matrix5[2][0] = 2;
        matrix5[2][1] = 3;
        ma5 = new Matrix(matrix5);

        float[][] matrix6 = new float[2][3];
        matrix6[0][0] = 50000;
        matrix6[0][1] = 50000;
        matrix6[0][2] = 50000;
        matrix6[1][0] = 90000;
        matrix6[1][1] = 90000;
        matrix6[1][2] = 90000;
        ma6 = new Matrix(matrix6);

        float[][] matrix7 = new float[3][2];
        matrix7[0][0] = 7000;
        matrix7[0][1] = 8000;
        matrix7[1][0] = 9000;
        matrix7[1][1] = 1000;
        matrix7[2][0] = 2000;
        matrix7[2][1] = 3000;
        ma7 = new Matrix(matrix7);
    }
    /**
     * Test des Fehlerfalls (Matrizen sind nicht gleich)
     */
    @org.junit.Test
    public void equalsUngleich() throws Exception {
        assertFalse("Die Matrizen sind nicht gleich", ma1.equals(ma4));
    }
    /**
     * Test des Normalfalls (Matrizen sind gleich)
     */
    @org.junit.Test
    public void equalsNormalfall() throws Exception {
        assertTrue("Die Matrizen sind gleich", ma1.equals(ma3));
    }
    /**
     * Test des Fehlerfalls (Dimensionen sind ungleich)
     */
    @org.junit.Test
    public void equalsUngleichDimension() throws Exception {
        assertFalse("Die Matrizen haben unterschiedliche Dimensionen", ma1.equals(ma2));
    }
    /**
     * Test des Normalfalls (Ergebnis stimmt mit dem Erwarteten ueberein)
     * @throws Exception
     */
    @org.junit.Test
    public void addNormalfall() throws Exception {
        float[][] expectedMatrix = new float[2][2];
        expectedMatrix[0][0] = 2;
        expectedMatrix[0][1] = 3;
        expectedMatrix[1][0] = 4;
        expectedMatrix[1][1] = 5;
        assertArrayEquals(expectedMatrix,ma1.add(ma4));
    }
    /**
     * Test des Fehlerfalls (Spalten sind ungleich)
     * @throws Exception
     */
    @org.junit.Test
    public void addSpaltenUngleich() throws Exception {
        float[][] expectedMatrix = new float[1][2];
        expectedMatrix[0][0] = 0;
        expectedMatrix[0][1] = 0;
        assertArrayEquals(expectedMatrix,ma1.add(ma2));
    }
    /**
     * Test des Fehlerfalls (Zeilen sind ungleich)
     * @throws Exception
     */
    @org.junit.Test
    public void addZeilenUngleich() throws Exception {
        float[][] expectedMatrix = new float[1][2];
        expectedMatrix[0][0] = 0;
        expectedMatrix[0][1] = 0;
        assertArrayEquals(expectedMatrix,ma1.add(ma5));
    }
    /**
     * Test des Normalfalls (Ergebnis und Erwartung stimmen ueberein)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyScalarNormalfall() throws Exception {
        float skalar = 1;
        float[][] expectedMatrix = new float[2][2];
        expectedMatrix[0][0] = 1;
        expectedMatrix[0][1] = 2;
        expectedMatrix[1][0] = 3;
        expectedMatrix[1][1] = 4;
        assertArrayEquals(expectedMatrix,ma1.multiplyScalar(skalar));
    }
    /**
     * Test des Normalfalls (Ergebnis und Erwartung stimmen ueberein, aber Zahlen sehr gross)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyScalarNormalfallGross() throws Exception {
        float skalar = 10000;
        float[][] expectedMatrix = new float[2][3];
        expectedMatrix[0][0] = 500000000;
        expectedMatrix[0][1] = 500000000;
        expectedMatrix[0][2] = 500000000;
        expectedMatrix[1][0] = 900000000;
        expectedMatrix[1][1] = 900000000;
        expectedMatrix[1][2] = 900000000;
        assertArrayEquals(expectedMatrix,ma6.multiplyScalar(skalar));
    }
    /**
     * Test des Fehlerfalls (Spalten=0, da ungleiche Spaltenzahlen in den Zeilen)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyScalarZeilenGleichNull() throws Exception {
        float skalar = 1;
        float[][] expectedMatrix = new float[1][2];
        expectedMatrix[0][0] = 0;
        expectedMatrix[0][1] = 0;
        assertArrayEquals(expectedMatrix,ma5.multiplyScalar(skalar));
    }
    /**
     * Test des Normalfalls (Spalten und Zeilen von Matrix1 gleich Zeilen und Spaltenanzahl Matrix2)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyNormalfall() throws Exception {
        float[][] expectedMatrix = new float[2][2];
        expectedMatrix[0][0] = 3;
        expectedMatrix[0][1] = 3;
        expectedMatrix[1][0] = 7;
        expectedMatrix[1][1] = 7;
        assertArrayEquals(expectedMatrix,ma1.multiply(ma4));
    }
    /**
     * Test des Grenzfalls (Zeilen von Matrix1 gleich Spaltenanzahl Matrix2 aber Zahlen sehr gross)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyNormalfallGross() throws Exception {
        float[][] expectedMatrix = new float[2][2];
        expectedMatrix[0][0] = 900000000;
        expectedMatrix[0][1] = 600000000;
        expectedMatrix[1][0] = 1620000000;
        expectedMatrix[1][1] = 1080000000;
        assertArrayEquals(expectedMatrix,ma6.multiply(ma7));
    }
    /**
     * Test des Fehlerfalls (Zeilen von Matrix1 ungleich Spaltenanzahl Matrix2)
     * @throws Exception
     */
    @org.junit.Test
    public void multiplyFehlerSpaltenZeilen() throws Exception {
        float[][] expectedMatrix = new float[1][2];
        expectedMatrix[0][0] = 0;
        expectedMatrix[0][1] = 0;
        assertArrayEquals(expectedMatrix,ma1.multiply(ma5));
    }
 
}