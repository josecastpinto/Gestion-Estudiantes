public class Estudiantes {
    Estudiante[] listado;

    
    // Constructor que recibe el tamaño del arreglo
    public Estudiantes(int cantidad) {
        listado = new Estudiante[cantidad];
        
    }

    // Método para agregar un estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante, int index) {
        if (index >= 0 && index < listado.length) {
            listado[index] = estudiante;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    // Método para mostrar todos los estudiantes y su estado
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : listado) {
            if (estudiante != null) {
                estudiante.mostrarDetalles();
                if (estudiante.esAprobado()) {
                    System.out.println("Estado: Aprobado\n");
                } else {
                    System.out.println("Estado: Reprobado\n");
                }
            }
        }
    }
}


