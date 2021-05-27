package alphachamados;

import com.sun.javafx.applet.Splash;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 389183623
 */
public class frmSplash extends javax.swing.JFrame {

    public frmSplash() {
        initComponents();
        setIcon();
        
        //Funciona como um time permitindo a tela de Splash Carregar/
        new Thread() {
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(50);
                        jProgressBar1.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (i == 100) {
                        //aparecer a janela do login
                        frmLogin lg = new frmLogin();
                        lg.setVisible(true);;
                        //para fechar a tela, deixar oculta
                        dispose();
                    }
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 378));
        setMinimumSize(new java.awt.Dimension(620, 378));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 378));
        getContentPane().setLayout(null);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(310, 200, 0, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carregador.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 250, 80, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SplashLogo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 50, 460, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/empresa.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -20, 670, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/alpha.png")));
    }
}
