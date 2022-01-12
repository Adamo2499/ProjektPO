package com.company;

import javax.swing.*;

public class Main extends GUI {
    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               new GUI().createGUI();
            }
        });
    }
}
