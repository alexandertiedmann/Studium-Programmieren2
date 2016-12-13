/**
 * login-class
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.12.2016
 */
public class Login {

    private boolean angemeldet;

    public void anmelden (String benutzer, String passwort) throws ZugriffUngueltigException{
        //ToDo
        angemeldet=true;
    }
    public void abmelden(){
        angemeldet=false;
    }
    public void bearbeiten() throws KeineBerechtigungException{
        //ToDO
    }

}
