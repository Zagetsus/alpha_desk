package alphachamados;

import Comando.dados;
import Comando.pegartab;
import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author 53264508X
 */
public class frmCadastroUsuario extends javax.swing.JFrame {

    Conexao cnx = new Conexao();

    public frmCadastroUsuario() {
        initComponents();
        cnx.conecta();
        status.setVisible(false);
        listarArea();
        listarNivel();

        btnAlterar.setVisible(false);

        if (pegartab.getal() == true) {
            jPanel11.setVisible(false);
            jPanel13.setVisible(false);
            btnCadastrar.setVisible(false);
            btnAlterar.setVisible(true);
            try {
                cnx.executaSQL("Select * From usuarios Where id_usuario = " + pegartab.getidU());

                cnx.rs.first();
                txtNome.setText(cnx.rs.getString("nome"));
                txtLogin.setText(cnx.rs.getString("login_usuario"));
                txtEmail.setText(cnx.rs.getString("email"));
                txtTelefone.setText(cnx.rs.getString("telefone"));
                try {
                    cnx.executaSQL("Select area from usuarios where id_usuario = " + pegartab.getidU());
                    cnx.rs.first();
                    String uni = cnx.rs.getString("area");
                    try {
                        cnx.executaSQL("Select nome_unidade from unidades where id_unidade = " + uni);
                        cnx.rs.first();
                        cbxArea.setSelectedItem(cnx.rs.getString("nome_unidade"));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Errrror: " + ex);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Errrror: " + ex);
                }
                try {
                    cnx.executaSQL("Select nivel from usuarios where id_usuario = " + pegartab.getidU());
                    cnx.rs.first();
                    String ni = cnx.rs.getString("nivel");
                    try {
                        cnx.executaSQL("Select nome_nivel from nivel where id_nivel = " + ni);
                        cnx.rs.first();
                        cbxNivel.setSelectedItem(cnx.rs.getString("nome_nivel"));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Errrror: " + ex);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Errrror: " + ex);
                }

            } catch (Exception ex) {

            }
        }
    }

