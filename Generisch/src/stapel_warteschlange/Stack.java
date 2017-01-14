package stapel_warteschlange;

/**
 * generic stack
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 12.01.2017
 */
public class Stack<T> extends List<T>{
    /**
     * puts a value on the stack
     *
     * @param wert value for stack
     */
    public void push(T wert) {
        addFirst(wert);
    }

    /**
     * takes the top value and return it
     *
     * @return value
     */
    public T pop() {
        return removeFirst();
    }

    /**
     * returns the top value
     *
     * @return value
     */
    public T top() {
        return get(0);
    }

    /**
     * true if stack empty, false if stack not empty
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
        String stack="";

        for (int i=0;i<size();i++){
            stack = stack + "** " + get(i) + " **\n";
        }
        stack = stack + "*******";
        return stack;
    }
}
