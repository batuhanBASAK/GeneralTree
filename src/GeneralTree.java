import java.util.LinkedList;

/**
 * General Tree implementation in java.
 * @param <E> The data stored.
 */
public class GeneralTree<E>{
    /** The list of children tree nodes. */
    private final LinkedList<GeneralTree<E>> children;
    /** The data of tree */
    private E data;

    /**
     * The constructor method that takes data of tree.
     * @param data The data of tree.
     */
    public GeneralTree(E data){
        this.data = data;
        children = new LinkedList<>();
    }

    /**
     * The constructor method that takes data of tree and list of children tree nodes.
     * @param data The data of tree.
     * @param children The list of children nodes.
     */
    public GeneralTree(E data, LinkedList<GeneralTree<E>> children){
        this.data = data;
        this.children = children;
    }


    /**
     * Checks whether tree is a leaf or not.
     * @return true if tree is a leaf, else false.
     */
    public boolean isLeaf(){
        return children.size() == 0;
    }

    /**
     * Adds new item to the children list.
     * @param e The new child item to add.
     */
    public void add(E e){
        children.add(new GeneralTree<>(e));
    }

    /**
     * Adds new node to the children list.
     * @param child The child node to add.
     */
    public void add(GeneralTree<E> child){
        children.add(child);
    }

    /**
     * Removes given node from children list.
     * @param node The removal child node.
     */
    public void remove(GeneralTree<E> node){
        children.remove(node);
    }

    /**
     * Sets data of tree with given value
     * @param e The new value of data.
     * @return The old value of data.
     */
    public E set(E e){
        E oldValue = data;
        data = e;
        return oldValue;
    }


    /**
     * The getter method for data of tree.
     * @return The data of tree.
     */
    public E get(){
        return data;
    }


    /**
     * The getter method for children list.
     * @return The list of children trees.
     */
    public LinkedList<GeneralTree<E>> getChildren(){
        return children;
    }


    public String toString(){
        return data.toString();
    }


    /**
     * Prints the data of tree and subtrees.
     */
    public void print(){
        print(this, 0);
    }

    private void print(GeneralTree<E> node, int lvl){
        if (node == null)
            return ;
        for (int i = 0; i < lvl; i++)
            System.out.print("    ");
        System.out.println(node.data);

        for (GeneralTree<E> n : node.children)
            print(n, lvl+1);
    }

}
