package Database;
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
import Mobil.Mobil;
import java.util.ArrayList;

public class Database {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public void insertQuery(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/tp2pbo2021", "root", "");
            
            statement = connection.createStatement();
            
            statement.executeUpdate(query);
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Mobil> getListMobil() {
        try {
            ArrayList<Mobil> listMobil = new ArrayList<>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/tp2pbo2021", "root", "");
            
            statement = connection.createStatement();
            
            String query = "SELECT * FROM data_mobil";
            
            resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String merk = resultSet.getString("merk");
                String plat = resultSet.getString("plat");
                String warna = resultSet.getString("warna");
                String jenis = resultSet.getString("jenis");
                
                Mobil mobil = new Mobil(merk, plat, warna, jenis);
                
                listMobil.add(mobil);
            }
            
            statement.close();
            connection.close();
            
            return listMobil;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}