package tree;
public class BinNode {
    int data;
    BinNode left, right;
    // Konstruktoren
    public BinNode(int d) {
        data = d;
        left = right = null;
    }
    //zusätzlich, um Knoten direkt zu erzeugen:
    public BinNode(int d, BinNode l, BinNode r) {
        data = d; left = l; right = r;
    }
}