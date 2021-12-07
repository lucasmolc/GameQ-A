/***
 * 
 * 
 */

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;


public class selectPlayer extends javax.swing.JFrame {
   
    public static final String VERSAONOVA = "2";
    public static final String VERSAO = "v" + VERSAONOVA + " 06/12/2021";
    public boolean player = false;
    public String firstPlayerSelected = "";
    public String secondPlayerSelected = "";
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
        ArrayList<JButton> botoes = new ArrayList<JButton>(Arrays.asList(
          btnBolsonaro,
          btnDilma,
          btnKim,
          btnLula,
          btnTemer,
          btnPlay,
          btnSelecPerso,
          btnTrump                
               ));
         for (JButton btn : botoes) {
           Border bordaVazia= BorderFactory.createEmptyBorder();
        btn.setBorder(bordaVazia);
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);           
           }        
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

        btnSelecPerso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/btnSelect.png"))); // NOI18N
        btnSelecPerso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelecPerso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecPerso.setDefaultCapable(false);
        btnSelecPerso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecPersoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelecPersoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelecPersoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSelecPersoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSelecPersoMouseReleased(evt);
            }
        });
        btnSelecPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecPersoActionPerformed(evt);
            }
        });
        telaLateral.add(btnSelecPerso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 80));

        lblSelecione.setForeground(new java.awt.Color(15, 15, 15));
        lblSelecione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/selectP1.png"))); // NOI18N
        telaLateral.add(lblSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        btnLula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lulaButton.png"))); // NOI18N
        btnLula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLulaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLulaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLulaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLulaMouseReleased(evt);
            }
        });
        btnLula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLulaActionPerformed(evt);
            }
        });
        telaLateral.add(btnLula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 50));

        btnBolsonaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/jairButtons.png"))); // NOI18N
        btnBolsonaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBolsonaroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBolsonaroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBolsonaroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBolsonaroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBolsonaroMouseReleased(evt);
            }
        });
        btnBolsonaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolsonaroActionPerformed(evt);
            }
        });
        telaLateral.add(btnBolsonaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, 50));

        btnDilma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dilmaButton.png"))); // NOI18N
        btnDilma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDilmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDilmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDilmaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDilmaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDilmaMouseReleased(evt);
            }
        });
        btnDilma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDilmaActionPerformed(evt);
            }
        });
        telaLateral.add(btnDilma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 50));

        btnTemer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/temerButton.png"))); // NOI18N
        btnTemer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTemerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTemerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTemerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTemerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTemerMouseReleased(evt);
            }
        });
        btnTemer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemerActionPerformed(evt);
            }
        });
        telaLateral.add(btnTemer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 50));

        btnTrump.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/trumpButton.png"))); // NOI18N
        btnTrump.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrumpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrumpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrumpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrumpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTrumpMouseReleased(evt);
            }
        });
        btnTrump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrumpActionPerformed(evt);
            }
        });
        telaLateral.add(btnTrump, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 50));

        btnKim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/kimButton.png"))); // NOI18N
        btnKim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKimMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKimMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnKimMouseReleased(evt);
            }
        });
        btnKim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKimActionPerformed(evt);
            }
        });
        telaLateral.add(btnKim, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 90, 50));

        telaPrincipal.setBackground(new java.awt.Color(48, 128, 189));
        telaPrincipal.setForeground(new java.awt.Color(89, 134, 173));
        telaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        telaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setBackground(new java.awt.Color(48, 128, 189));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(211, 211, 211));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/play.png"))); // NOI18N
        btnPlay.setBorder(null);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPlayMouseReleased(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        telaPrincipal.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 130, 100));

        lblNomedojogo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNomedojogo.setForeground(new java.awt.Color(235, 235, 235));
        lblNomedojogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomedojogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/title.png"))); // NOI18N
        telaPrincipal.add(lblNomedojogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 90));

        imgPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anonimoreformed.png"))); // NOI18N
        imgPlayer2.setFocusCycleRoot(true);
        telaPrincipal.add(imgPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 220));

        imgPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/anonimoreformed.png"))); // NOI18N
        telaPrincipal.add(imgPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 220));

        lblPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayer2.setText("PLAYER 2");
        telaPrincipal.add(lblPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        lblPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayer1.setText("PLAYER 1");
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
        if (secondPlayerSelected == null || secondPlayerSelected == "") {
            showMessageDialog(null, "Necessário selecionar os 2 personagens!");
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnLulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLulaActionPerformed
        if (player == false) {
            firstPlayerSelected = "lula";
            selectPlayer(player);
            setImg("/imgs/personagens/lula.png",1);
        }
        else {
            secondPlayerSelected = "lula";
            selectPlayer(player);
            setImg("/imgs/personagens/lula.png",2);
        }
        
    }//GEN-LAST:event_btnLulaActionPerformed

    private void btnSelecPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecPersoActionPerformed

        if ((firstPlayerSelected == null || firstPlayerSelected == "") && (secondPlayerSelected == null || secondPlayerSelected == "")) 
        {
            showMessageDialog(null, "Necessário selecionar os 2 personagens!");
        }
        else if(firstPlayerSelected != null && firstPlayerSelected != ""){
            if (player == true) {
                
                
                
                btnBolsonaro.setEnabled(false);
                btnDilma.setEnabled(false);
                btnKim.setEnabled(false);
                btnLula.setEnabled(false);
                btnTemer.setEnabled(false);
                btnTrump.setEnabled(false);
                btnSelecPerso.setEnabled(false);
            }
            else
            {
            ImageIcon II = new ImageIcon(getClass().getResource("/imgs/selectP2.png"));
            player = true;
            lblSelecione.setIcon(II);
            }
        }
    }//GEN-LAST:event_btnSelecPersoActionPerformed

    private void btnBolsonaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolsonaroActionPerformed
       if (player == false) {
           firstPlayerSelected = "bozo";
           selectPlayer(player);
           setImg("/imgs/personagens/bolsonaro.png",1);
       }
       else {
           secondPlayerSelected = "bozo";
           selectPlayer(player);
           setImg("/imgs/personagens/bolsonaro.png",2);
       }
    }//GEN-LAST:event_btnBolsonaroActionPerformed

    
    private void btnDilmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDilmaActionPerformed
        if (player == false) {
            firstPlayerSelected = "dilma";
            selectPlayer(player);
            setImg("/imgs/personagens/dilma.png",1);
        }
        else {
            secondPlayerSelected = "dilma";
            selectPlayer(player);
            setImg("/imgs/personagens/dilma.png",2);
        }
    }//GEN-LAST:event_btnDilmaActionPerformed

     
    private void btnTemerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemerActionPerformed
        if (player == false) {
            firstPlayerSelected = "temer";
            selectPlayer(player);
            setImg("/imgs/personagens/temer.png",1);
        }
        else {
            secondPlayerSelected = "temer";
            selectPlayer(player);
            setImg("/imgs/personagens/temer.png",2);
        }
    }//GEN-LAST:event_btnTemerActionPerformed

    private void btnTrumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrumpActionPerformed
        if (player == false) {
            firstPlayerSelected = "trump";
            selectPlayer(player);
            setImg("/imgs/personagens/trump.png",1);
        }
        else {
            secondPlayerSelected = "trump";
            selectPlayer(player);
            setImg("/imgs/personagens/trump.png",2);
        }
    }//GEN-LAST:event_btnTrumpActionPerformed

    private void btnKimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKimActionPerformed
        if (player == false) {
            firstPlayerSelected = "kim";
            selectPlayer(player);
            setImg("/imgs/personagens/kim.png",1);
        }
        else {
            secondPlayerSelected = "kim";
            selectPlayer(player);
            setImg("/imgs/personagens/kim.png",2);
        }
    }//GEN-LAST:event_btnKimActionPerformed

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        ImageIcon Play = new ImageIcon(getClass().getResource("/imgs/playClick.png"));
        btnPlay.setIcon(Play);
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        ImageIcon Play = new ImageIcon(getClass().getResource("/imgs/playHover.png"));
        btnPlay.setIcon(Play); 
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
        ImageIcon Play = new ImageIcon(getClass().getResource("/imgs/playClick.png"));
        btnPlay.setIcon(Play);
    }//GEN-LAST:event_btnPlayMouseExited

    private void btnPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMousePressed
        ImageIcon Play = new ImageIcon(getClass().getResource("/imgs/playClick.png"));
        btnPlay.setIcon(Play);
    }//GEN-LAST:event_btnPlayMousePressed

    private void btnPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseReleased
        ImageIcon Play = new ImageIcon(getClass().getResource("/imgs/playHover.png"));
        btnPlay.setIcon(Play);
    }//GEN-LAST:event_btnPlayMouseReleased

    private void btnSelecPersoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecPersoMouseClicked
        ImageIcon Select = new ImageIcon(getClass().getResource("/imgs/btnSelectClick.png"));
        btnSelecPerso.setIcon(Select);
    }//GEN-LAST:event_btnSelecPersoMouseClicked

    private void btnSelecPersoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecPersoMouseEntered
        ImageIcon Select = new ImageIcon(getClass().getResource("/imgs/btnSelectHover.png"));
        btnSelecPerso.setIcon(Select);
    }//GEN-LAST:event_btnSelecPersoMouseEntered

    private void btnSelecPersoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecPersoMouseExited
        ImageIcon Select = new ImageIcon(getClass().getResource("/imgs/btnSelect.png"));
        btnSelecPerso.setIcon(Select); 
    }//GEN-LAST:event_btnSelecPersoMouseExited

    private void btnSelecPersoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecPersoMousePressed
        ImageIcon Select = new ImageIcon(getClass().getResource("/imgs/btnSelectClick.png"));
        btnSelecPerso.setIcon(Select);
    }//GEN-LAST:event_btnSelecPersoMousePressed

    private void btnSelecPersoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecPersoMouseReleased
        ImageIcon Select = new ImageIcon(getClass().getResource("/imgs/btnSelectHover.png"));
        btnSelecPerso.setIcon(Select);
    }//GEN-LAST:event_btnSelecPersoMouseReleased

    private void btnLulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLulaMouseClicked
        ImageIcon Lula = new ImageIcon(getClass().getResource("/imgs/personagens/lulaButtonClick.png"));
        btnLula.setIcon(Lula);
    }//GEN-LAST:event_btnLulaMouseClicked

    private void btnLulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLulaMouseEntered
        ImageIcon Lula = new ImageIcon(getClass().getResource("/imgs/personagens/lulaButtonHover.png"));
        btnLula.setIcon(Lula);
    }//GEN-LAST:event_btnLulaMouseEntered

    private void btnLulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLulaMousePressed
        ImageIcon Lula = new ImageIcon(getClass().getResource("/imgs/personagens/lulaButtonClick.png"));
        btnLula.setIcon(Lula);
    }//GEN-LAST:event_btnLulaMousePressed

    private void btnLulaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLulaMouseReleased
        ImageIcon Lula = new ImageIcon(getClass().getResource("/imgs/personagens/lulaButtonHover.png"));
        btnLula.setIcon(Lula);
    }//GEN-LAST:event_btnLulaMouseReleased

    private void btnLulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLulaMouseExited
        ImageIcon Lula = new ImageIcon(getClass().getResource("/imgs/personagens/lulaButton.png"));
        btnLula.setIcon(Lula);
    }//GEN-LAST:event_btnLulaMouseExited

    private void btnBolsonaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBolsonaroMouseClicked
        ImageIcon Bolsonaro = new ImageIcon(getClass().getResource("/imgs/personagens/jairButtonClick.png"));
        btnBolsonaro.setIcon(Bolsonaro);
    }//GEN-LAST:event_btnBolsonaroMouseClicked

    private void btnBolsonaroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBolsonaroMouseEntered
        ImageIcon Bolsonaro = new ImageIcon(getClass().getResource("/imgs/personagens/jairButtonHover.png"));
        btnBolsonaro.setIcon(Bolsonaro);
    }//GEN-LAST:event_btnBolsonaroMouseEntered

    private void btnBolsonaroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBolsonaroMouseExited
        ImageIcon Bolsonaro = new ImageIcon(getClass().getResource("/imgs/personagens/jairButtons.png"));
        btnBolsonaro.setIcon(Bolsonaro);
    }//GEN-LAST:event_btnBolsonaroMouseExited

    private void btnBolsonaroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBolsonaroMousePressed
        ImageIcon Bolsonaro = new ImageIcon(getClass().getResource("/imgs/personagens/jairButtonClick.png"));
        btnBolsonaro.setIcon(Bolsonaro);
    }//GEN-LAST:event_btnBolsonaroMousePressed

    private void btnBolsonaroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBolsonaroMouseReleased
        ImageIcon Bolsonaro = new ImageIcon(getClass().getResource("/imgs/personagens/jairButtonHover.png"));
        btnBolsonaro.setIcon(Bolsonaro);
    }//GEN-LAST:event_btnBolsonaroMouseReleased

    private void btnDilmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilmaMouseClicked
        ImageIcon Dilma = new ImageIcon(getClass().getResource("/imgs/personagens/dilmaButtonHoverClick.png"));
        btnDilma.setIcon(Dilma);
    }//GEN-LAST:event_btnDilmaMouseClicked

    private void btnDilmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilmaMouseEntered
        ImageIcon Dilma = new ImageIcon(getClass().getResource("/imgs/personagens/dilmaButtonHover.png"));
        btnDilma.setIcon(Dilma);
    }//GEN-LAST:event_btnDilmaMouseEntered

    private void btnDilmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilmaMouseExited
        ImageIcon Dilma = new ImageIcon(getClass().getResource("/imgs/personagens/dilmaButton.png"));
        btnDilma.setIcon(Dilma);
    }//GEN-LAST:event_btnDilmaMouseExited

    private void btnDilmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilmaMousePressed
        ImageIcon Dilma = new ImageIcon(getClass().getResource("/imgs/personagens/dilmaButtonHoverClick.png"));
        btnDilma.setIcon(Dilma);
    }//GEN-LAST:event_btnDilmaMousePressed

    private void btnDilmaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilmaMouseReleased
        ImageIcon Dilma = new ImageIcon(getClass().getResource("/imgs/personagens/dilmaButtonHover.png"));
        btnDilma.setIcon(Dilma);
    }//GEN-LAST:event_btnDilmaMouseReleased

    private void btnTemerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemerMouseClicked
        ImageIcon Temer = new ImageIcon(getClass().getResource("/imgs/personagens/temerButtonClick.png"));
        btnTemer.setIcon(Temer);
    }//GEN-LAST:event_btnTemerMouseClicked

    private void btnTemerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemerMouseEntered
        ImageIcon Temer = new ImageIcon(getClass().getResource("/imgs/personagens/temerButtonHover.png"));
        btnTemer.setIcon(Temer);
    }//GEN-LAST:event_btnTemerMouseEntered

    private void btnTemerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemerMouseExited
        ImageIcon Temer = new ImageIcon(getClass().getResource("/imgs/personagens/temerButton.png"));
        btnTemer.setIcon(Temer);
    }//GEN-LAST:event_btnTemerMouseExited

    private void btnTemerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemerMousePressed
        ImageIcon Temer = new ImageIcon(getClass().getResource("/imgs/personagens/temerButtonHover.png"));
        btnTemer.setIcon(Temer);
    }//GEN-LAST:event_btnTemerMousePressed

    private void btnTemerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemerMouseReleased
        ImageIcon Temer = new ImageIcon(getClass().getResource("/imgs/personagens/temerButtonClick.png"));
        btnTemer.setIcon(Temer);
    }//GEN-LAST:event_btnTemerMouseReleased

    private void btnTrumpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrumpMouseClicked
        ImageIcon Trump = new ImageIcon(getClass().getResource("/imgs/personagens/trumpButtonClick.png"));
        btnTrump.setIcon(Trump);
    }//GEN-LAST:event_btnTrumpMouseClicked

    private void btnTrumpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrumpMouseEntered
        ImageIcon Trump = new ImageIcon(getClass().getResource("/imgs/personagens/trumpButtonHover.png"));
        btnTrump.setIcon(Trump);
    }//GEN-LAST:event_btnTrumpMouseEntered

    private void btnTrumpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrumpMouseExited
        ImageIcon Trump = new ImageIcon(getClass().getResource("/imgs/personagens/trumpButton.png"));
        btnTrump.setIcon(Trump);
    }//GEN-LAST:event_btnTrumpMouseExited

    private void btnTrumpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrumpMousePressed
        ImageIcon Trump = new ImageIcon(getClass().getResource("/imgs/personagens/trumpButtonHover.png"));
        btnTrump.setIcon(Trump);
    }//GEN-LAST:event_btnTrumpMousePressed

    private void btnTrumpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrumpMouseReleased
        ImageIcon Trump = new ImageIcon(getClass().getResource("/imgs/personagens/trumpButtonClick.png"));
        btnTrump.setIcon(Trump);
    }//GEN-LAST:event_btnTrumpMouseReleased

    private void btnKimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKimMouseClicked
        ImageIcon Kim = new ImageIcon(getClass().getResource("/imgs/personagens/kimButtonClick.png"));
        btnKim.setIcon(Kim);
    }//GEN-LAST:event_btnKimMouseClicked

    private void btnKimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKimMouseEntered
        ImageIcon Kim = new ImageIcon(getClass().getResource("/imgs/personagens/kimButtonHover.png"));
        btnKim.setIcon(Kim);
    }//GEN-LAST:event_btnKimMouseEntered

    private void btnKimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKimMouseExited
        ImageIcon Kim = new ImageIcon(getClass().getResource("/imgs/personagens/kimButton.png"));
        btnKim.setIcon(Kim);
    }//GEN-LAST:event_btnKimMouseExited

    private void btnKimMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKimMousePressed
        ImageIcon Kim = new ImageIcon(getClass().getResource("/imgs/personagens/kimButtonClick.png"));
        btnKim.setIcon(Kim);
    }//GEN-LAST:event_btnKimMousePressed

    private void btnKimMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKimMouseReleased
        ImageIcon Kim = new ImageIcon(getClass().getResource("/imgs/personagens/kimButtonHover.png"));
        btnKim.setIcon(Kim);
    }//GEN-LAST:event_btnKimMouseReleased

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
           imgPlayer1.setVisible(true);
           lblPlayer1.setVisible(true);
        } else{
           imgPlayer2.setEnabled(true);
           lblPlayer2.setEnabled(true);
           imgPlayer2.setVisible(true);
           lblPlayer2.setVisible(true);
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
