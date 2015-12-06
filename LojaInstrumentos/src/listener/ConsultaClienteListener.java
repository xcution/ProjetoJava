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
import telas.jinternalframe.ConsultaCliente;


public class ConsultaClienteListener extends javax.swing.JFrame implements ActionListener{
    private ConsultaCliente frame;
    private LojaUltimo LU;
    private Log LLog;
    public ConsultaClienteListener(ConsultaCliente frame) {
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("consultar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Cliente", "Consultar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("alterar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Alterar Usuario", "Alterar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void GetCliente()throws ExceptionLoja{}
    public void SetTelas()throws ExceptionLoja{}
}
