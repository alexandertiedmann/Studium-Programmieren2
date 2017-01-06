package test;

import tree.BinNode;
import tree.BinTree;

import static org.junit.jupiter.api.Assertions.*;

/**
 * testclass for BinTree
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 04.01.2017
 */
class BinTreeTest {
    BinTree normalTree;
    BinTree emptyTree;
    BinTree oneNodeTree;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        BinNode d1 = new BinNode(1);
        BinNode d2 = new BinNode(3);
        BinNode c1 = new BinNode(2,d1,d2);
        BinNode c2 = new BinNode(5);
        BinNode c3 = new BinNode(8);
        BinNode b1 = new BinNode(4,c1,c2);
        BinNode b2 = new BinNode(9,c3,null);
        BinNode a1 = new BinNode(7,b1,b2);
        BinTree normalTree = new BinTree(a1);

        BinTree emptyTree = new BinTree();

        BinNode n0 = new BinNode(5);
        BinTree oneNodeTree = new BinTree(n0);
    }

    /**
     * Case: empty tree
     */
    @org.junit.jupiter.api.Test
    void isNotEmptyEmptyTree() {
        assertFalse("The tree is empty",emptyTree.isNotEmpty());
    }

    /**
     * Case: one node
     */
    @org.junit.jupiter.api.Test
    void isNotEmptyOneNode() {
        assertTrue("Tree is not empty",oneNodeTree.isNotEmpty());
    }

    /**
     * Case: normal tree
     */
    @org.junit.jupiter.api.Test
    void isNotEmptyNormalTree() {
        assertTrue("Tree is not empty", normalTree.isNotEmpty());
    }

    /**
     * Case: empty tree
     */
    @org.junit.jupiter.api.Test
    void countLeavesEmptyTree() {
        assertEquals(0,emptyTree.countLeaves(),"Tree is empty --> 0 Leaves");
    }

    /**
     * Case: one node
     */
    @org.junit.jupiter.api.Test
    void countLeavesOneNode() {
        assertEquals(1,oneNodeTree.countLeaves(),"Tree with one Node/Leave --> 1 Leaves");
    }

    /**
     * Case: normal tree
     */
    @org.junit.jupiter.api.Test
    void countLeavesNormalTree() {
        assertEquals(4,normalTree.countLeaves(),"Normaltree --> 4 Leaves");
    }

    /**
     * Case: empty tree
     */
    @org.junit.jupiter.api.Test
    void isSortedEmptyTree() {
        assertFalse("Tree is empty --> not sorted",emptyTree.isSorted());
    }

    /**
     * Case: one node
     */
    @org.junit.jupiter.api.Test
    void isSortedOneNode() {
        assertTrue("Tree with one node --> sorted", oneNodeTree.isSorted());
    }

    /**
     * Case: normal tree
     */
    @org.junit.jupiter.api.Test
    void isSortedNormalTree() {
        assertTrue("Tree is sorted", normalTree.isSorted());
    }
}