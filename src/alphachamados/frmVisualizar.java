package alphachamados;

import Comando.pegartab;
import ConexaoBD.Conexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import alphachamados.frmPrincipal;

public class frmVisualizar extends javax.swing.JFrame {

    Conexao cnx = new Conexao();

    public frmVisualizar() {
        initComponents();
        cnx.conecta();

        btnFinalizar.setVisible(false);
        jLabel2.setVisible(false);

        if (!pegartab.getcst().equals("Pendente")) {
            btnFinalizar.setVisible(false);
            jLabel2.setVisible(true);
        } else {
            btnFinalizar.setVisible(true);
            jLabel2.setVisible(false);
        }

        try {
            cnx.executaSQL("SELECT \n"
                    + "	c.id_chamado as 'ID',\n"
                    + "	s.nome_situacao as 'Situacao',\n"
                    + "	p.nome_problema as 'Problema',\n"
                    + "	u.nome_unidade as 'Unidade',\n"
                    + "	c.ramal as Ramal,\n"
                    + "	c.nome_contato as 'Contato',\n"
                    + "	us.nome as 'Encaminhar',\n"
                    + "	c.data_abertura as 'Abertura',\n"
                    + "	pr.nome_prioridade as 'Prioridade',\n"
                    + "	c.data_agendar as 'Agendamento',\n"
                    + "	ts.tempo_numero as 'SLA',\n"
                    + "	c.desc_problema as 'Descrição'\n"
                    + "\n"
                    + "	from chamados c\n"
                    + "\n"
                    + "	inner join situacoes s on c.situacao_chamado = s.id_situacao\n"
                    + "	inner join problemas p on c.tipo_problema = p.id_problema\n"
                    + "	inner join unidades u on c.unidade = u.id_unidade \n"
                    + "	inner join usuarios us on c.encaminhar = us.id_usuario\n"
                    + "	inner join prioridades pr on c.prioridade = pr.id_prioridade\n"
                    + "	inner join tempo_solucoes ts on c.tempo_solucao = ts.id_tempo_solucao where id_chamado = " + pegartab.getcid());

            cnx.rs.first();
            txtId.setText(txtId.getText() + " " + (cnx.rs.getString("ID")));
            txtStatus.setText(txtStatus.getText() + " " + (cnx.rs.getString("Situacao")));
            //txtArea.setText(txtArea.getText() + " " + (cnx.rs.getString("Area")));
            txtProblema.setText(txtProblema.getText() + " " + (cnx.rs.getString("Problema")));
            txtUnidade.setText(txtUnidade.getText() + " " + (cnx.rs.getString("Unidade")));
            txtRamal.setText(txtRamal.getText() + " " + (cnx.rs.getString("Ramal")));
            txtContato.setText(txtContato.getText() + " " + (cnx.rs.getString("Contato")));
            txtEncam.setText(txtEncam.getText() + " " + (cnx.rs.getString("Encaminhar")));
            txtAbertura.setText(txtAbertura.getText() + " " + (cnx.rs.getString("Abertura")));
            txtPrioridade.setText(txtPrioridade.getText() + " " + (cnx.rs.getString("Prioridade")));
            txtAgendar.setText(txtAgendar.getText() + " " + (cnx.rs.getString("Agendamento")));
            txtSla.setText(txtSla.getText() + " " + (cnx.rs.getString("SLA")));
            txtDesc.setText(txtDesc.getText() + " " + (cnx.rs.getString("Descrição")));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRamal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        txtAbertura = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        txtSla = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        txtEncam = new javax.swing.JTextField();
        txtAgendar = new javax.swing.JTextField();
        txtProblema = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(510, 760));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRamal.setEditable(false);
        txtRamal.setBackground(new java.awt.Color(255, 255, 255));
        txtRamal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRamal.setForeground(new java.awt.Color(0, 87, 187));
        txtRamal.setText("  Ramal:");
        txtRamal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtRamal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamalActionPerformed(evt);
            }
        });
        jPanel1.add(txtRamal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, 40));

        jPanel2.setBackground(new java.awt.Color(0, 87, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 87, 187));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visualizador");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("de Chamados");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 510, 100));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 87, 187));
        txtId.setText("  ID:");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 40));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 87, 187));
        txtStatus.setText("  Status:");
        txtStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 340, 40));

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtArea.setForeground(new java.awt.Color(0, 87, 187));
        txtArea.setText("  Área responsavel:");
        txtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 450, 40));

        txtPrioridade.setEditable(false);
        txtPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        txtPrioridade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPrioridade.setForeground(new java.awt.Color(0, 87, 187));
        txtPrioridade.setText("  Prioridade:");
        txtPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrioridadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 450, 40));

        txtAbertura.setEditable(false);
        txtAbertura.setBackground(new java.awt.Color(255, 255, 255));
        txtAbertura.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAbertura.setForeground(new java.awt.Color(0, 87, 187));
        txtAbertura.setText("   ");
        txtAbertura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAberturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtAbertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 220, 40));

        txtUnidade.setEditable(false);
        txtUnidade.setBackground(new java.awt.Color(255, 255, 255));
        txtUnidade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUnidade.setForeground(new java.awt.Color(0, 87, 187));
        txtUnidade.setText("  Unidade:");
        txtUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 450, 40));

        txtSla.setEditable(false);
        txtSla.setBackground(new java.awt.Color(255, 255, 255));
        txtSla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSla.setForeground(new java.awt.Color(0, 87, 187));
        txtSla.setText("   SLA:");
        txtSla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtSla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 220, 40));

        txtContato.setEditable(false);
        txtContato.setBackground(new java.awt.Color(255, 255, 255));
        txtContato.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContato.setForeground(new java.awt.Color(0, 87, 187));
        txtContato.setText("  Contato:");
        txtContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });
        jPanel1.add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 450, 40));

        txtEncam.setEditable(false);
        txtEncam.setBackground(new java.awt.Color(255, 255, 255));
        txtEncam.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEncam.setForeground(new java.awt.Color(0, 87, 187));
        txtEncam.setText("  Encaminhar:");
        txtEncam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtEncam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncamActionPerformed(evt);
            }
        });
        jPanel1.add(txtEncam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 450, 40));

        txtAgendar.setEditable(false);
        txtAgendar.setBackground(new java.awt.Color(255, 255, 255));
        txtAgendar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAgendar.setForeground(new java.awt.Color(0, 87, 187));
        txtAgendar.setText("  Agendado:");
        txtAgendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 220, 40));

        txtProblema.setEditable(false);
        txtProblema.setBackground(new java.awt.Color(255, 255, 255));
        txtProblema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtProblema.setForeground(new java.awt.Color(0, 87, 187));
        txtProblema.setText("  Tipo do Problema:");
        txtProblema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProblemaActionPerformed(evt);
            }
        });
        jPanel1.add(txtProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 40));

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDesc.setForeground(new java.awt.Color(0, 87, 187));
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setText("  Descrição:");
        txtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jScrollPane2.setViewportView(txtDesc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 450, 130));

        btnFinalizar.setBackground(new java.awt.Color(0, 87, 187));
        btnFinalizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorder(null);
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setFocusPainted(false);
        btnFinalizar.setFocusable(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 780, 180, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 87, 187));
        jLabel2.setText("Chamado Finalizado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 790, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRamalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamalActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrioridadeActionPerformed

    private void txtAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAberturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAberturaActionPerformed

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void txtSlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlaActionPerformed

    private void txtContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContatoActionPerformed

    private void txtEncamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncamActionPerformed

    private void txtAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgendarActionPerformed

    private void txtProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProblemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProblemaActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jPanel12.setBackground(new Color(255, 0, 51));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jPanel12.setBackground(new Color(0, 87, 187));
    }//GEN-LAST:event_jLabel4MouseExited


    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            PreparedStatement pst = cnx.conex.prepareStatement("UPDATE chamados SET situacao_chamado = 2 WHERE id_chamado = " + pegartab.getcid());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Chamado finalizado com sucesso!");

            cnx.conex.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }

        frmPrincipal frmp = new frmPrincipal();
        frmp.btnClick.doClick();

        this.dispose();

    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVisualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAbertura;
    private javax.swing.JTextField txtAgendar;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtEncam;
    public javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtProblema;
    private javax.swing.JTextField txtRamal;
    private javax.swing.JTextField txtSla;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
