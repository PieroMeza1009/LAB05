package ejercicios_L05;
import java.util.LinkedList;
import java.util.List;

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
        return contador;
    }
    ///5. Comparar dos listas
    public static <T> boolean sonIguales(Node<T> lista1, Node<T> lista2) {
        while (lista1 != null && lista2 != null) {
            if (!lista1.getData().equals(lista2.getData())) {
                return false;
            }
            lista1 = lista1.getSiguiente();
            lista2 = lista2.getSiguiente();
        }
        return lista1 == null && lista2 == null; // ambas deben terminar al mismo tiempo
    }
    ///6. Concatenar dos listas
    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null) return lista2;
        Node<T> actual = lista1;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(lista2);
        return lista1;
    }
    public static <T> void imprimirLista(Node<T> cabeza) {
        Node<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getData());
            actual = actual.getSiguiente();
        }
        System.out.println();
    
    }
}
