package warteschlangen;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 30.12.2016
 */
public class Warteschlange extends listen.Liste implements WarteschlangeSchnittstelle {
    /**
     * puts a value to the end
     *
     * @param value
     */
    @Override
    public void enqueue(int value) {
        addLast(value);
    }

    /**
     * takes the first element and return it
     *
     * @return
     */
    @Override
    public int dequeue() {
        return removeFirst();
    }

    /**
     * return the first value
     *
     * @return
     */
    @Override
    public int first() {
        return get(0);
    }

    /**
     * true if empty, false if not empty
     *
     * @return true or false
     */
    @Override
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        String queue = "<---  ";

        for (int i=0;i<size();i++){
            queue = queue + get(i) + "  ";
        }
        queue = queue + "<---";
        return queue;
    }
}
