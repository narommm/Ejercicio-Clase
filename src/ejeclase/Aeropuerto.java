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
public class Aeropuerto {

    private String ciudad, pais, id;
    private ArrayList<Avion> avion;

    public Aeropuerto() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Avion agregar(Avion avion) {
        return avion;
    }

    public void modificar(Aeropuerto aeropuerto) {
    }
}
