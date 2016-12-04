package multidevices;

/**
 * interface for printer
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public interface IPrinter {
    String printSimulation = "Print is simulating";
    /**
     * Prints data
     * @param printRef Data to print
     */
    public void print(String printRef);
}
