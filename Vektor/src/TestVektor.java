public class TestVektor {
    public static void main(String[] args) {
        System.out.println("Übungsblatt 1 Aufgabe 1.1:");
        //ertellen eines Arrays mit den Werten für den Vektor
        float[] zahlen = {1,2,3};
        Vektor v1 = new Vektor(zahlen);
        //ausgabe des Vekotrs
        System.out.println(v1.toString());
        //umwandlung von Zeilen in Spaltenvektor
        v1.transponiere();
        //ausgabe Spaltenvektor
        System.out.println(v1.toString());
        //zurückwandeln von Spalten in Zeilenvektor
        v1.transponiere();
        //nochmalige Ausgabe des Zeilenvektors
        System.out.println(v1.toString());
        //Werte des 2. Vektors (Anzahl Elemente ist die Dimension)
        float[] vektor2 = {2,4,5};
        //Berechnung und Ausgabe des Skalarproduktes der beiden Vektoren
        System.out.println("Skalar: " + v1.skalarProdukt(vektor2));
    }
}
