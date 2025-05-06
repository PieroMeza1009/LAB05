package actividades_L05;

public class TareasCompletadas<T> {
    // Nodo inicial de la lista de tareas completadas
    private Node<T> cabeza;

        // Método para agregar una tarea completada al inicio de la lista
    public void agregarTareaCompletada(T tarea) {
        // Se agrega al principio de la lista para facilidad            
        Node<T> nueva = new Node<>(tarea, cabeza);
        cabeza = nueva;
    }
    // meodo para imprimir todas las tareas completadas
    public void imprimirTareasCompletadas() {
        Node<T> actual = cabeza;
        System.out.println("Tareas completadas:");
    
}
