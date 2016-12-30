import tree.BinNode;
import tree.BinTree;

public class Main {
    public static void main(String[] args) {
        BinNode k1 = new BinNode(6);
        BinNode k2 = new BinNode(7);
        BinNode m1 = new BinNode(4,k1,k2);
        BinNode m2 = new BinNode(5);
        BinNode m = new BinNode(2,m1,m2);
        BinNode n = new BinNode(3);
        BinNode o = new BinNode(1,m,n);
        BinTree baum = new BinTree(o);
    }
}
