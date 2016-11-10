public class Auszubildender extends Mitarbeiter{
    private int ausbildungsjahr;
    private String ausbildungsberuf;
    /**
     * neuer Auszubildnender
     * @param name
     * @param vorname
     * @param gehalt
     * @param ausbildungsberuf
     * @param ausbildungsjahr
     */
    public Auszubildender(String name, String vorname, float gehalt, String ausbildungsberuf, int ausbildungsjahr) {
        super(name, vorname, gehalt);
        this.ausbildungsjahr = ausbildungsjahr;
        this.ausbildungsberuf = ausbildungsberuf;
    }
    /**
     * Gibt das Ausbildungsjahr zurueck
     * @return Ausbildungsjahr
     */
    public int getAusbildungsjahr() {
        return ausbildungsjahr;
    }
    /**
     * Setzt das Ausbildungsjahr fest
     * @param ausbildungsjahr
     */
    public void setAusbildungsjahr(int ausbildungsjahr) {
        if (ausbildungsjahr < 1){
            System.out.println("Ausbildungsjahr kann nicht kleiner als 1 sein");
        }else{
            this.ausbildungsjahr = ausbildungsjahr;
        }
    }
    /**
     * Gibt den Ausbildungsberuf zurueck
     * @return Ausbildungsberuf
     */
    public String getAusbildungsberuf() {
        return ausbildungsberuf;
    }
    /**
     * Legt den Ausbildungsberuf fest
     * @param ausbildungsberuf
     */
    public void setAusbildungsberuf(String ausbildungsberuf) {
        this.ausbildungsberuf = ausbildungsberuf;
    }
    /**
     * Gibt alle Daten eines Auzubildenden wieder
     * @return Auzubildenden Daten
     */
    public String toString(){
        return super.toString() + ", Ausbildungsberuf: " + this.ausbildungsberuf + ", Ausbildungsjahr: " + this.ausbildungsjahr;
    }
}
