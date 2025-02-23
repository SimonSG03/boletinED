package aulaVirtual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa a un alumno del aula virtual.
 * Un alumno puede estar inscrito en varias asignaturas.
 */
public class Alumno extends Usuario {

    private Map<Asignatura, Integer> notas;

    /**
     * Constructor para crear un nuevo alumno
     *
     * @param nombre Asigna nombre a un alumno.
     * @param email Asigna email a un alumno.
     */
    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>();
    }

    /**
     * Obtiene un mapa de las notas del alumno.
     *
     * @return Un mapa con las asignaturas y sus respectivas notas.
     */
    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     * Asigna una nota a una asignatura especifica
     *
     * @param asignatura La arignatura a la que se le aplica la nota.
     * @param nota Nota de la asignatura.
     */
    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura.");
        }
    }

    /**
     * Muestra las notas del alumno en todas las asignaturas.
     */
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    /**
     * Obtiene la nota de una asignatura especifica.
     *
     * @param asignatura La asignatura de la cual se quiere obtener la nota.
     * @return La nota de la asignatura, o -1 si el alumno no esta inscrito en ella.
     */
    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1);
    }

}