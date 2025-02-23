package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlumnoTest {
    private Alumno alumno;
    private Asignatura asig1;
    private Asignatura asig2;

    @Before
    public void setUp(){
        alumno = new Alumno("Simon", "3720361@alu.murciaeduca.es");
        asig1 = new Asignatura("Programacion");
        asig2 = new Asignatura("Entornos de Desarrollo");

        //inscribir a un alumno
        alumno.inscribirAsignatura(asig1);
        asig1.agreagarAlumno(alumno);

        //Asignar nota
        alumno.asignarNota(asig1, 85);
    }

    @Test
    public void testObtenerNota(){
        int nota = alumno.obtenerNota(asig1);
        assertEquals(nota, 85);
    }

    @Test
    public void testObtenerNota_NoCursada(){
        int nota = alumno.obtenerNota(asig2);
        assertEquals(nota, -1);
    }
}