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
import telas.jinternalframe.AlteraCliente;


//talves tenha que mudar para javax.swing.JinternalFrame
public class AlteraClienteListener extends javax.swing.JFrame implements ActionListener{
    private AlteraCliente frame;
    private LojaUltimo LU;
    private Log LLog;
    public AlteraClienteListener(AlteraCliente frame)  {
        this.frame=frame;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("gravar".equals(e.getActionCommand())){
            try {
                LLog.GravarLog(LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                LLog.GravarLog(LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("excluir".equals(e.getActionCommand())){
            try {
                LLog.GravarLog(LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("localizar".equals(e.getActionCommand())){
            try {
                LLog.GravarLog(LU.Ultimo(), "", "Alterar Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(AlteraClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
