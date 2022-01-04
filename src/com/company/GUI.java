package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.util.Random;

public class GUI {
    boolean statsOK = true;
    JFrame characterCreator = new JFrame("Isaac Character Creator");
    Character newCharacter = new Character();
    //create form elements
    //menu items
    JMenuBar options = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem saveProject = new JMenuItem("Save project");
    JMenuItem loadProject = new JMenuItem("Load project");
    JMenuItem exportProject = new JMenuItem("Export project");
    //FIXME fix adding menubar and elements to it
    //options.add(file);
    //file.add(saveProject);
    //file.add(loadProject);
    //file.add(exportProject);

    //name and category
    JLabel characterNameLabel = new JLabel("Imię postaci: ");
    TextField characterName = new TextField("Who am I?");
    ButtonGroup characterCategory = new ButtonGroup();
    JRadioButton category1 = new JRadioButton("Normal", true);
    JRadioButton category2 = new JRadioButton("Tainted");
    JRadioButton category3 = new JRadioButton("Stranger Role");
    //health
    JLabel startingHealthLabel = new JLabel("Startowe zdrowie:");
    JLabel redHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_red_full.png"));
    JLabel soulHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_soul_full.png"));
    JLabel blackHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_black_full.png"));
    JLabel boneHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_bone_empty.png"));
    JLabel rottenHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_rotten.png"));
    JLabel brokenHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_Broken_Heart.png"));
    TextField redHearts = new TextField("3");
    TextField soulHearts = new TextField("0");
    TextField blackHearts = new TextField("0");
    TextField boneHearts = new TextField("0");
    TextField rottenHearts = new TextField("0");
    TextField brokenHearts = new TextField("0");
    // items
    JLabel startingActiveItemLabel = new JLabel("Starting active item: ");
    JComboBox startingActiveItem = new JComboBox();
    JButton randomActiveItem = new JButton("Random");
    JLabel startingPassiveItemsLabel = new JLabel("Starting passive items: ");
    JComboBox startingPassiveItem1 = new JComboBox();
    JComboBox startingPassiveItem2 = new JComboBox();
    JComboBox startingPassiveItem3 = new JComboBox();
    JButton morePassiveItems = new JButton("Add passive item");
    //trinkets and pickups
    JLabel startingPickups = new JLabel("Startowe pickupy:");
    JLabel coinIcon = new JLabel(new ImageIcon("src/icons/pickups/Penny.png"));
    TextField coins = new TextField("0");
    JLabel bombIcon = new JLabel(new ImageIcon("src/icons/pickups/Bomb.png"));
    TextField bombs = new TextField("0");
    JLabel keyIcon = new JLabel(new ImageIcon("src/icons/pickups/Key.png"));
    TextField key = new TextField("0");
    //trinket
    JLabel trinketLabel = new JLabel("Trinket:");
    JComboBox startingTrinket = new JComboBox();
    JButton randomTrinket = new JButton("Random");
    //pocket items
    JLabel pocketLabel = new JLabel("Card/Pill/Rune:");
    ButtonGroup pocketCategory = new ButtonGroup();
    JRadioButton cards = new JRadioButton("Cards",true);
    JRadioButton runes = new JRadioButton("Runes");
    JRadioButton pills = new JRadioButton("Pills");
    JComboBox startingPocket = new JComboBox();
    JButton randomPocket = new JButton("Random");
    //stats
    JLabel startingStatsLabel = new JLabel("Początkowe statystyki");
    JLabel damageIcon = new JLabel(new ImageIcon("src/icons/stats/damage.png"));
    TextField damage = new TextField("3.50");
    JLabel luckIcon = new JLabel(new ImageIcon("src/icons/stats/luck.png"));
    TextField luck = new TextField("0.00");
    JLabel rangeIcon = new JLabel(new ImageIcon("src/icons/stats/range.png"));
    TextField range = new TextField("6.50");
    JLabel shotSpeedIcon = new JLabel(new ImageIcon("src/icons/stats/shot_speed.png"));
    TextField shotSpeed = new TextField("1.00");
    JLabel speedIcon = new JLabel(new ImageIcon("src/icons/stats/speed.png"));
    TextField moveSpeed = new TextField("1.00");
    JLabel tearsIcon = new JLabel(new ImageIcon("src/icons/stats/tears.png"));
    TextField tears = new TextField("2.73");
    //interfaces
    JLabel specialAbilities = new JLabel("Special abilities:");
    JCheckBox noRedHealth = new JCheckBox("Can't have red health");
    JCheckBox canHavePocketItem = new JCheckBox("Can have pocket item");
    //create chracter
    JButton createCharacterButton = new JButton("Create a character");
    //pocket item
    JLabel pocketItemLabel = new JLabel("Pocket Item");
    JComboBox startingPocketItem = new JComboBox();
    JButton randomPocketItem = new JButton("Random");
    static Random rng = new Random();

