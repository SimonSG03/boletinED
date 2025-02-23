package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 * @author Javier Barceló
 * @version 0.1
 */
public class Usuario {
    protected String nombre;
    protected String email;
    private List<Asignatura> asignaturas;

    /**
     * Constructor para crear un nuevo usuario.
     *
     * @param nombre El nombre del usuario.
     * @param email  El email del usuario.
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    /**
     * Obtiene la lista de asignaturas en las que el usuario está inscrito.
     *
     * @return Una lista de asignaturas.
     */
    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    /**
     * Inscribe al usuario en una asignatura.
     *
     * @param asignatura La asignatura a inscribir.
     */
    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el email del usuario.
     *
     * @return El email del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Simula el inicio de sesión del usuario.
     *
     * @param password La contraseña del usuario.
     * @return true si el inicio de sesión es exitoso, false en caso contrario.
     */
    public boolean iniciarSesión (String password) {
        // simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}