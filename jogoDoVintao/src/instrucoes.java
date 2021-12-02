/**
 *
 * 
 */
import javax.swing.JFrame;
import java.awt.*;
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
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        instruction4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        instruction1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        instruction2 = new javax.swing.JLabel();
        instruction5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        instruction3 = new javax.swing.JLabel();
        instruction6 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(89, 134, 173));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/instrucoesSombra.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 90));

        jPanel3.setBackground(new java.awt.Color(145, 153, 163));

        instruction4.setBackground(new java.awt.Color(121, 122, 122));
        instruction4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        instruction4.setForeground(new java.awt.Color(255, 255, 255));
        instruction4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction4.setText("Pressione PLAY para começar!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instruction4, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instruction4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 520, 50));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, 50));

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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 770, -1));

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
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(instruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(instruction6, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instruction3)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(instruction6)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 770, 70));

        playButton.setBackground(new java.awt.Color(212, 215, 218));
        playButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playButton.setForeground(new java.awt.Color(65, 121, 189));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/playtest.png"))); // NOI18N
        playButton.setText("PLAY");
        playButton.setBorder(null);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel1.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        new instrucoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    
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
    private javax.swing.JLabel instruction4;
    private javax.swing.JLabel instruction5;
    private javax.swing.JLabel instruction6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
