/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author silvioghedin
 */
public class LojaLog {
    public String LerLog(){
        String Path="\\C:\\Log.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(Path);
            br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            while (br.ready()) {
                sb.append(br.readLine());
                sb.append("\n");
            }
            return sb.toString();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo" + ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo" + ex.getMessage());
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo" + ex.getMessage());
                }
            }
        }
        return null; 
    
    }
    public void GravarLog(String Usuario,String Data, String Hora,String Erros, String MenuAtual, String  Acao){
        FileWriter fw = null;
        String fileName="Log";
        String Dados= LerLog();
        String fileText="\nLog \nData do Acesso: "+Data+"\nHora do Acesso: "+Hora+"\nUltimo Usuario Logado:"+Usuario+
                "\nMenu Acessado: "+MenuAtual+"\nAção:"+Acao+"\nErros ocorridos:"+Erros+"\n\n"+Dados;
        fileName = fileName + ".txt";
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(fileName, false);
            bw = new BufferedWriter(fw);
            bw.write(fileText);
            bw.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Gravar o arquivo" + ex.getMessage());
                }
            }

        }
        
    }

}
