package stapel_warteschlange;

/**
 * generic list
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 12.01.2017
 */
public class List<T> {

    private int length=0;
    private Node head = null;

    private class Node {
        public T data;
        public Node next;

        public Node(){
            data = null;
            next = null;
        }

        public Node(T d) {
            data = d;
            next = null;
        }
    }

    /**
     * berechnet die Laenge der Liste
     *
     * @return Laenge der Liste
     */
    public int size() {
        return length;
    }

    /**
     * prueft, ob ein gegebener Wert in der Liste vorhanden ist
     *
     * @param wert gesuchter Wert
     * @return true, wenn gesuchter Wert in der Liste vorhanden
     */
    public boolean contains(T wert) {
        Node tmp = head;
        while ( tmp != null ){
            if (tmp.data == wert){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    /**
     * gibt den Wert eines Elementes am gegebenen Index zurueck (Lesen)
     *
     * @param index gefragter Index
     * @return Wert des Elements am gefragten Index
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    public T get(int index) throws NullPointerException {
        int count = 0;
        if (index > length || index < 0){
            throw new NullPointerException();
        }
        Node tmp = head;
        while (tmp != null){
            if (count == index){
                return tmp.data;
            }
            tmp = tmp.next;
            count++;
        }
        throw new NullPointerException();
    }

    /**
     * setzt den Wert eines Elementes am gegebenen Index auf einen neuen Wert (Schreiben)
     * und gibt den alten ueberschriebenen Wert des Elements zur�ck
     *
     * @param wert  neuer Wert
     * @param index Index, an dem der Wert ueberschrieben werden soll
     * @return alter ueberschriebener Wert
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden ist
     */
    public T set(T wert, int index) throws NullPointerException {
        int count = 0;
        if (index > length || index < 0){
            throw new NullPointerException();
        }
        Node tmp = head;
        while (tmp != null){
            if (count == index){
                T old = tmp.data;
                tmp.data = wert;
                return old;
            }
            tmp = tmp.next;
        }
        throw new NullPointerException();
    }

    /**
     * faegt einen Wert an den Anfang der Liste ein
     *
     * @param wert der einzufuegende Wert
     */
    public void addFirst(T wert) {
        Node newNode = new Node();
        newNode.data = wert;
        newNode.next = head;
        head = newNode;
        length++;
    }

    /**
     * faegt einen Wert ans Ende der Liste ein
     *
     * @param wert der einzufuegende Wert
     */
    public void addLast(T wert) {
        Node newNode = new Node();
        newNode.data = wert;
        newNode.next = null;
        if (head == null){
            head = newNode;
        }else{
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        length++;
    }

    /**
     * fuegt einen Wert am gegebenen Index in die Liste ein
     *
     * @param wert  der einzufuegende Wert
     * @param index Index, an dem das neue Element eingefuegt werden soll
     * @return true, wenn das Element am gegebenen Index erfolgreich eingefuegt wurde
     */
    public boolean add(T wert, int index) {
        int count = 0;
        if (index > length || index < 0){
            throw new NullPointerException();
        }
        Node newNode = new Node();
        newNode.data = wert;
        Node tmp = head;
        while (tmp != null){
            if (count == index-1){
                Node tmpNext = tmp.next;
                tmp.next = newNode;
                tmp.next.next = tmpNext;
                length++;
                return true;
            }
            count++;
            tmp = tmp.next;
        }
        return false;
    }

    /**
     * entfernt ein Element mit gegebenem Wert aus der Liste
     *
     * @param wert zu entfernende Wert
     * @return true, wenn Element mit gegebenem Wert gefunden und aus der Liste entfernt wurde
     */
    public boolean remove(T wert) {
        Node tmp = head;
        while (tmp.next != null){
            Node nextNode = tmp.next;
            if (nextNode.data == wert){
                tmp.next = nextNode.next;
                length--;
                return true;
            }
        }
        return false;
    }

    /**
     * entfernt das erste Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    public T removeFirst() throws NullPointerException {
        if (head == null){
            throw new NullPointerException();
        }
        Node tmp = head;
        head = tmp.next;
        length--;
        return tmp.data;
    }

    /**
     * entfernt das letzte Element aus der Liste
     *
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Liste leer
     */
    public T removeLast() throws NullPointerException {
        if (head == null){
            throw new NullPointerException();
        }
        Node tmp = head;
        while (tmp.next != null){
            Node nextNode = tmp.next;
            if (nextNode == null){
                tmp.next=null;
                length--;
                return nextNode.data;
            }
        }
        throw new NullPointerException();
    }

    /**
     * entfernt das Element am gegebenen Index aus der Liste
     *
     * @param index Index, an dem das Element entfernt werden soll
     * @return Wert des entfernten Elements
     * @throws NullPointerException wenn Index in der Liste nicht vorhanden
     */
    public T removeAtIndex(int index) throws NullPointerException {
        if (index > length || index < 0){
            throw new NullPointerException();
        }
        if (index == 0){
            head = head.next;
            length--;
        }
        int count = 0;
        Node tmp = head;
        while (tmp != null){
            if (count == index-1){
                Node removeNode = tmp.next;
                Node next = removeNode.next;
                tmp.next = next;
                length--;
                return tmp.data;
            }
            count++;
            //tmp = tmp.next;
        }
        throw new NullPointerException();
    }
}
