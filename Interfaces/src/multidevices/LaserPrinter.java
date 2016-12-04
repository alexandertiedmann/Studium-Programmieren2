package multidevices;

/**
 * Laserprinter simulation
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public class LaserPrinter implements IPrinter {
    private static int counter=0;
    private String Name = "LaserPrinter";
    /**
     * Counter for new devices
     */
    public LaserPrinter(){
        counter++;
        Name = Name + counter;
    }
    /**
     * Prints data
     *
     * @param printRef Data to print
     */
    @Override
    public void print(String printRef) {
        System.out.println("Sender is: " + Name);
        System.out.println(printSimulation);
        System.out.println(printRef);
    }
}
