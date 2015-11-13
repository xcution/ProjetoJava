
package loja.produtos;

import java.math.BigDecimal;

public class LojaProdutos {
    private int Codigo;
    private int QTD;
    private BigDecimal ValorCusto;
    private BigDecimal ValorUnitario;
    private String Nome;
    private String Marca;
    private String Modelo;
    private String Descricao;
    private String DataCompra;
    
    public LojaProdutos(){
    
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
}