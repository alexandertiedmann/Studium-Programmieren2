public class TestBinary{
    public static void main(String[] args) {
        //Es werden immer 32 Bit ausgegeben
        callBin(0);
        callBin(1);
        callBin(2);
        callBin(3);
        callBin(12);
        callBin(10);
        callBin(255);
        callBin(192);
        callBin(-2);
        callBin(-5);
    }

    private static void callBin(int zahl){
        System.out.println(zahl + ": " + Binary.inBinary(zahl));
    }
}
