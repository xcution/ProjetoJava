/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;
import autentica.LojaUltimo;
import database.Log;
import exception.ExceptionLoja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.jinternalframe.CadastroUsuario;

public class UsuarioListener extends javax.swing.JFrame implements ActionListener {

    private CadastroUsuario frame;
    private String Nome ;
    private String Sobrenome ;
    private String CPF ;
    private String RG ;
    private String Senha ;
    private String RSenha ;
    private String Email;
    private String Usuario ;
private LojaUltimo LU;
    private Log LLog;
    public UsuarioListener(CadastroUsuario frame) {
        //adicionar exception
        this.frame = frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //adicionar exception
        if ("gravar".equals(e.getActionCommand())) {
            try {
                SetCampos();
            } catch (ExceptionLoja ex) {
                Logger.getLogger(UsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (SenhaERSenha() == true) {
                    if (VerificarCampoVazio() == true) {
                        
                        if (GravarBanco() == true) {
                            JOptionPane.showMessageDialog(this, "Gravado com Sucesso");
                        } else {
                            JOptionPane.showMessageDialog(this, "Não foi possivel gravar no banco");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Obrigatorio o preenchimento de todos os campos");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Senha diferente digitada nos campos de Senha");
                }
            } catch (ExceptionLoja ex) {
                Logger.getLogger(UsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if ("cancelar".equals(e.getActionCommand())) {

        }
    }
    public void SetCampos()throws ExceptionLoja{
        //adicionar exception
        
        this.setNome(this.frame.getTXTNome().getText());
        this.setSobrenome(this.frame.getTXTSobrenome().getText());
        this.setCPF(this.frame.getTXTCPF().getText());
        this.setRG(this.frame.getTXTRG().getText());
        this.setSenha(this.frame.getTXTSenha().getPassword().toString());
        this.setRSenha(this.frame.getTXTRSenha().getPassword().toString());
        this.setEmail(this.frame.getTXTEmail().getText());
        this.setUsuario(this.frame.getTXTUsuario().getText());
        /*
        private String Nome = this.frame.getTXTNome().getText().toString();
    private String Sobrenome = this.frame.getTXTSobrenome().getText().toString();
    private String CPF = this.frame.getTXTCPF().getText().toString();
    private String RG = this.frame.getTXTRG().getText().toString();
    private String Senha = this.frame.getTXTSenha().getSelectedText().toString();
    private String RSenha = this.frame.getTXTRSenha().getSelectedText().toString();
    private String Email = this.frame.getTXTEmail().getText().toString();
    private String Usuario = this.frame.getTXTUsuario().getText().toString();*/
    }

    public boolean VerificarCampoVazio() throws ExceptionLoja{
        //adicionar exception
        if (getCPF().equals("")) {

            return false;
        } else if (getRG().equals("")) {

            return false;
        } else if (getNome().equals("")) {

            return false;
        } else if (getSobrenome().equals("")) {

            return false;
        } else if (getUsuario().equals("")) {

            return false;
        } else if (getSenha().equals("")) {

            return false;
        } else if (getRSenha().equals("")) {

            return false;
        } else if (getEmail().equals("")) {

            return false;
        }

        //  
        return true;
    }

    public boolean SenhaERSenha() throws ExceptionLoja{
        //adicionar exception
        System.out.println(this.getSenha().equals(this.getRSenha())+"\n"+this.getSenha()+"\n"+this.getRSenha());
        if (this.getSenha().toString().equals(this.getRSenha().toString())) {
            return false;
        }
        return true;
    }

    public boolean GravarBanco() throws ExceptionLoja{
        //adicionar exception
        System.out.println("\nUsuario\n");
        System.out.println(this.getNome());
        System.out.println(this.getSobrenome());
        System.out.println(this.getUsuario());
        System.out.println(this.getCPF());
        System.out.println(this.getRG());
        System.out.println(this.getRSenha());
        System.out.println(this.getSenha());
        System.out.println(this.getEmail()+"\n\n");
        
        return true;
    }

    /**
     * @return the frame
     */
    public CadastroUsuario getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(CadastroUsuario frame) {
        this.frame = frame;
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
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
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
     * @return the RSenha
     */
    public String getRSenha() {
        return RSenha;
    }

    /**
     * @param RSenha the RSenha to set
     */
    public void setRSenha(String RSenha) {
        this.RSenha = RSenha;
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

}
