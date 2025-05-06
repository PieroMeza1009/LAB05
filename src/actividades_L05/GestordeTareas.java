package actividades_L05;

public class GestordeTareas {
    private Node<T> cabeza;

    public void agregarTarea(T tarea) {
        Node<T> nuevo = new Node<>(tarea, null);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Node<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setPrioridad(nuevo);
        }
    }
}
    public boolean eliminarTarea(T tarea) {
        if (cabeza == null) return false;
        
        if (cabeza.getData().equals(tarea)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Node<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getData().equals(tarea)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setPrioridad(actual.getSiguiente().getSiguiente());
            return true;
        }

        return false;
    
    }
    public boolean contieneTarea(T tarea) {
        Node<T> actual = cabeza;
