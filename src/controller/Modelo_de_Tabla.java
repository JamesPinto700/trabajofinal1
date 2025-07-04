/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos Zumba
 */
public class Modelo_de_Tabla extends AbstractTableModel {

    private String[][] data;

    public String[][] getdata() {

        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data.length;

    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (columnIndex) {
            case 0:
                return data[rowIndex][0];
            case 1:
                return data[rowIndex][1];
            case 2:
                return data[rowIndex][2];
            case 3:
                return data[rowIndex][3];
            case 4:
                return data[rowIndex][4];
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Numero de Ciclo";
            case 1:
                return "Tipo";
            case 2:
                return "Materia";
            case 3:
                return "Horas";
            case 4:
                return "Siglas de la Materia";
            default:
                return null;
        }
    }
}
