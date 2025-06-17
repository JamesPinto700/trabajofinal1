/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoController;

import Proyecto.Materia;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author USUARIO
 */
public class DataControllerCreditos {
    private String fileName = "resultados_ciclo1.txt";

    public boolean guardarResultados(Materia[] materias) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            pw.println("Universidad Nacional de Loja - Computación 1er Ciclo");
            pw.println("Resultados de Créditos y Valor por M  ateria");
            pw.println("---------------------------------------------------");
            for (Materia m : materias) {
                double creditos = m.calcularCreditos();
                double valor = m.calcularValor();
                pw.printf("Materia: %s%n", m.getNombre());
                pw.printf("Créditos: %.2f%n", creditos);
                pw.printf("Valor a pagar: $%.2f%n", valor);
                pw.println("---------------------------------------------------");
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
            return false;
        }
    }
}

