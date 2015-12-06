
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import exception.ExceptionLoja;
import usuario.Usuario;
import database.Conexao;
public class UsuarioDAO {
    
    
    public void Inserirdados(int CPF,int RG,String Nome,String Sobrenome,String Email,String User,String Senha)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConnection();
            String sql = "INSERT INTO usuario VALUES("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + ");";
            ps = conn.prepareStatement(sql); 
            ps.setInt(1, CPF);
            ps.setInt(2, RG);
            ps.setString(3, Nome);
            ps.setString(4, Sobrenome);
            ps.setString(5, Email);
            ps.setString(6, User);
            ps.setString(7, Senha);
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
        
    }
    public void UpdateDados(int CPF,int RG,String Nome,String Sobrenome,String Email,String User,String Senha)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //nome tabela, qual o coluna ,e qual o valor novo
            String sql="update usuario   set ? = ? ";
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, CPF);
            ps.setString(2, Nome);
            
            
            
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
    }
    public void ExcluirDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
    }
    
    public ArrayList ListaDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Usuario> ResultadoDados = new ArrayList<Usuario>();
    
        
        
        return ResultadoDados;
    }
    public void ListaUsusario() throws ExceptionLoja{
         Connection conn = null;
        PreparedStatement ps = null;
        try{
            //nome tabela, qual o coluna ,e qual o valor novo
            String sql="select usario,senha from usuario ;";
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);
            
            
            
            
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
    }
}
