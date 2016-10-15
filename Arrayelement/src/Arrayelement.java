public class Arrayelement {
    /**
     * Gibt aus einem byte Array die Werte zurück die am häufigsten vorkommen
     * @param arr Array mit den zu übergebenden Werten
     * @return Array mit den Zahlen die am häufigsten vorkommen
     */
    public static byte[] haeufigstesElem(byte[] arr){
        //Ausgabe Array erzeugen
        byte[] elem = new byte[arr.length];
        //temporäres Array um alle Werte einmal zu erhalten
        byte[] temp = new byte [arr.length];
        temp = uebernehmen(temp, arr);

        //Alle nicht benötigten Werte wegfallen lassen
        int zahl=pruefTeilen(temp);
        byte[] cut = new byte[zahl];
        cut = teilen(temp,zahl);
        //sortieren des Arrays
        cut = sortArray(cut);

        //Matrix für Anzahl der Elemente aus dem Eingangsarray erzeugen
        byte[][] matrix = new byte[2][];
        matrix [0] = new byte[cut.length];
        matrix [1] = new byte[cut.length];
        int laengeM = cut.length;
        //Werte aus dem zusammengeschnittenen Array in die Matrix füllen
        for (int a = 0; a < cut.length;a++){
            matrix[0][a] = cut[a];
        }
        //schreibt die jeweilige Anzahl der Elemente in die 2. Zeile
        matrix = eingabeZaehlen(matrix, arr, laengeM);

        //ausgabe der Matrix
        //ausgabeMatrix(matrix);

        return pruefeMaxAnzahl(matrix,laengeM);
    }

    /**
     * prüft welche Zahl die höchste Zahl/en ist/sind und schreibt diese in ein Array
     * @param matrix sortiertes und gekürztes 2 Dimensionales Array wo in der 1. Zeile die Werte und in der 2. die Häufigkeit der Werte steht
     * @param laengeM Länge der Zeilen
     * @return Array mit den häufigsten Werten
     */
    private static byte[] pruefeMaxAnzahl(byte[][] matrix,int laengeM){
        byte maxZahl = 0;
        int zaehler = 0;
        //finde die Höchste Anzahl(maxZahl) und zaehle wie oft sie vorkommt
        for (int i = 0; i < laengeM; i++){
            maxZahl = matrix[1][i];
            zaehler = 0;
            for (int j=0; j < laengeM; j++){
                if (maxZahl <= matrix[1][j]){
                    //wenn maxZahl kleiner dann nimm größere und setze den Zähler zurück
                    if (maxZahl < matrix[1][j]){
                        maxZahl = matrix[1][j];
                        zaehler = 0;
                    }
                    //wenn max Zahl gleich zähle einen hoch
                    if (maxZahl == matrix[1][j]) {
                        zaehler++;
                    }
                }
            }
        }
        byte[] elem = new byte[zaehler];
        //suche die maxZahl und schreibe die Zahl die so oft vorkommt in das Array
        for (int k=0; k < laengeM; k++){
            if (matrix[1][k] == maxZahl){
                boolean found = false;
                //schauen ob bereits vorhanden
                for (int l =0; l < zaehler; l++){
                    if (elem[l] == matrix[0][k]) {
                        found = true;
                    }
                }
                //an freien Platz einfügen und weiter zum nächsten maxZahl
                if (!found) {
                    for (int m = 0; m < zaehler; m++) {
                        if (elem[m] == 0) {
                            elem[m] = matrix[0][k];
                            break;
                        }
                    }
                }
            }
        }
        return elem;
    }

    /**
     * eine Testfunktion die die Matrix für pruefeMaxAnzahl ausgibt
     * @param matrix
     */
    private static void ausgabeMatrix(byte[][] matrix){
        String ausgabe = new String();
        for ( int i = 0; i < matrix.length; i++){
            byte[] zahlen = matrix[i];
            for (int j = 0; j < zahlen.length; j++){
                ausgabe = ausgabe + zahlen[j] + " ";
            }
            ausgabe = ausgabe + "\n";
        }
        System.out.println(ausgabe);
    }

    /**
     * schreibt die häufigkeit der Werte aus dem arr Array in die entsprechende Zeile in der Matrix
     * @param matrix 2 Dimensionales Array mit 1. Zeile die Werte wie im arr Array und in der 2. Zeile 0en
     * @param arr Array mit den ursprungswerten
     * @param laengeM Länge der Zeilen in der Matrix
     * @return 2 Dimensionales Array mit 1. Zeile die Werte wie im arr Array und in der 2. Zeile die häufigkeit aus arr
     */
    private static byte[][] eingabeZaehlen(byte[][] matrix, byte[] arr, int laengeM){
        //durch dei Matrix gehen
        for (int b=0; b < laengeM;b++){
            byte zaehler = 0; //Zähler
            byte zahl = matrix[0][b]; //zu suchende Zahl
            //durch arr gehen
            for (int c = 0; c < arr.length; c++){
                if (arr[c] == zahl){
                    zaehler++;
                }
            }
            //Anzahl der gefundenen Treffer in die 2. Zeile
            matrix[1][b] = zaehler;
        }
        return matrix;
    }

    /**
     * sortiert das übergebene Array von klein nach groß
     * @param unsortArray unsortiertes Array
     * @return sortiertes Array
     */
    private static byte[] sortArray(byte[] unsortArray){
        byte value = 0; //Zwischenspeicher für den Wert aus dem Array
        int laenge = unsortArray.length;
        for (int i = 0; i < laenge; i++){
            value = unsortArray[i];
            int j = i-1;
            while (( j > -1) && ( unsortArray[j] > value) ){
                unsortArray[j+1] = unsortArray[j];
                j--;
            }
            unsortArray[j+1] = value;
        }
        return unsortArray;
    }

    /**
     * prüft an welcher Stelle das Array geteilt werden kann weil dahinter nur noch 0en kommen
     * @param temp zu langes Array
     * @return Stelle an der gekürzt werden kann
     */
    private static int pruefTeilen (byte[] temp){
        int cutAt = 0;
        //Stelle an der die die Standartwerte (0) beginnen
        for (int z = 0; z < temp.length; z++){
            if (temp[z] == 0){
                cutAt = z;
                break;
            }
        }
        return cutAt;
    }

    /**
     * Teilt das übergebene Array an der übergebenen Stelle
     * @param temp zu teilendes Array
     * @param cutAt Stelle an der geteilt wird
     * @return gekürztes Array
     */
    private static byte[] teilen (byte[] temp, int cutAt){
        //Alles was 0 ist kann weg
        //Alle Werte die nicht 0 sind in ein anderes Array übergeben
        byte[] tempCut = new byte[cutAt];
        for (int y = 0; y < tempCut.length; y++){
            tempCut[y] = temp[y];
        }
        return tempCut;
    }

    /**
     * jeden Wert aus dem ursprungs Array 1-mal in dass temporäre Array
     * @param temp temporäres Array (leer)
     * @param arr ursprüngliches Array
     * @return gefülltes temporäres Array
     */
    private static byte[] uebernehmen (byte[] temp, byte[] arr){
        //jedes Element aus dem Eingangsarray prüfen ob es im Temparray ist, wenn nicht dann einfügen
        for (int i = 0; i < arr.length; i++ ) {
            byte element = arr[i];
            boolean fehlt = true;
            for (int j = 0; j < temp.length; j++){
                if ( temp[j] == element){
                    fehlt=false;
                }
            }
            //wenn fehlt dann einfügen
            if (fehlt){
                for (int k = 0; k < temp.length; k++) {
                    //in das nächste freie Feld (0)
                    if (temp[k] == 0) {
                        temp[k] = element;
                        break;
                    }
                }
            }
        }
        return temp;
    }
}
