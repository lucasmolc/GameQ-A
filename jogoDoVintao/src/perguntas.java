
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;


public class perguntas extends javax.swing.JFrame {

    
    public perguntas() {
        initComponents();
        Border bordaVazia= BorderFactory.createEmptyBorder();
        nextQuestion.setBorder(bordaVazia);
        nextQuestion.setOpaque(false);
        nextQuestion.setContentAreaFilled(false);
        nextQuestion.setBorderPainted(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAlt4 = new javax.swing.JRadioButton();
        btnAlt1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnAlt2 = new javax.swing.JRadioButton();
        btnAlt3 = new javax.swing.JRadioButton();
        pnlHab = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
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

        javax.swing.GroupLayout pnlHabLayout = new javax.swing.GroupLayout(pnlHab);
        pnlHab.setLayout(pnlHabLayout);
        pnlHabLayout.setHorizontalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        pnlHabLayout.setVerticalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel1.add(pnlHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 270, 150));

        lblPergunta.setText("As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 560, 120));

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
    private javax.swing.JButton nextQuestion;
    private javax.swing.JPanel pnlHab;
    // End of variables declaration//GEN-END:variables
}
