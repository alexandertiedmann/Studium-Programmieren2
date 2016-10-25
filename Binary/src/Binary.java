public class Binary {
    /**
     * Umwandlung in Binaer
     * @param zahl umzuwandelnde Zahl
     * @return Binaerschreibweise der Zahl
     */
    public static String inBinary(int zahl){
        if (zahl == 0) return "0";
        if (zahl <  0) return inBinaryNeg(zahl);
        return inBinaryPos(zahl);
    }

    /**
     * wandelt eine positive Zahl in die binaere Schreinbweise um
     * @param zahl positive ganze Zahl
     * @return Binaerschreibweise
     */
    private static String inBinaryPos(int zahl){
        String bin = new String();
        //herausfinden der einzelnen Binaeren Stellen ueber ganzteilige Division
        for (int tmp = zahl; tmp > 0; tmp=tmp/2){
            bin = (tmp%2) + bin;
        }
        return bin;
    }

    /**
     * wandelt eine negative Zahl in die binaere Schreinbweise um
     * @param zahl negative ganze Zahl
     * @return Binaerschreibweise
     */
    private static String inBinaryNeg(int zahl){
        String bin = new String();
        //Zweierkomplement berechnen
        bin = "Noch keine negativen Zahlen";
        return bin;
    }
}
