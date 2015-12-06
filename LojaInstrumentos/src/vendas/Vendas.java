/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;
import java.math.BigDecimal;
import java.util.Objects;
/**
 *
 * @author Xcution
 */
public class Vendas implements Comparable<Vendas>{
    private int NumeroVenda;
    private String Data;
    private String Hora;
    private BigDecimal Desconto;
    private BigDecimal ValorTotal;
    private int QTD;
    
    public Vendas(){
    }
    public Vendas(int NumeroVendas, String Data, String Hora, BigDecimal Desconto, BigDecimal ValorTotal,int QTD){
        this.Data=Data;
        this.Desconto=Desconto;
        this.Hora=Hora;
        this.NumeroVenda=NumeroVendas;
        this.QTD=QTD;
        this.ValorTotal=ValorTotal;
    }

    /**
     * @return the NumeroVenda
     */
    public int getNumeroVenda() {
        return NumeroVenda;
    }

    /**
     * @param NumeroVenda the NumeroVenda to set
     */
    public void setNumeroVenda(int NumeroVenda) {
        this.NumeroVenda = NumeroVenda;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the Hora
     */
    public String getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the Desconto
     */
    public BigDecimal getDesconto() {
        return Desconto;
    }

    /**
     * @param Desconto the Desconto to set
     */
    public void setDesconto(BigDecimal Desconto) {
        this.Desconto = Desconto;
    }

    /**
     * @return the ValorTotal
     */
    public BigDecimal getValorTotal() {
        return ValorTotal;
    }

    /**
     * @param ValorTotal the ValorTotal to set
     */
    public void setValorTotal(BigDecimal ValorTotal) {
        this.ValorTotal = ValorTotal;
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendas other = (Vendas) obj;
        if (this.NumeroVenda != other.NumeroVenda) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Vendas o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
