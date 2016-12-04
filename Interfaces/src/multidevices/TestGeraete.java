import multidevices.Fax;
import multidevices.LaserPrinter;
import multidevices.Multidevice;

public class TestGeraete {

    public static void main(String[] args) {
        LaserPrinter l1 = new LaserPrinter();
        LaserPrinter l2 = new LaserPrinter();
        Fax f1 = new Fax();
        Fax f2 = new Fax();
        Multidevice k1 = new Multidevice();
        Multidevice k2 = new Multidevice();
        f1.send ("Dies ist ein Test");
        f2.send ("Dies ist ein Test");
        l1.print ("Dies ist ein Test");
        l2.print ("Dies ist ein Test");
        k1.send ("Dies ist ein Test");
        k2.send ("Dies ist ein Test");
        k1.print ("Dies ist ein Test");
        k2.print ("Dies ist ein Test");
    }
}
