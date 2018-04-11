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
public class Equipo {
    private String capitan,nombre;
    private float km;
    private ArrayList<String> pruebas;
    
    public Equipo(){}

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public ArrayList<String> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<String> pruebas) {
        this.pruebas = pruebas;
    }
    
}
