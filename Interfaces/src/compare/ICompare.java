package compare;

/**
 * Interface to compare
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 29.11.2016
 */
public interface ICompare {
    /**
     * copares this with the object parameter
     * @param obj object to compare
     * @return -1, if smaler 0 if same size and 1 if this is bigger
     */
    public abstract int compareWith(ICompare obj);
}
