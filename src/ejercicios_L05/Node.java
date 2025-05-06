package ejercicios_L05;

public class Node {
    private T data;
    private Node<T> siguiente;

    public Node(T data, Node<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }

    public T getData() {
        return data;
    }

    public Node<T> getSiguiente() {
        return siguiente;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSiguiente(Node<T> siguiente) {
        this.siguiente = siguiente;
    }
}

