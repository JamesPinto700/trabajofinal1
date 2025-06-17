/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author James Pinto
 */
public class Utilidades {
    private String path = "data";
    public void save(String text, String name_file) throws IOException{
        FileWriter file = new FileWriter(path+File.separatorChar+name_file, true);
        file.write(text);
        file.close();
    }
}
