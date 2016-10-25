public class BitFlags {
    private int status;
    /**
     * Konstruktor fuer BitFlags
     * @param index Bitfolge die zu status wird
     */
    public BitFlags(int index){
        status = index;
    }
    /**
     * Setzt das Bit am uebergebenen Index auf 1
     * @param index Index an dem gesetzt wird
     */
    public void switchOn (int index){
        // index-1 da sonst 0 die 1. Stelle waere
        // Bitweise mit 0en verodern
        // mit 1 an der Stelle die 1 gesetzt werden soll
        // bsp: 00000 | 00100 = 00100
        status = status | (1 << --index);
    }
    /**
     * Setzt das Bit am uebergebenen Index auf 0
     * @param index Index an dem geloescht wird
     */
    public void switchOff (int index){
        // index-1 da sonst 0 die 1. Stelle waere
        // Bitweise mit 1en verunden
        // mit 0 an der Stelle die 0 gesetzt werden soll
        // bsp: 11111 & (00100 negiert = 11011) = 11011
        status = status & ~(1 << --index);
    }

    /**
     * dreht das Bit am uebergebenen Index um
     * @param index Index an dem gedreht wird
     */
    public void swap (int index){
        if (isSet(index)){
            switchOff(index);
        }else{
            switchOn(index);
        }
    }

    /**
     * gibt zurueck, ob das Bit am uebergebenen Index gesetzt ist
     * @param index Inddex der ueberprueft wird
     * @return true bei gesetzt und false bei nicht gesetzt
     */
    public boolean isSet(int index){
        /*schiebe die Bits in Status um index viele stellen bis das gewollte Bit am Ende steht dann maskiere mit 1
        die gewuenschte Stelle ist eine 1 wenn dort eine 1 Stand und 0 wenn dort 0 stand */
        // index-1 da sonst 0 die 1. Stelle waere
        return ( ( (status >> --index ) & 1 ) == 1 );
    }

}
