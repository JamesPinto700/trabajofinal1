/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import controller.DataController;

/**
 *
 * @author James Pinto
 */
public class Ejecutor {

    public static void main(String[] args) {
        DataController DC = new DataController();
        if (DC.guardar_carreras(6, "Telecomunicaciones", "Facultad de la Energía, las Industrias y los Recursos Naturales no Renovables", "FEIRNNR")) {
            System.out.println("Guardado con exito");
        } else {
            System.out.println("No se pudo guardar la data");
        }
    }
}
