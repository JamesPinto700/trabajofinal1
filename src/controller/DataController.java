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
    public boolean guardar_carreras(String Carrera, String Facultad, String Sigla) {
        //Facultad = "Facultad de la Energía, las Industrias y los Recursos Naturales no Renovables";
        //Sigla = "FEIRNNR";
        String data = numero_carreras()+"\t"+Carrera+"\t"+Facultad+"\t"+Sigla+"\n";
        try {
            u.save(data, file_name);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public String [][] listar (){
        try {
            return u.listAll(file_name);
        } catch (Exception e) {
            System.out.println("Error en listar "+e);
            return null;
        }
    }
    
    public String numero_carreras(){
        String numero = "";
        String [][] listado = listar();
        if (listado != null) {
            Integer num = 0;
            num = listado.length + 1;
            numero = "00";
            numero = numero.substring(num.toString().length());
            numero += num.toString();
        }else{
            numero = "01";
        }
        return numero;
    }
}
