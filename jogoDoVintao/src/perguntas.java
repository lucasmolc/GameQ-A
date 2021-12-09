
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.border.Border;

public class perguntas extends javax.swing.JFrame {

    ArrayList<Pergunta> perguntas;
    int playerLife = 100;
    int[] acertos = {0, 0};
    int gPos = 0;
    int xPos = 0;
    int pergAtual = 0;

    public perguntas() {
        initComponents();
        setImg("/imgs/anonimoreformed.png");
        
        Border bordaVazia = BorderFactory.createEmptyBorder();
        nextQuestion.setBorder(bordaVazia);
        nextQuestion.setOpaque(false);
        nextQuestion.setContentAreaFilled(false);
        nextQuestion.setBorderPainted(false);

        perguntas = new ArrayList<Pergunta>(Arrays.asList(
                new Pergunta("Quais são as fases da Lua?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Nova, cheia e superlua", false),
                                new Alternativa("Penumbral, lunar parcial, lunar total e cheia", false),
                                new Alternativa("Nova, cheia, minguante e lua de sangue", false),
                                new Alternativa("Nova, crescente, cheia e minguante", true)))),
                new Pergunta("Quantos ossos temos no nosso corpo?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("126", false),
                                new Alternativa("18", false),
                                new Alternativa("206", true),
                                new Alternativa("300", false)))),
                new Pergunta("Qual o planeta mais próximo do Sol?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Netuno", false),
                                new Alternativa("Júpiter", false),
                                new Alternativa("Mercúrio", true),
                                new Alternativa("Terra", false)))),
                new Pergunta("Qual a maior floresta tropical do mundo?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Mata Atlântica", false),
                                new Alternativa("Pampas", false),
                                new Alternativa("Floresta Amazônica", true),
                                new Alternativa("Pantanal", false)))),
                new Pergunta("Qual o monumento famoso pela sua inclinação?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Torre Eiffel", false),
                                new Alternativa("Torre de Pisa", true),
                                new Alternativa(" Esfinge", false),
                                new Alternativa("Estátua da Liberdade", false)))),
                new Pergunta("Quem pintou Mona Lisa?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Leonardo da Vinci", true),
                                new Alternativa("Van Gogh", false),
                                new Alternativa("Salvador Dalí", false),
                                new Alternativa("Tarsila do Amaral", false)))),
                new Pergunta("O que representam os cinco anéis olímpicos?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("As argolas da ginástica artística.", false),
                                new Alternativa(" As partes do mundo unidas pelo Olimpismo.", true),
                                new Alternativa("Cinco tipos de esporte: de rede, de campo, de combate, de precisão, de invasão.", false),
                                new Alternativa("Cinco deuses do Olimpo: Zeus, Atena, Apolo, Dionísio e Hermes.", false)))),
                new Pergunta("As pessoas de qual tipo sanguíneo são consideradas doadores universais?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Tipo A", false),
                                new Alternativa("Tipo B", false),
                                new Alternativa("Tipo O", true),
                                new Alternativa("Tipo AB", false)))),
                new Pergunta("Em que século o continente europeu foi devastado pela peste bubônica?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("No século X", false),
                                new Alternativa("No século XI", false),
                                new Alternativa("No século XII", false),
                                new Alternativa("No século XIV", true)))),
                new Pergunta("Quantos graus são necessários para que dois ângulos sejam complementares?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("45", false),
                                new Alternativa("60", false),
                                new Alternativa("90", true),
                                new Alternativa("180", false))))
        ));
        proxQuestao();
    }

    void proxQuestao() {
        int rand = new Random().nextInt(perguntas.size());
        Pergunta atual = perguntas.get(rand);
        lblPergunta.setText(atual.texto);
        btnAlt1.setText(atual.alternativas.get(0).texto);
        btnAlt2.setText(atual.alternativas.get(1).texto);
        btnAlt3.setText(atual.alternativas.get(2).texto);
        btnAlt4.setText(atual.alternativas.get(3).texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAlt4 = new javax.swing.JRadioButton();
        btnAlt1 = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAlt2 = new javax.swing.JRadioButton();
        btnAlt3 = new javax.swing.JRadioButton();
        pnlHab = new javax.swing.JPanel();
        lblPlayer = new javax.swing.JLabel();
        nextQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlt4.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt4);
        btnAlt4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt4.setText("Nova, crescente, cheia e minguante");
        jPanel1.add(btnAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 430, 40));

        btnAlt1.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt1);
        btnAlt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt1.setText("Nova, cheia e superlua");
        jPanel1.add(btnAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 430, 40));

        lblPergunta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta.setText("As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 120));
        lblPergunta.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaPerguntas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 770, 180));

        btnAlt2.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt2);
        btnAlt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt2.setText("Penumbral, lunar parcial, lunar total e cheia");
        jPanel1.add(btnAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 430, 40));

        btnAlt3.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt3);
        btnAlt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt3.setText("Nova, cheia, minguante e lua de sangue");
        jPanel1.add(btnAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 430, 40));

        pnlHab.setBackground(new java.awt.Color(15, 106, 175));
        pnlHab.setToolTipText("<h1>Teste<h1/>");

        lblPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer.setToolTipText("");

        javax.swing.GroupLayout pnlHabLayout = new javax.swing.GroupLayout(pnlHab);
        pnlHab.setLayout(pnlHabLayout);
        pnlHabLayout.setHorizontalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHabLayout.setVerticalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pnlHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 270, 150));

        nextQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/setaButton.png"))); // NOI18N
        nextQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextQuestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextQuestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextQuestionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextQuestionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextQuestionMouseReleased(evt);
            }
        });
        nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionActionPerformed(evt);
            }
        });
        jPanel1.add(nextQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuestionMouseClicked
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextQuestion.setIcon(next);
    }//GEN-LAST:event_nextQuestionMouseClicked

    private void nextQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuestionMouseEntered
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        nextQuestion.setIcon(next);
    }//GEN-LAST:event_nextQuestionMouseEntered

    private void nextQuestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuestionMouseExited
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextQuestion.setIcon(next);
    }//GEN-LAST:event_nextQuestionMouseExited

    private void nextQuestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuestionMousePressed
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonClick.png"));
        nextQuestion.setIcon(next);
    }//GEN-LAST:event_nextQuestionMousePressed

    private void nextQuestionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuestionMouseReleased
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        nextQuestion.setIcon(next);
    }//GEN-LAST:event_nextQuestionMouseReleased
    
    public void selectPlayerImage(String playerName) {
        switch (playerName) {
                case "lula":
                    setImg("/imgs/personagens/lula.png");
                case "dilma":
                    setImg("/imgs/personagens/dilma.png");
                case "bozo":
                    setImg("/imgs/personagens/bolsonaro.png");
                case "temer":
                    setImg("/imgs/personagens/temer.png");
                case "trump":
                    setImg("/imgs/personagens/trump.png");
                case "kim":
                    setImg("/imgs/personagens/kim.png");
            }
    }
    
    private void nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionActionPerformed
        if (gPos < 5) {
            /*selectPlayer player = new selectPlayer();
            showMessageDialog(null, "Tela principal: " + player.firstPlayerSelected);
            selectPlayerImage(player.getFirstPlayerSelected());*/
            for (int i = 0; i < 5; i++) {
                Pergunta atual = perguntas.get(pergAtual);
                if (true == atual.alternativas.get(pergAtual).status) {
                    acertos[0] += 1;
                }
                proxQuestao();
            }
            gPos++;
        } else if (xPos < 5) {
            /*selectPlayer player = new selectPlayer();
            showMessageDialog(null, "Tela principal: " + player.getFirstPlayerSelected());
            selectPlayerImage(player.getSecondPlayerSelected());*/
            for (int i = 5; i >= 0; i--) {
                Pergunta atual = perguntas.get(pergAtual);
                if (true == atual.alternativas.get(pergAtual).status) {
                    acertos[1] += 1;
                }
                proxQuestao();
            }
            xPos++;
        } else {
            new campeao().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nextQuestionActionPerformed

    private void setImg(String path) {
        ImageIcon image = new ImageIcon(getClass().getResource(path));
        lblPlayer.setIcon(image);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAlt1;
    private javax.swing.JRadioButton btnAlt2;
    private javax.swing.JRadioButton btnAlt3;
    private javax.swing.JRadioButton btnAlt4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JButton nextQuestion;
    private javax.swing.JPanel pnlHab;
    // End of variables declaration//GEN-END:variables
}
