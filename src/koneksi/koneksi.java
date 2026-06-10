/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fadil
 */
public class koneksi {
    private static Connection koneksi;
        public static Connection getConnection() {
            try {
                String url="jdbc:mysql://localhost:3306/db_bimba";
                String user="root";
                String pass="12345";
                
                Connection conn = DriverManager.getConnection(url, user, pass);
                return conn;
            } catch (Exception e) {
                System.out.println("Koneksi Gagal: "+ e.getMessage());
                return null;
            }
        }
}
