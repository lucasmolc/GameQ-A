/***
 * 
 * 
 */

import javax.swing.JFrame;
import java.awt.*;

public class mainForm extends javax.swing.JFrame {
   
    public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public mainForm() {
        setUndecorated(true);
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        setOpacity(0.99f);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaLateral = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        telaPrincipal = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Personagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 222, 226));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        telaLateral.setBackground(new java.awt.Color(241, 246, 248));
        telaLateral.setForeground(new java.awt.Color(241, 246, 248));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botõesLateraldegrade.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDefaultCapable(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/instrucoes.png"))); // NOI18N
        jButton4.setText("Instruções");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/historico.png"))); // NOI18N
        jButton5.setText("Histórico");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout telaLateralLayout = new javax.swing.GroupLayout(telaLateral);
        telaLateral.setLayout(telaLateralLayout);
        telaLateralLayout.setHorizontalGroup(
            telaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(telaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        telaLateralLayout.setVerticalGroup(
            telaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        telaPrincipal.setBackground(new java.awt.Color(89, 134, 173));
        telaPrincipal.setForeground(new java.awt.Color(89, 134, 173));
        telaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        telaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setBackground(new java.awt.Color(89, 134, 173));
        playButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playButton.setForeground(new java.awt.Color(211, 211, 211));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/playtest.png"))); // NOI18N
        playButton.setText("PLAY");
        playButton.setBorder(null);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        telaPrincipal.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 180, 80));

        jButton2.setBackground(new java.awt.Color(211, 211, 211));
        jButton2.setForeground(new java.awt.Color(29, 29, 29));
        jButton2.setFocusPainted(false);
        jButton2.setLabel("X");
        jButton2.setName("btnClose"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        telaPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 50, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/title.png"))); // NOI18N
        telaPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 90));

        Personagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anonimoreformed.png"))); // NOI18N
        telaPrincipal.add(Personagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 210, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        new form_Regras().setVisible(true);
        dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try{
            JFrame frame = new JFrame("");
            Container fContainer = getContantPane();
        frame.setTitle("Jogo do Vintão - " + VERSAO);
        
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        Font font = Font.createFont(Font.TRUETYPE_FONT, mainForm.class.getResourceAsStream("SegoeUI-VF.ttf"));
        fContainer.setFont(font.deriveFont(Font.PLAIN, 9f));
        }
        catch(Exception e)
        {
        }
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Personagem;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel telaLateral;
    private javax.swing.JPanel telaPrincipal;
    // End of variables declaration//GEN-END:variables
}
