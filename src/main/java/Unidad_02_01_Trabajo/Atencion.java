/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_01_Trabajo;

import animalpoounidad1.ao_ag.trabajoclases.*;
import java.time.LocalDate;

/**
 *
 * @author ochoa
 */
public class Atencion {

    private String tipoAtencion;
    private int horaIngreso;
    private String veterinario;
    private LocalDate fecha;
    private double costo;
    private int CantidadReceta;
    Receta[] recetaList;
    Mascota nombreMascota;

    public Atencion(String tipoAtencion, int horaIngreso, String veterinario, LocalDate fecha, double costo, int CantidadReceta) {
        this.tipoAtencion = tipoAtencion;
        this.horaIngreso = horaIngreso;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.costo = costo;
        this.CantidadReceta = CantidadReceta;
        this.recetaList = new Receta[this.CantidadReceta];
    }
    
    public void nuevaReceta(String medica, int cantidad,String indicacion,int posicion){
        
        var receta = new Receta(medica,cantidad,indicacion);
        this.recetaList[posicion] = receta;
        
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

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadReceta() {
        return CantidadReceta;
    }

    public void setCantidadReceta(int CantidadReceta) {
        this.CantidadReceta = CantidadReceta;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }

    public Mascota getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(Mascota nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public void recetas(){
       
        
        for(int x = 0; x<this.CantidadReceta ;x++)
        {
            System.out.println("sus recetas " + x + " son");
            System.out.println(recetaList[x]);           
            }
          
  
    }

    @Override
    public String toString() {
        return "Atencion{" + "tipoAtencion=" + tipoAtencion + ", horaIngreso=" + horaIngreso + ", veterinario=" + veterinario 
                + ", fecha=" + fecha + ", costo=" + costo + ", CantidadReceta=" + CantidadReceta
                ;
    }
    
    
    

   
}
