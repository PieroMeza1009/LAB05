package actividades_L05;

public class Tarea {
    private String titulo;
    private int prioridad;

    public Tarea(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;

    }
    public String getTitulo(){
        return titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }
    public void setPrioridad(){
        this.prioridad =prioridad;
    }

    public String toString(){
        return this.titulo + " : " + this.prioridad;
    }
    
    
}