    public void listarArea() {
        try {
            cnx.executaSQL("Select * from unidades order by id_unidade");

            while (cnx.rs.next()) {
                cbxArea.addItem(cnx.rs.getString("nome_unidade"));
            }
            cbxArea.setSelectedItem(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    public void listarNivel() {
        try {
            cnx.executaSQL("Select * from nivel order by id_nivel");

            while (cnx.rs.next()) {
                cbxNivel.addItem(cnx.rs.getString("nome_nivel"));
            }
            cbxNivel.setSelectedItem(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbxArea = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cbxNivel = new javax.swing.JComboBox<>();
        status = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pswSenhaC = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuario");
        setMaximumSize(new java.awt.Dimension(471, 786));
        setMinimumSize(new java.awt.Dimension(471, 786));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(471, 786));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterar.setBackground(new java.awt.Color(0, 87, 187));
        btnAlterar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(null);
        btnAlterar.setBorderPainted(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusPainted(false);
        btnAlterar.setFocusable(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 720, 180, 40));

        btnCadastrar.setBackground(new java.awt.Color(0, 87, 187));
        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 720, 180, 40));

        jPanel2.setBackground(new java.awt.Color(0, 87, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 87, 187));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 140, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, 150));

        jPanel5.setBackground(new java.awt.Color(0, 87, 187));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 87, 187));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel5.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 430, 40));

        jPanel6.setBackground(new java.awt.Color(0, 87, 187));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Login:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        txtLogin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(0, 87, 187));
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel6.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 430, 40));

        jPanel7.setBackground(new java.awt.Color(0, 87, 187));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 87, 187));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel7.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("E-mail:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 430, 40));

        jPanel8.setBackground(new java.awt.Color(0, 87, 187));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 87, 187));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        jPanel8.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefone:");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 430, 40));

        jPanel9.setBackground(new java.awt.Color(0, 87, 187));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Área:");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        cbxArea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxArea.setForeground(new java.awt.Color(0, 87, 187));
        cbxArea.setSelectedItem(null);
        cbxArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        cbxArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(cbxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 430, 40));

        jPanel11.setBackground(new java.awt.Color(0, 87, 187));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Senha:");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        pswSenha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(0, 87, 187));
        pswSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel11.add(pswSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 430, 40));

        jPanel10.setBackground(new java.awt.Color(0, 87, 187));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nível:");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        cbxNivel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxNivel.setForeground(new java.awt.Color(0, 87, 187));
        cbxNivel.setSelectedItem(null);
        cbxNivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel10.add(cbxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 430, 40));

        status.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        status.setForeground(new java.awt.Color(0, 87, 187));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("jLabel3");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 680, 410, -1));

        jPanel13.setBackground(new java.awt.Color(0, 87, 187));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirmar:");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        pswSenhaC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pswSenhaC.setForeground(new java.awt.Color(0, 87, 187));
        pswSenhaC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel13.add(pswSenhaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 430, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 470, 785);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
            if (txtNome.getText().equals("") || txtEmail.getText().equals("") || txtTelefone.getText().equals("")
                    || pswSenha.getText().equals("") || cbxArea.getSelectedItem().equals(null) || cbxNivel.getSelectedItem().equals(null)) {
                status.setVisible(true);
                status.setText("Campos vázios");
            } else {
                if (!pswSenha.getText().equals(pswSenhaC.getText())) {
                    status.setVisible(true);
                    status.setText("A senha não bate");
                } else {
                    status.setVisible(false);

                    String query = ("INSERT INTO Usuarios VALUES(null,?,?,?,?,?,?,?,CURDATE(),CURDATE())"); //Comando de inserir dados
                    PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
                    pst.setString(1, txtNome.getText());
                    pst.setString(2, txtLogin.getText());
                    pst.setString(3, txtEmail.getText());
                    pst.setString(4, txtTelefone.getText());
                    try {
                        cnx.executaSQL("Select * from unidades Where nome_unidade = '" + cbxArea.getSelectedItem().toString() + "'");
                        cnx.rs.first();
                        pst.setString(5, cnx.rs.getString("id_unidade"));
                    } catch (Exception ex) {

                    }
                    try {
                        cnx.executaSQL("Select * from nivel Where nome_nivel = '" + cbxNivel.getSelectedItem().toString() + "'");
                        cnx.rs.first();
                        pst.setString(6, cnx.rs.getString("id_nivel"));
                    } catch (Exception ex) {

                    }
                    pst.setString(7, pswSenha.getText());

                    txtNome.setText("");
                    txtLogin.setText("");
                    txtEmail.setText("");
                    txtTelefone.setText("");
                    cbxArea.setSelectedItem(null);
                    cbxNivel.setSelectedItem(null);
                    pswSenha.setText("");
                    pswSenhaC.setText("");

                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                    pst.executeUpdate();
                    pst.close();
                    cnx.conex.close();
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jPanel12.setBackground(new Color(255, 0, 51));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jPanel12.setBackground(new Color(0, 87, 187));
    }//GEN-LAST:event_jLabel9MouseExited

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked

    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {

            String query = ("UPDATE usuarios SET nome = ?, login_usuario = ?, email = ?, telefone= ?, area = ?, nivel = ? WHERE id_usuario = " + pegartab.getidU()); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtLogin.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, txtTelefone.getText());
            try {
                cnx.executaSQL("Select * from unidades Where nome_unidade = '" + cbxArea.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(5, cnx.rs.getString("id_unidade"));
            } catch (Exception ex) {

            }
            try {
                cnx.executaSQL("Select * from nivel Where nome_nivel = '" + cbxNivel.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(6, cnx.rs.getString("id_nivel"));
            } catch (Exception ex) {

            }

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            pst.executeUpdate();
            pst.close();
            cnx.conex.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
       String numeros = "1234567890";
        if(!numeros.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxNivel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JPasswordField pswSenhaC;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
