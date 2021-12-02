/***
 * 
 * 
 */

import javax.swing.JFrame;
import java.awt.*;

public class mainForm extends javax.swing.JFrame {
   
    public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public boolean player = false;
    public String selectedPlayer = "a";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public mainForm() {
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaLateral = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        telaPrincipal = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imgPlayer2 = new javax.swing.JLabel();
        imgPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 222, 226));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        telaLateral.setBackground(new java.awt.Color(212, 215, 218));
        telaLateral.setForeground(new java.awt.Color(241, 246, 248));
        telaLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botõesLateraldegrade.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        telaLateral.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 74));

        jLabel2.setForeground(new java.awt.Color(15, 15, 15));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/selecionePlayer1.png"))); // NOI18N
        telaLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, -1));

        jButton1.setText("Lula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        telaLateral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jButton6.setText("Bolsonaro");
        telaLateral.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jButton7.setText("Dilma");
        telaLateral.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        jButton8.setText("Temer");
        telaLateral.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        jButton9.setText("Mario ");
        telaLateral.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, -1));

        jButton10.setText("Rafaela");
        telaLateral.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 90, -1));

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
        telaPrincipal.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 170, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/title.png"))); // NOI18N
        telaPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 90));

        imgPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anonimoreformed.png"))); // NOI18N
        imgPlayer2.setEnabled(false);
        telaPrincipal.add(imgPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 220));

        imgPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anonimoreformed.png"))); // NOI18N
        imgPlayer1.setEnabled(false);
        telaPrincipal.add(imgPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 220));

        lblPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayer2.setText("PLAYER 2");
        lblPlayer2.setEnabled(false);
        telaPrincipal.add(lblPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        lblPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayer1.setText("PLAYER 1");
        lblPlayer1.setEnabled(false);
        telaPrincipal.add(lblPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        new instrucoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectPlayer(player);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(selectedPlayer != null && selectedPlayer != ""){
            player = true;
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
    public void selectPlayer(boolean player){
        if(player == false ){
           imgPlayer1.setEnabled(true);
           lblPlayer1.setEnabled(true);
        } else{
           imgPlayer2.setEnabled(true);
           lblPlayer2.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgPlayer1;
    private javax.swing.JLabel imgPlayer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel telaLateral;
    private javax.swing.JPanel telaPrincipal;
    // End of variables declaration//GEN-END:variables
}
