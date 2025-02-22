package main;

import aulaVirtual.Alumno;
import aulaVirtual.Asignatura;
import aulaVirtual.Profesor;

public class Main {
    public static void main(String[] args) {

        // Crear asignaturas
        Asignatura matematicas = new Asignatura("Matemáticas");
        Asignatura programacion = new Asignatura("Programación");

        // Crear profesor
        Profesor profesor1 = new Profesor("Carlos Gómez", "carlos@instituto.com");
        profesor1.inscribirAsignatura(matematicas);
        profesor1.inscribirAsignatura(programacion);

        // Crear alumnos y asignarlos a asignaturas
        Alumno alumno1 = new Alumno("María Pérez", "maria@correo.com");
        alumno1.inscribirAsignatura(matematicas);
        alumno1.inscribirAsignatura(programacion);

        Alumno alumno2 = new Alumno("Pedro Martínez", "pedro@correo.com");
        alumno2.inscribirAsignatura(programacion);

        // El profesor califica a los alumnos
        profesor1.calificarAlumno(alumno1, matematicas, 85);
        profesor1.calificarAlumno(alumno1, programacion, 90);
        profesor1.calificarAlumno(alumno2, programacion, 78);

        // Mostrar notas de los alumnos 1 y 2
        alumno1.mostrarNotas();
        alumno2.mostrarNotas();
    }
}
