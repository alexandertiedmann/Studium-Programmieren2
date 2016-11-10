public class Main {
    public static void main (String[] args){
        System.out.println("Test:");
        Rechner.main(new String[]{"7","add","2"});
        Rechner.main(new String[]{"7","sub","2"});
        Rechner.main(new String[]{"7","mul","2"});
        Rechner.main(new String[]{"7","div","2"});
        //Abbruch gewollt, da ueber die Kommandozeile eigentlich nur eine Operation gleichzeitig angegeben wird
        Rechner.main(new String[]{"c","div","2"}); //Abbruch --> Keine gueltige Zahl
        Rechner.main(new String[]{"10","dif","2"}); //Abbruch --> kein gueltiger Operator
        //Rechner.main(new String[]{"10","dv","2"}); //Abbruch --> Kein gueltiger Operator
    }
}
