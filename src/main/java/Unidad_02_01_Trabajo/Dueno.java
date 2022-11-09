/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_01_Trabajo;

import animalpoounidad1.ao_ag.trabajoclases.*;

/**
 *
 * @author ochoa
 */
public class Dueno {
    private String nombre;
    private String cedula;
    private int cantidadTelefono;
    private Telefono [] telefonoList;

    public Dueno( String cedula, String nombre,int cantidadTelefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cantidadTelefono = cantidadTelefono;
        this.telefonoList = new Telefono[this.cantidadTelefono];
    }
    
    public void nuevoTelefono(String numero, int extencion, String tipoTelefono, String operadora,int posicion){
        
        var telefono = new Telefono(numero,extencion,tipoTelefono,operadora);
        this.telefonoList[posicion]=telefono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCantidadTelefono() {
        return cantidadTelefono;
    }

    public void setCantidadTelefono(int cantidadTelefono) {
        this.cantidadTelefono = cantidadTelefono;
    }

    public Telefono[] getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(Telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }
    public void telefonos(){
       
        
        for(var telefono: this.telefonoList)
        {
            System.out.println("sus telefonos son:");
            System.out.println(telefono.toString()+"\n");           
            }
          
  
    }

    @Override
    public String toString() {
        return "Dueno{" + "nombre=" + nombre + ", cedula=" + cedula + ", cantidadTelefono=" + cantidadTelefono + ", telefonoList=" + telefonoList[0].toString() + '}';
    }
    
    
}
