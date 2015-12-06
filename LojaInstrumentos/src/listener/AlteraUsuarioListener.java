
package listener;
    
import autentica.LojaUltimo;
import database.Log;
import exception.ExceptionLoja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.jinternalframe.AlteraUsuario;


public class AlteraUsuarioListener extends javax.swing.JFrame implements ActionListener{
    private AlteraUsuario frame;
    private LojaUltimo LU;
    private Log LLog;
    public AlteraUsuarioListener(AlteraUsuario frame)  {
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("gravar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            String cpf= this.frame.getTXTCPF().toString();
            String rg = this.frame.getTXTRG().toString();
            String Nome = this.frame.getTXTNome().toString();
            String Sobrenome = this.frame.getTXTSobrenome().toString();
            String Senha = this.frame.getTXTSenha().toString();
            String RSenha = this.frame.getTXTRSenha().toString();
            String SenhAtual = this.frame.getTXTSenhaAtual().toString();
            System.out.println(Nome);
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(AlteraUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("excluir".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Excluir");
            } catch (IOException ex) {
                Logger.getLogger(AlteraUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("localizar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Localizar");
            } catch (IOException ex) {
                Logger.getLogger(AlteraUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
