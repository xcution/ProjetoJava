/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.FrmLogin;
import autentica.Acesso;
import autentica.LojaUltimo;
import database.Log;
import exception.ExceptionLoja;
import telas.FrmPrincipal;

public class FrmLoginListener extends javax.swing.JFrame implements ActionListener{
    private FrmLogin frame;
    private String Login;
    private String Senha;
    private Acesso acesso = new Acesso();
    
    public FrmLoginListener(FrmLogin frame) {
        this.frame=frame;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if("acessar".equals(e.getActionCommand())){
            if (acesso.entrar(this.getFrame().getTxtUsuario().getText(),new String (this.getFrame().getTxtSenha().getPassword()))==true){
                LojaUltimo LU = new LojaUltimo();
                LU.GravarUltimo(this.getFrame().getTxtUsuario().getText());
                Log LLog = new Log();
                //usuario/erro/menuatual/acao
                LLog.GravarLog(this.getFrame().getTxtUsuario().getText(), "", "Logado No Sistema", "Logar");
                FrmPrincipal principal = new FrmPrincipal();
                principal.setVisible(true);
                this.frame.dispose();
            }
            this.Senha=new String (this.getFrame().getTxtSenha().getPassword());
            this.Login=this.getFrame().getTxtUsuario().getText();
            
            
        }else if("cancelar".equals(e.getActionCommand())){
            
        }
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
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
     * @return the frame
     */
    public FrmLogin getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(FrmLogin frame) {
        this.frame = frame;
    }
    
}
