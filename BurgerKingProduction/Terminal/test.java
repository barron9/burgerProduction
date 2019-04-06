/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Terminal;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;

public class test {
    private JPanel panel1;
    private JButton proceedButton;
    private JTextArea textArea1;
    private JTabbedPane tabbedPane1;
    private JList list1;

    public  void main() {

        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setUndecorated(false);
        frame.setBackground(new Color(63,63,63));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void show (){
        panel1.show();

    }

    public void setData(test data) {

    }

    public void getData(test data) {
    }

    public boolean isModified(test data) {
        return false;
    }
}
