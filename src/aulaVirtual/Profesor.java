package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 * Un profesor puede impartir varias asignaturas.
 */
public class Profesor extends Usuario {

    /**
     * Constructor para crear un nuevo profesor.
     *
     * @param nombre El nombre del profesor.
     * @param email  El email del profesor.
     */
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    /**
     * Califica a un alumno en una asignatura específica.
     *
     * @param alumno     El alumno a calificar.
     * @param asignatura La asignatura en la que se calificará al alumno.
     * @param nota       La nota a asignar.
     * @return true si la calificación fue exitosa, false si el profesor no imparte la asignatura.
     */
    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}
