package actividades_L05;

public class main {
    public static void main(String[] args) {

        // Se crea un gestor para manejar tareas pendientes de tipo Tarea
        GestordeTareas<Tarea> pendientes = new GestordeTareas<>();
        // Se crea un gestor para manejar las tareas que ya fueron completadas
        TareasCompletadas<Tarea> completadas = new TareasCompletadas<>();

        // Aca agregamos  tareas pendientes al gestor
        pendientes.agregarTarea(new Tarea("Estudiar para el examen", 1)); ///mientras menos sea el numero, mas alta la priodirdad
        pendientes.agregarTarea(new Tarea("Limpiar el cuarto", 3));
        pendientes.agregarTarea(new Tarea("Hacer tarea de AED", 2));

        //imprimimos todas las tereas pendientes
        System.out.println("Tareas pendientes:");
        pendientes.imprimirTareas();

        //aca creamos una tarea igual a la que ya existe para buscarla y marcarla como completada
        Tarea tareaTerminada = new Tarea("Limpiar el cuarto", 3);
        //si si se elimino la tarea, la agregamos a las ya completadas
        if (pendientes.eliminarTarea(tareaTerminada)) {
            completadas.agregarTareaCompletada(tareaTerminada);
        }

        // Mostramos el estado de las listas después de completar una tarea
        System.out.println("\nDespués de completar una tarea:");
        System.out.println("Tareas pendientes:");
        pendientes.imprimirTareas();

        System.out.println("\nTareas completadas:");
        completadas.imprimirTareasCompletadas();

        // Obtenenemos y mostramos la tarea más prioritaria
        System.out.println("\nTarea más prioritaria:");
        Tarea masImportante = pendientes.obtenerTareaMasPrioritaria();
        System.out.println(masImportante);

        //aca solo invertimos las tares
        pendientes.invertirTareas();
        System.out.println("\nTareas pendientes invertidas:");
        pendientes.imprimirTareas();
    }
}
