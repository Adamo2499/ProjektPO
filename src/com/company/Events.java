package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;


public class Events extends GUI {
    public Events(){
        /*
        Lists listy = new Lists();
        String charName = characterName.getText();
        category1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterName.setText("");
                characterName.setText(charName);
            }
        });
        category2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterName.setText("");
                characterName.setText("T. "+charName);
            }
        });
        category3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                characterName.setText("");
                characterName.setText("The "+charName);
            }
        });
        randomTrinket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int trinketID = rng.nextInt(1, startingTrinket.getItemCount());
                JOptionPane.showMessageDialog(null,"Trinket ID: "+trinketID);
                startingTrinket.setSelectedIndex(trinketID);
            }
        });
        randomActiveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int activeItemID = rng.nextInt(1, startingActiveItem.getItemCount());
                startingActiveItem.setSelectedIndex(activeItemID);
            }
        });
        randomPocket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pocketID = rng.nextInt(1, startingPocket.getItemCount());
                startingPocket.setSelectedIndex(pocketID);
            }
        });
        cards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startingPocket.removeAllItems();
                listy.prepareList(startingPocket,"src/lists/cardsReversesList.txt");
            }
        });
        runes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startingPocket.removeAllItems();
                listy.prepareList(startingPocket,"src/lists/runesSoulStones.txt");
            }
        });
        pills.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startingPocket.removeAllItems();
                listy.prepareList(startingPocket,"src/lists/pillsList.txt");
            }
        });
        noRedHealth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });
        canHavePocketItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(canHavePocketItem.isSelected()){
                    JOptionPane.showMessageDialog(null,"Your character can have pocket item!");
                }
            }
        });
        startingPassiveItem1.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {}

            @Override
            public void focusLost(FocusEvent e) {
                if(startingPassiveItem1.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null,"Please select an item!");
                }
                else {
                    if(startingPassiveItem1.getSelectedIndex() == startingPassiveItem2.getSelectedIndex() || startingPassiveItem1.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
                        JOptionPane.showMessageDialog(null,"Wybierz inny item jako pierwszy item pasywny!");
                    }
                }

            }
        });
        startingPassiveItem2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}

            @Override
            public void focusLost(FocusEvent e) {
                if(startingPassiveItem2.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null,"Please select an item!");
                }
                else {
                    if(startingPassiveItem2.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem2.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
                        JOptionPane.showMessageDialog(null,"Wybierz inny item jako drugi item pasywny!");
                    }
                }

            }
        });
        startingPassiveItem3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}

            @Override
            public void focusLost(FocusEvent e) {
                if(startingPassiveItem3.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null,"Please select an item!");
                }
                else {
                    if(startingPassiveItem3.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem3.getSelectedIndex() == startingPassiveItem2.getSelectedIndex()){
                        JOptionPane.showMessageDialog(null,"Wybierz inny item jako trzeci item pasywny!");
                    }
                }
            }
        });
        createCharacterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //eksport postaci do pliku
                JOptionPane.showMessageDialog(null, "Udało się utworzyć postać!");
                characterCreator.dispose();
            }
        });
        */
        /*
        Lists listy = new Lists();
        String charName = characterName.getText();
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
                if(e.getSource() == createCharacterButton){

                }
            }
        };
        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}

            @Override
            public void focusLost(FocusEvent e) {
                if(e.getSource() == moveSpeed){
                        double speedValue = Double.parseDouble(moveSpeed.getText());
                        if(speedValue < 0.60 || speedValue > 2.00){
                            JOptionPane.showMessageDialog(null,"Speed have to be between 0.6-2.0");
                        }
                    }
                if (e.getSource() == damage) {
                    double damageValue = Double.parseDouble(damage.getText());
                    if(damageValue < 0.5){
                        JOptionPane.showMessageDialog(null,"Damage can't be lower then 0.5!");
                    }
                }
                if(e.getSource() == tears){
                    double tearsValue = Double.parseDouble(tears.getText());
                    if(tearsValue < 0.5 || tearsValue > 5.0){
                        JOptionPane.showMessageDialog(null,"Tears have to be between 0.5-5.0!");
                    }
                }
            }
        };

        category1.addActionListener(al);
        category2.addActionListener(al);
        category3.addActionListener(al);
        randomTrinket.addActionListener(al);
        randomActiveItem.addActionListener(al);
        randomPocket.addActionListener(al);
        cards.addActionListener(al);
        runes.addActionListener(al);
        pills.addActionListener(al);
        noRedHealth.addActionListener(al);
        canHavePocketItem.addActionListener(al);
        moveSpeed.addFocusListener(fl);
        damage.addFocusListener(fl);
        */
    }

    //static void checkHealth(){} //sprawdzenie czy zdrowie postaci jest mniejsze lub równe limitowi
    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               new GUI().createGUI();
            }
        });
    }
}
