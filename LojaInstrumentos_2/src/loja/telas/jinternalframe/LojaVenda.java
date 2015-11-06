
package loja.telas.jinternalframe;

import java.io.Serializable;


public class LojaVenda extends javax.swing.JInternalFrame implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form LojaVenda
     */
    public LojaVenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelVendaProdutos = new javax.swing.JPanel();
        PainelVenda = new javax.swing.JPanel();
        PainelItem = new javax.swing.JPanel();
        LCodigo = new javax.swing.JLabel();
        LNomeP = new javax.swing.JLabel();
        TXTNomeP = new javax.swing.JComboBox();
        TXTCodigoP = new javax.swing.JTextField();
        LPrecoVenda = new javax.swing.JLabel();
        TXTPrecoVenda = new javax.swing.JTextField();
        LMarca = new javax.swing.JLabel();
        TXTMarcas = new javax.swing.JComboBox();
        LQTD = new javax.swing.JLabel();
        TXTQTD = new javax.swing.JSpinner();
        LDesconto = new javax.swing.JLabel();
        TXTDesconto = new javax.swing.JTextField();
        BotaoIncluir = new javax.swing.JButton();
        PainelCarrinhoCompras = new javax.swing.JPanel();
        SPTabela = new javax.swing.JScrollPane();
        TabelaCarrinhoCompras = new javax.swing.JTable();
        PainelDadosVenda = new javax.swing.JPanel();
        LCODVenda = new javax.swing.JLabel();
        LCODCliente = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        LSobrenome = new javax.swing.JLabel();
        TXTCODVenda = new javax.swing.JTextField();
        TXTCODCliente = new javax.swing.JTextField();
        TXTNome = new javax.swing.JTextField();
        TXTSobrenome = new javax.swing.JTextField();
        LFormaPagamento = new javax.swing.JLabel();
        LHoraVenda = new javax.swing.JLabel();
        LDataVenda = new javax.swing.JLabel();
        TXTFormaPagamento = new javax.swing.JComboBox();
        TXTNCheck = new javax.swing.JTextField();
        TXTHoraVenda = new javax.swing.JTextField();
        LValorTotal = new javax.swing.JLabel();
        TXTValorTotal = new javax.swing.JTextField();
        LNCheck = new javax.swing.JLabel();
        TXTDataVenda = new javax.swing.JTextField();
        LNDOC = new javax.swing.JLabel();
        TXTNDOC = new javax.swing.JTextField();
        PainelBotoes = new javax.swing.JPanel();
        BotaoNovo = new javax.swing.JButton();
        BotaoGravar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("loja/telas/jinternalframe/Bundle"); // NOI18N
        PainelVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaVenda.PainelVenda.border.title"))); // NOI18N

        PainelItem.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaVenda.PainelItem.border.title"))); // NOI18N

        LCodigo.setText(bundle.getString("LojaVenda.LCodigo.text")); // NOI18N

        LNomeP.setText(bundle.getString("LojaVenda.LNomeP.text")); // NOI18N

        TXTNomeP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TXTNomeP.setEnabled(false);

        TXTCodigoP.setText(bundle.getString("LojaVenda.TXTCodigoP.text")); // NOI18N
        TXTCodigoP.setEnabled(false);

        LPrecoVenda.setText(bundle.getString("LojaVenda.LPrecoVenda.text")); // NOI18N

        TXTPrecoVenda.setText(bundle.getString("LojaVenda.TXTPrecoVenda.text")); // NOI18N
        TXTPrecoVenda.setEnabled(false);

        LMarca.setText(bundle.getString("LojaVenda.LMarca.text")); // NOI18N

        TXTMarcas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TXTMarcas.setEnabled(false);

        LQTD.setText(bundle.getString("LojaVenda.LQTD.text")); // NOI18N

        TXTQTD.setEnabled(false);

        LDesconto.setText(bundle.getString("LojaVenda.LDesconto.text")); // NOI18N

        TXTDesconto.setText(bundle.getString("LojaVenda.TXTDesconto.text")); // NOI18N
        TXTDesconto.setEnabled(false);

        BotaoIncluir.setText(bundle.getString("LojaVenda.BotaoIncluir.text")); // NOI18N

        javax.swing.GroupLayout PainelItemLayout = new javax.swing.GroupLayout(PainelItem);
        PainelItem.setLayout(PainelItemLayout);
        PainelItemLayout.setHorizontalGroup(
            PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelItemLayout.createSequentialGroup()
                        .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCodigo)
                            .addComponent(LNomeP))
                        .addGap(50, 50, 50)
                        .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelItemLayout.createSequentialGroup()
                        .addComponent(LPrecoVenda)
                        .addGap(23, 23, 23)
                        .addComponent(TXTPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LMarca)
                    .addComponent(LQTD)
                    .addComponent(LDesconto))
                .addGap(49, 49, 49)
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTMarcas, 0, 150, Short.MAX_VALUE)
                    .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDesconto))
                .addGap(18, 18, 18)
                .addComponent(BotaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelItemLayout.setVerticalGroup(
            PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCodigo)
                    .addComponent(TXTCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMarca)
                    .addComponent(TXTMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoIncluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNomeP)
                    .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LQTD)
                        .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LPrecoVenda)
                        .addComponent(TXTPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXTDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDesconto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelCarrinhoCompras.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaVenda.PainelCarrinhoCompras.border.title"))); // NOI18N

        TabelaCarrinhoCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Marca", "QTD", "Preco"
            }
        ));
        TabelaCarrinhoCompras.setEnabled(false);
        SPTabela.setViewportView(TabelaCarrinhoCompras);
        if (TabelaCarrinhoCompras.getColumnModel().getColumnCount() > 0) {
            TabelaCarrinhoCompras.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("LojaVenda.TabelaCarrinhoCompras.columnModel.title0")); // NOI18N
            TabelaCarrinhoCompras.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("LojaVenda.TabelaCarrinhoCompras.columnModel.title1")); // NOI18N
            TabelaCarrinhoCompras.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("LojaVenda.TabelaCarrinhoCompras.columnModel.title2")); // NOI18N
            TabelaCarrinhoCompras.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("LojaVenda.TabelaCarrinhoCompras.columnModel.title3")); // NOI18N
            TabelaCarrinhoCompras.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("LojaVenda.TabelaCarrinhoCompras.columnModel.title4")); // NOI18N
        }

        javax.swing.GroupLayout PainelCarrinhoComprasLayout = new javax.swing.GroupLayout(PainelCarrinhoCompras);
        PainelCarrinhoCompras.setLayout(PainelCarrinhoComprasLayout);
        PainelCarrinhoComprasLayout.setHorizontalGroup(
            PainelCarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCarrinhoComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTabela)
                .addContainerGap())
        );
        PainelCarrinhoComprasLayout.setVerticalGroup(
            PainelCarrinhoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCarrinhoComprasLayout.createSequentialGroup()
                .addComponent(SPTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LojaVenda.PainelDadosVenda.border.title"))); // NOI18N

        LCODVenda.setText(bundle.getString("LojaVenda.LCODVenda.text")); // NOI18N

        LCODCliente.setText(bundle.getString("LojaVenda.LCODCliente.text")); // NOI18N

        LNome.setText(bundle.getString("LojaVenda.LNome.text")); // NOI18N

        LSobrenome.setText(bundle.getString("LojaVenda.LSobrenome.text")); // NOI18N

        TXTCODVenda.setEditable(false);
        TXTCODVenda.setText(bundle.getString("LojaVenda.TXTCODVenda.text")); // NOI18N

        TXTCODCliente.setText(bundle.getString("LojaVenda.TXTCODCliente.text")); // NOI18N
        TXTCODCliente.setEnabled(false);

        TXTNome.setText(bundle.getString("LojaVenda.TXTNome.text")); // NOI18N
        TXTNome.setEnabled(false);

        TXTSobrenome.setText(bundle.getString("LojaVenda.TXTSobrenome.text")); // NOI18N
        TXTSobrenome.setEnabled(false);

        LFormaPagamento.setText(bundle.getString("LojaVenda.LFormaPagamento.text")); // NOI18N

        LHoraVenda.setText(bundle.getString("LojaVenda.LHoraVenda.text")); // NOI18N

        LDataVenda.setText(bundle.getString("LojaVenda.LDataVenda.text")); // NOI18N

        TXTFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartao Credito", "Cartao Debito", "Check" }));
        TXTFormaPagamento.setEnabled(false);
        TXTFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFormaPagamentoActionPerformed(evt);
            }
        });

        TXTNCheck.setText(bundle.getString("LojaVenda.TXTNCheck.text")); // NOI18N
        TXTNCheck.setEnabled(false);

        TXTHoraVenda.setText(bundle.getString("LojaVenda.TXTHoraVenda.text")); // NOI18N
        TXTHoraVenda.setEnabled(false);

        LValorTotal.setText(bundle.getString("LojaVenda.LValorTotal.text")); // NOI18N

        TXTValorTotal.setText(bundle.getString("LojaVenda.TXTValorTotal.text")); // NOI18N
        TXTValorTotal.setEnabled(false);

        LNCheck.setText(bundle.getString("LojaVenda.LNCheck.text")); // NOI18N

        TXTDataVenda.setText(bundle.getString("LojaVenda.TXTDataVenda.text")); // NOI18N
        TXTDataVenda.setEnabled(false);

        LNDOC.setText(bundle.getString("LojaVenda.LNDOC.text")); // NOI18N

        TXTNDOC.setText(bundle.getString("LojaVenda.TXTNDOC.text")); // NOI18N
        TXTNDOC.setEnabled(false);

        javax.swing.GroupLayout PainelDadosVendaLayout = new javax.swing.GroupLayout(PainelDadosVenda);
        PainelDadosVenda.setLayout(PainelDadosVendaLayout);
        PainelDadosVendaLayout.setHorizontalGroup(
            PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                        .addComponent(LCODVenda)
                        .addGap(27, 27, 27)
                        .addComponent(TXTCODVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCODCliente)
                            .addComponent(LNome)
                            .addComponent(LSobrenome))
                        .addGap(24, 24, 24)
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(TXTNome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(TXTCODCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(TXTValorTotal)))
                    .addComponent(LValorTotal))
                .addGap(69, 69, 69)
                .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDataVenda)
                    .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LFormaPagamento)
                            .addComponent(LHoraVenda)
                            .addComponent(LNCheck)
                            .addComponent(LNDOC))
                        .addGap(18, 18, 18)
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTDataVenda)
                            .addComponent(TXTFormaPagamento, 0, 150, Short.MAX_VALUE)
                            .addComponent(TXTNCheck)
                            .addComponent(TXTHoraVenda)
                            .addComponent(TXTNDOC))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelDadosVendaLayout.setVerticalGroup(
            PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCODVenda)
                            .addComponent(TXTCODVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCODCliente)
                            .addComponent(TXTCODCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHoraVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNome)
                            .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LFormaPagamento)
                            .addComponent(TXTFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LDataVenda)
                    .addGroup(PainelDadosVendaLayout.createSequentialGroup()
                        .addComponent(TXTDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTHoraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LSobrenome)
                    .addComponent(LNCheck)
                    .addComponent(TXTNCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LValorTotal)
                    .addComponent(TXTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNDOC)
                    .addComponent(TXTNDOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoNovo.setText(bundle.getString("LojaVenda.BotaoNovo.text")); // NOI18N

        BotaoGravar.setText(bundle.getString("LojaVenda.BotaoGravar.text")); // NOI18N

        BotaoExcluir.setText(bundle.getString("LojaVenda.BotaoExcluir.text")); // NOI18N

        BotaoCancelar.setText(bundle.getString("LojaVenda.BotaoCancelar.text")); // NOI18N

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(BotaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(BotaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovo)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelVendaLayout = new javax.swing.GroupLayout(PainelVenda);
        PainelVenda.setLayout(PainelVendaLayout);
        PainelVendaLayout.setHorizontalGroup(
            PainelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelDadosVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelCarrinhoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelVendaLayout.setVerticalGroup(
            PainelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelCarrinhoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelVendaProdutosLayout = new javax.swing.GroupLayout(PainelVendaProdutos);
        PainelVendaProdutos.setLayout(PainelVendaProdutosLayout);
        PainelVendaProdutosLayout.setHorizontalGroup(
            PainelVendaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVendaProdutosLayout.createSequentialGroup()
                .addComponent(PainelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        PainelVendaProdutosLayout.setVerticalGroup(
            PainelVendaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVendaProdutosLayout.createSequentialGroup()
                .addComponent(PainelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelVendaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelVendaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFormaPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JButton BotaoIncluir;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JLabel LCODCliente;
    private javax.swing.JLabel LCODVenda;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LDataVenda;
    private javax.swing.JLabel LDesconto;
    private javax.swing.JLabel LFormaPagamento;
    private javax.swing.JLabel LHoraVenda;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LNCheck;
    private javax.swing.JLabel LNDOC;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LNomeP;
    private javax.swing.JLabel LPrecoVenda;
    private javax.swing.JLabel LQTD;
    private javax.swing.JLabel LSobrenome;
    private javax.swing.JLabel LValorTotal;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCarrinhoCompras;
    private javax.swing.JPanel PainelDadosVenda;
    private javax.swing.JPanel PainelItem;
    private javax.swing.JPanel PainelVenda;
    private javax.swing.JPanel PainelVendaProdutos;
    private javax.swing.JScrollPane SPTabela;
    private javax.swing.JTextField TXTCODCliente;
    private javax.swing.JTextField TXTCODVenda;
    private javax.swing.JTextField TXTCodigoP;
    private javax.swing.JTextField TXTDataVenda;
    private javax.swing.JTextField TXTDesconto;
    private javax.swing.JComboBox TXTFormaPagamento;
    private javax.swing.JTextField TXTHoraVenda;
    private javax.swing.JComboBox TXTMarcas;
    private javax.swing.JTextField TXTNCheck;
    private javax.swing.JTextField TXTNDOC;
    private javax.swing.JTextField TXTNome;
    private javax.swing.JComboBox TXTNomeP;
    private javax.swing.JTextField TXTPrecoVenda;
    private javax.swing.JSpinner TXTQTD;
    private javax.swing.JTextField TXTSobrenome;
    private javax.swing.JTextField TXTValorTotal;
    private javax.swing.JTable TabelaCarrinhoCompras;
    // End of variables declaration//GEN-END:variables
}