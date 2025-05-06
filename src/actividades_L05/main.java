package actividades_L05;

public class main {
    public static void main(String[] args) {

        // Se crea un gestor para manejar tareas pendientes de tipo Tarea
        GestordeTareas<Tarea> pendientes = new GestordeTareas<>();
        // Se crea un gestor para manejar las tareas que ya fueron completadas
        TareasCompletadas<Tarea> completadas = new TareasCompletadas<>();


        pendientes.agregarTarea(new Tarea("Estudiar para el examen", 5));
        pendientes.agregarTarea(new Tarea("Limpiar el cuarto", 2));
        pendientes.agregarTarea(new Tarea("Hacer tarea de AED", 4));

        System.out.println("Tareas pendientes:");
        pendientes.imprimirTareas();

        Tarea tareaTerminada = new Tarea("Limpiar el cuarto", 2);
        if (pendientes.eliminarTarea(tareaTerminada)) {
            completadas.agregarTareaCompletada(tareaTerminada);
        }

        System.out.println("\nDespués de completar una tarea:");
        System.out.println("Tareas pendientes:");
        pendientes.imprimirTareas();

        System.out.println("\nTareas completadas:");
        completadas.imprimirTareasCompletadas();

        System.out.println("\nTarea más prioritaria:");
        Tarea masImportante = pendientes.obtenerTareaMasPrioritaria();
        System.out.println(masImportante);

        pendientes.invertirTareas();
        System.out.println("\nTareas pendientes invertidas:");
        pendientes.imprimirTareas();
    }
}
