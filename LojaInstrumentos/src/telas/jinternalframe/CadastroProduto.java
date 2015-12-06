
package telas.jinternalframe;
import listener.ProdutoListener;

public class CadastroProduto extends javax.swing.JInternalFrame {
    private ProdutoListener listener = new ProdutoListener (this);
    /**
     * Creates new form LojaCadastroProduto
     */
    public CadastroProduto() {
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

        PainelCadastroProdutos = new javax.swing.JPanel();
        PainelBotoes = new javax.swing.JPanel();
        BotaoGravar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        PainelCamposdados1 = new javax.swing.JPanel();
        TXTCodigo = new javax.swing.JTextField();
        TXTNome = new javax.swing.JTextField();
        TXTMarca = new javax.swing.JTextField();
        TXTModelo = new javax.swing.JTextField();
        PainelCamposdados2 = new javax.swing.JPanel();
        LValorCusto = new javax.swing.JLabel();
        LValorUnitario = new javax.swing.JLabel();
        LQuantidade = new javax.swing.JLabel();
        TXTValorCusto = new javax.swing.JTextField();
        TXTValorUnitario = new javax.swing.JTextField();
        TXTQuantidade = new javax.swing.JSpinner();
        LCodigo = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        LMarca = new javax.swing.JLabel();
        LModelo = new javax.swing.JLabel();
        LDescricao = new javax.swing.JLabel();
        PTXTDescricao = new javax.swing.JScrollPane();
        TXTDescricao = new javax.swing.JTextArea();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("telas/jinternalframe/Bundle"); // NOI18N
        PainelCadastroProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("CadastroProduto.PainelCadastroProdutos.border.title"))); // NOI18N

        BotaoGravar.setText(bundle.getString("CadastroProduto.BotaoGravar.text")); // NOI18N
        BotaoGravar.addActionListener(listener);
        BotaoGravar.setActionCommand("gravar");
        BotaoCancelar.setText(bundle.getString("CadastroProduto.BotaoCancelar.text")); // NOI18N
        BotaoCancelar.addActionListener(listener);
        BotaoCancelar.setActionCommand("cancelar");
        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(BotaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        TXTCodigo.setEditable(false);
        TXTCodigo.setText(bundle.getString("CadastroProduto.TXTCodigo.text")); // NOI18N
        TXTCodigo.setEnabled(false);

        TXTNome.setText(bundle.getString("CadastroProduto.TXTNome.text")); // NOI18N

        TXTMarca.setText(bundle.getString("CadastroProduto.TXTMarca.text")); // NOI18N

        TXTModelo.setText(bundle.getString("CadastroProduto.TXTModelo.text")); // NOI18N

        javax.swing.GroupLayout PainelCamposdados1Layout = new javax.swing.GroupLayout(PainelCamposdados1);
        PainelCamposdados1.setLayout(PainelCamposdados1Layout);
        PainelCamposdados1Layout.setHorizontalGroup(
            PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TXTMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(TXTModelo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(TXTNome))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PainelCamposdados1Layout.setVerticalGroup(
            PainelCamposdados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados1Layout.createSequentialGroup()
                .addComponent(TXTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        LValorCusto.setText(bundle.getString("CadastroProduto.LValorCusto.text")); // NOI18N

        LValorUnitario.setText(bundle.getString("CadastroProduto.LValorUnitario.text")); // NOI18N

        LQuantidade.setText(bundle.getString("CadastroProduto.LQuantidade.text")); // NOI18N

        TXTValorCusto.setText(bundle.getString("CadastroProduto.TXTValorCusto.text")); // NOI18N

        TXTValorUnitario.setText(bundle.getString("CadastroProduto.TXTValorUnitario.text")); // NOI18N

        javax.swing.GroupLayout PainelCamposdados2Layout = new javax.swing.GroupLayout(PainelCamposdados2);
        PainelCamposdados2.setLayout(PainelCamposdados2Layout);
        PainelCamposdados2Layout.setHorizontalGroup(
            PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LValorCusto)
                    .addComponent(LValorUnitario)
                    .addComponent(LQuantidade))
                .addGap(40, 40, 40)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(TXTValorCusto))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PainelCamposdados2Layout.setVerticalGroup(
            PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCamposdados2Layout.createSequentialGroup()
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LValorCusto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LValorUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCamposdados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LQuantidade)
                    .addComponent(TXTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        LCodigo.setText(bundle.getString("CadastroProduto.LCodigo.text")); // NOI18N

        LNome.setText(bundle.getString("CadastroProduto.LNome.text")); // NOI18N

        LMarca.setText(bundle.getString("CadastroProduto.LMarca.text")); // NOI18N

        LModelo.setText(bundle.getString("CadastroProduto.LModelo.text")); // NOI18N

        LDescricao.setText(bundle.getString("CadastroProduto.LDescricao.text")); // NOI18N

        TXTDescricao.setColumns(20);
        TXTDescricao.setRows(5);
        PTXTDescricao.setViewportView(TXTDescricao);

        javax.swing.GroupLayout PainelCadastroProdutosLayout = new javax.swing.GroupLayout(PainelCadastroProdutos);
        PainelCadastroProdutos.setLayout(PainelCadastroProdutosLayout);
        PainelCadastroProdutosLayout.setHorizontalGroup(
            PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PTXTDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                        .addComponent(LDescricao)
                                        .addGap(227, 227, 227))
                                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                                        .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LCodigo)
                                            .addComponent(LNome)
                                            .addComponent(LMarca)
                                            .addComponent(LModelo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addComponent(PainelCamposdados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PainelCamposdados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))))
        );
        PainelCadastroProdutosLayout.setVerticalGroup(
            PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroProdutosLayout.createSequentialGroup()
                .addGroup(PainelCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelCadastroProdutosLayout.createSequentialGroup()
                        .addComponent(LCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LDescricao))
                    .addComponent(PainelCamposdados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelCamposdados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PTXTDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastroProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LDescricao;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LModelo;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LQuantidade;
    private javax.swing.JLabel LValorCusto;
    private javax.swing.JLabel LValorUnitario;
    private javax.swing.JScrollPane PTXTDescricao;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCadastroProdutos;
    private javax.swing.JPanel PainelCamposdados1;
    private javax.swing.JPanel PainelCamposdados2;
    private javax.swing.JTextField TXTCodigo;
    private javax.swing.JTextArea TXTDescricao;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTModelo;
    private javax.swing.JTextField TXTNome;
    private javax.swing.JSpinner TXTQuantidade;
    private javax.swing.JTextField TXTValorCusto;
    private javax.swing.JTextField TXTValorUnitario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the PTXTDescricao
     */
    public javax.swing.JScrollPane getPTXTDescricao() {
        return PTXTDescricao;
    }

    /**
     * @param PTXTDescricao the PTXTDescricao to set
     */
    public void setPTXTDescricao(javax.swing.JScrollPane PTXTDescricao) {
        this.PTXTDescricao = PTXTDescricao;
    }

    /**
     * @return the TXTCodigo
     */
    public javax.swing.JTextField getTXTCodigo() {
        return TXTCodigo;
    }

    /**
     * @param TXTCodigo the TXTCodigo to set
     */
    public void setTXTCodigo(javax.swing.JTextField TXTCodigo) {
        this.TXTCodigo = TXTCodigo;
    }


    /**
     * @return the TXTDescricao
     */
    public javax.swing.JTextArea getTXTDescricao() {
        return TXTDescricao;
    }

    /**
     * @param TXTDescricao the TXTDescricao to set
     */
    public void setTXTDescricao(javax.swing.JTextArea TXTDescricao) {
        this.TXTDescricao = TXTDescricao;
    }

    /**
     * @return the TXTMarca
     */
    public javax.swing.JTextField getTXTMarca() {
        return TXTMarca;
    }

    /**
     * @param TXTMarca the TXTMarca to set
     */
    public void setTXTMarca(javax.swing.JTextField TXTMarca) {
        this.TXTMarca = TXTMarca;
    }

    /**
     * @return the TXTModelo
     */
    public javax.swing.JTextField getTXTModelo() {
        return TXTModelo;
    }

    /**
     * @param TXTModelo the TXTModelo to set
     */
    public void setTXTModelo(javax.swing.JTextField TXTModelo) {
        this.TXTModelo = TXTModelo;
    }

    /**
     * @return the TXTNome
     */
    public javax.swing.JTextField getTXTNome() {
        return TXTNome;
    }

    /**
     * @param TXTNome the TXTNome to set
     */
    public void setTXTNome(javax.swing.JTextField TXTNome) {
        this.TXTNome = TXTNome;
    }

    /**
     * @return the TXTQuantidade
     */
    public javax.swing.JSpinner getTXTQuantidade() {
        return TXTQuantidade;
    }

    /**
     * @param TXTQuantidade the TXTQuantidade to set
     */
    public void setTXTQuantidade(javax.swing.JSpinner TXTQuantidade) {
        this.TXTQuantidade = TXTQuantidade;
    }

    /**
     * @return the TXTValorCusto
     */
    public javax.swing.JTextField getTXTValorCusto() {
        return TXTValorCusto;
    }

    /**
     * @param TXTValorCusto the TXTValorCusto to set
     */
    public void setTXTValorCusto(javax.swing.JTextField TXTValorCusto) {
        this.TXTValorCusto = TXTValorCusto;
    }

    /**
     * @return the TXTValorUnitario
     */
    public javax.swing.JTextField getTXTValorUnitario() {
        return TXTValorUnitario;
    }

    /**
     * @param TXTValorUnitario the TXTValorUnitario to set
     */
    public void setTXTValorUnitario(javax.swing.JTextField TXTValorUnitario) {
        this.TXTValorUnitario = TXTValorUnitario;
    }
}