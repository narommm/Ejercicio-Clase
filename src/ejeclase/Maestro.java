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
public class Maestro {

    private String nombre, sexo, fechaNacim;
    private String codigo;
    private ArrayList<Materia> materiaImpartida;

    public Maestro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Maestro AgregarM(Maestro materiaImpartida) {
        return materiaImpartida;
    }

    public void mostrar() {
    }

}
