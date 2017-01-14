package binaerBaeume;
/**
 * binary node
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 12.01.2017
 */
public class BinNode<T> {
    T data;
    BinNode left, right;
    // Konstruktoren
    public BinNode(T d) {
        data = d;
        left = right = null;
    }
    //zusätzlich, um Knoten direkt zu erzeugen:
    public BinNode(T d, BinNode l, BinNode r) {
        data = d; left = l; right = r;
    }
}