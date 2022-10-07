package model;
import recursos.ValidadorRut;

import java.util.List;


public class Carrera {

    private String nombre;
    private int codigo;
    private int cantSemestres;

    private CantidadCarreras cantidadCarreras;


    private List<Estudiante> estudiantes;

    public Carrera(String nombre, int codigo, int cantSemestres, List<Estudiante> estudiantes, CantidadCarreras cantidadCarreras) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantSemestres = cantSemestres;
        this.estudiantes = estudiantes;
        this.cantidadCarreras = cantidadCarreras;
    }

    public Carrera(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public int getCantSemestres() {
        return cantSemestres;
    }



    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiante(String rut) {
        Estudiante estudiante = null;
        for (Estudiante estudianteAux : this.estudiantes) {
            if (estudianteAux.getRut().equals(rut)) {
                estudiante = estudianteAux;
                break;

            }
        }
        return estudiante;
    }



    public boolean añadirEstudiante(String nombre, String apellido, String rut, int numero) {
        if (ValidadorRut.validarDigito(rut) && this.buscarEstudiante(rut) == null) {
            Estudiante estudiante = new Estudiante(nombre, apellido, rut, numero);
            this.estudiantes.add(estudiante);
            return true;
        } else {
            return false;
        }
    }

    public void eliminaEstudiante(String nombre, String apellido, String rut, int numero) {
        Estudiante estudiante = new Estudiante(nombre, apellido, rut, numero);
        this.estudiantes.remove(estudiante);
    }


}
