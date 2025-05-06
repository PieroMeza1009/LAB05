package actividades_L05;

// Declaramos que esta clase es genérica, es decir, puede trabajar con cualquier tipo de objeto <T>
public class GestordeTareas<T> {

    private Node<T> cabeza;    // Nodo que representa el inicio de la lista enlazada

    // este es un metodo que agrega una nueva tarea al final de la lista
    public void agregarTarea(T tarea) {

        //// Creamos un nuevo nodo con la tarea y sin siguiente (null)
        Node<T> nuevo = new Node<>(tarea, null);

        //aca si la lista esta vacia el nuevo nodo sera la cabeza, pero sino recorremos hasta el ultuimo nodo
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Node<T> actual = cabeza;
            while (actual.getSiguiente() != null) {//recorremos hasta el ultimo 
                actual = actual.getSiguiente();
            }
            // Al final enlazamos el nuevo nodo como siguiente
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
        while (actual != null) {
            if (actual.getData().equals(tarea)) return true;
            actual = actual.getSiguiente();
    }
    return false;
}

    public void imprimirTareas() {
        Node<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getData());
            actual = actual.getSiguiente();
        }
}

    public int contarTareas() {
        int contador = 0;
        Node<T> actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public T obtenerTareaMasPrioritaria() {
        if (cabeza == null) return null;
        if (!(cabeza.getData() instanceof Tarea)) return null;

        Node<T> actual = cabeza;
        Tarea masPrioritaria = (Tarea) actual.getData();

        while (actual != null) {
            Tarea tareaActual = (Tarea) actual.getData();
            if (tareaActual.getPrioridad() < masPrioritaria.getPrioridad()) {
                masPrioritaria = tareaActual;
            }
            actual = actual.getSiguiente();
        }
        return (T) masPrioritaria;
    }

    public void invertirTareas() {
        Node<T> anterior = null;
        Node<T> actual = cabeza;
        Node<T> siguiente;

        while (actual != null) {
            siguiente = actual.getSiguiente();
            actual.setPrioridad(anterior);
            anterior = actual;
            actual = siguiente;

        }
            cabeza = anterior;
    }
