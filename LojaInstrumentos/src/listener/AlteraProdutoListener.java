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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.jinternalframe.AlteraProduto;


public class AlteraProdutoListener extends javax.swing.JFrame implements ActionListener{
    private AlteraProduto frame;
    private LojaUltimo LU;
    private Log LLog;
    public AlteraProdutoListener(AlteraProduto frame) {
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("gravar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(AlteraProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("excluir".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Exluir");
            } catch (IOException ex) {
                Logger.getLogger(AlteraProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("localizar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Localizar");
            } catch (IOException ex) {
                Logger.getLogger(AlteraProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
