package Repaso;

import java.util.Random;

public class Coche implements Runnable {

    //Atributos
    private Aparcamiento ap;
    private String nombre;
    private Random Random = new Random();

    //Constructor
    public Coche(Aparcamiento ap, String nombre) {
        this.ap = ap;
        this.nombre = nombre;
    }

    @Override
    public void run() {

        try {
            //Entra al parking
            ap.entrar(nombre);

            //Tiempo entre 1 y 4 segundos
            Thread.sleep(1000 + new Random().nextInt(4000));

            //Sale del parking
            ap.salir(nombre);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

    }
}
