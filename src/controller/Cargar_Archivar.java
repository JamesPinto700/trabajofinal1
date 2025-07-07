/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Carlos Zumba
 */
public class Cargar_Archivar {

    private String path = "data";


    public String[] retornInformation(String archivo) {
        int i = 0;
        String[] conservador = new String[6];
        try (BufferedReader lector = new BufferedReader(new FileReader(path + File.separatorChar + archivo))) {
            String linea;
            while (((linea = lector.readLine()) != null)) {
                String[] array = linea.split("\t");
                if (array.length >= 2) {
                    String nombredelacarrera = array[1].trim();
                    if (!nombredelacarrera.isEmpty()) {
                        System.out.println(nombredelacarrera + " +");
                        conservador[i] = nombredelacarrera;
                        i++;
                    }
                }
            }
        } catch (Exception e) {
        }
        return conservador;
    }

    public String[] retornciclos(String archivo) {
        int i = 0;
        String[] conservador = new String[9];
        try (BufferedReader lector = new BufferedReader(new FileReader(path + File.separatorChar + archivo))) {
            String linea;
            String aux = "";
            while (((linea = lector.readLine()) != null)) {
                String[] array = linea.split("\t");
                String numCiclo = array[0].trim();
                if (!numCiclo.isEmpty()) {

                    if (!aux.equals(numCiclo)) {
                        aux = numCiclo;
                        System.out.println(numCiclo + " +");
                        conservador[i] = numCiclo;
                        i++;
                    }
                }
            }
        } catch (Exception e) {
        }
        return conservador;
    }

    public String[][] FiltrarMaterias(String[][] materia, String Numerociclo) {
        int filas = 0;
        for (String[] materia1 : materia) {
            if ((materia1 != null) && (materia1.length > 0) && (materia1[0].equals(Numerociclo))) {
                filas++;
            }
        }
        String[][] aux = new String[filas][];
        int count = 0;
        for (String[] materia1 : materia) {
            if ((materia1 != null) && (materia1.length > 0)) {
                if (materia1[0].equals(Numerociclo)) {
                    aux[count++] = materia1;
                }
            }
        }
        return aux;
    }
    
}
