public class Rechner {
    /**
     * Berechnen der Eingabe
     * @param args 1.Parameter Zahl1 2. Parameter Operator 3. Parameter Zahl2
     */
    public static void main(String[] args) {
        //pruefen ob die Parameter gesetzt sind
        if (args.length != 3){
            System.out.println("Bitte alle Parameter eingeben");
            System.exit(1);
        }
        //Ausgabe der Operation nachdem Operator und Values umgewandelt wurden
        System.out.println(args[0] +" " + args[1] + " " + args[2] + " is " + calculate(args[1],checkParamValue(args[0]),checkParamValue(args[2])));
    }

    /**
     * berechnet von zwei Werten das Ergebnis
     * @param op Operator (add,sub,mul,div)
     * @param v1 erste Zahl
     * @param v2 zweite Zahl
     * @return Ergebnis der Operation
     */
    private static float calculate(String op, float v1, float v2){
        float erg = 0;
        switch (op){
            case "add":
                        erg=v1+v2;
                        break;
            case "sub":
                        erg=v1-v2;
                        break;
            case "mul":
                        erg=v1*v2;
                        break;
            case "div":
                        erg=v1/v2;
                        break;
            default:
                System.out.println("Kein gueltiger Operator");
                System.exit(1);
        }
        return erg;
    }

    /**
     * Macht aus einem String eine Zahl
     * @param v Zahl die umgewandelt werden soll
     * @return Gleitkommazahl
     */
    private static float checkParamValue(String v){
        float value = 0;
        //wenn keine Zahl dann Fehler
        try {
            value = Float.parseFloat(v);
        }
        catch(NumberFormatException e) {
            System.err.println(v + " ist keine gueltige Zahl");
            System.exit(1);
        }
        return value;
    }
}
