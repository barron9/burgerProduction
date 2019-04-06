/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Terminal;

import BurgerKingProduction.Terminal.Constants.MealsConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Programme {
    Frame f = new Frame();
    Button b = new Button("click me");
    List l = new List();

    public void execute() {
        bringNames();
        buildframe();
    }


    void bringNames() {
        ArrayList<String> names = new MealsConstants().getNames();
        for (int i = 0; i < names.size(); i++) {
            l.add(names.get(i));
        }
        l.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItemSelectable().getSelectedObjects()[0]);
            }
        });
        l.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l.setBounds(30, 50, 200, 200);
    }

    void buildframe() {
        f.setTitle("...");
        f.add(b);
        f.add(l);
        f.setSize(900, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

}
