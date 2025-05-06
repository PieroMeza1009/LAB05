package actividades_L05;

public class GestordeTareas {
    private Node<T> cabeza;

    public void agregarTarea(T tarea) {
        Node<T> nuevo = new Node<>(tarea, null);
        if (cabeza == null) {
            cabeza = nuevo;
        }
    }

}
