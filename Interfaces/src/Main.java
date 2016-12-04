import compare.ICompare;
import compare.UsefulFunction;
import compare.VInteger;

public class Main {

    public static void main(String[] args) {
        VInteger[] ar = new VInteger[5];
        ar[0] = new VInteger(4);
        ar[1] = new VInteger(-6);
        ar[2] = new VInteger(1);
        ar[3] = new VInteger(10);
        ar[4] = new VInteger(8);

        //smalest element
        ICompare comp = UsefulFunction.smalestElem(ar);
        //cast to vinteger
        VInteger vi = (VInteger)comp;
        //get the value
        System.out.println(vi.getValue());
    }
}
