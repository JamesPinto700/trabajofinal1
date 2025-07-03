/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_grupal;

import controller.MateriaControl;

/**
 *
 * @author Carlos Zumba
 */
public class Ejecutor {

    public static void main(String[] args) {
        MateriaControl DC = new MateriaControl();        
        if (DC.guardar_Materuas("ciclo", 9, "Unidad de Integracion Curricular  ", 360)) {
            System.out.println("Guardado con exito");
        } else {
            System.out.println("No se pudo guardar la data");
        }
    }
}