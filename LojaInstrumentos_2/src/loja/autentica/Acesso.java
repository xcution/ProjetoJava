package loja.autentica;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        
        //recebe uma lista com os usuarios e senhas
        
        
        if(usuario.equals("admin") && senha.equals("admin"))
        {
            logado = true;
            
            
        }else if(usuario.equals("Xcution") && senha.equals("000")){
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
