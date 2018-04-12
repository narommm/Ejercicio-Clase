/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclase;

import java.util.ArrayList;

/**
 *
 * @author María Lourdes
 */
public class Alumno {

    private String grado, sexo, fechaNac, nombre;
    private ArrayList<Materia> materiaRecibida;

    public Alumno() {
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia Agregar(Materia materiaRecibida) {
        return materiaRecibida;
    }

    public void Mostrar() {
    }

}
