package compare;
/**
 * class VInteger gets a value, can return the value and can compare it
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public class VInteger extends Integer implements ICompare{
    /**
     * Constructor for VInteger
     * @param v value
     */
    public VInteger(int v){
        super(v);
    }
    /**
     * copares this with the object parameter
     *
     * @param obj object to compare
     * @return -1, if smaler 0 if same size and 1 if this is bigger
     */
    @Override
    public int compareWith(ICompare obj) {
        VInteger vi = (VInteger)obj;
        if (this.getValue() < vi.getValue()){
            return -1;
        }else if (this.getValue() == vi.getValue()){
            return 0;
        }else {
            return 1;
        }
    }
}
