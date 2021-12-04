/***
 * 
 * 
 */

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import java.applet.*;


public class selectPlayer extends javax.swing.JFrame {
   
    public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public boolean player = false;
    public String selectedPlayer = "a";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    public void musica(){
        
    }
    
    public selectPlayer() {
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        setLocationRelativeTo(null);
    }
    private void setImg(String path, int btn){
        ImageIcon image = new ImageIcon(
                        getClass().getResource(path));

        if (btn==1){ 
            imgPlayer1.setIcon(image);
        }
        else {
            imgPlayer2.setIcon(image);
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        telaLateral = new javax.swing.JPanel();
        btnSelecPerso = new javax.swing.JButton();
        lblSelecione = new javax.swing.JLabel();
        btnLula = new javax.swing.JButton();
        btnBolsonaro = new javax.swing.JButton();
        btnDilma = new javax.swing.JButton();
        btnTemer = new javax.swing.JButton();
        btnTrump = new javax.swing.JButton();
        btnKim = new javax.swing.JButton();
        telaPrincipal = new javax.swing.JPanel();
        btnPlay = new javax.swing.JButton();
        lblNomedojogo = new javax.swing.JLabel();
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

        btnSelecPerso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botõesLateraldegrade.png"))); // NOI18N
        btnSelecPerso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelecPerso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecPerso.setDefaultCapable(false);
        btnSelecPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecPersoActionPerformed(evt);
            }
        });
        telaLateral.add(btnSelecPerso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 74));

        lblSelecione.setForeground(new java.awt.Color(15, 15, 15));
        lblSelecione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/selecionePlayer1.png"))); // NOI18N
        telaLateral.add(lblSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, -1));

        btnLula.setText("Lula");
        btnLula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLulaActionPerformed(evt);
            }
        });
        telaLateral.add(btnLula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        btnBolsonaro.setText("Bolsonaro");
        btnBolsonaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolsonaroActionPerformed(evt);
            }
        });
        telaLateral.add(btnBolsonaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        btnDilma.setText("Dilma");
        btnDilma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDilmaActionPerformed(evt);
            }
        });
        telaLateral.add(btnDilma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        btnTemer.setText("Temer");
        btnTemer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemerActionPerformed(evt);
            }
        });
        telaLateral.add(btnTemer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        btnTrump.setText("Trump");
        btnTrump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrumpActionPerformed(evt);
            }
        });
        telaLateral.add(btnTrump, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, -1));

        btnKim.setText("Kim Jong un");
        btnKim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKimActionPerformed(evt);
            }
        });
        telaLateral.add(btnKim, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 90, -1));

        telaPrincipal.setBackground(new java.awt.Color(89, 134, 173));
        telaPrincipal.setForeground(new java.awt.Color(89, 134, 173));
        telaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        telaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setBackground(new java.awt.Color(89, 134, 173));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(211, 211, 211));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/playtest.png"))); // NOI18N
        btnPlay.setText("PLAY");
        btnPlay.setBorder(null);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        telaPrincipal.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 170, 80));

        lblNomedojogo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNomedojogo.setForeground(new java.awt.Color(235, 235, 235));
        lblNomedojogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomedojogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/title.png"))); // NOI18N
        telaPrincipal.add(lblNomedojogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 90));

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

             
        
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
          showMessageDialog(null, "");
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnLulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLulaActionPerformed
        selectPlayer(player);
        setImg("/imgs/lula.png",1);
    }//GEN-LAST:event_btnLulaActionPerformed

    private void btnSelecPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecPersoActionPerformed
        if(selectedPlayer != null && selectedPlayer != ""){
            player = true;
            
        }
        
    }//GEN-LAST:event_btnSelecPersoActionPerformed

    private void btnBolsonaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolsonaroActionPerformed
       selectPlayer(player);
       setImg("/imgs/bolsonaro.png",1);
       
       
    }//GEN-LAST:event_btnBolsonaroActionPerformed

    
    private void btnDilmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDilmaActionPerformed
        selectPlayer(player);
        setImg("/imgs/dilma.png",1);
        
    }//GEN-LAST:event_btnDilmaActionPerformed

     
    private void btnTemerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemerActionPerformed
        selectPlayer(player);
        setImg("/imgs/temer.png",1);
        
        
        
    }//GEN-LAST:event_btnTemerActionPerformed

    private void btnTrumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrumpActionPerformed
        selectPlayer(player);
        setImg("/imgs/trump.png",1);
      
        
    
    }//GEN-LAST:event_btnTrumpActionPerformed

    private void btnKimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKimActionPerformed
        selectPlayer(player);
        setImg("/imgs/kim.png",1);
        
    }//GEN-LAST:event_btnKimActionPerformed

    public static void main(String args[]) {
        try{
            JFrame frame = new JFrame("");
            Container fContainer = getContantPane();
        frame.setTitle("Jogo do Vintão - " + VERSAO);
        
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        Font font = Font.createFont(Font.TRUETYPE_FONT, selectPlayer.class.getResourceAsStream("SegoeUI-VF.ttf"));
        fContainer.setFont(font.deriveFont(Font.PLAIN, 9f));
        }
        catch(Exception e)
        {
        }
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectPlayer().setVisible(true);
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
    private javax.swing.JButton btnBolsonaro;
    private javax.swing.JButton btnDilma;
    private javax.swing.JButton btnKim;
    private javax.swing.JButton btnLula;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSelecPerso;
    private javax.swing.JButton btnTemer;
    private javax.swing.JButton btnTrump;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgPlayer1;
    private javax.swing.JLabel imgPlayer2;
    private javax.swing.JLabel lblNomedojogo;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JPanel telaLateral;
    private javax.swing.JPanel telaPrincipal;
    // End of variables declaration//GEN-END:variables
}
