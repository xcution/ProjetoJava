
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import exception.ExceptionLoja;
import cliente.Cliente;
import database.Conexao;
public class ClienteDAO {
    //recebe as variaveis coom dados
    public void Inserirdados(int CPF,int RG,String Nome,String Sobrenome,String Sexo, String DataNascimento,String DataCadastro,String EstadoCivil,String Telefone,
            String Celular,String Email,String Endereco,String Logadouro,String Bairro,int Numero,String CEP,String Estado,String Complemento,String Referencia)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = Conexao.getConnection();
            String sql = "INSERT INTO cliente () VALUES("
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
            ps.setString(5, Sexo);
            ps.setString(6, DataNascimento);
            ps.setString(7, DataCadastro);
            ps.setString(3, EstadoCivil);
            ps.setString(3, Telefone);
            ps.setString(3, Celular);
            ps.setString(3, Email);
            ps.setString(3, Endereco);
            ps.setString(3, Logadouro);
            ps.setString(3, Bairro);
            ps.setInt(3, Numero);
            ps.setString(3, CEP);
            ps.setString(3, Estado);
            ps.setString(3, Complemento);
            ps.setString(3, Referencia);
            
            
            
            
            ps.execute();
            conn.commit();
        }catch(SQLException ex){
            throw new ExceptionLoja(ex.getMessage());
        }
        
    }
    public void UpdateDados(int CPF,int RG,String Nome,String Sobrenome,String Sexo, String DataNascimento,String DataCadastro,String EstadoCivil,String Telefone,
            String Celular,String Email,String Endereco,String Logadouro,String Bairro,int Numero,String CEP,String Estado,String Complemento,String Referencia)throws ExceptionLoja{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //nome tabela, qual o coluna ,e qual o valor novo
            String sql="update produto set ? = ? ";
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
    
    
}
