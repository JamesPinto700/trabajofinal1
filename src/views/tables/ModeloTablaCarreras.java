/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.tables;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author James Pinto
 */
public class ModeloTablaCarreras extends AbstractTableModel {
    private String[][] data;

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return data[rowIndex][0];
            case 1:
                return data[rowIndex][1];
            case 2:
                return data[rowIndex][2];
            case 3:
                return data[rowIndex][3];
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Carreras";
            case 2:
                return "Facultad";
            case 3:
                return "Sigla";
            default:
                return null;
        }
    }
    
    
    
}
