
import javax.swing.JOptionPane;

public class Acesso 
{
    private String usuario = "";
    private String senha = "";
    
    public boolean entrar(String usuario, String senha)
    {
        this.usuario = usuario;
        this.senha = senha;
        boolean logado = false;
        
        if(usuario.equals("admin") && senha.equals("admin"))
        {
            logado = true;
        }
        else
        {
            if(usuario.equals("") && senha.equals(""))
            {
                JOptionPane.showMessageDialog(null, "É necessário informar o login e a senha para entrar.");
                logado = false;
            }
            else
            {
                if((!usuario.equals("admin")) && (!senha.equals("admin")))
                {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
                    logado = false;
                }
            }
        }
        return logado;
    }
}
