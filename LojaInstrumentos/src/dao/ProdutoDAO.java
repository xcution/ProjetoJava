
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import exception.ExceptionLoja;
import produtos.Produtos;
import database.Conexao;
import java.math.BigDecimal;
public class ProdutoDAO {
    public void Inserirdados(int Codigo,String Nome,String Marca,String Modelo,String Descricao,String Data,int QTD,BigDecimal ValorCusto,BigDecimal ValorUnitario)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConnection();
            String sql = "INSERT INT produtos () VALUES("
                    + "?,"
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
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
        
    }
    public void UpdateDados(int Codigo,String Nome,String Marca,String Modelo,String Descricao,String Data,int QTD,BigDecimal ValorCusto,BigDecimal ValorUnitario)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //nome tabela, qual o coluna ,e qual o valor novo
            String sql="update produto set ? = ? ";
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Codigo);
            ps.setString(2, Nome);
            
            
            
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
    }
    public void ExcluirDados(int codigo)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            String sql="delete from produto where = ?";
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
            conn.commit();
            
        }catch(SQLException ex){
            if(conn != null){
                try{
                    conn.rollback();     
                }catch(SQLException e){
                    throw new ExceptionLoja(e.getMessage());            
                }               
            }
    }finally{
            if(conn != null){
                try{
                    conn.close();    
                }catch(SQLException e){
                    throw new ExceptionLoja(e.getMessage());
                }                
            }
            
            if(ps != null){
                try{
                    ps.close();    
                }catch(SQLException e){
                    throw new ExceptionLoja(e.getMessage());
                }                
            }
        }
    }
    public int Codigo() throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        int codigo;
        try{
            String sql="select count(codigo) from produto;";
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);
            
            codigo= ps.executeUpdate(sql);
            
            
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
        
        
        return codigo+1;
    }
    public ArrayList ListaDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Produtos> ResultadoDados = new ArrayList<Produtos>();
    
        
        
        return ResultadoDados;
    }
}
