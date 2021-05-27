package alphachamados;

import Comando.dados;
import ConexaoBD.Conexao;
import UTIL.ManipulaIMG;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frmAbrirChamados extends javax.swing.JFrame {

    Conexao cnx = new Conexao();

    BufferedImage imagem;
    int ar, i = 0;

    public frmAbrirChamados() {
        initComponents();
        cnx.conecta();

        new Thread() {
            public void run() {
                while (i < 101) {
                    try {
                        sleep(100);

                        try {
                            if (!cnx.conex.isClosed()) {
                                try {
                                    cnx.executaSQL("Select * From problemas Where nome_problema = '" + cbxProblema.getSelectedItem().toString() + "'");
                                    cnx.rs.first();
                                    String prio = cnx.rs.getString("prioridade");
                                    String sla = cnx.rs.getString("tempo_solucao");
                                    try {
                                        cnx.executaSQL("Select * From prioridades Where id_prioridade = " + prio);
                                        cnx.rs.first();
                                        txtPrioridade.setText(cnx.rs.getString("nome_prioridade"));

                                    } catch (Exception ex) {

                                    }
                                    try {
                                        cnx.executaSQL("Select * From tempo_solucoes Where id_tempo_solucao = " + sla);
                                        cnx.rs.first();
                                        txtSla.setText(cnx.rs.getString("tempo_solucao"));

                                    } catch (Exception ex) {

                                    }

                                } catch (Exception ex) {

                                }
                                if (i == 100) {
                                    i = 0;
                                }
                                i++;
                            }
                        } catch (Exception ex) {

                        }

                        //jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    

                }
            }
        }.start();

        listarEncaminhar();
        txtArea.setText("TI");
        listarProblema();
        listarUnidade();

        txtContato.setText(dados.getnome());

        setIcon();
    }

    public void listarProblema() {
        try {
            cnx.executaSQL("Select * from problemas");

            while (cnx.rs.next()) {
                cbxProblema.addItem(cnx.rs.getString("nome_problema"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    public void listarUnidade() {
        try {
            cnx.executaSQL("Select * from unidades");

            while (cnx.rs.next()) {
                cbxUnidade.addItem(cnx.rs.getString("nome_unidade"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    public void listarEncaminhar() {
        try {
            cnx.executaSQL("Select * from usuarios where nivel = 1 or nivel = 2");

            while (cnx.rs.next()) {
                cbxEncaminhar.addItem(cnx.rs.getString("nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbxUnidade = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cbxProblema = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtPrioridade = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtAgendarChamado = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cbxEncaminhar = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtRamal = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        txtSla = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(691, 795));
        setMinimumSize(new java.awt.Dimension(691, 795));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(691, 795));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187)));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbrir.setBackground(new java.awt.Color(0, 87, 187));
        btnAbrir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setBorder(null);
        btnAbrir.setBorderPainted(false);
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.setFocusPainted(false);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, 140, 50));

        jPanel2.setBackground(new java.awt.Color(0, 87, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abertura");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("de Chamados");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

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

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 40));

        btnClick.setBorderPainted(false);
        btnClick.setContentAreaFilled(false);
        btnClick.setFocusPainted(false);
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        jPanel2.add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, 100));

        jPanel3.setBackground(new java.awt.Color(0, 87, 187));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área Responsavel:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        jPanel3.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 620, 50));

        jPanel4.setBackground(new java.awt.Color(0, 87, 187));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Desc. problema:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txaDescricao.setColumns(20);
        txaDescricao.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txaDescricao.setLineWrap(true);
        txaDescricao.setRows(5);
        txaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jScrollPane2.setViewportView(txaDescricao);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 90));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 193, 620, 90));

        jPanel5.setBackground(new java.awt.Color(0, 87, 187));
        jPanel5.setName(""); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Unidade:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        cbxUnidade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        cbxUnidade.setFocusable(false);
        jPanel5.add(cbxUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 286, 620, 50));

        jPanel6.setBackground(new java.awt.Color(0, 87, 187));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contato:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        txtContato.setEditable(false);
        txtContato.setBackground(new java.awt.Color(255, 255, 255));
        txtContato.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });
        jPanel6.add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 339, 620, 50));

        jPanel7.setBackground(new java.awt.Color(0, 87, 187));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Problema:");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        cbxProblema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxProblema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        cbxProblema.setFocusable(false);
        cbxProblema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProblemaItemStateChanged(evt);
            }
        });
        cbxProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxProblemaMousePressed(evt);
            }
        });
        cbxProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProblemaActionPerformed(evt);
            }
        });
        jPanel7.add(cbxProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 392, 620, 50));

        jPanel8.setBackground(new java.awt.Color(0, 87, 187));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Prioridade:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        txtPrioridade.setEditable(false);
        txtPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        txtPrioridade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel8.add(txtPrioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 445, 620, 50));

        jPanel9.setBackground(new java.awt.Color(0, 87, 187));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Agendar:");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        txtAgendarChamado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAgendarChamado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel9.add(txtAgendarChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 552, 620, 50));

        jPanel11.setBackground(new java.awt.Color(0, 87, 187));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Encaminhar:");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        cbxEncaminhar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxEncaminhar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        cbxEncaminhar.setFocusable(false);
        jPanel11.add(cbxEncaminhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 620, 50));

        jPanel10.setBackground(new java.awt.Color(0, 87, 187));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ramal:");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        txtRamal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRamal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel10.add(txtRamal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 606, 620, 50));

        jPanel13.setBackground(new java.awt.Color(0, 87, 187));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSla.setEditable(false);
        txtSla.setBackground(new java.awt.Color(255, 255, 255));
        txtSla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 187), 2));
        jPanel13.add(txtSla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 50));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tempo de Solução:");
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 498, 620, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 795);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContatoActionPerformed

    }//GEN-LAST:event_txtContatoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try {
            String query = ("INSERT INTO chamados VALUES(null,?,?,?,?,?,?,?,?,?,CURDATE(),?,'1')"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query);

            try {
                cnx.executaSQL("Select id_area From area_responsavel Where nome_area = '" + txtArea.getText() + "'");
                cnx.rs.first();
                pst.setString(1, cnx.rs.getString("id_area"));
            } catch (Exception ex) {
            }
            pst.setString(2, txaDescricao.getText());
            try {
                cnx.executaSQL("Select * from unidades where nome_unidade = '" + cbxUnidade.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(3, cnx.rs.getString("id_unidade"));
            } catch (Exception ex) {

            }

            pst.setString(4, txtContato.getText());
            pst.setString(5, txtAgendarChamado.getText());

            try {
                cnx.executaSQL("Select * From problemas Where nome_problema = '" + cbxProblema.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(6, cnx.rs.getString("prioridade"));
            } catch (Exception ex) {
            }
            try {
                cnx.executaSQL("Select * From problemas Where nome_problema = '" + cbxProblema.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(7, cnx.rs.getString("id_problema"));
            } catch (Exception ex) {

            }
            pst.setString(8, txtRamal.getText());
            try {
                cnx.executaSQL("Select * from Usuarios where nome = '" + cbxEncaminhar.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(9, cnx.rs.getString("nivel"));
            } catch (Exception ex) {
            }
            try{
                cnx.executaSQL("select * from tempo_solucoes where tempo_solucao = '"+txtSla.getText()+"'");
                cnx.rs.first();
                pst.setString(10, cnx.rs.getString("id_tempo_solucao"));
            }catch(Exception ex){
                
            }

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();
            i = 101;
            cnx.conex.close();



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jPanel12.setBackground(new Color(255, 0, 51));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jPanel12.setBackground(new Color(0, 87, 187));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void cbxProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProblemaActionPerformed

    }//GEN-LAST:event_cbxProblemaActionPerformed

    private void cbxProblemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxProblemaMousePressed

    }//GEN-LAST:event_cbxProblemaMousePressed

    private void cbxProblemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProblemaItemStateChanged


    }//GEN-LAST:event_cbxProblemaItemStateChanged

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed

    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(frmAbrirChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAbrirChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAbrirChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAbrirChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbrirChamados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    public javax.swing.JButton btnClick;
    private javax.swing.JComboBox<String> cbxEncaminhar;
    private javax.swing.JComboBox<String> cbxProblema;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtAgendarChamado;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtRamal;
    private javax.swing.JTextField txtSla;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/alpha.png")));
    }
}
