package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;


public class Events extends GUI {
    public Events(){
//        String charName = characterName.getText();
//        Lists listy = new Lists();
//        ActionListener al = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(e.getSource() == category1){
//                    characterName.setText("");
//                    characterName.setText(charName);
//                }
//                if(e.getSource() == category2){
//                    characterName.setText("");
//                    characterName.setText("T. "+charName);
//                }
//                if(e.getSource() == category3){
//                    characterName.setText("");
//                    characterName.setText("The "+charName);
//                }
//                if(e.getSource() == randomTrinket){
//                    int trinketID = rng.nextInt(1, startingTrinket.getItemCount());
//                    JOptionPane.showMessageDialog(null,"Trinket ID: "+trinketID);
//                    startingTrinket.setSelectedIndex(trinketID);
//                }
//                if(e.getSource() == randomActiveItem){
//                    int activeItemID = rng.nextInt(1, startingActiveItem.getItemCount());
//                    startingActiveItem.setSelectedIndex(activeItemID);
//                }
//                if(e.getSource() == randomPocket){
//                    int pocketID = rng.nextInt(1, startingPocket.getItemCount());
//                    startingPocket.setSelectedIndex(pocketID);
//                }
//                if(e.getSource() == cards){
//                    startingPocket.removeAllItems();
//                    listy.prepareList(startingPocket,"src/lists/cardsReversesList.txt");
//                }
//                if(e.getSource() == pills){
//                    startingPocket.removeAllItems();
//                    listy.prepareList(startingPocket,"src/lists/pillsList.txt");
//                }
//                if(e.getSource() == runes){
//                    startingPocket.removeAllItems();
//                    listy.prepareList(startingPocket,"src/lists/runesSoulStones.txt");
//                }
//                if(e.getSource() == noRedHealth){
//                    if(noRedHealth.isSelected()){
//                        redHearts.setText("0");
//                        redHearts.setEditable(false);
//                        rottenHearts.setText("0");
//                        rottenHearts.setEditable(false);
//                    }
//                    else {
//                        redHearts.setEditable(true);
//                        rottenHearts.setEditable(true);
//                    }
//                }
//                if(e.getSource() == canHavePocketItem){
//                    if(canHavePocketItem.isSelected()){
//                        JOptionPane.showMessageDialog(null,"Twoja postać może mieć pocket item!");
//                        pocketItemLabel.setVisible(true);
//                        startingPocketItem.setVisible(true);
//                        randomPocketItem.setVisible(true);
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null,"Twoja postać nie może mieć pocket itemu!");
//                        pocketItemLabel.setVisible(false);
//                        startingPocketItem.setVisible(false);
//                        randomPocketItem.setVisible(false);
//                    }
//                }
//                if(e.getSource() == createCharacterButton){
//                    if(statsOK){
//                        JOptionPane.showMessageDialog(null, "Udało się utworzyć postać!");
//                        JOptionPane.showMessageDialog(null,newCharacter.toString());
//                        //eksport postaci do pliku
//                        characterCreator.dispose();
//                    }
//                }
//            }
//        };
//
//        FocusListener fl = new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {}
//            @Override
//            public void focusLost(FocusEvent e) {
//                if(e.getSource() == characterName){
//                    if(charName.contains("Who am I?")){
//                        JOptionPane.showMessageDialog(null,"Proszę nadać postaci imię");
//                        statsOK = false;
//                        characterName.requestFocus();
//                    }
//                    else {
//                        newCharacter.name = charName;
//                    }
//                }
//                if(e.getSource() == startingPassiveItem1){
//                    if(startingPassiveItem1.getSelectedIndex() == 0){
//                        JOptionPane.showMessageDialog(null,"Proszę wybrać item!");
//                    }
//                    else {
//                        if(startingPassiveItem1.getSelectedIndex() == startingPassiveItem2.getSelectedIndex() || startingPassiveItem1.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
//                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako pierwszy item pasywny!");
//                        }
//                    }
//                }
//                if(e.getSource() == startingPassiveItem2){
//                    if(startingPassiveItem2.getSelectedIndex() == 0){
//                        JOptionPane.showMessageDialog(null,"Proszę wybrać item!");
//                    }
//                    else {
//                        if(startingPassiveItem2.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem2.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
//                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako drugi item pasywny!");
//                        }
//                    }
//                }
//                if(e.getSource() == startingPassiveItem3){
//                    if(startingPassiveItem3.getSelectedIndex() == 0){
//                        JOptionPane.showMessageDialog(null,"Proszę wybrać item!");
//                    }
//                    else {
//                        if(startingPassiveItem3.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem3.getSelectedIndex() == startingPassiveItem2.getSelectedIndex()){
//                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako trzeci item pasywny!");
//                        }
//                    }
//                }
//                if(e.getSource() == moveSpeed){
//                    double speedValue = Double.parseDouble(moveSpeed.getText());
//                    if(speedValue < 0.60 || speedValue > 2.00){
//                        JOptionPane.showMessageDialog(null,"Speed have to be between 0.6-2.0");
//                        statsOK = false;
//                        moveSpeed.requestFocus();
//                    }
//                    else {
//                        newCharacter.speed = speedValue;
//                    }
//                }
//                if (e.getSource() == damage) {
//                    double damageValue = Double.parseDouble(damage.getText());
//                    if(damageValue < 0.5){
//                        JOptionPane.showMessageDialog(null,"Damage can't be lower then 0.5!");
//                        statsOK = false;
//                        damage.requestFocus();
//                    }
//                    else {
//                        newCharacter.damage = damageValue;
//                    }
//                }
//                if(e.getSource() == tears){
//                    double tearsValue = Double.parseDouble(tears.getText());
//                    if(tearsValue < 0.5 || tearsValue > 5.0){
//                        JOptionPane.showMessageDialog(null,"Tears have to be between 0.5-5.0!");
//                        statsOK = false;
//                        tears.requestFocus();
//                    }
//                    else {
//                        newCharacter.tears = tearsValue;
//                    }
//                }
//                if(e.getSource() == shotSpeed){
//                    double shotSpeedValue = Double.parseDouble(shotSpeed.getText());
//                    if(shotSpeedValue < 0.60 || shotSpeedValue > 2.00){
//                        JOptionPane.showMessageDialog(null,"Speed have to be between 0.6-2.0");
//                        statsOK = false;
//                        shotSpeed.requestFocus();
//                    }
//                    else {
//                        newCharacter.shotSpeed = shotSpeedValue;
//                    }
//                }
//                if(e.getSource() == luck){
//                    double luckValue = Double.parseDouble(luck.getText());
//                    if(luckValue < -3.0){
//                        JOptionPane.showMessageDialog(null,"Luck musi być większy niż -3.0");
//                        statsOK = false;
//                        luck.requestFocus();
//                    }
//                    else {
//                        newCharacter.luck = luckValue;
//                    }
//                }
//                if(e.getSource() == range){
//                    double rangeValue = Double.parseDouble(range.getText());
//                    if(rangeValue < 1.0){
//                        JOptionPane.showMessageDialog(null,"Range musi być większy niż 1.0");
//                        statsOK = false;
//                        range.requestFocus();
//                    }
//                    else {
//                        newCharacter.range = rangeValue;
//                    }
//                }
//            }
//        };
//        category1.addActionListener(al);
//        category2.addActionListener(al);
//        category3.addActionListener(al);
//        randomTrinket.addActionListener(al);
//        randomActiveItem.addActionListener(al);
//        randomPocket.addActionListener(al);
//        cards.addActionListener(al);
//        runes.addActionListener(al);
//        pills.addActionListener(al);
//        noRedHealth.addActionListener(al);
//        canHavePocketItem.addActionListener(al);
//        createCharacterButton.addActionListener(al);
//
//        startingPassiveItem1.addFocusListener(fl);
//        startingPassiveItem2.addFocusListener(fl);
//        startingPassiveItem3.addFocusListener(fl);
//        moveSpeed.addFocusListener(fl);
//        damage.addFocusListener(fl);
//        shotSpeed.addFocusListener(fl);
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
