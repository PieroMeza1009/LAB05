package actividades_L05;

public class TareasCompletadas<T> {
    // este es el odo inicial de la lista de tareas completadas
    private Node<T> cabeza;

        // aca el metodo para agregar una tarea completada al inicio de la lista
    public void agregarTareaCompletada(T tarea) {
        // lo agrega al principio de la lista para facilidad            
        Node<T> nueva = new Node<>(tarea, cabeza);
        cabeza = nueva;
    }
    // meodo para imprimir todas las tareas completadas
    public void imprimirTareasCompletadas() {
        Node<T> actual = cabeza;
        System.out.println("Tareas completadas:");

         //aca recorremos e imprimimos
        while (actual != null) {
            System.out.println(actual.getData());
            actual = actual.getSiguiente();
        }
    }
    // por ultimo un metoodo que devuelve cuántas tareas fueron completadas
    public int contarTareasCompletadas() {
        int contador = 0;
        Node<T> actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    
    }
}
