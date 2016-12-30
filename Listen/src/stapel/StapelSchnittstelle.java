package stapel;

/**
 * class for stacks
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 30.12.2016
 */
public interface StapelSchnittstelle {
    /**
     * puts a value on the stack
     * @param wert value for stack
     */
    void push(int wert);

    /**
     * takes the top value and return it
     * @return value
     */
    int pop ();

    /**
     * returns the top value
     * @return value
     */
    int top();

    /**
     * true if stack empty, false if stack not empty
     * @return true or false
     */
    boolean isEmpty();
}
