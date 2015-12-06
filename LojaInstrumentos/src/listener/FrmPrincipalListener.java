
package listener;
import autentica.LojaUltimo;
import database.Log;
import exception.ExceptionLoja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import telas.FrmPrincipal;
import telas.jinternalframe.*;
public class FrmPrincipalListener extends javax.swing.JFrame implements ActionListener{
    private CadastroCliente CADCliente = new CadastroCliente();
    private CadastroProduto CADProduto = new CadastroProduto();
    private CadastroUsuario CADUsuario = new CadastroUsuario();
    private FrmPrincipal frame;
    private LojaUltimo LU;
    private Log LLog;
    
    public FrmPrincipalListener(FrmPrincipal frame){
        //adicionar exception
        this.frame=frame;
        
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        //adicionar exception
        
        if ("sobre".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(frame, "Desenvolvido por \nDioni Machado Ferreira\nMauricio Citadini Biléssimo\nSilvio Polli Ghedin");
        }else if("cadastrarcliente".equals(e.getActionCommand())){
            this.frame.getJDP_principal().remove(CADUsuario);
            this.frame.getJDP_principal().remove(CADCliente);
            this.frame.getJDP_principal().remove(CADProduto);
            this.frame.getJDP_principal().updateUI();
            this.frame.getJDP_principal().add(CADCliente);
            this.frame.getJDP_principal().remove(this);
            CADCliente.setVisible(true);
            CADUsuario.setVisible(false);
            CADProduto.setVisible(false);
            //fazer funcao pra setar osdemais frames com visibilidade como false
        }else if("cadastrarusuario".equals(e.getActionCommand())){
            this.frame.getJDP_principal().remove(CADUsuario);
            this.frame.getJDP_principal().remove(CADCliente);
            this.frame.getJDP_principal().remove(CADProduto);
            this.frame.getJDP_principal().updateUI();
            this.frame.getJDP_principal().add(CADUsuario);
            CADUsuario.setVisible(true);
            CADCliente.setVisible(false);
            CADProduto.setVisible(false);
            //fazer funcao pra setar osdemais frames com visibilidade como false
        }else if("cadastrarproduto".equals(e.getActionCommand())){ 
            this.frame.getJDP_principal().remove(CADUsuario);
            this.frame.getJDP_principal().remove(CADCliente);
            this.frame.getJDP_principal().remove(CADProduto);
            this.frame.getJDP_principal().updateUI();
            this.frame.getJDP_principal().add(CADProduto);
            CADProduto.setVisible(true);
            CADCliente.setVisible(false);
            CADUsuario.setVisible(false);
            //fazer funcao pra setar osdemais frames com visibilidade como false
            
        }else if("alterarcliente".equals(e.getActionCommand())){
            
        }else if("alterarusuariosenha".equals(e.getActionCommand())){
            
        }else if("alterarproduto".equals(e.getActionCommand())){
            
        }else if("consultarcliente".equals(e.getActionCommand())){
            
        }else if("consultarproduto".equals(e.getActionCommand())){
            
        }else if("consultarvendas".equals(e.getActionCommand())){
            
        }else if("vendamercadoria".equals(e.getActionCommand())){
            
        }else if("contasreceber".equals(e.getActionCommand())){
            
        }
        
    }
    
    
    
    
}
