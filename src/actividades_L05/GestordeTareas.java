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


    // este es el metodo que elimina una tarea si existe
    public boolean eliminarTarea(T tarea) {
        if (cabeza == null) return false; //si esta vacia no eliminamos nada
        
        //aca si la tarea a eliminar esta en la cabeza la movemos al siguiente nodo
        if (cabeza.getData().equals(tarea)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
         // Recorremos la lista buscando la tarea
        Node<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getData().equals(tarea)) {
            actual = actual.getSiguiente();
        }

          // Si encontramos la tarea, eliminamos el nodo
        if (actual.getSiguiente() != null) {
            actual.setPrioridad(actual.getSiguiente().getSiguiente());
            return true;
        }
        //sino encontramos nada retorna false
        return false;
    
    }
    //este el em metodo que busca si una tarea existe en la lista
    public boolean contieneTarea(T tarea) {

        Node<T> actual = cabeza;
        //recorremos mientras existan nodos
        while (actual != null) {

            // Si el nodo actual es igual a la tarea, la encontramos
            if (actual.getData().equals(tarea)) return true;
            actual = actual.getSiguiente();
    }
    //si lo la encontramos bota false
    return false;
}
    //AAca el metodo que imprime todas las tareas en la lista
    public void imprimirTareas() {
        Node<T> actual = cabeza;
        
        //// Recorremos e imprimimos una por una
        while (actual != null) {
            System.out.println(actual.getData());
            actual = actual.getSiguiente();
        }
}

    //este es el metodo que cuenta cuántas tareas hay en la lista
    public int contarTareas() {
        int contador = 0;
        Node<T> actual = cabeza;
        //contamos una por una
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    // este es el metodo que devuelve la tarea con mayor prioridad (si T es una instancia de Tarea)
    public T obtenerTareaMasPrioritaria() {
        if (cabeza == null) return null;

        // Verificamos que los objetos sean instancias de Tarea
        if (!(cabeza.getData() instanceof Tarea)) return null;

        Node<T> actual = cabeza;
        Tarea masPrioritaria = (Tarea) actual.getData();
        //recorremos toda la lista y vamos comparando las prioridades
        while (actual != null) {
            Tarea tareaActual = (Tarea) actual.getData();
            if (tareaActual.getPrioridad() < masPrioritaria.getPrioridad()) {
                masPrioritaria = tareaActual;
            }
            actual = actual.getSiguiente();
        }
        return (T) masPrioritaria;
    }

    // el metodo que invierte el orden de la lista enlazada
    public void invertirTareas() {
        Node<T> anterior = null;
        Node<T> actual = cabeza;
        Node<T> siguiente;
        // Recorremos y vamos revirtiendo los enlaces
        while (actual != null) {
            siguiente = actual.getSiguiente(); // Guardamos el siguiente nodo
            actual.setPrioridad(anterior); ///Revertimos el enlace
            anterior = actual;   // Avanzamos anterior y actual
            actual = siguiente;

        }
         // Al final, el anterior será la nueva cabeza
            cabeza = anterior;
    }
}
