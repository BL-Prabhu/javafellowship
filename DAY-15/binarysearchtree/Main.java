package binarysearchtree;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("Size of BST: " + bst.size());
        System.out.println(bst.search(71));
    }
}
