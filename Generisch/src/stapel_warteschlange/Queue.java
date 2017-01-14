package stapel_warteschlange;

/**
 * generic queue
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 12.01.2017
 */
public class Queue<T> extends List<T>{
    /**
     * puts a value to the end
     *
     * @param value
     */
    public void enqueue(T value) {
        addLast(value);
    }

    /**
     * takes the first element and return it
     *
     * @return
     */
    public T dequeue() {
        return removeFirst();
    }

    /**
     * return the first value
     *
     * @return
     */
    public T first() {
        return get(0);
    }

    /**
     * true if empty, false if not empty
     *
     * @return true or false
     */
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * to String
     * @return String
     */
    public String toString(){
        String queue = "<---  ";

        for (int i=0;i<size();i++){
            queue = queue + get(i) + "  ";
        }
        queue = queue + "<---";
        return queue;
    }
}
