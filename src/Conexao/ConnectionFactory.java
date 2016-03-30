package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    private Connection con;
    
    public Connection createConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String endereco = "jdbc:mysql://localhost:3306/loja";
            con = DriverManager.getConnection(endereco, "root", "root");
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não achada");
        } catch (SQLException ex) {
            System.out.println("Problema no SQL");
        }
        
        return con;
    }
    
    public void closeConnetion(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Problema no SQL ao fechar a conexão");
        }
    }
    
}
