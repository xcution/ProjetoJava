/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;
import autentica.LojaUltimo;
import exception.ExceptionLoja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.jinternalframe.CadastroCliente;

import cliente.Cliente;
import database.Log;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteListener extends javax.swing.JFrame implements ActionListener {

    private CadastroCliente frame;
    private String CPF ;
    private String RG ;
    private String Nome ;
    private String Sobrenome;
    private String DataCadastro ;
    private String DataNascimento ;
    private String Sexo ;
    private String EstadoCivil ;
    private String Telefone ;
    private String Celular ;
    private String Numero ;
    private String Email ;
    private String Endereco ;
    private String Bairro ;
    private String Logadouro ;
    private String CEP ;
    private String Cidade ;
    private String Estado ;
    private String Complemento ;
    private String Referencia ;
    private LojaUltimo LU;
    private Log LLog;
    public ClienteListener(CadastroCliente frame) throws IOException {
        this.frame = frame;
        this.LU.Ultimo();
        this.LLog.GravarLog(LU.Ultimo(), "", "Cadastro de Cliente", "");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("gravar".equals(e.getActionCommand())) {
            
            try {
                Validar();
            } catch (ExceptionLoja ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            try {
                this.LLog.GravarLog(this.LU.Ultimo(), "", "Cadastro de Cliente", "Gravar Dados");
            } catch (IOException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.frame.setVisible(false);
            this.frame.dispose();
           
        }
    }

    public void Validar() throws ExceptionLoja, IOException{
        this.LLog.GravarLog(this.LU.Ultimo(), "", "Cadastro de Cliente", "Gravar Dados");
        SetCampos();
        if (VerificarCPF() == true) {
            if (VerificarRG() == true) {
                if (VerificarEmail() == true) {
                    if (VerificarCampoVazio() == true) {

                        if (GravarBanco() == true) {
                            JOptionPane.showMessageDialog(this, "Gravado com Sucesso");
                        } else {
                            JOptionPane.showMessageDialog(this, "Não foi possivel gravar no banco");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Obrigatorio o preenchimento de todos os campos");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "EMail ja cadastrado no sistema");
                }
            } else {
                JOptionPane.showMessageDialog(this, "RG ja cadastrado no sistema");
            }

        } else {
            JOptionPane.showMessageDialog(this, "CPF ja cadastrado no sistema");
        }
    }

    public boolean VerificarCampoVazio() throws ExceptionLoja{
        if (getCPF().equals("")) {
            return false;
        } else if (getRG().equals("")) {
            return false;
        } else if (getNome().equals("")) {
            return false;
        } else if (getSobrenome().equals("")) {
            return false;
        } else if (getDataNascimento().equals("")) {
            return false;
        } else if (getDataCadastro().equals("")) {
            return false;
        } else if (getTelefone().equals("")) {
            return false;
        } else if (getCidade().equals("")) {
            return false;
        } else if (getEstado().equals("")) {
            return false;
        } else if (getEstadoCivil().equals("")) {
            return false;
        } else if (getCelular().equals("")) {
            return false;
        } else if (getCEP().equals("")) {
            return false;
        } else if (getReferencia().equals("")) {
            return false;
        } else if (getEmail().equals("")) {
            return false;
        } else if (getLogadouro().equals("")) {
            return false;
        } else if (getBairro().equals("")) {
            return false;
        } else if (getNumero().equals("")) {
            return false;
        } else if (getComplemento().equals("")) {
            return false;
        } else if (getSexo().equals("")) {
            return false;
        } else if (getEndereco().equals("")) {
            return false;
        }

        return true;
    }

    public boolean VerificarCPF() throws ExceptionLoja{
        //recebe a tabela do banco e verifica se ja tem CPF cadastrado

        return true;
    }

    public boolean VerificarEmail() throws ExceptionLoja{
        //recebe a tabela do banco e verifica se ja tem email cadastrado
        return true;
    }

    public boolean VerificarRG() throws ExceptionLoja{
        //recebe a tabela do banco e verifica se ja tem RG cadastrado
        return true;
    }

    public boolean GravarBanco() throws ExceptionLoja{
        
        System.out.println("\nUsuario\n");
        System.out.println(this.getNome());
        System.out.println(this.getNumero());
        System.out.println(this.getCPF());
        System.out.println(this.getRG());
        System.out.println(this.getSobrenome());
        System.out.println(this.getSexo());
        System.out.println(this.getDataCadastro());
        System.out.println(this.getDataNascimento());
        System.out.println(this.getEstadoCivil());
        System.out.println(this.getTelefone());
        System.out.println(this.getCelular());
        System.out.println(this.getEmail());
        System.out.println(this.getEndereco());
        System.out.println(this.getBairro());
        System.out.println(this.getLogadouro());
        System.out.println(this.getCEP());
        System.out.println(this.getCidade());
        System.out.println(this.getEstado());
        System.out.println(this.getComplemento());
        System.out.println(this.getReferencia()+"\n");
        
        
        
        
        return true;
    }

    public void SetCampos() throws ExceptionLoja{
        
        
        
        this.setCPF(this.frame.getTXTCPF().getText().toString());
        this.setRG(this.frame.getTXTRG().getText().toString());
        this.setNome(this.frame.getTXTNome().getText().toString());
        this.setSobrenome(this.frame.getTXTSobrenome().getText());
        this.setDataCadastro(new SimpleDateFormat("yyyy/MM/dd").toString());
        this.setDataNascimento(this.frame.getTXTDataNascimento().getText());
        this.setSexo(this.frame.getTXTSexo().getSelectedItem().toString());
        this.setEstadoCivil(this.frame.getTXTEstadoCivil().getSelectedItem().toString());
        this.setTelefone(this.frame.getTXTtelefone().getText());
        this.setCelular(this.frame.getTXTCelular().getText());
        this.setNumero(this.frame.getTXTNumero().getText());
        this.setEmail(this.frame.getTXTEmail().getText());
        this.setEndereco(this.frame.getTXTEndereco().getText());
        this.setBairro(this.frame.getTXTBairro().getText());
        this.setLogadouro(this.frame.getTXTLogadouro().getText());
        this.setCEP(this.frame.getTXTCEP().getText());
        this.setCidade(this.frame.getTXTCidade().getText());
        this.setEstado(this.frame.getTXTUF().getSelectedItem().toString());
        this.setComplemento(this.frame.getTXTComplemento().getText());
        this.setReferencia(this.frame.getTXTReferencia().getText());
       
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Sobrenome
     */
    public String getSobrenome() {
        return Sobrenome;
    }

    /**
     * @param Sobrenome the Sobrenome to set
     */
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    /**
     * @return the DataCadastro
     */
    public String getDataCadastro() {
        return DataCadastro;
    }

    /**
     * @param DataCadastro the DataCadastro to set
     */
    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    /**
     * @return the DataNascimento
     */
    public String getDataNascimento() {
        return DataNascimento;
    }

    /**
     * @param DataNascimento the DataNascimento to set
     */
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the EstadoCivil
     */
    public String getEstadoCivil() {
        return EstadoCivil;
    }

    /**
     * @param EstadoCivil the EstadoCivil to set
     */
    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Logadouro
     */
    public String getLogadouro() {
        return Logadouro;
    }

    /**
     * @param Logadouro the Logadouro to set
     */
    public void setLogadouro(String Logadouro) {
        this.Logadouro = Logadouro;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Referencia
     */
    public String getReferencia() {
        return Referencia;
    }

    /**
     * @param Referencia the Referencia to set
     */
    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
}
