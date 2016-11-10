public class Mitarbeiter {
    private String name,vorname;
    private float gehalt;
    /**
     * Konstruktor fuer einen Mitarbeiter
     * @param name
     * @param vorname
     * @param gehalt
     */
    public Mitarbeiter(String name, String vorname, float gehalt) {
        this.name = name;
        this.vorname = vorname;
        if (gehalt < 0){
            System.out.println("Gehalt kann nicht negativ sein");
            this.gehalt = 0;
        }else {
            this.gehalt = gehalt;
        }
    }
    /**
     * Gibt den Namen zurueck
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Setzt den Namen eines Mitarbeiters
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gibt den Vornamen zurueck
     * @return
     */
    public String getVorname() {
        return vorname;
    }
    /**
     * Setzt den Vornamen eines Mitarbeiters
     * @param vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    /**
     * Gibt das Gehalt zurueck
     * @return
     */
    public float getGehalt() {
        return gehalt;
    }
    /**
     * legt ein Gehalt fest
     * @param gehalt
     */
    public void setGehalt(float gehalt){
        this.gehalt = gehalt;
    }
    /**
     * legt eine Gehaltserhoehung fest
     * @param erhoehung
     */
    public void erhoehen(float erhoehung) {
        if (erhoehung < 1){
                System.out.println("Das neue Gehalt muss erhoeht werden!");
        }else {
                gehalt = gehalt + erhoehung;
        }
    }
    /**
     * Gibt alle Daten eines Mitarbeiters zurueck
     * @return Mitarbeiterdaten
     */
    public String toString(){
        return "Vorname: " + this.vorname + ", Nachname: " + this.name + ", Gehalt: " + this.gehalt;
    }
}
