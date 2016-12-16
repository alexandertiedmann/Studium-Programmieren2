/**
 * class for InvalidAccessException
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 09.12.2016
 */
public class ZugriffUngueltigException extends Exception{
    /**
     * construktor for InvalidAccessException
     */
    public ZugriffUngueltigException() {
        super("Die Anmeldung war nicht erfolgreich.");
    }
}
