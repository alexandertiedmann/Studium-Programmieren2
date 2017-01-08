package tree;

public class BinTree
{
    private BinNode root = null;

    public BinTree() {
        root = null;
    }

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
     * returns true if the binary tree is sorted
     * @return true or false
     */
    public boolean isSorted(){
        return isSorted(root);
    }

    /**
     * returns true if the binary tree is sorted
     * @param node
     * @return true or false
     */
    private boolean isSorted(BinNode node){
        if (node == null){
            return true;
        }
        else {
            if (node.right == null && node.right == null){//if leave
                return true;
            }else {
                if (node.right == null && node.left.data < node.data && isSorted(node.left)){
                    return true;
                }else{
                    if (node.left == null && node.right.data > node.data && isSorted(node.right)) {
                        return true;
                    } else {
                        if (node.left.data < node.data && node.data < node.right.data && isSorted(node.left) && isSorted(node.right)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
