package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Sala;
import modelo.Usuario;
import modelo.Servidor;


public class ConexaoBanco {
    
    Connection con;
    Statement comando;
    ResultSet resultado;
    
    public ConexaoBanco(){        
        con = new ConnectionFactory().createConnection();
        try {
            comando = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Problema no SQL");
        }
    }
    
    public ArrayList<Sala> listarSala(){
        ArrayList<Sala> listaSala = new ArrayList();
        
        try {            
                       
            resultado = comando.executeQuery("select * from sala");
            
             while (resultado.next()) {                
                //Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                Sala sala = new Sala();
                sala.setNome(resultado.getString("nome"));
                sala.setNumero(resultado.getInt("numero"));
                sala.setCodusu(resultado.getInt("codusu"));
                sala.setCodserv(resultado.getInt("codserv"));
                listaSala.add(sala);
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        
        return listaSala;
    }
    
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> listaUsuario = new ArrayList();
        
        try {            
                       
            resultado = comando.executeQuery("select * from usuario");
            
             while (resultado.next()) {                
                //Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                Usuario usuario = new Usuario();
                usuario.setNome(resultado.getString("nome"));
                usuario.setMatricula(resultado.getInt("matricula"));
                usuario.setCHoraria(resultado.getInt("choraria"));
                listaUsuario.add(usuario);
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        
        return listaUsuario;
    }
    
    public ArrayList<Servidor> listarServidor(){
        ArrayList<Servidor> listaServidor = new ArrayList();
        
        try {            
                       
            resultado = comando.executeQuery("select * from servidor");
            
             while (resultado.next()) {                
                //Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                Servidor serv = new Servidor();
                serv.setNome(resultado.getString("nome"));
                serv.setMatricula(resultado.getInt("matricula"));
                serv.setCHoraria(resultado.getInt("choraria"));
               
                listaServidor.add(serv);
            }           
            
        } catch (SQLException ex) {
            System.out.println("Problema com SQL");
        }
        
        return listaServidor;
    }
}
