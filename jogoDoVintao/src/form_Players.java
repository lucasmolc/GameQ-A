import java.awt.*;

public class form_Players extends javax.swing.JFrame {
    public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public form_Players() {
        setUndecorated(true);
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        lblAttHeitor.setText("Sono");
        lblAttMateus.setText("Agilidade");
        lblAttMol.setText("Barganha");
        lblAttPeter.setText("Miranha");
        lblAttXico.setText("Sorte");
        AttRafa.setText("Inteligência");
        setOpacity(0.98f);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcone = new javax.swing.JLabel();
        btnRafaela = new javax.swing.JButton();
        btnPeter = new javax.swing.JButton();
        btnMol = new javax.swing.JButton();
        AttRafa = new javax.swing.JLabel();
        btnMateus = new javax.swing.JButton();
        btnXico = new javax.swing.JButton();
        btnHeitor = new javax.swing.JButton();
        lblAttHeitor = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        lblAttXico = new javax.swing.JLabel();
        lblAttPeter = new javax.swing.JLabel();
        lblAttMol = new javax.swing.JLabel();
        lblAttMateus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/player.png"))); // NOI18N

        btnRafaela.setText("Rafaela");
        btnRafaela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRafaelaActionPerformed(evt);
            }
        });

        btnPeter.setText("Peter");
        btnPeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeterActionPerformed(evt);
            }
        });

        btnMol.setText("Mol");
        btnMol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMolActionPerformed(evt);
            }
        });

        AttRafa.setForeground(new java.awt.Color(255, 255, 255));
        AttRafa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttRafa.setText("jLabel1");
        AttRafa.setToolTipText("");

        btnMateus.setText("Mateus");
        btnMateus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateusActionPerformed(evt);
            }
        });

        btnXico.setText("Xico");
        btnXico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXicoActionPerformed(evt);
            }
        });

        btnHeitor.setText("Heitor");
        btnHeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeitorActionPerformed(evt);
            }
        });

        lblAttHeitor.setForeground(new java.awt.Color(255, 255, 255));
        lblAttHeitor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttHeitor.setText("jLabel1");
        lblAttHeitor.setToolTipText("");

        btnSelect.setText("Selecionar");

        lblAttXico.setForeground(new java.awt.Color(255, 255, 255));
        lblAttXico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttXico.setText("jLabel1");
        lblAttXico.setToolTipText("");

        lblAttPeter.setForeground(new java.awt.Color(255, 255, 255));
        lblAttPeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttPeter.setText("jLabel1");
        lblAttPeter.setToolTipText("");

        lblAttMol.setForeground(new java.awt.Color(255, 255, 255));
        lblAttMol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttMol.setText("jLabel1");
        lblAttMol.setToolTipText("");

        lblAttMateus.setForeground(new java.awt.Color(255, 255, 255));
        lblAttMateus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttMateus.setText("jLabel1");
        lblAttMateus.setToolTipText("");

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setLabel("X");
        jButton1.setName("btnClose"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblIcone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAttMateus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMateus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                    .addComponent(lblAttXico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAttPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnRafaela, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AttRafa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMol, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnHeitor, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(lblAttHeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAttMol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(13, 13, 13)
                .addComponent(lblIcone)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRafaela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttRafa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttMol, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAttMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttXico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnSelect)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRafaelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRafaelaActionPerformed
            form_Players atributos = new form_Players();
            atributos.setVisible(false);         
    }//GEN-LAST:event_btnRafaelaActionPerformed

    private void btnPeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeterActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
    }//GEN-LAST:event_btnPeterActionPerformed

    private void btnMolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMolActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
    }//GEN-LAST:event_btnMolActionPerformed

    private void btnMateusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateusActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
    }//GEN-LAST:event_btnMateusActionPerformed

    private void btnXicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXicoActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
    }//GEN-LAST:event_btnXicoActionPerformed

    private void btnHeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeitorActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
    }//GEN-LAST:event_btnHeitorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(form_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttRafa;
    public javax.swing.JButton btnHeitor;
    public javax.swing.JButton btnMateus;
    public javax.swing.JButton btnMol;
    public javax.swing.JButton btnPeter;
    public javax.swing.JButton btnRafaela;
    public javax.swing.JButton btnSelect;
    public javax.swing.JButton btnXico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAttHeitor;
    private javax.swing.JLabel lblAttMateus;
    private javax.swing.JLabel lblAttMol;
    private javax.swing.JLabel lblAttPeter;
    private javax.swing.JLabel lblAttXico;
    private javax.swing.JLabel lblIcone;
    // End of variables declaration//GEN-END:variables

}
