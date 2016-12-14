/**
 * class for NoAuthorizationException
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.12.2016
 */
public class KeineBerechtigungException extends Exception{
    public KeineBerechtigungException() {
        super("Sie haben keine Berechtigung zum bearbeiten.");
    }
}
