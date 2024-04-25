public class Node<T> {

    private T element;
    private Node<T> next;

    public Node() {
        element = null;
        next = null;
    }
    public Node(T ele) {
        element = ele;
        next = null;
    }

    public void setElement(T ele) {
        element = ele;
    }
    public T getElement() {
        return element;
    }

    public void setNext(Node<T> n){
        next = n;
    }
    public Node<T> getNext(){
        return next;
    }


    @Override
    public String toString() {
        return "Node: "+ element + " -> " + next;
    }

}
