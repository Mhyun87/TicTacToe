package TicTacToe3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marlon Hyun
 */
public class TicTacToe3 extends javax.swing.JFrame {

    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean  checker; 
    /**
     * Creates new form tictactoe
     */
    public TicTacToe3() {
        initComponents();
    }
    private void gameScore()
    {
        PlayerX.setText(String.valueOf (xCount));
        PlayerO.setText(String.valueOf (oCount));
        
    }
    
    private void choose_a_Player()
    {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else 
        {
            startGame ="X";
        }
        
    }
    
    private void winningGame()
    {
        String b1 = Tic1.getText();
        String b2 = Tic2.getText();
        String b3 = Tic3.getText();
        String b4 = Tic4.getText();
        String b5 = Tic5.getText();
        String b6 = Tic6.getText();
        String b7 = Tic7.getText();
        String b8 = Tic8.getText();
        String b9 = Tic9.getText();
        
        //Player X coding
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.ORANGE);
            Tic2.setBackground(Color.ORANGE);
            Tic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore(); 
        }
        
        if (b4 == ("X") && b5 == ("X") && b6 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic4.setBackground(Color.CYAN);
            Tic5.setBackground(Color.CYAN);
            Tic6.setBackground(Color.CYAN);
            xCount++;
            gameScore(); 
        }
        
        if (b7 == ("X") && b8 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic7.setBackground(Color.GREEN);
            Tic8.setBackground(Color.GREEN);
            Tic9.setBackground(Color.GREEN);
            xCount++;
            gameScore(); 
            }
        
        if (b3 == ("X") && b6 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic3.setBackground(Color.ORANGE);
            Tic6.setBackground(Color.ORANGE);
            Tic9.setBackground(Color.ORANGE);
            xCount++;
            gameScore(); 
        }
        
         if (b1 == ("X") && b5 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.GREEN);
            Tic5.setBackground(Color.GREEN);
            Tic9.setBackground(Color.GREEN);
            xCount++;
            gameScore(); 
            }
        
        if (b2 == ("X") && b5 == ("X") && b8 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic3.setBackground(Color.ORANGE);
            Tic5.setBackground(Color.ORANGE);
            Tic8.setBackground(Color.ORANGE);
            xCount++;
            gameScore(); 
        }
        
        if (b1 == ("X") && b4 == ("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.CYAN);
            Tic4.setBackground(Color.CYAN);
            Tic7.setBackground(Color.CYAN);
            xCount++;
            gameScore(); 
        }
        
        if (b3 == ("X") && b5 == ("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic3.setBackground(Color.GREEN);
            Tic5.setBackground(Color.GREEN);
            Tic7.setBackground(Color.GREEN);
            xCount++;
            gameScore(); 
            }
        //Player O Coding
        if (b1 == ("O") && b2 == ("O") && b3 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.RED);
            Tic2.setBackground(Color.RED);
            Tic3.setBackground(Color.RED);
            oCount++;
            gameScore(); 
            }
        
        if (b4 == ("O") && b5 == ("O") && b6 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic4.setBackground(Color.BLUE);
            Tic5.setBackground(Color.BLUE);
            Tic6.setBackground(Color.BLUE);
            oCount++;
            gameScore(); 
            }

        if (b7 == ("O") && b8 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic7.setBackground(Color.MAGENTA);
            Tic8.setBackground(Color.MAGENTA);
            Tic9.setBackground(Color.MAGENTA);
            oCount++;
            gameScore(); 
            }
        
        if (b1 == ("O") && b4 == ("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.RED);
            Tic4.setBackground(Color.RED);
            Tic7.setBackground(Color.RED);
            oCount++;
            gameScore(); 
            }
        
        if (b2 == ("O") && b5 == ("O") && b8 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic2.setBackground(Color.BLUE);
            Tic5.setBackground(Color.BLUE);
            Tic8.setBackground(Color.BLUE);
            oCount++;
            gameScore(); 
            }

        if (b3 == ("O") && b6 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic3.setBackground(Color.MAGENTA);
            Tic6.setBackground(Color.MAGENTA);
            Tic9.setBackground(Color.MAGENTA);
            oCount++;
            gameScore(); 
            }
        
         if (b1 == ("O") && b5 ==("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic1.setBackground(Color.BLUE);
            Tic5.setBackground(Color.BLUE);
            Tic9.setBackground(Color.BLUE);
            oCount++;
            gameScore(); 
            }

        if (b3 == ("O") && b5 == ("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            Tic3.setBackground(Color.MAGENTA);
            Tic5.setBackground(Color.MAGENTA);
            Tic7.setBackground(Color.MAGENTA);
            oCount++;
            gameScore(); 
            }
    }
public final class NewJFrame extends javax.swing.JFrame {

/** Creates new form NewJFrame */
public NewJFrame() {
    initComponents();
    myInitComponents();
}

public void myInitComponents() {
}
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NewGame = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        EndGame = new javax.swing.JButton();
        PlayerX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Tic3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Tic1 = new javax.swing.JButton();
        Tic2 = new javax.swing.JButton();
        Tic4 = new javax.swing.JButton();
        Tic5 = new javax.swing.JButton();
        Tic6 = new javax.swing.JButton();
        Tic7 = new javax.swing.JButton();
        Tic8 = new javax.swing.JButton();
        Tic9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AppleGothic", 1, 90)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe Game");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 20, 1260, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 50, 1330, 150));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewGame.setFont(new java.awt.Font("sansserif", 0, 59)); // NOI18N
        NewGame.setText("New Game");
        NewGame.setPreferredSize(new java.awt.Dimension(200, 150));
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        jPanel2.add(NewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 570, 90));

        Reset.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        Reset.setText("Reset");
        Reset.setPreferredSize(new java.awt.Dimension(200, 150));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel2.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 270, 110));

        EndGame.setFont(new java.awt.Font("sansserif", 0, 40)); // NOI18N
        EndGame.setText("End Game");
        EndGame.setPreferredSize(new java.awt.Dimension(200, 150));
        EndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameActionPerformed(evt);
            }
        });
        jPanel2.add(EndGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 270, 110));

        PlayerX.setFont(new java.awt.Font("sansserif", 1, 70)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlayerX.setOpaque(true);
        jPanel2.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 270, 110));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 58)); // NOI18N
        jLabel2.setText("Player O:");
        jLabel2.setBorder(null);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 110));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 58)); // NOI18N
        jLabel3.setText("Player X:");
        jLabel3.setBorder(null);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 270, 110));

        PlayerO.setFont(new java.awt.Font("sansserif", 1, 70)); // NOI18N
        PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlayerO.setOpaque(true);
        jPanel2.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 270, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 630, 600));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tic3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic3.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic3ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 180, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 630, 540));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(700, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 630, 540));

        Tic1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic1.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic1ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 170));

        Tic2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic2.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic2ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 180, 170));

        Tic4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic4.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic4ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 170));

        Tic5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic5.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic5ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 170));

        Tic6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic6.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic6ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 180, 170));

        Tic7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic7.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic7ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, 170));

        Tic8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic8.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic8ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 180, 170));

        Tic9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 100)); // NOI18N
        Tic9.setPreferredSize(new java.awt.Dimension(200, 150));
        Tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic9ActionPerformed(evt);
            }
        });
        jPanel3.add(Tic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 180, 170));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 660, 600));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1380, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private JFrame frame;
    
    private void Tic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic3ActionPerformed
        Tic3.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic3ActionPerformed

    private void Tic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic9ActionPerformed
        Tic9.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic9ActionPerformed

    private void EndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", 
                JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            System.exit (0); 
        }
    }//GEN-LAST:event_EndGameActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Tic1.setEnabled (true);
        Tic2.setEnabled (true);
        Tic3.setEnabled (true);
        Tic4.setEnabled (true);
        Tic5.setEnabled (true);
        Tic6.setEnabled (true);
        Tic7.setEnabled (true);
        Tic8.setEnabled (true);
        Tic9.setEnabled (true);
        
        Tic1.setText ("");
        Tic2.setText ("");
        Tic3.setText ("");
        Tic4.setText ("");
        Tic5.setText ("");
        Tic6.setText ("");
        Tic7.setText ("");
        Tic8.setText ("");
        Tic9.setText ("");
        
        Tic1.setBackground(Color.LIGHT_GRAY);
        Tic2.setBackground(Color.LIGHT_GRAY);
        Tic3.setBackground(Color.LIGHT_GRAY);
        Tic4.setBackground(Color.LIGHT_GRAY);
        Tic5.setBackground(Color.LIGHT_GRAY);
        Tic6.setBackground(Color.LIGHT_GRAY);
        Tic7.setBackground(Color.LIGHT_GRAY);
        Tic8.setBackground(Color.LIGHT_GRAY);
        Tic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ResetActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        Tic1.setEnabled (true);
        Tic2.setEnabled (true);
        Tic3.setEnabled (true);
        Tic4.setEnabled (true);
        Tic5.setEnabled (true);
        Tic6.setEnabled (true);
        Tic7.setEnabled (true);
        Tic8.setEnabled (true);
        Tic9.setEnabled (true);
        
        PlayerX.setText("0");
        PlayerO.setText("0");
        
        Tic1.setText ("");
        Tic2.setText ("");
        Tic3.setText ("");
        Tic4.setText ("");
        Tic5.setText ("");
        Tic6.setText ("");
        Tic7.setText ("");
        Tic8.setText ("");
        Tic9.setText ("");
        
        Tic1.setBackground(Color.LIGHT_GRAY);
        Tic2.setBackground(Color.LIGHT_GRAY);
        Tic3.setBackground(Color.LIGHT_GRAY);
        Tic4.setBackground(Color.LIGHT_GRAY);
        Tic5.setBackground(Color.LIGHT_GRAY);
        Tic6.setBackground(Color.LIGHT_GRAY);
        Tic7.setBackground(Color.LIGHT_GRAY);
        Tic8.setBackground(Color.LIGHT_GRAY);
        Tic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_NewGameActionPerformed

    private void Tic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic1ActionPerformed
        Tic1.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic1ActionPerformed

    private void Tic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic2ActionPerformed
        Tic2.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic2ActionPerformed

    private void Tic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic4ActionPerformed
        Tic4.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic4ActionPerformed

    private void Tic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic5ActionPerformed
        Tic5.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic5ActionPerformed

    private void Tic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic6ActionPerformed
        Tic6.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic6ActionPerformed

    private void Tic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic7ActionPerformed
        Tic7.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic7ActionPerformed

    private void Tic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic8ActionPerformed
        Tic8.setText (startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else 
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Tic8ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton EndGame;
    public javax.swing.JButton NewGame;
    public javax.swing.JLabel PlayerO;
    public javax.swing.JLabel PlayerX;
    public javax.swing.JButton Reset;
    public javax.swing.JButton Tic1;
    public javax.swing.JButton Tic2;
    public javax.swing.JButton Tic3;
    public javax.swing.JButton Tic4;
    public javax.swing.JButton Tic5;
    public javax.swing.JButton Tic6;
    public javax.swing.JButton Tic7;
    public javax.swing.JButton Tic8;
    public javax.swing.JButton Tic9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
