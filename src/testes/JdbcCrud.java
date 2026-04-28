/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author u07449294150
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva"; ;;;
            user = "marcos_vilhanueva"; 
            password = "marcos_vilhanueva";
           // url = "jdbc://mysql/localhost/db_marcos_vilhanueva"; 
           // user = "marcos_vilhanueva"; 
           // password = "marcos_vilhanueva";
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           //106
           
            PreparedStatement pst = cnt.prepareStatement("insert into "
                   + "mpv_usuarios(mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf)"
                   + " values(?,?,?,?)");
            pst.setInt(1, 206);
            pst.setString(2, "julyy");
            pst.setString(3, "perezz");
            pst.setString(4, "07449294150");
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } 
        System.out.println("rodou");           
    }   
}
