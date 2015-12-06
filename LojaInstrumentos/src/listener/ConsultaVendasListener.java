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
import telas.jinternalframe.ConsultaVendas;


public class ConsultaVendasListener extends javax.swing.JFrame implements ActionListener{
    private ConsultaVendas frame;
    private LojaUltimo LU;
    private Log LLog;
    public ConsultaVendasListener(ConsultaVendas frame)  {
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("consultar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Vendas", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaVendasListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Vendas", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaVendasListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("alterar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Vendas", "Alterar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaVendasListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void GetVendas()throws ExceptionLoja{}
    public void SetTelas() throws ExceptionLoja{
        
    }
}
