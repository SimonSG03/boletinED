package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {
    private Profesor profesor;
    private Alumno alumno;
    private Asignatura asig1;
    private Asignatura asig2;

    @Before
    public void setUp() {
        profesor = new Profesor("Jesus","Jesusito@murciaeduca.es");
        alumno = new Alumno("Simon", "3720361@alu.murciaeduca.es");
        asig1 = new Asignatura("Programacion");
        asig2 = new Asignatura("Entornos de Desarrollo");

        //Inscribir a un profesor en asig1
        profesor.inscribirAsignatura(asig1);
        asig1.setProfesor(profesor);

        alumno.inscribirAsignatura(asig1);
        asig1.agreagarAlumno(alumno);
    }

    @Test
    public void aluImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, asig1, 90);
        assertTrue(resultado);
        assertEquals(90, alumno.obtenerNota(asig1));
    }
    @Test
    public void aluNoImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, asig2, 90);
        assertFalse(resultado);
        assertEquals(-1, alumno.obtenerNota(asig2));
    }
}