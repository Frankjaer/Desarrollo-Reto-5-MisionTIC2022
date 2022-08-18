
package com.mycompany.reto_5_g59.modelo.VO;

public class Lider {
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_resicencia;

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String primer_apellido, String ciudad_resicencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_resicencia = ciudad_resicencia;
    }

    public int getId_lider() {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudad_resicencia() {
        return ciudad_resicencia;
    }

    public void setCiudad_resicencia(String ciudad_resicencia) {
        this.ciudad_resicencia = ciudad_resicencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", ciudad_resicencia=" + ciudad_resicencia + '}';
    }
    
    
      
    
}
