package controller;
import model.*;

public class main {

    public Estudiante añadirEstudiante(String nombre, String apellido, String rut, int numero, String carrera) {
        Estudiante estudiante = new Estudiante(nombre, apellido, rut, numero, carrera);


        return añadirEstudiante(nombre, apellido, rut,numero, carrera);
    }
    public static boolean eliminarEstudiante(String nombre, String apellido, String rut, int numero, String carrera ){
        return eliminarEstudiante(nombre,apellido,rut,numero,carrera);
    }

}
