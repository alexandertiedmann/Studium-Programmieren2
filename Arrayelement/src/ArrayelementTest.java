public class ArrayelementTest {
    public static void main(String[] args) {
        //erzeugen des Arrays mit Werten
        byte[] zahlen = {1,2,5,4,3,2,7,8,9,2,3,3,3,3,3};
        //übergeben des Arrays und Ausgabe des Rückgabewertes
        zahlen = Arrayelement.haeufigstesElem(zahlen));
        for (byte i : zahlen) {
            System.out.println(i);
        }
    }
}
