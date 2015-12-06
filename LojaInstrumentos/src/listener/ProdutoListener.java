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
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.jinternalframe.CadastroProduto;
import javax.swing.JOptionPane;

public class ProdutoListener extends javax.swing.JFrame implements ActionListener {

    private CadastroProduto frame;
    private int Codigo ;
    private String Nome ;
    private String Marca ;
    private String Modelo ;
    private String DataCompra ;
    private String Descricao ;
    private int QTD ;
    private BigDecimal ValorCusto ;
    private BigDecimal ValorUnitario ;
private LojaUltimo LU;
    private Log LLog;
    public ProdutoListener(CadastroProduto frame) {
        //adicionar exception
        this.frame = frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //adicionar exception
        if ("gravar".equals(e.getActionCommand())) {
            try {
                SetCampos();
            } catch (ExceptionLoja ex) {
                Logger.getLogger(ProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (GravarBanco()==true){
                    JOptionPane.showMessageDialog(this, "Gravado com sucesso");
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao gravar no banco");
                }
            } catch (ExceptionLoja ex) {
                Logger.getLogger(ProdutoListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("cancelar".equals(e.getActionCommand())) {

        }
    }

    public boolean GravarBanco() throws ExceptionLoja{
        //adicionar exception
        System.out.println("\nProdutos\n");
        System.out.println(this.getCodigo());
        System.out.println(this.getNome());
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getDataCompra());
        System.out.println(this.getDescricao());       
        System.out.println(this.getQTD());
        System.out.println(this.getValorCusto());
        System.out.println(this.getValorUnitario()+"\n\n");
        return true;
    }
    public void SetCampos()throws ExceptionLoja{
        //adicionar exception
        this.setCodigo(123);
        this.setNome(this.frame.getTXTNome().getText());
        this.setMarca(this.frame.getTXTMarca().getText());
        this.setModelo(this.frame.getTXTModelo().getText());
        this.setDataCompra(new SimpleDateFormat("yyyy/MM/dd").toString());
        this.setDescricao(this.frame.getTXTDescricao().getText());
        this.setQTD((int) this.frame.getTXTQuantidade().getValue());
        this.setValorCusto(new BigDecimal(this.frame.getTXTValorCusto().getText()));
        this.setValorUnitario(new BigDecimal(this.frame.getTXTValorUnitario().getText()));
        /*
        
        private int Codigo = Integer.valueOf(this.frame.getTXTCodigo().getText());
    private String Nome = this.frame.getTXTNome().getText().toString();
    private String Marca = this.frame.getTXTMarca().getText().toString();
    private String Modelo = this.frame.getTXTModelo().getText().toString();
    private String DataCompra = this.frame.getTXTDataCompra().getText().toString();
    private String Descricao = this.frame.getTXTDescricao().getText().toString();
    private int QTD = (int) this.frame.getTXTQuantidade().getValue();
    private BigDecimal ValorCusto = new BigDecimal(this.frame.getTXTValorCusto().getText().toString());
    private BigDecimal ValorUnitario = new BigDecimal(this.frame.getTXTValorUnitario().getText().toString());
        */
    }
    /**
     * @return the frame
     */
    public CadastroProduto getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(CadastroProduto frame) {
        this.frame = frame;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
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
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the DataCompra
     */
    public String getDataCompra() {
        return DataCompra;
    }

    /**
     * @param DataCompra the DataCompra to set
     */
    public void setDataCompra(String DataCompra) {
        this.DataCompra = DataCompra;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the QTD
     */
    public int getQTD() {
        return QTD;
    }

    /**
     * @param QTD the QTD to set
     */
    public void setQTD(int QTD) {
        this.QTD = QTD;
    }

    /**
     * @return the ValorCusto
     */
    public BigDecimal getValorCusto() {
        return ValorCusto;
    }

    /**
     * @param ValorCusto the ValorCusto to set
     */
    public void setValorCusto(BigDecimal ValorCusto) {
        this.ValorCusto = ValorCusto;
    }

    /**
     * @return the ValorUnitario
     */
    public BigDecimal getValorUnitario() {
        return ValorUnitario;
    }

    /**
     * @param ValorUnitario the ValorUnitario to set
     */
    public void setValorUnitario(BigDecimal ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }
}
