
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.Icon;
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
        lblPlayer.setIcon(selectPlayer.firstPlayerSelected);

        Border bordaVazia = BorderFactory.createEmptyBorder();
        nextQuestion.setBorder(bordaVazia);
        nextQuestion.setOpaque(false);
        nextQuestion.setContentAreaFilled(false);
        nextQuestion.setBorderPainted(false);

        perguntas = new ArrayList<Pergunta>(Arrays.asList(
                new Pergunta("Quais dois valores uma variável booliana pode ter?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Operadores aritméticos e lógicos", false),
                                new Alternativa("Números e caracteres", false),
                                new Alternativa("Operadores relacionais e lógicos", false),
                                new Alternativa("Verdadeiro e falso", true)))),
                new Pergunta("Na instanciação 'Conta primeiraConta = New Conta();' primeiraConta é:",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Uma Classe", false),
                                new Alternativa("Uma referencia a uma instância de objeto", true),
                                new Alternativa("Um objeto", false),
                                new Alternativa("Um método", false)))),
                new Pergunta("<html>" + "Essa palavra-chave é usada para instruir código específico quando" + "<br />" + "a entrada de uma instrução switch não corresponde a nenhum desses casos." + "</html>",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Switch", false),
                                new Alternativa("Case", false),
                                new Alternativa("Default", true),
                                new Alternativa("Break", false)))),
                new Pergunta("<html>" + "Temos uma classe chamada Employee, quando instanciamos uma referência" + "<br />" + "a um objeto, qual será a instanciação?" + "</html>",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("New Employee ();", false),
                                new Alternativa("new Employee();", false),
                                new Alternativa("Employee empregado = new Employee();", true),
                                new Alternativa("Employee empregado = new;", false)))),
                new Pergunta("<html>" + "Qual operador você usa para chamar um método de" + "<br />" + "construtor de objeto e criar um novo objeto?" + "</html>",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("classe", false),
                                new Alternativa("new", true),
                                new Alternativa("instanceOf", false),
                                new Alternativa("scanner", false)))),
                new Pergunta("Os quatro pilares do paradigma de Orientação a Objetos são:",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Abstração, Encapsulamento, Herança e Polimorfismo.", true),
                                new Alternativa("Classes, Atributos, Métodos e Abstração.", false),
                                new Alternativa("Herança, Polimorfismo, Classes e Objetos.", false),
                                new Alternativa("Sequenciamento, Procedimentos, Bibliotecas e Herança.", false)))),
                new Pergunta("Quantos são os modificadores de visibilidade?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("5", false),
                                new Alternativa("3", true),
                                new Alternativa("2", false),
                                new Alternativa("1", false)))),
                new Pergunta("Qual dessas pessoas é considerado o pai do conceito de orientação a objetos?",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("Alan Kay", true),
                                new Alternativa("Dennis Ritchie", false),
                                new Alternativa("Bill Gates", false),
                                new Alternativa("Bjarne Stroustrup", false)))),
                new Pergunta("Os três operadores lógicos no Java são:",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("&&, != ,=", false),
                                new Alternativa("!=, =, ==", false),
                                new Alternativa("&, |, =", false),
                                new Alternativa("&&, ||, !", true)))),
                new Pergunta("<html>" + "No Java, a classe que implementa uma lista ordenada" + "<br />" + "que permite a inclusão de elementos nulos (null) é:" + "</html>",
                        new ArrayList<Alternativa>(Arrays.asList(
                                new Alternativa("List", false),
                                new Alternativa("HashMap", false),
                                new Alternativa("ArrayList", true),
                                new Alternativa("HashSet", false))))
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
        nextQuestion = new javax.swing.JButton();
        lblPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 215, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlt4.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt4);
        btnAlt4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt4.setText("Nova, crescente, cheia e minguante");
        jPanel1.add(btnAlt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 430, 40));

        btnAlt1.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt1);
        btnAlt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt1.setText("Nova, cheia e superlua");
        jPanel1.add(btnAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 430, 40));

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
        jPanel1.add(btnAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 430, 40));

        btnAlt3.setBackground(new java.awt.Color(15, 106, 175));
        buttonGroup1.add(btnAlt3);
        btnAlt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlt3.setText("Nova, cheia, minguante e lua de sangue");
        jPanel1.add(btnAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 430, 40));

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
        jPanel1.add(nextQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 110, 50));

        lblPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer.setToolTipText("Pombinho Gostoso");
        jPanel1.add(lblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 190, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public void selectPlayerImage(Icon player) {
        lblPlayer.setIcon(player);
    }

    public void desmarcaOption() {
        buttonGroup1.clearSelection();
    }

    public boolean verificaSelected() {
        if (btnAlt1.isSelected() || btnAlt2.isSelected() || btnAlt3.isSelected() || btnAlt4.isSelected()) {
            return true;
        } else {
            showMessageDialog(null, "Ao menos uma resposta deve ser selecionada!");
            return false;
        }
    }

    private void nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionActionPerformed
        if (gPos < 4) {
            if (verificaSelected()) {
                for (int i = 0; i < 4; i++) {
                    desmarcaOption();
                    selectPlayerImage(selectPlayer.firstPlayerSelected);
                    Pergunta atual = perguntas.get(pergAtual);
                    if (true == atual.alternativas.get(pergAtual).status) {
                        acertos[0] += 1;
                    }
                    proxQuestao();
                }
            }
            gPos++;
        } else if (gPos >= 4 && gPos < 9) {
            if (verificaSelected()) {
                for (int i = 4; i >= 0; i--) {
                    desmarcaOption();
                    selectPlayerImage(selectPlayer.secondPlayerSelected);
                    Pergunta atual = perguntas.get(pergAtual);
                    if (true == atual.alternativas.get(pergAtual).status) {
                        acertos[1] += 1;
                    }
                    proxQuestao();
                }
            }
            gPos++;
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
    // End of variables declaration//GEN-END:variables
}
