
package database;
import exception.ExceptionLoja;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public static Connection getConnection() throws ExceptionLoja{
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            //conn = DriverManager.getConnection("jdbc:hsqldb:jdbc:file:/media/zero/01D02D0A2E138B20/FaculdadeProjetos/Java/Loja/", "sa", "");
            conn = DriverManager.getConnection("jdbc:hsqldb:file:localhost/loja", "sa", "");
        } catch (SQLException e) {
            throw  new ExceptionLoja("Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            throw  new ExceptionLoja("O driver não foi configurado corretametne");
        }

        return conn;
    }
}
