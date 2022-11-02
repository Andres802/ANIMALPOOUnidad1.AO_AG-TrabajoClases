/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalpoounidad1.ao_ag.trabajoclases;

/**
 *
 * @author ochoa
 */
public class Atencion {
    
    String tipoAtencion;
    int horaIngreso;
    Mascota nombreMascota;

    public Atencion(String tipoAtencion, int horaIngreso, Mascota nombreMascota) {
        this.tipoAtencion = tipoAtencion;
        this.horaIngreso = horaIngreso;
        this.nombreMascota = nombreMascota;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Mascota getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(Mascota nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    
    public String mostrarInfo(){
        
        return "La mascota se llama " + this.nombreMascota.getNombre() + " su atencion sera atendido en " + this.getHoraIngreso()
                + " horas y su tipo de atencion es " + this.getTipoAtencion();
        
    }
}
