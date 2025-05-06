package ejercicios_L05;

import java.util.LinkedList;
import java.util.List;

public class MainEjercicios {
    public static void main(String[] args) {
        // Crear lista de String
        Node<String> listaStr = new Node<>("A", new Node<>("B", new Node<>("C", null)));

        // 1. Buscar un elemento
        System.out.println("¿Contiene 'B'? " + Los_6Metodos.buscarElemento(listaStr, "B"));
        System.out.println("¿Contiene 'Z'? " + Los_6Metodos.buscarElemento(listaStr, "Z"));

        // 2. Invertir una lista
        Node<String> invertida = Los_6Metodos.invertirLista(listaStr);
        System.out.print("Lista invertida: ");
        Los_6Metodos.imprimirLista(invertida);

        // 3. Insertar al final
        Node<Integer> listaNumeros = new Node<>(1, new Node<>(2, null));
        listaNumeros = Los_6Metodos.insertarAlFinal(listaNumeros, 3);
        System.out.print("Lista con 3 al final: ");
        Los_6Metodos.imprimirLista(listaNumeros);

        /// 4. Contar nodos
        System.out.println("Cantidad de nodos: " + Los_6Metodos.contarNodos(listaNumeros));

        ///5.Comparar dos listas
        Node<Integer> listaA = new Node<>(1, new Node<>(2, new Node<>(3, null)));
        Node<Integer> listaB = new Node<>(1, new Node<>(2, new Node<>(3, null)));
        Node<Integer> listaC = new Node<>(1, new Node<>(4, null));
        System.out.println("listaA y listaB iguales: " + Los_6Metodos.sonIguales(listaA, listaB));
        System.out.println("listaA y listaC iguales: " + Los_6Metodos.sonIguales(listaA, listaC));

        /// 6. Concatenar dos listas
        Node<String> listaX = new Node<>("Hola", null);
        Node<String> listaY = new Node<>("Mundo", null);
        Node<String> listaConcat = Los_6Metodos.concatenarListas(listaX, listaY);
        System.out.print("Lista concatenada: ");
        Los_6Metodos.imprimirLista(listaConcat);
    }
}