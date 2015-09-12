public class Acesso
{
    private String usuario;
    private String senha;
    
    public String getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    public void Acessar(String usuario, String senha)
    {
        if(usuario.equals("admin") && senha.equals("admin"))
        {
            frmPrincipal principal = new frmPrincipal();
            
            principal.show();
        }
    }
}
