package binarysearchtree;

interface INode<K extends Comparable<K>>
{
    K getKey();
    INode<K> getLeft();
    INode<K> getRight();
}

class MyBinaryNode<K extends Comparable<K>> implements INode<K>
{

    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public INode<K> getLeft() {
        return left;
    }

    @Override
    public INode<K> getRight() {
        return right;
    }
}

public class BinarySearchTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(K key) {
        root = addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {

        if (current == null) {
            size++;
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursively(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursively(current.right, key);
        }

        return current;
    }

    public int size() {
        return size;
    }
    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<K> current, K key) {

        if (current == null) {
            return false;   // key not found
        }

        if (key.compareTo(current.key) == 0) {
            return true;    // key found
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }

}
