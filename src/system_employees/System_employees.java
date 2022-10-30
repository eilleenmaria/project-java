/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_employees;

import system_employees.employeeData.conexion;


public class System_employees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion objectConexion = new conexion();
        objectConexion.establecerConexion();
        // TODO code application logic here
    }
    
}
