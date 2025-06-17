/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import ProyectoController.DataControllerCreditos;
import Proyecto.Materia;
/**
 *
 * @author USUARIO
 */
public class Ejecutor {
   
    public static void main(String[] args) {
        double costoPorCredito = 150.0; // VALOR CUALQUIERA

        Materia[] materias = new Materia[] {
            
            new Materia("Electricidad", 64, 48, 18, costoPorCredito), 
            new Materia("Matemáticas Discretas", 48, 48, 24, costoPorCredito), 
            new Materia("Álgebra Lineal", 64, 32, 16, costoPorCredito), 
            new Materia("Teoría de la Programación", 96, 48, 16, costoPorCredito),
            new Materia("Comunicación y Redacción Técnica", 16, 16, 8, costoPorCredito) 
        };

        DataControllerCreditos dc = new DataControllerCreditos();
        if (dc.guardarResultados(materias)) {
            System.out.println("Resultados guardados en el archivo correctamente.");
        } else {
            System.out.println("No se pudo guardar los resultados.");
        }
    }
}


