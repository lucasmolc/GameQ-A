
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Daniel
 */
public class campeao extends javax.swing.JFrame {

    public campeao() {
        initComponents();
        setImg("/imgs/personagens/dilma.png", "");
        lblPlayerWinner.setToolTipText("Vamos saldar a mandioca!!");
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/player1.png"));
        lblWinner.setIcon(next);
        Border bordaVazia = BorderFactory.createEmptyBorder();
        btnFinish.setBorder(bordaVazia);
        btnFinish.setOpaque(false);
        btnFinish.setContentAreaFilled(false);
        btnFinish.setBorderPainted(false);
    }

    private void setImg(String path, String label) {
        ImageIcon image = new ImageIcon(getClass().getResource(path));
        lblPlayerWinner.setIcon(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCampeao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlayerWinner = new javax.swing.JLabel();
        lblWinner = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCampeao.setBackground(new java.awt.Color(212, 215, 218));
        pnlCampeao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vencedorImg.png"))); // NOI18N
        jLabel1.setToolTipText("");
        pnlCampeao.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vencedorTxt.png"))); // NOI18N
        pnlCampeao.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 380, 100));

        lblPlayerWinner.setBackground(new java.awt.Color(212, 215, 218));
        pnlCampeao.add(lblPlayerWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 230, 200));

        lblWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlCampeao.add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 200, 30));

        btnFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/finalizar.png"))); // NOI18N
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinishMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFinishMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFinishMouseReleased(evt);
            }
        });
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        pnlCampeao.add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCampeao, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCampeao, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseClicked
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/finalizarButtonClick.png"));
        btnFinish.setIcon(next);
    }//GEN-LAST:event_btnFinishMouseClicked

    private void btnFinishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseEntered
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/finalizarButtonHover.png"));
        btnFinish.setIcon(next);
    }//GEN-LAST:event_btnFinishMouseEntered

    private void btnFinishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseExited
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/finalizar.png"));
        btnFinish.setIcon(next);
    }//GEN-LAST:event_btnFinishMouseExited

    private void btnFinishMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMousePressed
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/finalizarButtonClick.png"));
        btnFinish.setIcon(next);
    }//GEN-LAST:event_btnFinishMousePressed

    private void btnFinishMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMouseReleased
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/finalizarButtonHover.png"));
        btnFinish.setIcon(next);
    }//GEN-LAST:event_btnFinishMouseReleased

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
            java.util.logging.Logger.getLogger(campeao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(campeao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(campeao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(campeao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new campeao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPlayerWinner;
    private javax.swing.JLabel lblWinner;
    private javax.swing.JPanel pnlCampeao;
    // End of variables declaration//GEN-END:variables
}
