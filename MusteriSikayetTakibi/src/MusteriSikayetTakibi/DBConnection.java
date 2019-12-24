/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musteritakipsistemi;

/**
 *
 * @author Meteserbay
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnection {
    private Connection conn;
    String dburl="jdbc:derby://localhost:1527/MusteriSikayetTakip";
    String user="meteserbay"; 
    String pass="1234";
    public Connection baglan(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection(dburl,user,pass);
        }
        catch(Exception e){
            System.out.println("Bağlantıda problem var...");
        }
        return conn;
    }
    public void kullaniciListesi(){
        if(conn==null){
            System.out.println("Veritabanına bağlanılıyor...");
            baglan();
            return;
        }
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM MUSTERI");
            
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(2));
            }
        }
        catch(Exception e){
            
        }
    }
    
    public static void main(String args[]){
        DBConnection dbk=new DBConnection();
        dbk.kullaniciListesi();
    }
}