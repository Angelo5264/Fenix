package Kernel.ShortScheduling;

import Kernel.Proceso.Proceso;

import java.util.Queue;

public class RoundRobin {
    private final int quantum=2;
    //Haremos que el constructor reciba los preparatvos para el metodo
    public void roundRobin(Queue<Proceso> procesosCola){
        while (!procesosCola.isEmpty()){
            Proceso proceso=procesosCola.poll();

            int ejecucion = Math.max(proceso.getTiempoRafagaCPU() - quantum, 0);
            if (ejecucion>0){
                proceso.setTiempoRafagaCPU(ejecucion);
                procesosCola.add(proceso);
            }else {
                IO.println("Proceso terminado");
            }
        }

    }

}
