/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_employees.employeeData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    
    String cadena = "jdbc:sqlite:D:/bd/system.s3db" ;
    Connection conectar = null;

    public conexion(){
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection(cadena);
            System.out.println("Successfully conected to the database");
            
        }catch(Exception e){
            System.out.println("Error connecting to database" + e);
                
        }
    
    }
    public int insertSentenceSql(String sentenceSql){
        try{
            PreparedStatement statement= conectar.prepareStatement(sentenceSql);
            statement.execute();
           
            return 1;
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
        
    }
    
    public ResultSet consultRegister(String sentenceSql){
        try{
            PreparedStatement statement= conectar.prepareStatement(sentenceSql);
            ResultSet response = statement.executeQuery();
            return response;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

