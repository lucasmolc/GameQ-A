import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.border.Border;


public class cadastro extends javax.swing.JFrame {
    public static final String VERSAONOVA = "1";
    public static final String VERSAO = "v" + VERSAONOVA + " 26/11/2021";
    public boolean player = false;
    public static  Container getContantPane()
            {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public cadastro() {
        initComponents();
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
        setLocationRelativeTo(null);
        Border bordaVazia= BorderFactory.createEmptyBorder();
        nextCadastro.setBorder(bordaVazia);
        nextCadastro.setOpaque(false);
        nextCadastro.setContentAreaFilled(false);
        nextCadastro.setBorderPainted(false);
        nextCadastro1.setBorder(bordaVazia);
        nextCadastro1.setOpaque(false);
        nextCadastro1.setContentAreaFilled(false);
        nextCadastro1.setBorderPainted(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idCadastro = new javax.swing.JLabel();
        lblTele = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        nextCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNome1 = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        nextCadastro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        idCadastro.setForeground(new java.awt.Color(16, 69, 115));
        idCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cadastroP1.png"))); // NOI18N
        jPanel1.add(idCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 100));

        lblTele.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTele.setForeground(new java.awt.Color(16, 69, 115));
        lblTele.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/foneCadastro.png"))); // NOI18N
        jPanel1.add(lblTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, 20));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(16, 69, 115));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/nomeCadastro.png"))); // NOI18N
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, 20));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(16, 69, 115));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emailCadastro.png"))); // NOI18N
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 200, 80, 20));

        txtNome.setBackground(new java.awt.Color(212, 215, 218));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(54, 57, 63));
        txtNome.setBorder(null);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 210, 20));

        nextCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/setaButton.png"))); // NOI18N
        nextCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextCadastroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextCadastroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextCadastroMouseReleased(evt);
            }
        });
        nextCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(nextCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 210, 10));

        jSeparator2.setToolTipText("");
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 210, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 210, 10));

        txtNome1.setBackground(new java.awt.Color(212, 215, 218));
        txtNome1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(54, 57, 63));
        txtNome1.setBorder(null);
        jPanel1.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 210, 20));

        txtNome2.setBackground(new java.awt.Color(212, 215, 218));
        txtNome2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNome2.setForeground(new java.awt.Color(54, 57, 63));
        txtNome2.setBorder(null);
        jPanel1.add(txtNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 210, 20));

        nextCadastro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/setaButton.png"))); // NOI18N
        nextCadastro1.setEnabled(false);
        nextCadastro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextCadastro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextCadastro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextCadastro1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextCadastro1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextCadastro1MouseReleased(evt);
            }
        });
        nextCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCadastro1ActionPerformed(evt);
            }
        });
        jPanel1.add(nextCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCadastroActionPerformed
        if ((txtNome1.getText().isEmpty()) || (txtNome2.getText().isEmpty()) || (txtNome.getText().isEmpty())) {
            verificaEmpty();
        }
        else
        {
            nextCadastro.setVisible(false);
            nextCadastro.setEnabled(false);
            nextCadastro1.setVisible(true);
            nextCadastro1.setEnabled(true);
            txtNome1.setText("");
            txtNome2.setText("");
            txtNome.setText("");
            ImageIcon next = new ImageIcon(getClass().getResource("/imgs/cadastroP2.png"));
            idCadastro.setIcon(next);
        }
    }//GEN-LAST:event_nextCadastroActionPerformed

    public void verificaEmpty()
    {
        if (txtNome1.getText().isEmpty()) {
            showMessageDialog(null, "Nome não pode estar vazio!");
        }
        if (txtNome2.getText().isEmpty()) {
            showMessageDialog(null, "E-Mail não pode estar vazio!");
        }
        if (txtNome.getText().isEmpty()) {
            showMessageDialog(null, "Telefone não pode estar vazio!");
        }
    }
    
    private void nextCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastroMouseClicked
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextCadastro.setIcon(next);
    }//GEN-LAST:event_nextCadastroMouseClicked

    private void nextCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastroMouseEntered
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        nextCadastro.setIcon(next);
    }//GEN-LAST:event_nextCadastroMouseEntered

    private void nextCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastroMouseExited
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextCadastro.setIcon(next);
    }//GEN-LAST:event_nextCadastroMouseExited

    private void nextCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastroMousePressed
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonClick.png"));
        nextCadastro.setIcon(next);
    }//GEN-LAST:event_nextCadastroMousePressed

    private void nextCadastroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastroMouseReleased
       ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
       nextCadastro.setIcon(next);
    }//GEN-LAST:event_nextCadastroMouseReleased

    private void nextCadastro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastro1MouseClicked
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextCadastro1.setIcon(next);
    }//GEN-LAST:event_nextCadastro1MouseClicked

    private void nextCadastro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastro1MouseEntered
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        nextCadastro1.setIcon(next);
    }//GEN-LAST:event_nextCadastro1MouseEntered

    private void nextCadastro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastro1MouseExited
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButton.png"));
        nextCadastro1.setIcon(next);
    }//GEN-LAST:event_nextCadastro1MouseExited

    private void nextCadastro1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastro1MousePressed
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonClick.png"));
        nextCadastro1.setIcon(next);
    }//GEN-LAST:event_nextCadastro1MousePressed

    private void nextCadastro1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextCadastro1MouseReleased
        ImageIcon next = new ImageIcon(getClass().getResource("/imgs/setaButtonHover.png"));
        nextCadastro1.setIcon(next);
    }//GEN-LAST:event_nextCadastro1MouseReleased

    private void nextCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCadastro1ActionPerformed
        if ((txtNome1.getText().isEmpty()) || (txtNome2.getText().isEmpty()) || (txtNome.getText().isEmpty())) {
            verificaEmpty();
        }
        else {
            new instrucoes().setVisible(true);
            dispose();
            }
    }//GEN-LAST:event_nextCadastro1ActionPerformed
                                    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTele;
    private javax.swing.JButton nextCadastro;
    private javax.swing.JButton nextCadastro1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    // End of variables declaration//GEN-END:variables
}
