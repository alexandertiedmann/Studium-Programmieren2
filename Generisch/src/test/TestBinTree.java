package test;

import binaerBaeume.*;
/**
 * test for generic binary tree
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 13.01.2017
 */
public class TestBinTree {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("12.2:");
        //12.2 Binary Tree
        System.out.println("12.2");
        BinNode d1 = new BinNode(1);
        BinNode d2 = new BinNode(3);
        BinNode c1 = new BinNode(2,d1,d2);
        BinNode c2 = new BinNode(5);
        BinNode c3 = new BinNode(8);
        BinNode b1 = new BinNode(4,c1,c2);
        BinNode b2 = new BinNode(9,c3,null);
        BinNode a1 = new BinNode(7,b1,b2);
        BinTree tree = new BinTree(a1);

        System.out.println("tree:");
        System.out.println("          7           ");
        System.out.println("     4          9     ");
        System.out.println("  2     5     8       ");
        System.out.println("1   3                 ");

        //12.2 a)
        System.out.println("");
        System.out.println("12.2 a)");
        System.out.println("depth-first with stack:");
        System.out.println(tree.depthFirst());

        //12.2 b)
        System.out.println("");
        System.out.println("12.2 b)");
        System.out.println("breadth-firtst with queue:");
        System.out.println(tree.breadthFirst());
    }
}
