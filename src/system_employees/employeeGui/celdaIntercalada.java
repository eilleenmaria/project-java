/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_employees.employeeGui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class celdaIntercalada extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, 
                                                   Object value, 
                                                   boolean isSelected, 
                                                   boolean hasFocus, 
                                                   int row, 
                                                   int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(evaluarPar(row)){
            this.setBackground( new Color(240,255,255));
        }
        else{
            this.setBackground(new Color(224,255,255));
        }
        return this;
    }
    public boolean evaluarPar(int numero){
        return (numero % 2 == 0);
    }
}
