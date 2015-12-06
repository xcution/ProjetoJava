
package telas.jinternalframe;
import listener.AlteraUsuarioListener;

public class AlteraUsuario extends javax.swing.JInternalFrame {
    private AlteraUsuarioListener listener = new AlteraUsuarioListener(this);
    /**
     * Creates new form LojaCadastroUsuario
     */
    public AlteraUsuario() {
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

        PainelCadastroUsuario = new javax.swing.JPanel();
        PainelDados = new javax.swing.JPanel();
        LNome = new javax.swing.JLabel();
        LSenha = new javax.swing.JLabel();
        LRSenha = new javax.swing.JLabel();
        TXTUsuario = new javax.swing.JTextField();
        TXTSenha = new javax.swing.JPasswordField();
        TXTRSenha = new javax.swing.JPasswordField();
        LEmail = new javax.swing.JLabel();
        TXTEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LNome1 = new javax.swing.JLabel();
        LSobrenome = new javax.swing.JLabel();
        LCPF = new javax.swing.JLabel();
        LRG = new javax.swing.JLabel();
        TXTNome = new javax.swing.JTextField();
        TXTSobrenome = new javax.swing.JTextField();
        TXTCPF = new javax.swing.JTextField();
        TXTRG = new javax.swing.JTextField();
        PainelBotoes = new javax.swing.JPanel();
        BotaoGravar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        PainelLocalizarUsuario = new javax.swing.JPanel();
        LSenhaAtual = new javax.swing.JLabel();
        TXTUsuarioBusca = new javax.swing.JTextField();
        TXTSenhaAtual = new javax.swing.JPasswordField();
        BotaoLocalizar = new javax.swing.JButton();
        CBOpcao = new javax.swing.JComboBox<>();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("telas/jinternalframe/Bundle"); // NOI18N
        PainelCadastroUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("AlteraUsuario.PainelCadastroUsuario.border.title"))); // NOI18N

        LNome.setText(bundle.getString("AlteraUsuario.LNome.text")); // NOI18N

        LSenha.setText(bundle.getString("AlteraUsuario.LSenha.text")); // NOI18N

        LRSenha.setText(bundle.getString("AlteraUsuario.LRSenha.text")); // NOI18N

        TXTUsuario.setText(bundle.getString("AlteraUsuario.TXTUsuario.text")); // NOI18N

        TXTSenha.setText(bundle.getString("AlteraUsuario.TXTSenha.text")); // NOI18N

        TXTRSenha.setText(bundle.getString("AlteraUsuario.TXTRSenha.text")); // NOI18N

        LEmail.setText(bundle.getString("AlteraUsuario.LEmail.text")); // NOI18N

        TXTEmail.setText(bundle.getString("AlteraUsuario.TXTEmail.text")); // NOI18N

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNome)
                    .addComponent(LEmail)
                    .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LRSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LSenha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TXTUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(TXTSenha)
                        .addComponent(TXTRSenha)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(LNome)
                        .addGap(18, 18, 18)
                        .addComponent(LSenha))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(TXTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTRSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LRSenha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LEmail)
                    .addComponent(TXTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        LNome1.setText(bundle.getString("AlteraUsuario.LNome1.text")); // NOI18N

        LSobrenome.setText(bundle.getString("AlteraUsuario.LSobrenome.text")); // NOI18N

        LCPF.setText(bundle.getString("AlteraUsuario.LCPF.text")); // NOI18N

        LRG.setText(bundle.getString("AlteraUsuario.LRG.text")); // NOI18N

        TXTNome.setText(bundle.getString("AlteraUsuario.TXTNome.text")); // NOI18N

        TXTSobrenome.setText(bundle.getString("AlteraUsuario.TXTSobrenome.text")); // NOI18N

        TXTCPF.setText(bundle.getString("AlteraUsuario.TXTCPF.text")); // NOI18N

        TXTRG.setText(bundle.getString("AlteraUsuario.TXTRG.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LNome1)
                        .addGap(86, 86, 86)
                        .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNome1)
                    .addComponent(TXTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LSobrenome)
                    .addComponent(TXTSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LCPF)
                    .addComponent(TXTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LRG)
                    .addComponent(TXTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCadastroUsuarioLayout = new javax.swing.GroupLayout(PainelCadastroUsuario);
        PainelCadastroUsuario.setLayout(PainelCadastroUsuarioLayout);
        PainelCadastroUsuarioLayout.setHorizontalGroup(
            PainelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCadastroUsuarioLayout.setVerticalGroup(
            PainelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BotaoGravar.setText(bundle.getString("AlteraUsuario.BotaoGravar.text")); // NOI18N
        BotaoGravar.addActionListener(listener);
        BotaoGravar.setActionCommand("gravar");
        BotaoExcluir.setText(bundle.getString("AlteraUsuario.BotaoExcluir.text")); // NOI18N
        BotaoExcluir.addActionListener(listener);
        BotaoExcluir.setActionCommand("excluir");
        BotaoCancelar.setText(bundle.getString("AlteraUsuario.BotaoCancelar.text")); // NOI18N
        BotaoCancelar.addActionListener(listener);
        BotaoCancelar.setActionCommand("cancelar");

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);

        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(BotaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGravar)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelLocalizarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("AlteraUsuario.PainelLocalizarUsuario.border.title"))); // NOI18N

        LSenhaAtual.setText(bundle.getString("AlteraUsuario.LSenhaAtual.text")); // NOI18N

        TXTUsuarioBusca.setText(bundle.getString("AlteraUsuario.TXTUsuarioBusca.text")); // NOI18N

        TXTSenhaAtual.setText(bundle.getString("AlteraUsuario.TXTSenhaAtual.text")); // NOI18N

        BotaoLocalizar.setText(bundle.getString("AlteraUsuario.BotaoLocalizar.text")); // NOI18N
        BotaoLocalizar.addActionListener(listener);
        BotaoLocalizar.setActionCommand("localizar");
        CBOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Email" }));

        javax.swing.GroupLayout PainelLocalizarUsuarioLayout = new javax.swing.GroupLayout(PainelLocalizarUsuario);
        PainelLocalizarUsuario.setLayout(PainelLocalizarUsuarioLayout);
        PainelLocalizarUsuarioLayout.setHorizontalGroup(
            PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLocalizarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LSenhaAtual)
                    .addComponent(CBOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTUsuarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoLocalizar)
                .addGap(33, 33, 33))
        );
        PainelLocalizarUsuarioLayout.setVerticalGroup(
            PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLocalizarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTUsuarioBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoLocalizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLocalizarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSenhaAtual)
                    .addComponent(TXTSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelLocalizarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLocalizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JButton BotaoLocalizar;
    private javax.swing.JComboBox<String> CBOpcao;
    private javax.swing.JLabel LCPF;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LNome1;
    private javax.swing.JLabel LRG;
    private javax.swing.JLabel LRSenha;
    private javax.swing.JLabel LSenha;
    private javax.swing.JLabel LSenhaAtual;
    private javax.swing.JLabel LSobrenome;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCadastroUsuario;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JPanel PainelLocalizarUsuario;
    private javax.swing.JTextField TXTCPF;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTNome;
    private javax.swing.JTextField TXTRG;
    private javax.swing.JPasswordField TXTRSenha;
    private javax.swing.JPasswordField TXTSenha;
    private javax.swing.JPasswordField TXTSenhaAtual;
    private javax.swing.JTextField TXTSobrenome;
    private javax.swing.JTextField TXTUsuario;
    private javax.swing.JTextField TXTUsuarioBusca;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the TXTCPF
     */
    public javax.swing.JTextField getTXTCPF() {
        return TXTCPF;
    }

    /**
     * @param TXTCPF the TXTCPF to set
     */
    public void setTXTCPF(javax.swing.JTextField TXTCPF) {
        this.TXTCPF = TXTCPF;
    }

    /**
     * @return the TXTEmail
     */
    public javax.swing.JTextField getTXTEmail() {
        return TXTEmail;
    }

    /**
     * @param TXTEmail the TXTEmail to set
     */
    public void setTXTEmail(javax.swing.JTextField TXTEmail) {
        this.TXTEmail = TXTEmail;
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
     * @return the TXTRG
     */
    public javax.swing.JTextField getTXTRG() {
        return TXTRG;
    }

    /**
     * @param TXTRG the TXTRG to set
     */
    public void setTXTRG(javax.swing.JTextField TXTRG) {
        this.TXTRG = TXTRG;
    }

    /**
     * @return the TXTRSenha
     */
    public javax.swing.JPasswordField getTXTRSenha() {
        return TXTRSenha;
    }

    /**
     * @param TXTRSenha the TXTRSenha to set
     */
    public void setTXTRSenha(javax.swing.JPasswordField TXTRSenha) {
        this.TXTRSenha = TXTRSenha;
    }

    /**
     * @return the TXTSenha
     */
    public javax.swing.JPasswordField getTXTSenha() {
        return TXTSenha;
    }

    /**
     * @param TXTSenha the TXTSenha to set
     */
    public void setTXTSenha(javax.swing.JPasswordField TXTSenha) {
        this.TXTSenha = TXTSenha;
    }

    /**
     * @return the TXTSenhaAtual
     */
    public javax.swing.JPasswordField getTXTSenhaAtual() {
        return TXTSenhaAtual;
    }

    /**
     * @param TXTSenhaAtual the TXTSenhaAtual to set
     */
    public void setTXTSenhaAtual(javax.swing.JPasswordField TXTSenhaAtual) {
        this.TXTSenhaAtual = TXTSenhaAtual;
    }

    /**
     * @return the TXTSobrenome
     */
    public javax.swing.JTextField getTXTSobrenome() {
        return TXTSobrenome;
    }

    /**
     * @param TXTSobrenome the TXTSobrenome to set
     */
    public void setTXTSobrenome(javax.swing.JTextField TXTSobrenome) {
        this.TXTSobrenome = TXTSobrenome;
    }

    /**
     * @return the TXTUsuario
     */
    public javax.swing.JTextField getTXTUsuario() {
        return TXTUsuario;
    }

    /**
     * @param TXTUsuario the TXTUsuario to set
     */
    public void setTXTUsuario(javax.swing.JTextField TXTUsuario) {
        this.TXTUsuario = TXTUsuario;
    }

    /**
     * @return the TXTUsuarioBusca
     */
    public javax.swing.JTextField getTXTUsuarioBusca() {
        return TXTUsuarioBusca;
    }

    /**
     * @param TXTUsuarioBusca the TXTUsuarioBusca to set
     */
    public void setTXTUsuarioBusca(javax.swing.JTextField TXTUsuarioBusca) {
        this.TXTUsuarioBusca = TXTUsuarioBusca;
    }
}
