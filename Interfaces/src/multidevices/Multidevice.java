package multidevices;

/**
 * Multidevice sumulation
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public class Multidevice implements IFax,IPrinter {
    private static int counter=0;
    private String Name = "Multidevice";

    /**
     * Counter for new devices
     */
    public Multidevice(){
        counter++;
        Name = Name + counter;
    }
    /**
     * Sends data
     *
     * @param sendRef Data to send
     */
    @Override
    public void send(String sendRef) {
        System.out.println("Sender is: " + Name);
        System.out.println(printSimulation);
        System.out.println(sendRef);
    }

    /**
     * Prints data
     *
     * @param printRef Data to print
     */
    @Override
    public void print(String printRef) {
        System.out.println("Absender ist: " + Name);
        System.out.println(faxSimulation);
        System.out.println(printRef);
    }
}
