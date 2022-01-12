package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import javax.swing.*;


public class Events extends GUI {
    // implements ActionListener, FocusListener
    public Events(){
        /*
        Lists lists = new Lists();
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == category1) {
                    newCharacter.name = characterName.getText();
                    newCharacter.category = category1.getText();
                }
                if (e.getSource() == category2) {
                    newCharacter.name = "Tainted "+characterName.getText();
                    newCharacter.category = category2.getText();

                }
                if (e.getSource() == category3) {
                    newCharacter.name = "The "+characterName.getText();
                    newCharacter.category = category3.getText();
                }
                if (e.getSource() == randomTrinket) {
                    lists.setRandomIndex(startingTrinket);
                    newCharacter.trinket = startingTrinket.getSelectedItem().toString();
                }
                if (e.getSource() == randomActiveItem) {
                    lists.setRandomIndex(startingActiveItem);
                    newCharacter.activeItem = startingActiveItem.getSelectedItem().toString();
                }
                if (e.getSource() == randomPocket) {
                    lists.setRandomIndex(startingPocket);
                    newCharacter.pocket = startingPocket.getSelectedItem().toString();
                }
                if (e.getSource() == randomPocketItem) {
                    lists.setRandomIndex(startingPocketItem);
                    newCharacter.pocketItem = startingPocketItem.getSelectedItem().toString();
                }
                if (e.getSource() == cards) {
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket, "src/lists/cardsReversesList.txt");
                }
                if (e.getSource() == pills) {
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket, "src/lists/pillsList.txt");
                }
                if (e.getSource() == runes) {
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket, "src/lists/runesSoulStones.txt");
                }
                if (e.getSource() == noRedHealth) {
                    if (noRedHealth.isSelected()) {
                        redHearts.setText("0");
                        redHearts.setEditable(false);
                        rottenHearts.setText("0");
                        rottenHearts.setEditable(false);
                    } else {
                        redHearts.setEditable(true);
                        rottenHearts.setEditable(true);
                    }
                    newCharacter.canHaveRedHealth = noRedHealth.isSelected();
                }
                if (e.getSource() == canHavePocketItem) {
                    if (canHavePocketItem.isSelected()) {
                        JOptionPane.showMessageDialog(null, "Twoja postać może mieć pocket item!");
                        pocketItemLabel.setVisible(true);
                        startingPocketItem.setVisible(true);
                        randomPocketItem.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Twoja postać nie może mieć pocket itemu!");
                        pocketItemLabel.setVisible(false);
                        startingPocketItem.setVisible(false);
                        randomPocketItem.setVisible(false);
                    }
                    newCharacter.canHavePocketItem = canHavePocketItem.isSelected();
                }
                if (e.getSource() == saveProject) {
                    int returnValue = JOptionPane.showConfirmDialog(null, "Zapisać projekt?", "Zapisz projekt", JOptionPane.YES_NO_OPTION);
                    if (returnValue == JOptionPane.YES_OPTION) {
                        new ReadWriteExportProject().saveProject(newCharacter.toString());
                    } else {
                        characterName.requestFocus();
                    }

                }
                if (e.getSource() == loadProject) {
                    int returnValue = JOptionPane.showConfirmDialog(null, "Wczytać projekt?", "Załaduj projekt", JOptionPane.YES_NO_OPTION);
                    if (returnValue == JOptionPane.YES_OPTION) {
                        String loadedProjectPath = JOptionPane.showInputDialog(null, "Podaj ścieżkę do pliku: ");
                        File loadedProject = new File(loadedProjectPath);
                        if (loadedProject.exists()) {
                            new ReadWriteExportProject().loadProject(loadedProjectPath);
                        }
                    } else {
                        characterName.requestFocus();
                    }
                }
                if (e.getSource() == createCharacterButton) {
                    //FIXME Naprawić przypisanie itemu aktywnego, pocketa, trunketu oraz pocket itemu + naprawić sprawdzeniie zanznaczenia checkboxów
                    if (statsOK) {
                        JOptionPane.showMessageDialog(null, "Udało się utworzyć postać!");
                        JOptionPane.showMessageDialog(null, "Podsumowanie: \n" + newCharacter.toString());
                        new ReadWriteExportProject().saveProject(newCharacter.toString());
                        characterCreator.dispose();
                    }
                }
            }
        };

        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (e.getSource() == startingActiveItem) {
                    if(startingActiveItem.getSelectedItem().equals(null)){
                        JOptionPane.showMessageDialog(null, "Proszę wybrać item aktywny!");
                        startingActiveItem.requestFocus();
                    }
                    else {
                        newCharacter.activeItem = startingActiveItem.getSelectedItem().toString();
                    }
                }
                if (e.getSource() == startingTrinket) {
                        if (startingTrinket.getSelectedItem().equals(null)) {
                            JOptionPane.showMessageDialog(null, "Proszę wybrać trinket!");
                            statsOK = false;
                            startingTrinket.requestFocus();
                        } else {
                            newCharacter.trinket = startingTrinket.getSelectedItem().toString();
                            createCharacterButton.setEnabled(true);
                            }
                        }
                if (e.getSource() == startingPassiveItem1) {
                    if (startingPassiveItem1.getSelectedIndex() == 0 || startingPassiveItem1.getSelectedItem().equals(null)) {
                        JOptionPane.showMessageDialog(null, "Proszę wybrać item!");
                    } else {
                        if (startingPassiveItem1.getSelectedIndex() == startingPassiveItem2.getSelectedIndex() || startingPassiveItem1.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()) {
                            JOptionPane.showMessageDialog(null, "Wybierz inny item jako pierwszy item pasywny!");
                        } else {
                            newCharacter.passiveItem1 = startingPassiveItem1.getSelectedItem().toString();
                        }
                    }
                }
                if (e.getSource() == startingPassiveItem2) {
                    if (startingPassiveItem2.getSelectedIndex() == 0 || startingPassiveItem2.getSelectedItem().equals(null)) {
                        newCharacter.passiveItem2 = "";
                    } else {
                        if (startingPassiveItem2.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem2.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()) {
                            JOptionPane.showMessageDialog(null, "Wybierz inny item jako drugi item pasywny!");
                        } else {
                            newCharacter.passiveItem2 = startingPassiveItem2.getSelectedItem().toString();
                        }
                    }
                }
                if (e.getSource() == startingPassiveItem3) {
                    if (startingPassiveItem3.getSelectedIndex() == 0 || startingPassiveItem3.getSelectedItem().equals(null)) {
                        newCharacter.passiveItem3 = "";
                    } else {
                        if (startingPassiveItem3.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem3.getSelectedIndex() == startingPassiveItem2.getSelectedIndex()) {
                            JOptionPane.showMessageDialog(null, "Wybierz inny item jako trzeci item pasywny!");
                        } else {
                            newCharacter.passiveItem3 = startingPassiveItem3.getSelectedItem().toString();
                        }
                    }
                }
                if (e.getSource() == startingPickups) {
                    if (!startingPocket.getSelectedItem().equals(null)) {
                        newCharacter.pocket = startingPocket.getSelectedItem().toString();
                    }
                }
                if (e.getSource() == coins) {
                    int coinCounter = Integer.parseInt(coins.getText());
                    if (coinCounter < 0) {
                        JOptionPane.showMessageDialog(null, "Nie można mieć mniej niż 0 coinów");
                        statsOK = false;
                        coins.requestFocus();
                    } else if (coinCounter > 99 && (!startingPassiveItem1.getSelectedItem().toString().equals("Deep " +
                            "Pockets")) || !startingPassiveItem2.getSelectedItem().toString().equals("Deep Pockets") || !startingPassiveItem3.getSelectedItem().toString().equals("Deep Pockets")) {
                        JOptionPane.showMessageDialog(null, "Nie można mieć więcej niż 99 coinów");
                        statsOK = false;
                        coins.requestFocus();
                    } else {
                        newCharacter.coins = coinCounter;
                        bombs.requestFocus();
                    }
                }
                if (e.getSource() == bombs) {
                    int bombCounter = Integer.parseInt(bombs.getText());
                    if (bombCounter < 0 || bombCounter > 99) {
                        JOptionPane.showMessageDialog(null, "Nieprawidłowa ilość bomb");
                    } else {
                        newCharacter.bombs = bombCounter;
                        key.requestFocus();
                    }
                }
                if (e.getSource() == key) {
                    int keysCounter = Integer.parseInt(key.getText());
                    if (keysCounter < 0 || keysCounter > 99) {
                        JOptionPane.showMessageDialog(null, "Nieprawidłowa ilość kluczy");
                    } else {
                        newCharacter.keys = keysCounter;
                        moveSpeed.requestFocus();
                    }
                }
                if (e.getSource() == moveSpeed) {
                    double speedValue = Double.parseDouble(moveSpeed.getText());
                    if (speedValue < 0.10 || speedValue > 2.00) {
                        JOptionPane.showMessageDialog(null, "Speed have to be between 0.1-2.0");
                        statsOK = false;
                        moveSpeed.requestFocus();
                    } else {
                        newCharacter.speed = speedValue;
                        tears.requestFocus();
                    }
                }
                if (e.getSource() == damage) {
                    double damageValue = Double.parseDouble(damage.getText());
                    if (damageValue < 0.5) {
                        JOptionPane.showMessageDialog(null, "Damage can't be lower then 0.5!");
                        statsOK = false;
                        damage.requestFocus();
                    } else {
                        newCharacter.damage = damageValue;
                        range.requestFocus();
                    }
                }
                if (e.getSource() == tears) {
                    double tearsValue = Double.parseDouble(tears.getText());
                    if (tearsValue < 0.5 || tearsValue > 5.0) {
                        JOptionPane.showMessageDialog(null, "Tears have to be between 0.5-5.0!");
                        statsOK = false;
                        tears.requestFocus();
                    } else {
                        newCharacter.tears = tearsValue;
                        damage.requestFocus();
                    }
                }
                if (e.getSource() == shotSpeed) {
                    double shotSpeedValue = Double.parseDouble(shotSpeed.getText());
                    if (shotSpeedValue < 0.60 || shotSpeedValue > 2.00) {
                        JOptionPane.showMessageDialog(null, "Speed have to be between 0.6-2.0");
                        statsOK = false;
                        shotSpeed.requestFocus();
                    } else {
                        newCharacter.shotSpeed = shotSpeedValue;
                        luck.requestFocus();
                    }
                }
                if (e.getSource() == luck) {
                    double luckValue = Double.parseDouble(luck.getText());
                    if (luckValue < -3.0) {
                        JOptionPane.showMessageDialog(null, "Luck musi być większy niż -3.0");
                        statsOK = false;
                        luck.requestFocus();
                    } else {
                        newCharacter.luck = luckValue;
                        startingTrinket.requestFocus();
                    }
                }
                if (e.getSource() == range) {
                    double rangeValue = Double.parseDouble(range.getText());
                    if (rangeValue < 1.0) {
                        JOptionPane.showMessageDialog(null, "Range musi być większy niż 1.0");
                        statsOK = false;
                        range.requestFocus();
                    } else {
                        newCharacter.range = rangeValue;
                        shotSpeed.requestFocus();
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
        randomPocketItem.addActionListener(al);
        cards.addActionListener(al);
        runes.addActionListener(al);
        pills.addActionListener(al);
        noRedHealth.addActionListener(al);
        canHavePocketItem.addActionListener(al);
        createCharacterButton.addActionListener(al);
        saveProject.addActionListener(al);
        loadProject.addActionListener(al);
        exportProject.addActionListener(al);

        startingPassiveItem1.addFocusListener(fl);
        startingPassiveItem2.addFocusListener(fl);
        startingPassiveItem3.addFocusListener(fl);
        moveSpeed.addFocusListener(fl);
        damage.addFocusListener(fl);
        shotSpeed.addFocusListener(fl);
        tears.addFocusListener(fl);
        range.addFocusListener(fl);
        coins.addFocusListener(fl);
        bombs.addFocusListener(fl);
        key.addFocusListener(fl);
    }
         */

    }
    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               new GUI().createGUI();
            }
        });

    }
/*
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
    */
}
