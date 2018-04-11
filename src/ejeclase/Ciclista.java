/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclase;

/**
 *
 * @author María Lourdes
 */
public class Ciclista {
    private String nombre;
    private String nacionalidad, fechaUnion;
    private int anioEstudio;
    
    public Ciclista(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaUnion() {
        return fechaUnion;
    }

    public void setFechaUnion(String fechaUnion) {
        this.fechaUnion = fechaUnion;
    }

    public int getAnioEstudio() {
        return anioEstudio;
    }

    public void setAnioEstudio(int anioEstudio) {
        this.anioEstudio = anioEstudio;
    }
    
    
}
