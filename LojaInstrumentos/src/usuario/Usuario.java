
package usuario;
import java.util.Objects;

public class Usuario implements Comparable<Usuario>{
    private int CPF;
    private int RG;
    private String Nome;
    private String Sobrenome;
    private String Usuario;
    private String Senha;
    private String Email;
    
    public Usuario(){  
        
    }
    public Usuario(int CPF,int RG, String Usuario, String Senha, String Email,
            String Nome,String Sobrenome){  
        this.CPF=CPF;
        this.Email=Email;
        this.Nome=Nome;
        this.RG=RG;
        this.Senha=Senha;
        this.Sobrenome=Sobrenome;
        this.Usuario=Usuario;
    }
    
    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Sobrenome
     */
    public String getSobrenome() {
        return Sobrenome;
    }

    /**
     * @param Sobrenome the Sobrenome to set
     */
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }
    
     /**
     * @return the RG
     */
    public int getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(int RG) {
        this.RG = RG;
    }
    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.CPF != other.CPF) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
    
    
}
