package ejercicios_L05;

public class Node {
    private T data;
    private Node<T> siguiente;

    public Node(T data, Node<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }
}
