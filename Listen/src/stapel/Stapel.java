package stapel;

import com.sun.org.apache.regexp.internal.REUtil;

/**
 * comment about this class
 *
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 30.12.2016
 */
public class Stapel extends listen.Liste implements StapelSchnittstelle {
    /**
     * puts a value on the stack
     *
     * @param wert value for stack
     */
    @Override
    public void push(int wert) {
        addFirst(wert);
    }

    /**
     * takes the top value and return it
     *
     * @return value
     */
    @Override
    public int pop() {
        return removeFirst();
    }

    /**
     * returns the top value
     *
     * @return value
     */
    @Override
    public int top() {
        return get(0);
    }

    /**
     * true if stack empty, false if stack not empty
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
        String stack="";

        for (int i=0;i<size();i++){
            stack = stack + "** " + get(i) + " **\n";
        }
        stack = stack + "*******";
        return stack;
    }
}
