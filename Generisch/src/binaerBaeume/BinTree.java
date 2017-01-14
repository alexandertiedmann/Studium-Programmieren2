package binaerBaeume;
import stapel_warteschlange.*;

/**
 * binary tree
 * @author Alexander Tiedmann (s0556127)
 * @version 1.0
 * @since 12.01.2017
 */
public class BinTree<T>
{
    private BinNode<T> root = null;

    /**
     * constructor for empty tree
     */
    public BinTree() {
        root = null;
    }

    /**
     * constructor for binary tree
     * @param rn first node
     */
    public BinTree(BinNode rn) {
        root = rn;
    }

    /**
     * returns true if the binary tree is not empty
     * @return true or false
     */
    public boolean isNotEmpty(){
        return root != null;
    }

    /**
     * returns the number of leaves in the binary tree
     * @return number of leaves
     */
    public int countLeaves(){
        return countLeaves(root);
    }

    /**
     * returns the number of leaves in the binary tree
     * @param node
     * @return number of leaves
     */
    private int countLeaves(BinNode node){
        if (node == null){
            return 0;
        } else {
            if (node.right == null && node.left == null){
                return 1;
            } else{
                return countLeaves(node.right) + countLeaves(node.left);
            }
        }

    }

    /**
     * depth-first
     * @return all visited nodes
     */
    public String depthFirst(){
        Stack<BinNode> nodes = new Stack();
        String ret = new String();
        nodes.push(this.root);
        if (root == null){
            return "";
        }

        while (!nodes.isEmpty()) {
            BinNode current = nodes.pop();
            ret = ret + current.data + " ";
            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
        return ret;
    }

    /**
     * breadth-first
     * @return all visited nodes
     */
    public String breadthFirst(){
        Queue<BinNode> nodes = new Queue();
        String ret = new String();
        if (root == null){
            return "";
        }
       nodes.enqueue(root);
        while (!nodes.isEmpty()) {
            BinNode current = nodes.dequeue();
            ret = ret + current.data + " ";
            if (current.left != null)
                nodes.enqueue(current.left);
            if (current.right != null)
                nodes.enqueue(current.right);
        }
        return ret;
    }
}
