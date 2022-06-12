/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Hawa
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class TestBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String urlBDD = "jdbc:mysql://localhost:3306/agencebd";
        String user = "root";
        String passwd = "";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(urlBDD, user, passwd);
        System.out.println("Connexion avec succès");
        } catch (Exception e){
        e.printStackTrace();
        System.out.println("Erreur de connexion");
        }
    }
 }
    
