/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatgames01;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author CESAR
 */
public class JInterAzar extends javax.swing.JFrame {

    /**
     * Creates new form JInterAzar
     */
    public JInterAzar() {
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

        LabelDado1 = new javax.swing.JLabel();
        LabelDado2 = new javax.swing.JLabel();
        jButtonLanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aleatgames01/dados 2.PNG"))); // NOI18N
        getContentPane().add(LabelDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 70));

        LabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aleatgames01/dados 2.PNG"))); // NOI18N
        getContentPane().add(LabelDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 35, -1, -1));

        jButtonLanzar.setText("Lanzar");
        jButtonLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLanzarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLanzarActionPerformed
        // TODO add your handling code here:

        Random random = new Random();
        int resultado = random.nextInt(6) + 1; // Número aleatorio entre 1 y 6
        int resultado2 = random.nextInt(6) + 1; // Número aleatorio entre 1 y 6

        LabelDado1.setText(String.valueOf(resultado));
        LabelDado2.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_jButtonLanzarActionPerformed

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
            java.util.logging.Logger.getLogger(JInterAzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInterAzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInterAzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInterAzar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JInterAzar frame = new JInterAzar();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDado1;
    private javax.swing.JLabel LabelDado2;
    private javax.swing.JButton jButtonLanzar;
    // End of variables declaration//GEN-END:variables

