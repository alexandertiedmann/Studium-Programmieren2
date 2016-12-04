package multidevices;

/**
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public interface IFax {
    String faxSimulation = "Send is simulating";
    /**
     * Sends data
     * @param sendRef Data to send
     */
    public void send(String sendRef);
}
