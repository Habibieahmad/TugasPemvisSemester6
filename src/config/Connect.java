/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author  Habibie Ahmad
 */
public class Connect {
    private Connection conn;
    public Connection dbConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil!");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Koneksi Gagal!"+ex);            
        }
        String url ="jdbc:mysql://localhost/pertalife";
        try{
            conn = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Ke Database");
        }
        catch(SQLException ex){
            System.out.println("Koneksi Ke Database Gagal!"+ex);            
        }
        return conn;
    }
}
