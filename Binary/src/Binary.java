public class Binary {
    /**
     * Umwandlung in Binaer (32 Bit werden zurueck gegeben)
     * @param zahl umzuwandelnde Zahl
     * @return Binaerschreibweise der Zahl
     */
    public static String inBinary(int zahl){
        String bin = new String();
        // Da die int Zahl schon die richtige Schreibweise nutzt muss nur noch ausgegeben werden
        for (int i = 0; i < 32; i++){
            if (isSet(i,zahl)){
                bin = 1 + bin;
            }else{
                bin = 0 + bin;
            }
        }
        return bin;
    }

    /**
     * schaut ob ein Bit gesetzt ist oder nicht
     * @param index Stelle an der geschaut wird
     * @param status Zahl in der das Bit gesetzt sein soll
     * @return gesetzt oder nicht gesetzt
     */
    public static boolean isSet(int index, int status){
        /*schiebe die Bits in status um index viele stellen bis das gewollte Bit am Ende steht dann maskiere mit 1
        die gewuenschte Stelle ist eine 1 wenn dort eine 1 Stand und 0 wenn dort 0 stand */
        // index-1 da sonst 0 die 1. Stelle waere
        return ( ( (status >> index ) & 1 ) == 1 );
    }
}
