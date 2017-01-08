package test;

import tree.BinNode;
import tree.BinTree;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * testclass for BinTree
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 04.01.2017
 */
public class BinTreeTest {

    /**
     * Case: empty tree
     */
    @Test
    public void EmptyTree() {
        BinTree emptyTree = new BinTree();

        assertFalse(emptyTree.isNotEmpty());
        assertEquals(0,emptyTree.countLeaves());
        assertTrue(emptyTree.isSorted());
    }

    /**
     * Case: one node
     */
    @Test
    public void OneNode() {
        BinNode n0 = new BinNode(5);
        BinTree oneNodeTree = new BinTree(n0);

        assertTrue(oneNodeTree.isNotEmpty());
        assertEquals(1,oneNodeTree.countLeaves());
        assertTrue(oneNodeTree.isSorted());
    }

    /**
     * Case: normal tree
     */
    @Test
    public void NormalTree() {
        BinNode d1 = new BinNode(1);
        BinNode d2 = new BinNode(3);
        BinNode c1 = new BinNode(2,d1,d2);
        BinNode c2 = new BinNode(5);
        BinNode c3 = new BinNode(8);
        BinNode b1 = new BinNode(4,c1,c2);
        BinNode b2 = new BinNode(9,c3,null);
        BinNode a1 = new BinNode(7,b1,b2);
        BinTree normalTree = new BinTree(a1);

        assertTrue(normalTree.isNotEmpty());
        assertEquals(4,normalTree.countLeaves());
        assertTrue(normalTree.isSorted());
    }
}