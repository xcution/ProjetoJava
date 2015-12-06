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
import telas.jinternalframe.ConsultaProduto;


public class ConsultaProdutoListener extends javax.swing.JFrame implements ActionListener{
    private ConsultaProduto frame;
    private LojaUltimo LU;
    private Log LLog;
    public ConsultaProdutoListener(ConsultaProduto frame) {
        this.frame=frame;    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("consultar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Produtos", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("cancelar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Produtos", "Cancelar");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("alterar".equals(e.getActionCommand())){
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Consulta Produtos", "Alterar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void GetProduto()throws ExceptionLoja{}
    public void SetTela()throws ExceptionLoja{}
}
