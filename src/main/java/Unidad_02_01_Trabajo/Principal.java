/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_01_Trabajo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ochoa
 */
public class Principal {

    public static void main(String[] args) {
        
        
        System.out.println("-------------------Telefono ---------------");
        var andres = new Dueno("Andres", "0302592704", 3);
        andres.nuevoTelefono("099835633", 0, "Movil", "Claro",0);
        andres.nuevoTelefono("0998455543", 0, "Trabajo", "Movistar",1);
        andres.nuevoTelefono("09988833", 125, "Casa", "tuenti",2);
        System.out.println(andres.toString());
        
        System.out.println("-----------------Receta ----------------");
       
        var atencion = new Atencion("Medico",2,"Daniel",LocalDate.of(2021, Month.MARCH, 3),23,3);
        atencion.nuevaReceta("ibuprofeno", 3, "tomar tres veces al dia", 0);
        atencion.nuevaReceta("paracetamol", 2, "tomar 1 ves al dia", 1);
        atencion.nuevaReceta("buscapinas", 3, "tomar dos veces al dia", 2);
        System.out.println(atencion.toString());
        atencion.recetas();
    }

}
