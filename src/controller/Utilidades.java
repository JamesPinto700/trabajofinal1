/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carlos Zumba
 */
public class Utilidades {

    private String path = "data";

    public void save(String text, String name_file) throws IOException {
        FileWriter file = new FileWriter(path + File.separatorChar + name_file, true);
        file.write(text);
        file.close();
    }

    public void save1(String text, String name_file) throws IOException {
        FileWriter file = new FileWriter(path + File.separatorChar + name_file, true);
        file.write(text);
        file.close();

    }

    public String[][] listAll(String name_file) throws IOException {
        String[][] data = null;
        Integer filas = countRegister(name_file);
        if (filas > 0) {
            Integer col = countColumn(name_file);
            System.out.println("Columnas " + col);
            data = new String[filas][col];
            FileReader file = new FileReader(path + File.separatorChar + name_file);
            BufferedReader br = new BufferedReader(file);
            String linea = br.readLine();
            int fil = 0;
            while (linea != null) {
                String[] columas = linea.split("\t");
                for (int j = 0; j < columas.length; j++) {
                    data[fil][j] = columas[j];
                }
                fil++;
                linea = br.readLine();
            }
            file.close();
            br.close();
        }

        System.out.println();
        return data;
    }

    private Integer countRegister(String name_file) throws IOException {
        FileReader file = new FileReader(path + File.separatorChar + name_file);
        BufferedReader br = new BufferedReader(file);
        int lines = (int) br.lines().count();
        file.close();
        br.close();
        return lines;
    }

    private Integer countColumn(String name_file) throws FileNotFoundException, IOException {
        FileReader file = new FileReader(path + File.separatorChar + name_file);
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();
        file.close();
        br.close();
        return line.split("\t").length;

    }

    //private Utilidades u = new Utilidades();
    // private String file_name = "persona.dat";
    //Autor, anio de publicación, país, editorial, isbn, idioma, nro_paginas, titulo
    //public boolean guardar(
    //    ) {
    //String data = dni+"\t"+apellidos+"\t"+nombres+"\t"+celular+"\t"+direccion+"\n";
    //try {
    // u.save(data, file_name);
    // return true;
    //} catch (Exception e) {
    //  System.out.println(e);
    //return false;
    //}
    //}
    // public String[][] listar(){
    //try {
    //return listAll(file_name);
    // } catch (Exception e) {
    //System.out.println("Error en listar "+e);
    //  return null;
//        }
//        
//    }
    public String[] retornInformation(String archivo) {
        int i = 0;
        String[] conservador =new String [6];
        try (BufferedReader lector = new BufferedReader(new FileReader(path+File.separatorChar+archivo))) {
            String linea;
            while (((linea = lector.readLine()) != null)) {
                String[] array = linea.split("\t");
                if (array.length >= 2) {
                    String nombredelacarrera = array[1].trim();
                    if (!nombredelacarrera.isEmpty()) {
                        System.out.println(nombredelacarrera+" +");
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
        try (BufferedReader lector = new BufferedReader(new FileReader(path+File.separatorChar+archivo))) {
            String linea;
            String aux = "";
            while (((linea = lector.readLine()) != null)) {
                String[] array = linea.split("\t");
                String numCiclo = array[1].trim();
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
}
