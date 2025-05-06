package ejercicios_L05;

public class Los_6Metodos {

    //1. Buscar un elemento genérico en una lista
    public static <T> boolean buscarElemento(Node<T> cabeza, T valor) {
        Node<T> actual = cabeza;
        while (actual != null) {
            if (actual.getData().equals(valor)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    
    }

    ///2. Invertir una lista genérica
    public static <T> Node<T> invertirLista(Node<T> cabeza) {
        Node<T> anterior = null;
        Node<T> actual = cabeza;

        while (actual != null) {
            Node<T> siguiente = actual.getSiguiente();
            actual.setSiguiente(anterior);

        }
        return anterior; // nueva cabeza
    }

    ///3. Insertar un nodo al final
    public static <T> Node<T> insertarAlFinal(Node<T> cabeza, T valor) {
        Node<T> nuevo = new Node<>(valor, null);

        if (cabeza == null) {
            return nuevo;
        }
        Node<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
        return cabeza;
    }

    /// 4. Contar los nodos
    public static <T> int contarNodos(Node<T> cabeza) {
        int contador = 0;
        Node<T> actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
}
