import java.util.Arrays;
public class Matrix {

    private float[][] matrix = new float[][];

    public boolean equals(float[][] matrix1){
        
        if ( Arrays.equals(matrix1,matrix) ){
            return true;
        }else {
            return false;
        }
    }

    public float[][] add(float[][] matrix1){

        return matrix1;
    }

    public float[][] multiplayScalar(float[][] matrix, float skalar){

        return matrix;
    }

    public float[][] multiplay(float[][] matrix1){

        return matrix1;
    }

    private int getColumns(){

        return 1;
    }

    private int getRows(){

        return 1;
    }

    private boolean isSameDimension(float[][] matrix1){

        return true;
    }
}
