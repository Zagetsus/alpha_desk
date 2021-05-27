package alphachamados;

import Comando.dados;
import Comando.pegartab;
import ConexaoBD.Conexao;
import ConexaoBD.MostrarTabela;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.Document;

/**
 *
 * @author Proativa
 */
public class frmPrincipal extends javax.swing.JFrame {

    Conexao cnx = new Conexao();
    int opc = 0, mural = 1;
    public int i;
    String cid, cst;

    public frmPrincipal() {
        initComponents();

       btnClick.doClick();

        //btnClick.doClick();
        cnx.conecta();
        setIcon();

        lblUsuario.setText(dados.getnome());

        listarPrioridades();
        listarSla();

        //Inicializar o Form Maximizado//
        setExtendedState(MAXIMIZED_BOTH);

        //Deixa o Painel com visibilidade falsa para não dar conflito entre os paineis// 
        pnlChamados.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlConfOpc.setVisible(false);
        pnlMural.setVisible(false);

        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);

        

    }

    public void listarPrioridades() {
        try {

            cnx.executaSQL("Select * from Prioridades");

            while (cnx.rs.next()) {
                cbxPrioridade.addItem(cnx.rs.getString("nome_prioridade"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    public void listarSla() {
        try {
            cnx.executaSQL("Select * from Tempo_Solucoes");

            while (cnx.rs.next()) {
                cbxSla.addItem(cnx.rs.getString("tempo_solucao"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnpChamados = new javax.swing.JPopupMenu();
        menuVisualizar = new javax.swing.JMenuItem();
        mnpUsuario = new javax.swing.JPopupMenu();
        mniVisualizar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniAlterar = new javax.swing.JMenuItem();
        mniExcluir = new javax.swing.JMenuItem();
        pnlMenu = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnChamados = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnConfig = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        pnlConfOpc = new javax.swing.JPanel();
        btnMural = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPrioridades = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnProblema = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSetor = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtAviso = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAvisoDesc = new javax.swing.JTextArea();
        pnlChamados = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnSolucionados = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnPendentes = new javax.swing.JButton();
        btnTodos1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pnlUsuarios = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        pnlRelatorio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlMural = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTituloAviso = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescAviso = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        pnlProblema = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        cbxPrioridade = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        cbxSla = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        txtDescProblema = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtProblema = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        pnlSetor = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtSetor = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        pnlSla = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtNomeSla = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        txtSla = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        pnlPrioridades = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtPrioridade = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();

        menuVisualizar.setText("Visualizar");
        menuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarActionPerformed(evt);
            }
        });
        mnpChamados.add(menuVisualizar);

        mnpUsuario.setBackground(new java.awt.Color(255, 255, 255));

        mniVisualizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mniVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-pesquisar.png"))); // NOI18N
        mniVisualizar.setText("Visualizar");
        mniVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mniVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mniVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVisualizarActionPerformed(evt);
            }
        });
        mnpUsuario.add(mniVisualizar);

        jSeparator4.setForeground(new java.awt.Color(0, 87, 187));
        mnpUsuario.add(jSeparator4);

        mniAlterar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mniAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-alterar.png"))); // NOI18N
        mniAlterar.setText("Alterar");
        mniAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlterarActionPerformed(evt);
            }
        });
        mnpUsuario.add(mniAlterar);

        mniExcluir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mniExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-excluir.png"))); // NOI18N
        mniExcluir.setText("Excluir");
        mniExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mniExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExcluirActionPerformed(evt);
            }
        });
        mnpUsuario.add(mniExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 228, 228)));
        pnlMenu.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoPequeno.png"))); // NOI18N
        pnlMenu.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 340, 150));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/administrator.png"))); // NOI18N
        pnlMenu.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 180));

        btnSair.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(153, 153, 153));
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        pnlMenu.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 40, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 300, 10));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 10));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 10));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 300, 10));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        pnlMenu.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 300, 10));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu-home.png"))); // NOI18N
        jLabel13.setText(" Inicio");
        btnInicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        pnlMenu.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 299, 60));

        btnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });
        btnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu-usuario.png"))); // NOI18N
        jLabel14.setText(" Usuários");
        btnUsuario.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        pnlMenu.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 299, 60));

        btnChamados.setBackground(new java.awt.Color(255, 255, 255));
        btnChamados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChamadosMouseClicked(evt);
            }
        });
        btnChamados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu-chamados.png"))); // NOI18N
        jLabel15.setText(" Chamados");
        btnChamados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        pnlMenu.add(btnChamados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 299, 60));

        btnRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });
        btnRelatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu-retorios.png"))); // NOI18N
        jLabel16.setText(" Relatórios");
        btnRelatorio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        pnlMenu.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 299, 60));

        btnConfig.setBackground(new java.awt.Color(255, 255, 255));
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfigMouseExited(evt);
            }
        });
        btnConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu-configurações.png"))); // NOI18N
        jLabel12.setText(" Configurações");
        btnConfig.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        pnlMenu.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 299, 70));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMenu.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 100, 30));

        btnClick.setBorderPainted(false);
        btnClick.setContentAreaFilled(false);
        btnClick.setFocusPainted(false);
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        pnlMenu.add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, 30));

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 0, 300, 900);

        pnlConfOpc.setBackground(new java.awt.Color(204, 204, 204));
        pnlConfOpc.setForeground(new java.awt.Color(204, 204, 204));
        pnlConfOpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlConfOpcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConfOpcMouseExited(evt);
            }
        });
        pnlConfOpc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMural.setBackground(new java.awt.Color(0, 142, 172));
        btnMural.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMural.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuralMouseClicked(evt);
            }
        });
        btnMural.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mural");
        btnMural.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        pnlConfOpc.add(btnMural, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 209, 40));

        btnPrioridades.setBackground(new java.awt.Color(0, 142, 172));
        btnPrioridades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrioridades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrioridadesMouseClicked(evt);
            }
        });
        btnPrioridades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnPrioridades.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioridades");
        btnPrioridades.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        pnlConfOpc.add(btnPrioridades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 209, 40));

        btnProblema.setBackground(new java.awt.Color(0, 142, 172));
        btnProblema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProblemaMouseClicked(evt);
            }
        });
        btnProblema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnProblema.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Problema");
        btnProblema.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        pnlConfOpc.add(btnProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 209, 40));

        btnSetor.setBackground(new java.awt.Color(0, 142, 172));
        btnSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetor.setVerifyInputWhenFocusTarget(false);
        btnSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetorMouseClicked(evt);
            }
        });
        btnSetor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnSetor.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Setor");
        btnSetor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        pnlConfOpc.add(btnSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 209, 40));

        jPanel23.setBackground(new java.awt.Color(0, 142, 172));
        jPanel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SLA");
        jPanel23.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        pnlConfOpc.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, 209, 40));

        getContentPane().add(pnlConfOpc);
        pnlConfOpc.setBounds(300, 650, 210, 206);
        pnlConfOpc.getAccessibleContext().setAccessibleName("");

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 142, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Quadro");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("de avisos");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mural.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 270));

        jPanel18.setBackground(new java.awt.Color(0, 178, 214));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Mural");
        jPanel18.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Quadro de aviso");
        jPanel18.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        txtAviso.setEditable(false);
        txtAviso.setBackground(new java.awt.Color(0, 178, 214));
        txtAviso.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAviso.setForeground(new java.awt.Color(255, 255, 255));
        txtAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel18.add(txtAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 420, 50));

        txtAvisoDesc.setEditable(false);
        txtAvisoDesc.setBackground(new java.awt.Color(0, 178, 214));
        txtAvisoDesc.setColumns(20);
        txtAvisoDesc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAvisoDesc.setForeground(new java.awt.Color(255, 255, 255));
        txtAvisoDesc.setLineWrap(true);
        txtAvisoDesc.setRows(5);
        txtAvisoDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane8.setViewportView(txtAvisoDesc);

        jPanel18.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 420, 170));

        pnlPrincipal.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 570, 500));

        getContentPane().add(pnlPrincipal);
        pnlPrincipal.setBounds(300, 0, 1140, 900);

        pnlChamados.setBackground(new java.awt.Color(242, 238, 238));
        pnlChamados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlChamados.setMinimumSize(new java.awt.Dimension(1070, 445));
        pnlChamados.setPreferredSize(new java.awt.Dimension(1070, 445));
        pnlChamados.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 142, 172));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Atendimento");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Chamados");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atendimento.png"))); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        btnSolucionados.setBackground(new java.awt.Color(0, 142, 172));
        btnSolucionados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSolucionados.setForeground(new java.awt.Color(255, 255, 255));
        btnSolucionados.setText("Solucionados");
        btnSolucionados.setBorder(null);
        btnSolucionados.setBorderPainted(false);
        btnSolucionados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolucionados.setFocusPainted(false);
        btnSolucionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionadosActionPerformed(evt);
            }
        });
        jPanel4.add(btnSolucionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 160, 40));

        btnTodos.setBackground(new java.awt.Color(0, 115, 149));
        btnTodos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Todos");
        btnTodos.setBorder(null);
        btnTodos.setBorderPainted(false);
        btnTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos.setFocusPainted(false);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel4.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, 40));

        btnPendentes.setBackground(new java.awt.Color(0, 142, 172));
        btnPendentes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPendentes.setForeground(new java.awt.Color(255, 255, 255));
        btnPendentes.setText("Pendentes");
        btnPendentes.setBorder(null);
        btnPendentes.setBorderPainted(false);
        btnPendentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPendentes.setFocusPainted(false);
        btnPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendentesActionPerformed(evt);
            }
        });
        jPanel4.add(btnPendentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 160, 40));

        btnTodos1.setBackground(new java.awt.Color(0, 115, 149));
        btnTodos1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTodos1.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        btnTodos1.setText("Abrir");
        btnTodos1.setBorder(null);
        btnTodos1.setBorderPainted(false);
        btnTodos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos1.setFocusPainted(false);
        btnTodos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodos1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnTodos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 100, 50));

        pnlChamados.add(jPanel4);
        jPanel4.setBounds(0, 0, 1140, 270);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(40);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 610));

        pnlChamados.add(jPanel5);
        jPanel5.setBounds(0, 270, 1140, 900);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(40);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 880));

        pnlChamados.add(jPanel6);
        jPanel6.setBounds(0, 270, 1140, 900);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setRowHeight(40);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 880));

        pnlChamados.add(jPanel7);
        jPanel7.setBounds(0, 270, 1140, 900);

        getContentPane().add(pnlChamados);
        pnlChamados.setBounds(300, 0, 1140, 900);

        pnlUsuarios.setBackground(new java.awt.Color(242, 238, 238));
        pnlUsuarios.setMinimumSize(new java.awt.Dimension(1070, 445));
        pnlUsuarios.setPreferredSize(new java.awt.Dimension(1070, 445));
        pnlUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 142, 172));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Controle de usuários");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Usuários");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        btnNovo.setBackground(new java.awt.Color(0, 115, 149));
        btnNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setBorderPainted(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusPainted(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel8.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 100, 50));

        pnlUsuarios.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 260));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable4.setGridColor(new java.awt.Color(255, 255, 255));
        jTable4.setRowHeight(35);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable4MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 620));

        pnlUsuarios.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1140, 640));

        getContentPane().add(pnlUsuarios);
        pnlUsuarios.setBounds(300, 0, 1140, 900);

        pnlRelatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 142, 172));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Relatórios");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Auditoria");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlRelatorio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRelatorio.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1140, 630));

        getContentPane().add(pnlRelatorio);
        pnlRelatorio.setBounds(300, 0, 1140, 900);

        pnlMural.setBackground(new java.awt.Color(255, 255, 255));
        pnlMural.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 142, 172));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Mural");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Controle");
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlMural.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 270));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 178, 214));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Mural");
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Quadro de aviso");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Titulo do aviso");
        jPanel12.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtTituloAviso.setBackground(new java.awt.Color(0, 178, 214));
        txtTituloAviso.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTituloAviso.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel12.add(txtTituloAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 500, 50));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Descrição do Aviso:");
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtDescAviso.setBackground(new java.awt.Color(0, 178, 214));
        txtDescAviso.setColumns(20);
        txtDescAviso.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDescAviso.setForeground(new java.awt.Color(255, 255, 255));
        txtDescAviso.setLineWrap(true);
        txtDescAviso.setRows(5);
        txtDescAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane6.setViewportView(txtDescAviso);

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 500, 150));

        jButton2.setBackground(new java.awt.Color(0, 142, 172));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Postar");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 160, 40));

        jPanel24.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 500));

        pnlMural.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1010));
        pnlMural.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1007));

        getContentPane().add(pnlMural);
        pnlMural.setBounds(300, 0, 1140, 900);

        pnlProblema.setBackground(new java.awt.Color(255, 255, 255));
        pnlProblema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(0, 142, 172));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Problema");
        jPanel37.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Controle");
        jPanel37.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jPanel37.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlProblema.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 270));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(0, 178, 214));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxPrioridade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel14.add(cbxPrioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 460, 40));

        jLabel72.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Prioridade");
        jPanel14.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        cbxSla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbxSla.setSelectedItem(null);
        cbxSla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSlaActionPerformed(evt);
            }
        });
        jPanel14.add(cbxSla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 460, 40));

        jLabel75.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Tempo de Solução(SLA)");
        jPanel14.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtDescProblema.setBackground(new java.awt.Color(0, 178, 214));
        txtDescProblema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDescProblema.setForeground(new java.awt.Color(255, 255, 255));
        txtDescProblema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel14.add(txtDescProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 460, 40));

        jLabel74.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Descrição do problema");
        jPanel14.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtProblema.setBackground(new java.awt.Color(0, 178, 214));
        txtProblema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtProblema.setForeground(new java.awt.Color(255, 255, 255));
        txtProblema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel14.add(txtProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 460, 40));

        jLabel70.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Nome do problema");
        jPanel14.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Tipo de chamados");
        jPanel14.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Problema");
        jPanel14.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jButton11.setBackground(new java.awt.Color(0, 142, 172));
        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Cadastrar");
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 160, 40));

        jPanel38.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 520));

        pnlProblema.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1010));
        pnlProblema.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1007));

        getContentPane().add(pnlProblema);
        pnlProblema.setBounds(300, 0, 1140, 900);

        pnlSetor.setBackground(new java.awt.Color(255, 255, 255));
        pnlSetor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(0, 142, 172));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Setor");
        jPanel33.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Controle");
        jPanel33.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jPanel33.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlSetor.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 270));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(0, 178, 214));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Setor");
        jPanel35.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Áreas da empresa");
        jPanel35.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Setor");
        jPanel35.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, -1));

        txtSetor.setBackground(new java.awt.Color(0, 178, 214));
        txtSetor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSetor.setForeground(new java.awt.Color(255, 255, 255));
        txtSetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel35.add(txtSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 470, 50));

        jButton10.setBackground(new java.awt.Color(0, 142, 172));
        jButton10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Postar");
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel35.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 160, 60));

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 500));

        pnlSetor.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1010));
        pnlSetor.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1007));

        getContentPane().add(pnlSetor);
        pnlSetor.setBounds(300, 0, 1140, 900);

        pnlSla.setBackground(new java.awt.Color(255, 255, 255));
        pnlSla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(0, 142, 172));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Tempo de Solução");
        jPanel44.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel81.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Controle");
        jPanel44.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jPanel44.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlSla.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 270));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(0, 178, 214));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("SLA");
        jPanel46.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel84.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Tempo de Solução");
        jPanel46.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel85.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("tempo em segundos:");
        jPanel46.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtNomeSla.setBackground(new java.awt.Color(0, 178, 214));
        txtNomeSla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNomeSla.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeSla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel46.add(txtNomeSla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 470, 50));

        jButton13.setBackground(new java.awt.Color(0, 142, 172));
        jButton13.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Cadastrar");
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel46.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 160, 60));

        txtSla.setBackground(new java.awt.Color(0, 178, 214));
        txtSla.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSla.setForeground(new java.awt.Color(255, 255, 255));
        txtSla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel46.add(txtSla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 470, 50));

        jLabel86.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("nome do tempo:");
        jPanel46.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel45.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 500));

        pnlSla.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1010));
        pnlSla.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1007));

        getContentPane().add(pnlSla);
        pnlSla.setBounds(300, 0, 1140, 900);

        pnlPrioridades.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrioridades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(0, 142, 172));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Prioridade");
        jPanel29.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Controle");
        jPanel29.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jPanel29.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pnlPrioridades.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 270));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(0, 178, 214));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Prioridade");
        jPanel32.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("nível dos chamados");
        jPanel32.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Prioridade");
        jPanel32.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtPrioridade.setBackground(new java.awt.Color(0, 178, 214));
        txtPrioridade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPrioridade.setForeground(new java.awt.Color(255, 255, 255));
        txtPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel32.add(txtPrioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 460, 50));

        jButton9.setBackground(new java.awt.Color(0, 142, 172));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Postar");
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 160, 60));

        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 500));

        pnlPrioridades.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1010));
        pnlPrioridades.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1300, 1007));

        getContentPane().add(pnlPrioridades);
        pnlPrioridades.setBounds(300, 0, 1140, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        jPanel5.setVisible(true);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);

        btnTodos.setBackground(new Color(0, 115, 149));
        btnPendentes.setBackground(new Color(0, 142, 172));
        btnSolucionados.setBackground(new Color(0, 142, 172));
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendentesActionPerformed
        jPanel5.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(false);

        btnTodos.setBackground(new Color(0, 142, 172));
        btnPendentes.setBackground(new Color(0, 115, 149));
        btnSolucionados.setBackground(new Color(0, 142, 172));
    }//GEN-LAST:event_btnPendentesActionPerformed

    private void btnSolucionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionadosActionPerformed
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(true);

        btnTodos.setBackground(new Color(0, 142, 172));
        btnPendentes.setBackground(new Color(0, 142, 172));
        btnSolucionados.setBackground(new Color(0, 115, 149));
    }//GEN-LAST:event_btnSolucionadosActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        pnlPrincipal.setVisible(true);
        pnlUsuarios.setVisible(false);
        pnlChamados.setVisible(false);

        pnlMural.setVisible(false);
        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        pnlPrincipal.setVisible(false);
        pnlUsuarios.setVisible(true);
        pnlChamados.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);
        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChamadosMouseClicked
        pnlPrincipal.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlChamados.setVisible(true);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);
        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnChamadosMouseClicked

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        pnlPrincipal.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlChamados.setVisible(false);
        pnlRelatorio.setVisible(true);

        pnlMural.setVisible(false);
        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnRelatorioMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        //pnlPrincipal.setVisible(false);
        //pnlUsuarios.setVisible(false);
        //pnlChamados.setVisible(false);
        //pnlRelatorio.setVisible(false);
        //pnlConfig.setVisible(false);
        if (opc == 0) {
            pnlConfOpc.setVisible(true);
            opc++;
        } else {
            pnlConfOpc.setVisible(false);
            opc--;
        }
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        frmLogin lg = new frmLogin();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setForeground(new Color(1, 174, 231));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnSairMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String query = ("INSERT INTO Mural_Avisos VALUES(null,?,?)"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtTituloAviso.getText());
            pst.setString(2, txtDescAviso.getText());

            txtTituloAviso.setText("");
            txtDescAviso.setText("");

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();

            cnx.executaSQL("Select * from Mural_Avisos where id_aviso = 1");

            if (!cnx.rs.next()) {
                txtAviso.setText("Ainda não tem Avisos");
            } else {
                cnx.rs.first();

                txtAviso.setText(cnx.rs.getString("nome_aviso"));
                txtAvisoDesc.setText(cnx.rs.getString("desc_aviso"));
            }
            btnClick.doClick();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMuralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuralMouseClicked
        pnlPrincipal.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlChamados.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(true);
        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnMuralMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            String query = ("INSERT INTO Prioridades VALUES(null,?)"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtPrioridade.getText());

            cbxPrioridade.addItem(txtPrioridade.getText());
            txtPrioridade.setText("");
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();
            cnx.conex.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnTodos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodos1ActionPerformed
        frmAbrirChamados ac = new frmAbrirChamados();
        ac.setVisible(true);
    }//GEN-LAST:event_btnTodos1ActionPerformed

    private void btnPrioridadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrioridadesMouseClicked
        pnlPrincipal.setVisible(false);
        pnlChamados.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);

        pnlPrioridades.setVisible(true);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnPrioridadesMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            String query = ("INSERT INTO Problemas VALUES(null,?,?,?,?)"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtProblema.getText());
            pst.setString(2, txtDescProblema.getText());

            try {
                cnx.executaSQL("Select * from tempo_solucoes Where tempo_solucao = '" + cbxSla.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(3, cnx.rs.getString("id_tempo_solucao"));
            } catch (Exception ex) {

            }

            try {
                cnx.executaSQL("Select * from prioridades Where nome_prioridade = '" + cbxPrioridade.getSelectedItem().toString() + "'");
                cnx.rs.first();
                pst.setString(4, cnx.rs.getString("id_prioridade"));
            } catch (Exception ex) {

            }

            txtProblema.setText("");
            txtDescProblema.setText("");

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();
            cnx.conex.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnProblemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProblemaMouseClicked
        pnlPrincipal.setVisible(false);
        pnlChamados.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);

        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(true);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnProblemaMouseClicked

    private void btnConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseEntered

    }//GEN-LAST:event_btnConfigMouseEntered

    private void pnlConfOpcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfOpcMouseEntered

    }//GEN-LAST:event_pnlConfOpcMouseEntered

    private void btnConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseExited

    }//GEN-LAST:event_btnConfigMouseExited

    private void pnlConfOpcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfOpcMouseExited

    }//GEN-LAST:event_pnlConfOpcMouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String query = ("INSERT INTO Unidades VALUES(null,?)"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtSetor.getText());

            txtSetor.setText("");
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();
            cnx.conex.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetorMouseClicked
        pnlPrincipal.setVisible(false);
        pnlChamados.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);

        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(true);

        pnlSla.setVisible(false);
    }//GEN-LAST:event_btnSetorMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String query = ("INSERT INTO Tempo_Solucoes VALUES(null,?,?)"); //Comando de inserir dados
            PreparedStatement pst = cnx.conex.prepareStatement(query); //Cria o objeto que liga o form a Conexao
            pst.setString(1, txtNomeSla.getText());
            pst.setString(2, txtSla.getText());

            cbxSla.addItem(txtNomeSla.getText());
            txtNomeSla.setText("");
            txtSla.setText("");
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            pst.executeUpdate();
            pst.close();
            cnx.conex.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!! " + ex.toString());
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        pnlPrincipal.setVisible(false);
        pnlChamados.setVisible(false);
        pnlUsuarios.setVisible(false);
        pnlRelatorio.setVisible(false);

        pnlMural.setVisible(false);

        pnlPrioridades.setVisible(false);
        pnlProblema.setVisible(false);
        pnlSetor.setVisible(false);

        pnlSla.setVisible(true);
    }//GEN-LAST:event_jPanel23MouseClicked

    private void cbxSlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSlaActionPerformed

    }//GEN-LAST:event_cbxSlaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        pegartab.setal(false);
        frmCadastroUsuario fcu = new frmCadastroUsuario();
        fcu.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        if (evt.isPopupTrigger()) {
            mnpUsuario.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable4MouseReleased

    private void menuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarActionPerformed
        if (jPanel5.isVisible() == true) {
            cid = (String) (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            cst = (String) (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7));
        } else if (jPanel6.isVisible() == true) {
            cid = (String) (jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0));
            cst = (String) (jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 7));
        } else if (jPanel7.isVisible() == true) {
            cid = (String) (jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0));
            cst = (String) (jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 7));
        }

        pegartab.setcid(cid);
        pegartab.setcst(cst);
        frmVisualizar fv = new frmVisualizar();
        fv.setVisible(true);

    }//GEN-LAST:event_menuVisualizarActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (evt.isPopupTrigger()) {
            mnpChamados.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void mniVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVisualizarActionPerformed
        
        pegartab.setidU((String) (jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0)));
        frmVisualizarUsuario fvu = new frmVisualizarUsuario();
        fvu.setVisible(true);
    }//GEN-LAST:event_mniVisualizarActionPerformed

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        allChamados("SELECT c.id_chamado as ID, u.nome_unidade as 'Unidade', p.nome_problema as 'Problema', c.desc_problema as 'Descrição', c.nome_contato as 'Contato', c.ramal as 'Ramal', c.data_abertura as 'Abertura', s.nome_situacao as 'Situação' from chamados c\n"
                + "inner join unidades u on c.unidade = u.id_unidade \n"
                + "inner join situacoes s on c.situacao_chamado = s.id_situacao\n"
                + "inner join problemas p on c.tipo_problema = p.id_problema;");
        pendentes("SELECT c.id_chamado as ID, u.nome_unidade as 'Unidade', p.nome_problema as 'Problema', c.desc_problema as 'Descrição', c.nome_contato as 'Contato', c.ramal as 'Ramal', c.data_abertura as 'Abertura', s.nome_situacao as 'Situação' from chamados c\n"
                + "inner join unidades u on c.unidade = u.id_unidade \n"
                + "inner join situacoes s on c.situacao_chamado = s.id_situacao\n"
                + "inner join problemas p on c.tipo_problema = p.id_problema where situacao_chamado=1;");
        solucionados("SELECT c.id_chamado as ID, u.nome_unidade as 'Unidade', p.nome_problema as 'Problema', c.desc_problema as 'Descrição', c.nome_contato as 'Contato', c.ramal as 'Ramal', c.data_abertura as 'Abertura', s.nome_situacao as 'Situação' from chamados c\n"
                + "inner join unidades u on c.unidade = u.id_unidade \n"
                + "inner join situacoes s on c.situacao_chamado = s.id_situacao\n"
                + "inner join problemas p on c.tipo_problema = p.id_problema where situacao_chamado=2;");

        tabelaUsuarios("select \n"
                + "u.id_usuario as ID,\n"
                + "u.nome as Nome ,\n"
                + "u.login_usuario as Login ,\n"
                + "u.senha as Senha,\n"
                + "u.email as Email ,\n"
                + "u.telefone  as Telefone ,\n"
                + "ar.nome_unidade AS Area ,\n"
                + "n.nome_nivel as Nivel\n"
                + "\n"
                + "from usuarios u \n"
                + "\n"
                + "inner join unidades ar ON u.area = ar.id_unidade \n"
                + "inner join nivel n on u.nivel = n.id_nivel order by id_usuario;");
        
        try {
            cnx.executaSQL("SELECT * FROM mural_avisos ORDER BY id_aviso DESC");

            if (!cnx.rs.next()) {
                txtAviso.setText("Ainda não tem Avisos");
                txtAvisoDesc.setText("");
            } else {
                cnx.rs.first();

                txtAviso.setText(cnx.rs.getString("nome_aviso"));
                txtAvisoDesc.setText(cnx.rs.getString("desc_aviso"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar registro!" + ex.toString());
        }
    }//GEN-LAST:event_btnClickActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        if (evt.isPopupTrigger()) {
            mnpChamados.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable2MouseReleased

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        if (evt.isPopupTrigger()) {
            mnpChamados.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable3MouseReleased

    private void mniExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExcluirActionPerformed
        String del = (String) (jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0));

        int resp = 0;

        resp = JOptionPane.showConfirmDialog(rootPane, "Deseja Remover o registro?");
        if (resp == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pst = cnx.conex.prepareStatement("DELETE FROM Usuarios WHERE id_usuario = " + del);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Registros Excluidos com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO! Remoção de dados não efetuada" + ex.toString());
            }
        }

    }//GEN-LAST:event_mniExcluirActionPerformed

    private void mniAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlterarActionPerformed
 
        pegartab.setal(true);
        pegartab.setidU((String) (jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0)));
        frmCadastroUsuario fvu = new frmCadastroUsuario();
        fvu.setVisible(true);
    }//GEN-LAST:event_mniAlterarActionPerformed

    public void allChamados(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Unidade", "Problema", "Descrição", "Contato", "Ramal", "Abertura", "Situação"};
        cnx.conecta();
        cnx.executaSQL(Sql);

        try {
            cnx.rs.first();
            do {
                dados.add(new Object[]{
                    cnx.rs.getString("ID"),
                    cnx.rs.getString("Unidade"),
                    cnx.rs.getString("Problema"),
                    cnx.rs.getString("Descrição"),
                    cnx.rs.getString("Contato"),
                    cnx.rs.getString("Ramal"),
                    cnx.rs.getString("Abertura"),
                    cnx.rs.getString("Situação")
                });
            } while (cnx.rs.next());
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ARRAYLIST" + ex);
        }
        MostrarTabela tabela = new MostrarTabela(dados, colunas);
        jTable1.setModel(tabela);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(130);
        jTable1.getColumnModel().getColumn(7).setResizable(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void pendentes(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Unidade", "Problema", "Descrição", "Contato", "Ramal", "Abertura", "Situação"};
        cnx.conecta();
        cnx.executaSQL(Sql);

        try {
            cnx.rs.first();
            do {
                dados.add(new Object[]{
                    cnx.rs.getString("ID"),
                    cnx.rs.getString("Unidade"),
                    cnx.rs.getString("Problema"),
                    cnx.rs.getString("Descrição"),
                    cnx.rs.getString("Contato"),
                    cnx.rs.getString("Ramal"),
                    cnx.rs.getString("Abertura"),
                    cnx.rs.getString("Situação")
                });
            } while (cnx.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ARRAYLIST" + ex);
        }
        MostrarTabela tabela = new MostrarTabela(dados, colunas);
        jTable2.setModel(tabela);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable2.getColumnModel().getColumn(1).setResizable(false);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable2.getColumnModel().getColumn(2).setResizable(false);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable2.getColumnModel().getColumn(3).setResizable(false);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(4).setResizable(false);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable2.getColumnModel().getColumn(5).setResizable(false);
        jTable2.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(6).setResizable(false);
        jTable2.getColumnModel().getColumn(7).setPreferredWidth(130);
        jTable2.getColumnModel().getColumn(7).setResizable(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_OFF);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void solucionados(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Unidade", "Problema", "Descrição", "Contato", "Ramal", "Abertura", "Situação"};
        cnx.conecta();
        cnx.executaSQL(Sql);

        try {
            cnx.rs.first();
            do {
                dados.add(new Object[]{
                    cnx.rs.getString("ID"),
                    cnx.rs.getString("Unidade"),
                    cnx.rs.getString("Problema"),
                    cnx.rs.getString("Descrição"),
                    cnx.rs.getString("Contato"),
                    cnx.rs.getString("Ramal"),
                    cnx.rs.getString("Abertura"),
                    cnx.rs.getString("Situação")
                });
            } while (cnx.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ARRAYLIST" + ex);
        }
        MostrarTabela tabela = new MostrarTabela(dados, colunas);
        jTable3.setModel(tabela);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable3.getColumnModel().getColumn(0).setResizable(false);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(1).setResizable(false);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(2).setResizable(false);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(3).setResizable(false);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable3.getColumnModel().getColumn(4).setResizable(false);
        jTable3.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable3.getColumnModel().getColumn(5).setResizable(false);
        jTable3.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable3.getColumnModel().getColumn(6).setResizable(false);
        jTable3.getColumnModel().getColumn(7).setPreferredWidth(130);
        jTable3.getColumnModel().getColumn(7).setResizable(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.setAutoResizeMode(jTable3.AUTO_RESIZE_OFF);
        jTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void tabelaUsuarios(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Login", "Email", "Telefone", "Área", "nivel"};
        cnx.conecta();
        cnx.executaSQL(Sql);

        try {
            cnx.rs.first();
            do {
                dados.add(new Object[]{
                    cnx.rs.getString("ID"),
                    cnx.rs.getString("Nome"),
                    cnx.rs.getString("Login"),
                    cnx.rs.getString("Email"),
                    cnx.rs.getString("Telefone"),
                    cnx.rs.getString("Area"),
                    cnx.rs.getString("Nivel")
                });
            } while (cnx.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ARRAYLIST" + ex);
        }
        MostrarTabela tabela = new MostrarTabela(dados, colunas);
        jTable4.setModel(tabela);
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable4.getColumnModel().getColumn(0).setResizable(false);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(106);
        jTable4.getColumnModel().getColumn(1).setResizable(false);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(2).setResizable(false);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(300);
        jTable4.getColumnModel().getColumn(3).setResizable(false);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable4.getColumnModel().getColumn(4).setResizable(false);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(250);
        jTable4.getColumnModel().getColumn(5).setResizable(false);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(200);
        jTable4.getColumnModel().getColumn(6).setResizable(false);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.setAutoResizeMode(jTable4.AUTO_RESIZE_OFF);
        jTable4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnChamados;
    public javax.swing.JButton btnClick;
    private javax.swing.JPanel btnConfig;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnMural;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPendentes;
    private javax.swing.JPanel btnPrioridades;
    private javax.swing.JPanel btnProblema;
    private javax.swing.JPanel btnRelatorio;
    private javax.swing.JLabel btnSair;
    private javax.swing.JPanel btnSetor;
    private javax.swing.JButton btnSolucionados;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnTodos1;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JComboBox<String> cbxPrioridade;
    private javax.swing.JComboBox<String> cbxSla;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuVisualizar;
    private javax.swing.JMenuItem mniAlterar;
    private javax.swing.JMenuItem mniExcluir;
    private javax.swing.JMenuItem mniVisualizar;
    private javax.swing.JPopupMenu mnpChamados;
    private javax.swing.JPopupMenu mnpUsuario;
    private javax.swing.JPanel pnlChamados;
    private javax.swing.JPanel pnlConfOpc;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMural;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrioridades;
    private javax.swing.JPanel pnlProblema;
    private javax.swing.JPanel pnlRelatorio;
    private javax.swing.JPanel pnlSetor;
    private javax.swing.JPanel pnlSla;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTextField txtAviso;
    private javax.swing.JTextArea txtAvisoDesc;
    private javax.swing.JTextArea txtDescAviso;
    private javax.swing.JTextField txtDescProblema;
    private javax.swing.JTextField txtNomeSla;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtProblema;
    private javax.swing.JTextField txtSetor;
    private javax.swing.JTextField txtSla;
    private javax.swing.JTextField txtTituloAviso;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/alpha.png")));
    }
}
