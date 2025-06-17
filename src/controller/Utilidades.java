/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carlos Zumba
 */
public class Utilidades {
    private String path= "data";
     public void save(String text, String name_file) throws IOException{
     FileWriter file = new FileWriter(path +File.separatorChar+name_file,true);
     file.write(text);
     file.close();
 }   
}
