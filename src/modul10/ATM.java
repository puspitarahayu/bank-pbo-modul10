package modul10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puspita
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
    public ATM() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\tSelamat Datang\n     ANJUNGAN TUNAI MANDIRI\n     BNI SYARIAH-BOJONEGORO\n");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME");
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(null);

        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });
        getContentPane().add(buttonOK);
        buttonOK.setBounds(160, 210, 60, 30);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 160, 30);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel3.setText("DI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 20, 50, 30);

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel4.setText("BNI SYARIAH_BOJONEGORO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 60, 270, 30);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel5.setText("Masukkan 4 Digit PIN Anda !");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 180, 270, 30);

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jLabel6.setText("ANJUNGAN TUNAI MANDIRI");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 40, 270, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        // TODO add your handling code here:
        new inputPin().setVisible(true);
    }//GEN-LAST:event_buttonOKActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
