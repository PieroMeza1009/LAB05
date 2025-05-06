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

    public String toString(){
        return this.titulo + " : " + this.prioridad;
    }
    
    
}
