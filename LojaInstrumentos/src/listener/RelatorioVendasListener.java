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
import telas.jinternalframe.RelatorioVendas;

public class RelatorioVendasListener extends javax.swing.JFrame implements ActionListener{
    private RelatorioVendas frame;
    private LojaUltimo LU;
    private Log LLog;
    public RelatorioVendasListener(RelatorioVendas frame) {
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand())){
            
        }else if("cancelar".equals(e.getActionCommand())){
            
        }
    }
    
}
