

import javax.swing.JFrame;
import java.awt.*;
public class form_Players extends javax.swing.JFrame {
public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public static  Container getContantPane() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public form_Players() {
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        AttRafa.setText("jLabel1");

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

        lblAttHeitor.setText("jLabel1");

        btnSelect.setText("Selecionar");

        lblAttXico.setText("jLabel1");

        lblAttPeter.setText("jLabel1");

        lblAttMol.setText("jLabel1");

        lblAttMateus.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXico, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lblAttXico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAttMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRafaela, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttRafa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAttPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAttMol, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMol, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblIcone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(lblIcone)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRafaela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttRafa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttPeter, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttMol, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAttMateus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttXico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttHeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnSelect)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRafaelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRafaelaActionPerformed
            form_Players atributos = new form_Players();
            atributos.setVisible(false);         
            
            AttRafa.setText("Inteligência");
    }//GEN-LAST:event_btnRafaelaActionPerformed

    private void btnPeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeterActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
        
        lblAttPeter.setText("Miranha");
    }//GEN-LAST:event_btnPeterActionPerformed

    private void btnMolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMolActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);
        
        lblAttMol.setText("Barganha");
        
    }//GEN-LAST:event_btnMolActionPerformed

    private void btnMateusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateusActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);

        lblAttMateus.setText("Agilidade");
    }//GEN-LAST:event_btnMateusActionPerformed

    private void btnXicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXicoActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);

        lblAttXico.setText("Sorte");
    }//GEN-LAST:event_btnXicoActionPerformed

    private void btnHeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeitorActionPerformed
        form_Players atributos = new form_Players();
        atributos.setVisible(false);

        lblAttHeitor.setText("Sono");
    }//GEN-LAST:event_btnHeitorActionPerformed

    
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
    private javax.swing.JButton btnHeitor;
    private javax.swing.JButton btnMateus;
    public javax.swing.JButton btnMol;
    public javax.swing.JButton btnPeter;
    public javax.swing.JButton btnRafaela;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnXico;
    private javax.swing.JLabel lblAttHeitor;
    private javax.swing.JLabel lblAttMateus;
    private javax.swing.JLabel lblAttMol;
    private javax.swing.JLabel lblAttPeter;
    private javax.swing.JLabel lblAttXico;
    private javax.swing.JLabel lblIcone;
    // End of variables declaration//GEN-END:variables

}
