
package dao;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import exception.ExceptionLoja;
import vendas.Vendas;
import database.Conexao;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
public class VendasDAO {
    public void Inserirdados(int Codigo,String Nome,String Marca,String Modelo,String Descricao,String DataCompra,
            int Quantidade,BigDecimal Valorunitario,BigDecimal Valorcompra)throws ExceptionLoja{
        
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConnection();
            String sql = "INSERT INTO vendas () VALUES("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            ps.setInt(1, Codigo);
            ps.setString(2, Nome);
            ps.setString(3, Marca);
            ps.setString(4, Modelo);
            ps.setString(5, Descricao);
            ps.setString(6,DataCompra);
            
            ps.setInt(7, Quantidade);
            ps.setBigDecimal(8, Valorunitario);
            ps.setBigDecimal(8, Valorcompra);
            
            
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
        
    }
    public void UpdateDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
    }
    public void ExcluirDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
    }
    
    public ArrayList ListaDados()throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Vendas> ResultadoDados = new ArrayList<Vendas>();
    
        
        
        return ResultadoDados;
    }
}
