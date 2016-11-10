public class Main {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Boss","Hans",4000);
        Auszubildender a1 = new Auszubildender("Kaffee","mach",50,"Beruf",1);
        //Geter
        //Test Name,Vorname,Gehalt
        System.out.println("Name:" + m1.getName() + ", Vorname:" + m1.getVorname() + ", Gehalt:" + m1.getGehalt());
        //Test Beruf
        System.out.println("Azubiberuf: " + a1.getName() + "=" + a1.getAusbildungsberuf());
        //Test Ausbildungsjahr
        System.out.println("Azubi Ausbildungsjahr: " + a1.getName() + "=" + a1.getAusbildungsjahr());

        //Seter
        a1.setName("Bee");
        a1.setVorname("New");
        a1.setGehalt(1400);
        a1.setAusbildungsjahr(2);
        a1.setAusbildungsberuf("Sekretaer");
        //Test der toString
        System.out.println(a1.toString());

        //TestGehaltserhoeung
        System.out.println("Azubigehalt:" + a1.getName() + "=" + a1.getGehalt());
        //Erhoeung des Gehalts um 1200€
        a1.erhoehen(1200);
        System.out.println("Azubigehalt nach Erhoehung:" + a1.getName() + "=" + a1.getGehalt());


        //Test Fehlerfall (negatives Gehalt)
        a1.erhoehen(-2000);
        //Test Fehlerfall Ausbildungsjahr
        a1.setAusbildungsjahr(-2);
        a1.setAusbildungsjahr(0);

        //Test Fehlerfall Konstruktor (negatives Gehalt)
        Mitarbeiter m2 = new Mitarbeiter("Mitarbeiter","Ehrenamtlicher",-200);
        System.out.println(m2.toString());
    }
}
