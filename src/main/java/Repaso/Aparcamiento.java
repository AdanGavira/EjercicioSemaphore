package Repaso;

import java.util.concurrent.Semaphore;

public class Aparcamiento {

    //Atributos
   private static Semaphore semaforo;
   private static int PlazasOcupadas = 0;
   private int Capacidad;

   //Constructor
    public Aparcamiento(int capacidad) { //Recibe el numero de plazas
        this.Capacidad = capacidad;
        this.semaforo = new Semaphore(capacidad, true); //inicia el semaphore
    }

    public void entrar(String nombre){

        try {
            semaforo.acquire(); //Bloqueante
            System.out.println(nombre + " intenta entrar");

            synchronized (this){ //Controla automáticamente la entrada y salida de los coches
                PlazasOcupadas++;
                System.out.println(nombre + " ha entrado. Plazas Ocupadas: " + PlazasOcupadas);
            }

        } catch (InterruptedException e) {
                e.getMessage();
        }
    }

    public void salir(String nombre){

        synchronized (this){
            PlazasOcupadas--;//Disminución de los coches
            System.out.println(nombre + " ha salido. Plazas Ocupadas: " + (PlazasOcupadas));
        }
        semaforo.release();
    }
}
