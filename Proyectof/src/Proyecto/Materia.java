/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

/**
 *
 * @author USUARIO
 */
public class Materia {

     private String nombre;
    private int horasTeoricas;   // ACD
    private int horasPracticas;    //APE
    private int horasPorCredito;
    private double costoPorCredito;

    public Materia(String nombre, int horasTeoricas, int horasPracticas, int horasPorCredito, double costoPorCredito) {
        this.nombre = nombre;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.horasPorCredito = horasPorCredito;
        this.costoPorCredito = costoPorCredito;
    }

    public double calcularCreditos() {
        int totalHoras = horasTeoricas + horasPracticas;
        return (double) totalHoras / horasPorCredito;
    }

    public double calcularValor() {
        return calcularCreditos() * costoPorCredito;
    }

    public String getNombre() {
        return nombre;
    }
}


   