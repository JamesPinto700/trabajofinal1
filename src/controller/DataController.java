/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import utiles.Utilidades;

/**
 *
 * @author James Pinto
 */
public class DataController {
    private Utilidades u = new Utilidades();
    private String file_name = "data.carreras";
    public boolean guardar_carreras(int Number, String Carrera, String Facultad, String Sigla) {
        String data = Number+"\t"+Carrera+"\t"+Facultad+"\t"+Sigla+"\n";
        try {
            u.save(data, file_name);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
