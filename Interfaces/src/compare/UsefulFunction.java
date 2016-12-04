package compare;

/**
 * usful Function
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public class UsefulFunction {
    /**
     * determines the smalest element of the parameter-arrayz
     * @param array delivered array
     * @return smalest element of the array
     */
    public static ICompare smalestElem(ICompare[] array) {
        if (array.length<1){
            System.out.println("Array is empty!");
            return null;
        }
        ICompare smalest = array[0];
        for (int i=0; i < array.length; i++){
            if (smalest.compareWith(array[i]) >= 1){
                smalest = array[i];
            }
        }
        return smalest;
    }
}
