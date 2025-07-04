/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Carlos Zumba
 */
public class MateriaControl {

    private Utilidades u = new Utilidades();
    private String file_name = "data.Electricidad";

    public boolean guardar_Materuas(int Number, String ciclo, String Materias, int hora, String Abrebiatura) {
        String data = Number + "\t"+ ciclo+"\t" + Materias + "\t" + hora + "\t"+Abrebiatura+"\n";
        try {
            u.save1(data, file_name);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
}


