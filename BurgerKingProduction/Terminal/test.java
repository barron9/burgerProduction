/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Terminal;

import javax.swing.*;

public class test {
    private JPanel panel1;
    private JTextPane textPane12;
    private JButton proceedButton;
    private JProgressBar progressBar1;

    public  void main() {
        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void show (){
        panel1.show();

    }
}
