package ejercicios_L05;
import java.util.LinkedList;
import java.util.List;

public class Los_6Metodos {

    //1. Buscar un elemento genérico en una lista
    public static <T> boolean buscarElemento(Node<T> cabeza, T valor) {
        Node<T> actual = cabeza;// Comienza desde el nodo cabeza
        // Mientras no se llegue al final de la lista
        while (actual != null) {
            if (actual.getData().equals(valor)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    
    }

    ///2. Invertir una lista genérica
    public static <T> Node<T> invertirLista(Node<T> cabeza) {
        
        // Puntero al nodo anterior, inicia como null
        Node<T> anterior = null;
         // Nodo actual que se está procesando
        Node<T> actual = cabeza;

        while (actual != null) {
            Node<T> siguiente = actual.getSiguiente();// Guardar referencia al siguiente nodo
            actual.setSiguiente(anterior);  // Invertir el enlace del nodo actual
            anterior = actual;                         // avanzar anterior al actual
            actual = siguiente;  //actual seria el siguiene

        }
        return anterior; // nueva cabeza
    }

    ///3. Insertar un nodo al final
    public static <T> Node<T> insertarAlFinal(Node<T> cabeza, T valor) {
        Node<T> nuevo = new Node<>(valor, null); // Crea un nuevo nodo con el valor dado

        //si la lista esta vacia el nuevo nodo sera la cabeza
        if (cabeza == null) {
            return nuevo;
        }
        Node<T> actual = cabeza;
        //recorremos hasta el ultimo nodo
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);// Enlaza el nuevo nodo al final de la lista
        return cabeza;
    }

    /// 4. Contar los nodos
    public static <T> int contarNodos(Node<T> cabeza) {
        int contador = 0;
        Node<T> actual = cabeza;
        //mientras haya nodos, aumenta el contador 
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;//aca damos el total de nodos
    }
    ///5. Comparar dos listas
    public static <T> boolean sonIguales(Node<T> lista1, Node<T> lista2) {
        while (lista1 != null && lista2 != null) { //recorremos ambas listas 
            if (!lista1.getData().equals(lista2.getData())) {
                return false;
            }
            lista1 = lista1.getSiguiente(); 
            lista2 = lista2.getSiguiente(); 
        }
        return lista1 == null && lista2 == null; // ambas deben terminar al mismo tiempo para qye sean iguales 
    }
    ///6. Concatenar dos listas
    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null) return lista2;
        Node<T> actual = lista1;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(lista2);// Enlaza el ultimo nodo de la primera lista con la segunda lista
        return lista1; ///devuelve la lista concatenada que empieza desde la cabeza de la primera 
    }

    ///hacia falta un metodo para imprimir las listas
    public static <T> void imprimirLista(Node<T> cabeza) {
        Node<T> actual = cabeza;
        while (actual != null) { //mientras haya nodos 
            System.out.print(actual.getData());
            actual = actual.getSiguiente();
        }
        System.out.println();// Salto de línea después de imprimir la lista
    
    }
}
