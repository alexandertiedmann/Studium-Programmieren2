public class ArrayelementTest {
    public static void main(String[] args) {
        System.out.println("Übungsblatt 1 Aufgabe 1.2:");
        //erzeugen des Arrays mit Werten
        byte[] zahlen = {1,2,5,4,3,2,7,8,9,2,3,3,3,3,9,9,9,9,7,7,7,7};
        //übergeben des Arrays und Ausgabe des Rückgabewertes
        System.out.println("Diese Zahlen kommen am häufigsten in dem Array vor:");
        zahlen = Arrayelement.haeufigstesElem(zahlen);
        for (byte i : zahlen) {
            System.out.println(i);
        }
    }
}
