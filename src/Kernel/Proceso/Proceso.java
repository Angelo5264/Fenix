package Kernel.Proceso;

public class Proceso {
    private String ID, nombre;
    private int prioridad, tiempoLlegada, tiempoRafagaCPU, tamanioMemoria;

    public Proceso(String ID, String nombre, int prioridad, int tiempoLlegada, int tiempoRafagaCPU, int tamanioMemoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRafagaCPU = tiempoRafagaCPU;
        this.tamanioMemoria = tamanioMemoria;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoRafagaCPU() {
        return tiempoRafagaCPU;
    }

    public void setTiempoRafagaCPU(int tiempoRafagaCPU) {
        this.tiempoRafagaCPU = tiempoRafagaCPU;
    }

    public int getTamanioMemoria() {
        return tamanioMemoria;
    }

    public void setTamanioMemoria(int tamanioMemoria) {
        this.tamanioMemoria = tamanioMemoria;
    }
}
