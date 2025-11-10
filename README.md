🅿️ Control de Acceso Concurrente a un Aparcamiento con Semaphore
📘 Descripción

Este proyecto simula un aparcamiento con plazas limitadas (3) al que intentan acceder 7 coches concurrentemente, utilizando Semaphore para controlar el acceso a los recursos compartidos. Cada coche es un hilo independiente que entra, permanece entre 1 y 4 segundos y luego libera la plaza.

🧩 Estructura del proyecto

Aparcamiento.java → controla el semáforo y gestiona las plazas.

Coche.java → representa cada hilo que intenta aparcar.

PrincipalParking.java → crea el aparcamiento y lanza los 7 hilos concurrentes.

▶️ Ejecución

Compila todas las clases en el paquete Repaso.

javac Repaso/*.java


Ejecuta la clase principal:

java Repaso.PrincipalParking


🖼️ Ejemplo de salida
Coche-1 está esperando para entrar...
Coche-1 ha entrado. Plazas ocupadas: 1/3
Coche-2 ha entrado. Plazas ocupadas: 2/3
Coche-3 ha entrado. Plazas ocupadas: 3/3
Coche-4 está esperando para entrar...
Coche-1 ha salido. Plazas ocupadas: 2/3
Coche-4 ha entrado. Plazas ocupadas: 3/3
