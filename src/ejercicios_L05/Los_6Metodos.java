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
