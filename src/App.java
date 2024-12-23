/*Clase 1 Ejercicio Adicional:
Crear un sistema para gestionar información de estudiantes en un colegio.
Define la clase Estudiante con atributos:
-	nombre, edad, promedio
Métodos:
mostrarDetalles(): Muestra la información del estudiante.
esAprobado(): Devuelve true si el promedio es mayor o igual a 3.0.
En la clase principal (Main):
Crea una lista de estudiantes.
Muestra la información de todos los estudiantes.
Indica si están aprobados o no.  */


public class App {
    public static void main(String[] args) throws Exception {


         // Crear el objeto Estudiantes para gestionar la lista
         Estudiantes estudiantes = new Estudiantes(4);

         // Crear los estudiantes
         Estudiante estudiante1 = new Estudiante("Juan Pérez", 16, 4.2);
         Estudiante estudiante2 = new Estudiante("María González", 17, 2.9);
         Estudiante estudiante3 = new Estudiante("Carlos Sánchez", 15, 3.5);
         Estudiante estudiante4 = new Estudiante("Ana López", 18, 3.0);
 
         // Agregar los estudiantes a la lista
         estudiantes.agregarEstudiante(estudiante1, 0);
         estudiantes.agregarEstudiante(estudiante2, 1);
         estudiantes.agregarEstudiante(estudiante3, 2);
         estudiantes.agregarEstudiante(estudiante4, 3);
 
         // Mostrar los detalles de todos los estudiantes
         estudiantes.mostrarEstudiantes();
     }
 }

        

        
        
        

    

