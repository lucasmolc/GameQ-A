/**
 *
 * 
 */
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class instrucoes extends javax.swing.JFrame {
public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public instrucoes() {
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        setLocationRelativeTo(null);
        Border bordaVazia= BorderFactory.createEmptyBorder();
        playButton.setBorder(bordaVazia);
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        instruction1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        instruction2 = new javax.swing.JLabel();
        instruction5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        instruction3 = new javax.swing.JLabel();
        instruction6 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), null));
        jPanel1.setForeground(new java.awt.Color(212, 215, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(145, 153, 163));

        instruction1.setBackground(new java.awt.Color(121, 122, 122));
        instruction1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction1.setForeground(new java.awt.Color(255, 255, 255));
        instruction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction1.setText(" O jogo terá um total de 10 perguntas de conhecimento geral para cada jogador. ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(instruction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 760, 50));

        jPanel5.setBackground(new java.awt.Color(145, 153, 163));

        instruction2.setBackground(new java.awt.Color(121, 122, 122));
        instruction2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction2.setForeground(new java.awt.Color(255, 255, 255));
        instruction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction2.setText("Cada jogador terá as habilidades de acordo com seu personagem, ");

        instruction5.setBackground(new java.awt.Color(121, 122, 122));
        instruction5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction5.setForeground(new java.awt.Color(255, 255, 255));
        instruction5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction5.setText("podendo solicitar ajuda em até 2 questões.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(instruction2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(instruction5, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(instruction2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 760, -1));

        jPanel6.setBackground(new java.awt.Color(145, 153, 163));

        instruction3.setBackground(new java.awt.Color(121, 122, 122));
        instruction3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction3.setForeground(new java.awt.Color(255, 255, 255));
        instruction3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction3.setText(" Ao final, serão somados a quantidade de pontos adquiridos em cada pergunta ");

        instruction6.setBackground(new java.awt.Color(121, 122, 122));
        instruction6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction6.setForeground(new java.awt.Color(255, 255, 255));
        instruction6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction6.setText("(10 por Acerto). O Jogador com mais pontos será o vencedor!");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(instruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(instruction6, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instruction3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction6)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 750, 70));

        playButton.setBackground(new java.awt.Color(212, 215, 218));
        playButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playButton.setForeground(new java.awt.Color(212, 215, 218));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/setaButton.png"))); // NOI18N
        playButton.setAlignmentY(0.0F);
        playButton.setBorder(null);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playButtonMouseReleased(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel1.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/instrucoes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        new selectPlayer().setVisible(true);
        dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        ImageIcon II = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        playButton.setIcon(II);
    }//GEN-LAST:event_playButtonMouseClicked

    private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        playButton.setIcon(II);
    }//GEN-LAST:event_playButtonMouseEntered

    private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        playButton.setIcon(II);
    }//GEN-LAST:event_playButtonMouseExited

    private void playButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/imgs/setaButtonClick.png"));
        playButton.setIcon(II);
    }//GEN-LAST:event_playButtonMousePressed

    private void playButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        playButton.setIcon(II);
    }//GEN-LAST:event_playButtonMouseReleased

    
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
            java.util.logging.Logger.getLogger(instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instrucoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instruction1;
    private javax.swing.JLabel instruction2;
    private javax.swing.JLabel instruction3;
    private javax.swing.JLabel instruction5;
    private javax.swing.JLabel instruction6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
