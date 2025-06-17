/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_grupal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Carlos Zumba
 */
public class Ejecutor {
    private static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        String[] materias = {
            "Electricidad", "Comunicación y Redacción Técnica", "Teoria de la programación", "Algebra Lineal", "Matemáticas Discretas"
        };

        int[] horas = {160, 40, 240, 160, 120};

        try {
            // Ruta del archivo
            PrintWriter archivo = new PrintWriter("C:/Users/juanf/OneDrive/Escritorio/materias_ciclo_I.txt");

            // Encabezado de tabla
            archivo.println("+----+---------------------------------------------+-------+");
            archivo.printf("| %-2s | %-43s | %-5s |\n", "No", "Materia", "Horas");
            archivo.println("+----+---------------------------------------------+-------+");

            // Filas de datos
            for (int i = 0; i < materias.length; i++) {
                archivo.printf("| %-2d | %-43s | %-5d |\n", i + 1, materias[i], horas[i]);
            }

            // Línea final
            archivo.println("+----+---------------------------------------------+-------+");

            archivo.close();
            System.out.println("Archivo generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo: " + e.getMessage());
        }
    }

}
   
