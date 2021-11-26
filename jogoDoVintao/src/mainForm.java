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
        initComponents();        
        setTitle("Jogo do Vintão - " + VERSAO);
        Container fContainer = getContentPane();
        fContainer.setBackground(Color.DARK_GRAY);
        fContainer.setForeground(Color.WHITE);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        btnComeco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bem vindo ao jogo.png"))); // NOI18N

        btnComeco.setText("Começar");
        btnComeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnComeco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnComeco)
                .addGap(121, 121, 121))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecoActionPerformed
        new form_Regras().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComecoActionPerformed

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
    private javax.swing.JButton btnComeco;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
