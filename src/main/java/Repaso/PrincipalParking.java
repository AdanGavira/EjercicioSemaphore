package Repaso;

public class PrincipalParking {

    //Atributos
    private static int NumPlazas = 3;
    private static int NumCoches = 7;

    public static void main(String[] args) {

        //Creación aparcamiento
        Aparcamiento ap = new Aparcamiento(NumPlazas);

        //Creación hilos
        for (int i = 1; i <= NumCoches; i++){
            Coche coche = new  Coche(ap, "Coche" + i);
            Thread hilo = new Thread(coche);
            hilo.start();
        }

    }
}
