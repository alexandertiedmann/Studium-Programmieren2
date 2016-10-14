public class Arrayelement {
    public static byte[] haeufigstesElem(byte[] arr){
        //das ausgabe Array ist im "schlimmsten Fall so lang wie das Eingabe Array (jeder Wert 1 mal)
        //
        byte[] elem = new byte[arr.length];
        //Jeden Wert einmal in das ausgabe Array schreiben, so das keine doppelten mehr vorkommen
        for (int i=0; i < arr.length; i++){
            elem[i]=arr[i]
                for (int j=i+1; j < arr.length; j++){
                    if (elem[i] != arr[j]){
                        elem[i]=arr[j];
                        break;
                    }
                }
        }
        //
        return elem;
    }
}
