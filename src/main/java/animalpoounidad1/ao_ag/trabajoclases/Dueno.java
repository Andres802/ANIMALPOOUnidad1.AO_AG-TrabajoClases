/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalpoounidad1.ao_ag.trabajoclases;

/**
 *
 * @author ochoa
 */
public class Dueno {
    private String nombre;
    private String direccion;
    private Mascota nombreMascota;

    public Dueno(String nombre, String direccion, Mascota nombreMascota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombreMascota = nombreMascota;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Mascota getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(Mascota nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    
    public String mostrarInfo(){
        
        return "Su nombre es " + this.getNombre() + " vive en " + this.getDireccion() + " y su mascota se llama " + this.nombreMascota.getNombre();
        
    }
    
}
