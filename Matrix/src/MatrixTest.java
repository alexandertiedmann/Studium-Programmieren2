import static org.junit.Assert.*;

public class MatrixTest {
    private float[][] matrix1 = new float[2][2];
    private float[][] matrix2 = new float[2][1];
    private float[][] matrix3 = new float[2][2];

    @org.junit.Before
    public void setUp() throws Exception {
        Matrix ma = new Matrix();
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        matrix2[0][0] = 5;
        matrix2[1][0] = 6;

        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[1][0] = 3;
        matrix3[1][1] = 4;
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    /**
     * Test des Fehlerfalls (ungleiche Dimensionen
     */
    public void equalsUngleichDimension() throws Exception {
        assertFalse("Fehlgeschlagen", Matrix.equals(matrix1,matrix2));
    }

    @org.junit.Test
    /**
     * Test des Normalfalls
     */
    public void equalsNormalfall() throws Exception {
        assertTrue("Erfolgreich", Matrix.equals(matrix1,matrix3));
    }

    @org.junit.Test
    public void add() throws Exception {

    }

    @org.junit.Test
    public void multiplayScalar() throws Exception {

    }

    @org.junit.Test
    public void multiplay() throws Exception {

    }

}