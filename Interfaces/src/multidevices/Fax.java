package multidevices;

/**
 * Fax simulation
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public class Fax implements IFax {
    private static int counter=0;
    private String Name = "Fax";
    /**
     * Counter for new devices
     */
    public Fax(){
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
        System.out.println(faxSimulation);
        System.out.println(sendRef);
    }
}
