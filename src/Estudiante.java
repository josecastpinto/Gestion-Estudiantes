public class Estudiante {

    

    String nombre;
    int edad;
    double promedio;

    // constructor vacio

    public Estudiante(){

    }

    // constructor lleno

    public Estudiante(String nombre, int edad, double promedio){
        this.nombre= nombre;
        this.edad= edad;
        this.promedio= promedio;
    }

    public void mostrarDetalles(){
        System.out.println("\n");
        System.out.println("Nombre del estudiante: "+ this.nombre);
        System.out.println("Edad del estudiante: "+ edad);
        System.out.println("Promedio del estudiante"+ promedio);
    }

    public boolean esAprobado() {
        return promedio >= 3.0;
    }

    
    

}
