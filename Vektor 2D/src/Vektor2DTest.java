//Präsensübung
public class Vektor2DTest {

    public static void main (String[] args) {
        //Aufgabe 1 Klasse zum laufen bringen
        Punkt p1 = new Punkt(1.3f, 2.0f);
        Vektor2D v1 = new Vektor2D(3, 5.5f, p1);
        Vektor2D v2 = new Vektor2D(4,0,new Punkt(1,1));

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        //Aufgabe 2 Klassenmethode für Betrag und verschiebe Anker + Vergleich
        System.out.println("Betrag: " + v1.betrag());
        System.out.println("betragKlasse: " + Vektor2D.betragKlasse(v1.getdelX(), v1.getdelY()));
        v2.verschiebeAnker(v2);
        System.out.println("verschiebeAnker: " + v2.toString());
        System.out.println("verschiebeAnkerKlasse" + Vektor2D.verschiebeAnkerKlasse(v1,p1));

        //Aufgabe 3 Ausgabe eines 2-dimensionalen Arrays
        float [][] arrayU = new float [3][];
        arrayU [0] = new float [2];
        arrayU [1] = new float [3];
        arrayU [2] = new float [1];
        arrayU [0][1] = 2;
        arrayU [1][0] = 3;
        arrayU [1][2] = 5;
        arrayU [2][0] = 4;
        System.out.println(ausgabeMatrix(arrayU));

        //Aufgabe 4 erzeugen eines Arrays aus Vektor2D
        Vektor2D[] vektoren = new Vektor2D[];
    }

    public static String ausgabeMatrix(float[][] matrix){
        String ausgabe = new String();
        for (int i = 0; i < matrix.length; i++){
            float[] zahlen = matrix[i];
            for (int j = 0; j < zahlen.length; j++){
                ausgabe = ausgabe + zahlen[j] + " ";
            }
            ausgabe = ausgabe + "\n";
        }
        return ausgabe;
    }
}
