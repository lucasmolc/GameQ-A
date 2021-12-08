
public class perguntas extends javax.swing.JFrame {

    
    public perguntas() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlt4.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt4);
        btnAlt4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt4.setText("Nova, crescente, cheia e minguante");
        btnAlt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 430, 40));

        btnAlt1.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt1);
        btnAlt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt1.setText("Nova, cheia e superlua");
        btnAlt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 430, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/telaPerguntas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 770, 180));

        btnAlt2.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt2);
        btnAlt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt2.setText("Penumbral, lunar parcial, lunar total e cheia");
        btnAlt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 430, 40));

        btnAlt3.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt3);
        btnAlt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt3.setText("Nova, cheia, minguante e lua de sangue");
        btnAlt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlt3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 430, 40));

        pnlHab.setBackground(new java.awt.Color(15, 106, 175));

        javax.swing.GroupLayout pnlHabLayout = new javax.swing.GroupLayout(pnlHab);
        pnlHab.setLayout(pnlHabLayout);
        pnlHabLayout.setHorizontalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        pnlHabLayout.setVerticalGroup(
            pnlHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jPanel1.add(pnlHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 260, 190));

        lblPergunta.setText("As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 560, 120));

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

    private void btnAlt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlt3ActionPerformed

    private void btnAlt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlt2ActionPerformed

    private void btnAlt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlt1ActionPerformed

    private void btnAlt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlt4ActionPerformed

    
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
    private javax.swing.JPanel pnlHab;
    // End of variables declaration//GEN-END:variables
}
