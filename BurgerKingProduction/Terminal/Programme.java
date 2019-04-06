/*
 * Copyright (c) 2019. r1p.net
 */

package BurgerKingProduction.Terminal;

import BurgerKingProduction.PrepareMeal.PrepareSingle;
import BurgerKingProduction.Terminal.Constants.MealsConstants;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Programme {
    Frame f = new Frame();
    Button b = new Button("+1 extra coca cola");
    List l = new List();
    Label label = new Label();
    TextArea ta = new TextArea();
    public void execute() {
      //  bringNames();
     //   buildframe();
        new test().main();
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
                ta.setText("");
                ta.append(new PrepareSingle().customMeal(e.getItemSelectable().getSelectedObjects()[0].toString()).showItems());
            }
        });
        l.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l.setBounds(30, 50, 200, 200);
    }

    void extrabuttons() {
        b.setBounds(550, 100, 200, 20);
        f.add(b);
    }

    void buildframe() {
        ta.setSize(200, 200);
        ta.setBackground(new Color(220,220,250));
        ta.setBounds(250, 50, 200, 200);
        ta.disable();
        f.setTitle("...");
        f.add(ta);
        extrabuttons();
        f.add(l);
        f.setSize(900, 300);
        f.setLayout(null);
       f.setBackground(new Color(147,112,219));
        f.toFront();
        f.setUndecorated (true);
        f.setResizable(false); f.setVisible(true);
    }

}
