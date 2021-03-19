package Mobil;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yudip
 */

import java.sql.*;
import Database.Database;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mobil {
    
    private String merk;
    private String plat;
    private String warna;
    private String jenis;
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public Mobil(String merk, String plat, String warna, String jenis){
        this.merk = merk;
        this.plat = plat;
        this.warna = warna;
        this.jenis = jenis;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    public String getPlat(){
        return this.plat;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    
    public void save(){
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/tp2pbo2021", "root", "");
//            
//            statement = connection.createStatement();
//            
//            String query = "INSERT INTO data_mobil (merk, plat, warna, jenis) VALUES ('%s', '%s', '%s', '%s')";
//            query = String.format(query, this.merk, this.plat, this.warna, this.jenis);
//            
//            statement.executeUpdate(query);
//            
//            statement.close();
//            connection.close();
            String query = "INSERT INTO data_mobil (merk, plat, warna, jenis) VALUES ('%s', '%s', '%s', '%s')";
            query = String.format(query, this.merk, this.plat, this.warna, this.jenis);
            
            Database db = new Database();
            db.insertQuery(query);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public ResultSet getTable() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/tp2pbo2021", "root", "");
//            
//            statement = connection.createStatement();
//            
//            String query = "SELECT * FROM data_mobil";
//            
//            resultSet = statement.executeQuery(query);
//            
//            statement.close();
//            connection.close();
//            
//            return resultSet;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        return null;
//    }
}