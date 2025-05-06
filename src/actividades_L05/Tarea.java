package actividades_L05;

public class Tarea {
    private String titulo;
    private int prioridad;

    public Tarea(String tarea, int prioridad){
        this.titulo = tarea;
        this.prioridad = prioridad;

    }
    public String getTitulo(){
        return titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setPrioridad(int prioridad){
        this.prioridad =prioridad;
    }

    // Usamos esto para comparar tareas facilmente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tarea)) return false;
        Tarea otra = (Tarea) obj;
        return this.titulo.equals(otra.titulo) && this.prioridad == otra.prioridad;
    }

    public String toString(){
        return this.titulo + " : " + this.prioridad;
    }
    
    
}
