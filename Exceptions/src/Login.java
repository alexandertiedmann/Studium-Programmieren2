/**
 * class for login
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.12.2016
 */
public class Login {

    private boolean angemeldet;

    /**
     * method to log in
     * @param benutzer user
     * @param passwort password
     * @throws ZugriffUngueltigException if InvalidAccess
     */
    public void anmelden (String benutzer, String passwort) throws ZugriffUngueltigException{
        //check if empty and to short for username or password
        if (( benutzer.length() > 1 ) || (passwort.length() > 1)) {
            //other checks (user correct,password correct, etc.)
            this.angemeldet = true;
        }else{
            this.angemeldet = false;
            throw new ZugriffUngueltigException();
        }
    }

    /**
     * method to log out
     */
    public void abmelden(){
        angemeldet=false;
    }

    /**
     * method to edit something
     * @throws KeineBerechtigungException if not logged in
     */
    public void bearbeiten() throws KeineBerechtigungException{
        if (!angemeldet){
            throw new KeineBerechtigungException();
        }
    }

}
