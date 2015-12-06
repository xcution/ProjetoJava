
package telas.jinternalframe;
import listener.ConsultaVendasListener;

public class ConsultaVendas extends javax.swing.JInternalFrame {
    private ConsultaVendasListener listener = new ConsultaVendasListener(this);
    /**
     * Creates new form LojaConsultaVendas
     */
    public ConsultaVendas() {
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

        PainelConsultaVendas = new javax.swing.JPanel();
        PainelBotoes = new javax.swing.JPanel();
        BotaoAlterar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        SPTabela = new javax.swing.JScrollPane();
        TabelaResultado = new javax.swing.JTable();
        TXTCodigo = new javax.swing.JCheckBox();
        TXTNome = new javax.swing.JCheckBox();
        TXTSobrenome = new javax.swing.JCheckBox();
        TXTData = new javax.swing.JCheckBox();
        TXTConsuta = new javax.swing.JTextField();
        BotaoConsultar = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("telas/jinternalframe/Bundle"); // NOI18N
        PainelConsultaVendas.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ConsultaVendas.PainelConsultaVendas.border.title"))); // NOI18N

        BotaoAlterar.setText(bundle.getString("ConsultaVendas.BotaoAlterar.text")); // NOI18N
        BotaoAlterar.addActionListener(listener);
        BotaoAlterar.setActionCommand("alterar");
        BotaoCancelar.setText(bundle.getString("ConsultaVendas.BotaoCancelar.text")); // NOI18N
        BotaoCancelar.addActionListener(listener);
        BotaoCancelar.setActionCommand("cancelar");
        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotoesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        TabelaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sobrenome", "CPF", "RG", "Data ", "Hora ", "Valor Total"
            }
        ));
        SPTabela.setViewportView(TabelaResultado);
        if (TabelaResultado.getColumnModel().getColumnCount() > 0) {
            TabelaResultado.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title0")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title1")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title2")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title3")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title4")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title5")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(6).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title6")); // NOI18N
            TabelaResultado.getColumnModel().getColumn(7).setHeaderValue(bundle.getString("ConsultaVendas.TabelaResultado.columnModel.title7")); // NOI18N
        }

        TXTCodigo.setText(bundle.getString("ConsultaVendas.TXTCodigo.text")); // NOI18N

        TXTNome.setText(bundle.getString("ConsultaVendas.TXTNome.text")); // NOI18N

        TXTSobrenome.setText(bundle.getString("ConsultaVendas.TXTSobrenome.text")); // NOI18N

        TXTData.setText(bundle.getString("ConsultaVendas.TXTData.text")); // NOI18N

        TXTConsuta.setText(bundle.getString("ConsultaVendas.TXTConsuta.text")); // NOI18N

        BotaoConsultar.setText(bundle.getString("ConsultaVendas.BotaoConsultar.text")); // NOI18N
        BotaoConsultar.addActionListener(listener);
        BotaoConsultar.setActionCommand("consultar");
        javax.swing.GroupLayout PainelConsultaVendasLayout = new javax.swing.GroupLayout(PainelConsultaVendas);
        PainelConsultaVendas.setLayout(PainelConsultaVendasLayout);
        PainelConsultaVendasLayout.setHorizontalGroup(
            PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                        .addComponent(TXTCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(TXTNome)
                        .addGap(18, 18, 18)
                        .addComponent(TXTSobrenome)
                        .addGap(18, 18, 18)
                        .addComponent(TXTData)
                        .addGap(18, 18, 18)
                        .addComponent(TXTConsuta, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SPTabela))
                .addContainerGap())
            .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelConsultaVendasLayout.setVerticalGroup(
            PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConsultaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTCodigo)
                    .addComponent(TXTNome)
                    .addComponent(TXTSobrenome)
                    .addComponent(TXTData)
                    .addComponent(TXTConsuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelConsultaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelConsultaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoConsultar;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelConsultaVendas;
    private javax.swing.JScrollPane SPTabela;
    private javax.swing.JCheckBox TXTCodigo;
    private javax.swing.JTextField TXTConsuta;
    private javax.swing.JCheckBox TXTData;
    private javax.swing.JCheckBox TXTNome;
    private javax.swing.JCheckBox TXTSobrenome;
    private javax.swing.JTable TabelaResultado;
    // End of variables declaration//GEN-END:variables
}