    public void createGUI() {
        //lists of items
        Lists lists = new Lists();
        // create a frame
        characterCreator.setSize(600, 768);
        characterCreator.setLayout(null);
        characterCreator.setVisible(true);
        characterCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterCreator.setJMenuBar(options);


        //set frame icon

        ImageIcon isaacIcon = new ImageIcon("src/icons/Character_Isaac_icon.png");
        characterCreator.setIconImage(isaacIcon.getImage());

        //add items to comboboxes
        startingPassiveItem1.addItem("");
        startingPassiveItem2.addItem("");
        startingPassiveItem3.addItem("");
        startingActiveItem.addItem("");
        startingTrinket.addItem("");
        startingPocket.addItem("");
        startingPocketItem.addItem("");
        lists.prepareList(startingTrinket,"src/lists/trinketsList.txt");
        lists.prepareList(startingActiveItem,"src/lists/activeItemsList.txt");
        lists.prepareList(startingPocket,"src/lists/cardsReversesList.txt");
        lists.prepareList(startingPassiveItem1,"src/lists/passiveItemsList.txt");
        lists.prepareList(startingPassiveItem2,"src/lists/passiveItemsList.txt");
        lists.prepareList(startingPassiveItem3,"src/lists/passiveItemsList.txt");
        lists.prepareList(startingPocketItem, "src/lists/activeItemsList.txt");

        //set sizes of elements
        characterNameLabel.setBounds(15, -35, 125, 100);
        characterName.setBounds(150, 5, 130, 25);
        category1.setBounds(15, 45, 75, 30);
        category2.setBounds(100, 45, 75, 30);
        category3.setBounds(185, 45, 150, 30);
        startingHealthLabel.setBounds(15,85,115, 30);
        redHeartIcon.setBounds(15,120,30,30);
        redHearts.setBounds(50,125,50,20);
        soulHeartIcon.setBounds(15,150,30,30);
        soulHearts.setBounds(50,155,50,20);
        blackHeartIcon.setBounds(15,180,30,30);
        blackHearts.setBounds(50,185,50,20);
        boneHeartIcon.setBounds(15,210,30,30);
        boneHearts.setBounds(50,215,50,20);
        rottenHeartIcon.setBounds(15,240,30,30);
        rottenHearts.setBounds(50,245,50,20);
        brokenHeartIcon.setBounds(15,270,30,30);
        brokenHearts.setBounds(50,275,50,20);
        startingActiveItemLabel.setBounds(150,85,125,30);
        startingActiveItem.setBounds(150,120,215,20);
        randomActiveItem.setBounds(275,95,90,20);
        startingPassiveItemsLabel.setBounds(150,150,150,30);
        startingPassiveItem1.setBounds(150,180,215,20);
        startingPassiveItem2.setBounds(150,210,215,20);
        startingPassiveItem3.setBounds(150,240,215,20);
        noRedHealth.setBounds(150,270,200,25);
        canHavePocketItem.setBounds(150,290,200,30);
        startingPickups.setBounds(15,300,100,30);
        coinIcon.setBounds(15,330,30,30);
        coins.setBounds(50,335,50,20);
        bombIcon.setBounds(15,360,30,30);
        bombs.setBounds(50,365,50,20);
        keyIcon.setBounds(15,390,30,30);
        key.setBounds(50,395,50,20);
        startingStatsLabel.setBounds(15,420,200,30);
        speedIcon.setBounds(15,450,30,30);
        moveSpeed.setBounds(50,455,50,20);
        tearsIcon.setBounds(15,480,30,30);
        tears.setBounds(50,485,50,20);
        damageIcon.setBounds(15,510,30,30);
        damage.setBounds(50,515,50,20);
        rangeIcon.setBounds(15,540,30,30);
        range.setBounds(50,545,50,20);
        shotSpeedIcon.setBounds(15,570,30,30);
        shotSpeed.setBounds(50,575,50,20);
        luckIcon.setBounds(15,600,30,30);
        luck.setBounds(50,605,50,20);
        trinketLabel.setBounds(15,630,100,20);
        startingTrinket.setBounds(15,650,210,20);
        randomTrinket.setBounds(135,630,90,20);
        pocketLabel.setBounds(150,330,100,30);
        cards.setBounds(150, 360, 75, 30);
        pills.setBounds(225, 360, 75, 30);
        runes.setBounds(300, 360, 75, 30);
        startingPocket.setBounds(150,400,215,25);
        randomPocket.setBounds(250,335,115,20);
        pocketItemLabel.setBounds(150,425,100,30);
        randomPocketItem.setBounds(250,430,115,20);
        startingPocketItem.setBounds(150,455,215,20);
        createCharacterButton.setBounds(20,680,200,30);


        //add elements to form
        characterCreator.add(characterNameLabel);
        characterCreator.add(characterName);
        characterCreator.add(category1);
        characterCreator.add(category2);
        characterCreator.add(category3);
        characterCreator.add(startingHealthLabel);
        characterCreator.add(redHeartIcon);
        characterCreator.add(redHearts);
        characterCreator.add(soulHeartIcon);
        characterCreator.add(soulHearts);
        characterCreator.add(blackHeartIcon);
        characterCreator.add(blackHearts);
        characterCreator.add(boneHeartIcon);
        characterCreator.add(boneHearts);
        characterCreator.add(rottenHeartIcon);
        characterCreator.add(rottenHearts);
        characterCreator.add(brokenHeartIcon);
        characterCreator.add(brokenHearts);
        characterCreator.add(startingActiveItemLabel);
        characterCreator.add(startingActiveItem);
        characterCreator.add(randomActiveItem);
        characterCreator.add(startingPassiveItemsLabel);
        characterCreator.add(startingPassiveItem1);
        characterCreator.add(startingPassiveItem2);
        characterCreator.add(startingPassiveItem3);
        characterCreator.add(morePassiveItems);
        characterCreator.add(trinketLabel);
        characterCreator.add(startingTrinket);
        characterCreator.add(randomTrinket);
        characterCreator.add(pocketLabel);
        characterCreator.add(startingPickups);
        characterCreator.add(coinIcon);
        characterCreator.add(coins);
        characterCreator.add(bombIcon);
        characterCreator.add(bombs);
        characterCreator.add(keyIcon);
        characterCreator.add(key);
        characterCreator.add(startingStatsLabel);
        characterCreator.add(damage);
        characterCreator.add(damageIcon);
        characterCreator.add(tears);
        characterCreator.add(tearsIcon);
        characterCreator.add(range);
        characterCreator.add(rangeIcon);
        characterCreator.add(shotSpeed);
        characterCreator.add(shotSpeedIcon);
        characterCreator.add(moveSpeed);
        characterCreator.add(speedIcon);
        characterCreator.add(luckIcon);
        characterCreator.add(luck);
        characterCreator.add(randomPocket);
        characterCreator.add(specialAbilities);
        characterCreator.add(noRedHealth);
        characterCreator.add(canHavePocketItem);
        characterCreator.add(pocketLabel);
        characterCreator.add(cards);
        characterCreator.add(runes);
        characterCreator.add(pills);
        characterCreator.add(startingPocket);
        characterCreator.add(pocketItemLabel);
        characterCreator.add(randomPocketItem);
        characterCreator.add(startingPocketItem);
        characterCreator.add(createCharacterButton);

        //add elements to groups
        characterCategory.add(category1);
        characterCategory.add(category2);
        characterCategory.add(category3);
        pocketCategory.add(pills);
        pocketCategory.add(cards);
        pocketCategory.add(runes);

        //hide pocket item elements
        pocketItemLabel.setVisible(false);
        startingPocketItem.setVisible(false);
        randomPocketItem.setVisible(false);

        //action listeners
        String charName = characterName.getText();
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == category1){
                    characterName.setText("");
                    characterName.setText(charName);
                    newCharacter.name = characterName.getText();
                    newCharacter.category = category1.getText();
                }
                if(e.getSource() == category2){
                    characterName.setText("");
                    characterName.setText("T. "+charName);
                    newCharacter.name = characterName.getText();
                    newCharacter.category = category2.getText();
                }
                if(e.getSource() == category3){
                    characterName.setText("");
                    characterName.setText("The "+charName);
                    newCharacter.name = characterName.getText();
                    newCharacter.category = category3.getText();
                }
                if(e.getSource() == randomTrinket){
                    lists.setRandomIndex(startingTrinket);
                }
                if(e.getSource() == randomActiveItem){
                    lists.setRandomIndex(startingActiveItem);
                }
                if(e.getSource() == randomPocket){
                    lists.setRandomIndex(startingPocket);
                }
                if(e.getSource() == randomPocketItem){
                    lists.setRandomIndex(startingPocketItem);
                }
                if(e.getSource() == cards){
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket,"src/lists/cardsReversesList.txt");
                }
                if(e.getSource() == pills){
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket,"src/lists/pillsList.txt");
                }
                if(e.getSource() == runes){
                    startingPocket.removeAllItems();
                    lists.prepareList(startingPocket,"src/lists/runesSoulStones.txt");
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
                    newCharacter.canHaveRedHealth = noRedHealth.isSelected();
                }
                if(e.getSource() == canHavePocketItem){
                    if(canHavePocketItem.isSelected()){
                        JOptionPane.showMessageDialog(null,"Twoja postać może mieć pocket item!");
                        pocketItemLabel.setVisible(true);
                        startingPocketItem.setVisible(true);
                        randomPocketItem.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Twoja postać nie może mieć pocket itemu!");
                        pocketItemLabel.setVisible(false);
                        startingPocketItem.setVisible(false);
                        randomPocketItem.setVisible(false);
                    }
                    newCharacter.canHavePocketItem = canHavePocketItem.isSelected();
                }
                if(e.getSource() == createCharacterButton){
                    //FIXME Naprawić przypisanie itemu aktywnego, pocketa, trunketu oraz pocket itemu + naprawić sprawdzeniie zanznaczenia checkboxów
                    if(statsOK && newCharacter.okHealth()){
                        JOptionPane.showMessageDialog(null, "Udało się utworzyć postać!");
                        JOptionPane.showMessageDialog(null,"Podsumowanie: \n"+newCharacter.toString());
                        new ReadWriteExportProject().saveProject(newCharacter.toString());
                        characterCreator.dispose();
                    }
                    //FIXME fix okHealth function
                    else if(!newCharacter.okHealth()){
                        JOptionPane.showMessageDialog(null,"Nieprawidłowa ilość serc!");
                    }
                }
            }
        };

        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {}
            @Override
            public void focusLost(FocusEvent e) {
                if(e.getSource() == characterName){
                    if(charName.contains("Who am I?")){
                        JOptionPane.showMessageDialog(null,"Proszę nadać postaci imię");
                        statsOK = false;
                        characterName.requestFocus();
                    }
                    else {
                        newCharacter.name = charName;
                        redHearts.requestFocus();
                    }
                }
                if(e.getSource() == startingActiveItem){
                        if(startingActiveItem.getSelectedIndex() != 0){
                            newCharacter.activeItem = startingActiveItem.getSelectedItem().toString();

                        }
                        else {
                            if(startingActiveItem.getSelectedItem().equals(null)){
                                JOptionPane.showMessageDialog(null,"Proszę wybrać item aktywny!");
                                statsOK = false;
                                startingActiveItem.requestFocus();
                            }
                            else {
                                newCharacter.activeItem = "";
                            }
                        }

                }
                if(e.getSource() == startingTrinket){
                    if(startingTrinket.getSelectedIndex() != 0){
                        newCharacter.trinket = startingTrinket.getSelectedItem().toString();
                    }
                    else {
                        if(startingTrinket.getSelectedItem().equals(null)){
                            JOptionPane.showMessageDialog(null,"Proszę wybrać trinket!");
                            statsOK = false;
                            startingTrinket.requestFocus();
                        }
                        else {
                            newCharacter.trinket = startingTrinket.getSelectedItem().toString();
                        }
                    }
                }
                if(e.getSource() == startingPassiveItem1){
                    if(startingPassiveItem1.getSelectedIndex() == 0 || startingPassiveItem1.getSelectedItem().equals(null)){
                        JOptionPane.showMessageDialog(null,"Proszę wybrać item!");
                    }
                    else {
                        if(startingPassiveItem1.getSelectedIndex() == startingPassiveItem2.getSelectedIndex() || startingPassiveItem1.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako pierwszy item pasywny!");
                        }
                        else {
                            newCharacter.passiveItem1 = startingPassiveItem1.getSelectedItem().toString();
                        }
                    }
                }
                if(e.getSource() == startingPassiveItem2){
                    if(startingPassiveItem2.getSelectedIndex() == 0 || startingPassiveItem2.getSelectedItem().equals(null)){
                        newCharacter.passiveItem2 = "";
                    }
                    else {
                        if(startingPassiveItem2.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem2.getSelectedIndex() == startingPassiveItem3.getSelectedIndex()){
                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako drugi item pasywny!");
                        }
                        else {
                            newCharacter.passiveItem2 = startingPassiveItem2.getSelectedItem().toString();
                        }
                    }
                }
                if(e.getSource() == startingPassiveItem3){
                    if(startingPassiveItem3.getSelectedIndex() == 0 || startingPassiveItem3.getSelectedItem().equals(null)){
                        newCharacter.passiveItem3 = "";
                    }
                    else {
                        if(startingPassiveItem3.getSelectedIndex() == startingPassiveItem1.getSelectedIndex() || startingPassiveItem3.getSelectedIndex() == startingPassiveItem2.getSelectedIndex()){
                            JOptionPane.showMessageDialog(null,"Wybierz inny item jako trzeci item pasywny!");
                        }
                        else {
                            newCharacter.passiveItem3 = startingPassiveItem3.getSelectedItem().toString();
                        }
                    }
                }
                if(e.getSource() == startingPickups){
                    if(startingPocket.getSelectedIndex() != 0 && !startingPocket.getSelectedItem().equals(null)){
                        newCharacter.pocket = startingPocket.getSelectedItem().toString();
                    }
                    else {
                        newCharacter.pocket = "";
                    }
                }
                if(e.getSource() == coins){
                    int coinCounter = Integer.parseInt(coins.getText());
                    if(coinCounter < 0){
                        JOptionPane.showMessageDialog(null,"Nie można mieć mniej niż 0 coinów");
                        statsOK = false;
                        coins.requestFocus();
                    }
                    else if(coinCounter > 99 && (!startingPassiveItem1.getSelectedItem().toString().equals("Deep " +
                            "Pockets")) || !startingPassiveItem2.getSelectedItem().toString().equals("Deep Pockets") || !startingPassiveItem3.getSelectedItem().toString().equals("Deep Pockets")) {
                        JOptionPane.showMessageDialog(null,"Nie można mieć więcej niż 99 coinów");
                        statsOK = false;
                        coins.requestFocus();
                    }
                    else {
                        newCharacter.coins = coinCounter;
                        bombs.requestFocus();
                    }
                }
                if(e.getSource() == bombs){
                    int bombCounter = Integer.parseInt(bombs.getText());
                    if(bombCounter < 0 || bombCounter > 99){
                        JOptionPane.showMessageDialog(null,"Nieprawidłowa ilość bomb");
                    }
                    else {
                        newCharacter.bombs = bombCounter;
                        key.requestFocus();
                    }
                }
                if(e.getSource() == key){
                    int keysCounter = Integer.parseInt(key.getText());
                    if(keysCounter < 0 || keysCounter > 99){
                        JOptionPane.showMessageDialog(null,"Nieprawidłowa ilość kluczy");
                    }
                    else {
                        newCharacter.keys = keysCounter;
                        moveSpeed.requestFocus();
                    }
                }
                if(e.getSource() == moveSpeed){
                    double speedValue = Double.parseDouble(moveSpeed.getText());
                    if(speedValue < 0.60 || speedValue > 2.00){
                        JOptionPane.showMessageDialog(null,"Speed have to be between 0.6-2.0");
                        statsOK = false;
                        moveSpeed.requestFocus();
                    }
                    else {
                        newCharacter.speed = speedValue;
                        tears.requestFocus();
                    }
                }
                if (e.getSource() == damage) {
                    double damageValue = Double.parseDouble(damage.getText());
                    if(damageValue < 0.5){
                        JOptionPane.showMessageDialog(null,"Damage can't be lower then 0.5!");
                        statsOK = false;
                        damage.requestFocus();
                    }
                    else {
                        newCharacter.damage = damageValue;
                        range.requestFocus();
                    }
                }
                if(e.getSource() == tears){
                    double tearsValue = Double.parseDouble(tears.getText());
                    if(tearsValue < 0.5 || tearsValue > 5.0){
                        JOptionPane.showMessageDialog(null,"Tears have to be between 0.5-5.0!");
                        statsOK = false;
                        tears.requestFocus();
                    }
                    else {
                        newCharacter.tears = tearsValue;
                        damage.requestFocus();
                    }
                }
                if(e.getSource() == shotSpeed){
                    double shotSpeedValue = Double.parseDouble(shotSpeed.getText());
                    if(shotSpeedValue < 0.60 || shotSpeedValue > 2.00){
                        JOptionPane.showMessageDialog(null,"Speed have to be between 0.6-2.0");
                        statsOK = false;
                        shotSpeed.requestFocus();
                    }
                    else {
                        newCharacter.shotSpeed = shotSpeedValue;
                        luck.requestFocus();
                    }
                }
                if(e.getSource() == luck){
                        double luckValue = Double.parseDouble(luck.getText());
                        if(luckValue < -3.0){
                            JOptionPane.showMessageDialog(null,"Luck musi być większy niż -3.0");
                            statsOK = false;
                            luck.requestFocus();
                        }
                        else {
                            newCharacter.luck = luckValue;
                            startingTrinket.requestFocus();
                        }
                }
                if(e.getSource() == range){
                    double rangeValue = Double.parseDouble(range.getText());
                    if(rangeValue < 1.0){
                        JOptionPane.showMessageDialog(null,"Range musi być większy niż 1.0");
                        statsOK = false;
                        range.requestFocus();
                    }
                    else {
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

        startingPassiveItem1.addFocusListener(fl);
        startingPassiveItem2.addFocusListener(fl);
        startingPassiveItem3.addFocusListener(fl);
        moveSpeed.addFocusListener(fl);
        damage.addFocusListener(fl);
        shotSpeed.addFocusListener(fl);

    }
}
