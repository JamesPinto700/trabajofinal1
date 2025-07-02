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

    /*
    public static void main(String[] args) {
        DataController DC = new DataController();
        if (DC.guardar_carreras(6, "Telecomunicaciones", "Facultad de la Energía, las Industrias y los Recursos Naturales no Renovables", "FEIRNNR")) {
            System.out.println("Guardado con exito");
        } else {
            System.out.println("No se pudo guardar la data");
        }
    }
     */
    /*public static void main(String[] args) {
        String aux = "00";
        Integer num = 5;
        aux = aux.substring(num.toString().length());
        aux += num.toString();
        System.out.println(aux);
    }*/

    public static void main(String[] args) {
        DataController dc = new DataController();
        //dc.listar();
        String[][] aux = dc.listar();
        if (aux != null) {
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[0].length; j++) {
                    System.out.println(aux[i][j] + " | ");
                }
                System.out.println("");
            }
        }
    }
}
