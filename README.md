# 🅿️ Control de Acceso Concurrente a un Aparcamiento con Semaphore

## 📘 Descripción

Este proyecto simula un aparcamiento con plazas limitadas (**3**) al que intentan acceder **7 coches** de forma concurrente, utilizando la clase `Semaphore` de Java para controlar el acceso a los recursos compartidos. Cada coche es representado por un hilo independiente que:

- Intenta entrar al aparcamiento.
- Permanece estacionado entre **1 y 4 segundos** (aleatorio).
- Finalmente, libera la plaza para otro coche.

## 🧩 Estructura del proyecto

- **Aparcamiento.java**  
  Controla el semáforo y gestiona las plazas libres del aparcamiento.

- **Coche.java**  
  Representa cada hilo que intenta aparcar en el parking.

- **PrincipalParking.java**  
  Crea la instancia de aparcamiento y lanza los 7 hilos de coches concurrentemente.

## ▶️ Ejecución

### Compilar

javac Repaso/*.java

### Ejecutar

java Repaso.PrincipalParking

---

**Autor:** [AdanGavira](https://github.com/AdanGavira)

