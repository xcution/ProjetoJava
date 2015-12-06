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


public class ConsultaUsuarioListener extends javax.swing.JFrame implements ActionListener{
private LojaUltimo LU;
    private Log LLog;
    public void Consulta() throws IOException{
        this.LU.Ultimo();
        this.LLog.GravarLog(LU.Ultimo(), "", "Consulta Usuario", "");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if("acessar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Usuario", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Usuario", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaUsuarioListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void GetUsuario()throws ExceptionLoja{
        
    }
    public void SetTela()throws ExceptionLoja{
        
    }
}
