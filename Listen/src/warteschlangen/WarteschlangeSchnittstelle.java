package warteschlangen;

/**
 * interface for queue
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 30.12.2016
 */
public interface WarteschlangeSchnittstelle {
    /**
     * puts a value to the end
     * @param value
     */
    void enqueue(int value);

    /**
     * takes the first element and return it
     * @return
     */
    int dequeue();

    /**
     * return the first value
     * @return
     */
    int first();

    /**
     * true if empty, false if not empty
     * @return true or false
     */
    boolean isEmpty();
}
