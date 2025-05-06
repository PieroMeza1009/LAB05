package ejercicios_L05;

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
    }

}
