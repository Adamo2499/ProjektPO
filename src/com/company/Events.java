package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Events extends Main {
    public Events(){
        /*
        Lists listy = new Lists();
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == category1){
                    characterName.setText("");
                    characterName.setText(charName);
                }
                if(e.getSource() == category2){
                    characterName.setText("");
                    characterName.setText("T. "+charName);
                }
                if(e.getSource() == category3){
                    characterName.setText("");
                    characterName.setText("The "+charName);
                }
                if(e.getSource() == randomTrinket){
                    int trinketID = rng.nextInt(1, startingTrinket.getItemCount());
                    JOptionPane.showMessageDialog(null,"Trinket ID: "+trinketID);
                    startingTrinket.setSelectedIndex(trinketID);
                }
                if(e.getSource() == randomActiveItem){
                    int activeItemID = rng.nextInt(1, startingActiveItem.getItemCount());
                    startingActiveItem.setSelectedIndex(activeItemID);
                }
                if(e.getSource() == randomPocket){
                    int pocketID = rng.nextInt(1, startingPocket.getItemCount());
                    startingPocket.setSelectedIndex(pocketID);
                }
                if(e.getSource() == cards){
                    startingPocket.removeAllItems();
                    listy.prepareList(startingPocket,"src/lists/cardsReversesList.txt");
                }
                if(e.getSource() == pills){
                    startingPocket.removeAllItems();
                    listy.prepareList(startingPocket,"src/lists/pillsList.txt");
                }
                if(e.getSource() == runes){
                    startingPocket.removeAllItems();
                    listy.prepareList(startingPocket,"src/lists/runesSoulStones.txt");
                }
                if(e.getSource() == noRedHealth){
                    if(noRedHealth.isSelected()){
                        redHearts.setText("0");
                        redHearts.setEditable(false);
                        rottenHearts.setText("0");
                        rottenHearts.setEditable(false);
                    }
                    else {
                        redHearts.setEditable(true);
                        rottenHearts.setEditable(true);
                    }
                }
                if(e.getSource() == canHavePocketItem){
                    if(canHavePocketItem.isSelected()){
                        JOptionPane.showMessageDialog(null,"Your character can have pocket item!");
                    }
                }
            }
        };

        category1.addActionListner(al);
        category2.addActionListner(al);
        category3.addActionListner(al);
        randomTrinket.addActionListener(al);
        randomActiveItem.addActionListener(al);
        randomPocket.addActionListener(al);
        cards.addActionListener(al);
        runes.addActionListener(al);
        pills.addActionListener(al);
        noRedHealth.addActionListener(al);
        canHavePocketItem.addActionListener(al);

         */
    }

    //static void checkHealth(){} //sprawdzenie czy zdrowie postaci jest mniejsze lub równe limitowi
    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().createGUI();
            }
        });
    }
}
