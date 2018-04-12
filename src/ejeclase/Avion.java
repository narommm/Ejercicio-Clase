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
public class Avion {

    private int horasDeV;
    private String matricula, tipo;
    private float capMaxima;
    private ArrayList<Vuelo> fecha;

    public Avion() {
    }

    public int getHorasDeV() {
        return horasDeV;
    }

    public void setHorasDeV(int horasDeV) {
        this.horasDeV = horasDeV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(float capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Vuelo agregar(Vuelo fecha) {
        return fecha;
    }

    public void mostrar() {
    }
}
