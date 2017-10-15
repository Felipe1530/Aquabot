/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.logica;

/**
 *
 * @author root
 */
public abstract class Sensor {
    protected String nombre;
    protected int tasaRefresh;

    public Sensor(String nombre, int tasaRefresh) {
        this.nombre = nombre;
        this.tasaRefresh = tasaRefresh;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTasaRefresh() {
        return tasaRefresh;
    }

    public void setTasaRefresh(int tasaRefresh) {
        this.tasaRefresh = tasaRefresh;
    }
    
    public abstract void add(Actividad act);
    
    public abstract void remove(int id);
    
    public abstract int medir();
}
