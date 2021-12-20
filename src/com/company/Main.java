package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    static Random rng = new Random();
    //TemplateCharacter basicIsaac = new TemplateCharacter();
    public static void createGUI() {
        // create a frame
        JFrame characterCreator = new JFrame("Isaac Character Creator");
        characterCreator.setSize(600, 600);
        characterCreator.setLayout(null);
        characterCreator.setVisible(true);
        characterCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterCreator.setAlwaysOnTop(true);

        //create form elements
        JLabel characterNameLabel = new JLabel("Character's name: ");
        TextField characterName = new TextField("Who am I?");
        ButtonGroup characterCategory = new ButtonGroup();
        JRadioButton category1 = new JRadioButton("Normal", true);
        JRadioButton category2 = new JRadioButton("Tainted");
        JRadioButton category3 = new JRadioButton("Stranger Role");
            //health
        JLabel startingHealthLabel = new JLabel("Starting health:");
        JLabel redHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_red_full.png"));
        JLabel soulHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_soul_full.png"));
        JLabel blackHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_black_full.png"));
        JLabel boneHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_bone_empty.png"));
        JLabel rottenHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_heart_rotten.png"));
        JLabel brokenHeartIcon = new JLabel(new ImageIcon("src/icons/hearts/HUD_Broken_Heart.png"));
        TextField redHearts = new TextField("1");
        TextField soulHearts = new TextField("1");
        TextField blackHearts = new TextField("1");
        TextField boneHearts = new TextField("1");
        TextField rottenHearts = new TextField("1");
        TextField brokenHearts = new TextField("0");
           // items
        JLabel startingActiveItemLabel = new JLabel("Starting active item: ");
        JComboBox startingActiveItem = new JComboBox();
        startingActiveItem.addItem("Random");
        JButton randomActiveItem = new JButton("Random");
        JLabel startingPassiveItemsLabel = new JLabel("Starting passive items: ");
        JComboBox startingPassiveItem1 = new JComboBox();
        JComboBox startingPassiveItem2 = new JComboBox();
        JComboBox startingPassiveItem3 = new JComboBox();
        JButton morePassiveItems = new JButton("Add passive item");
           //trinkets and pickups
        JLabel startingPickups = new JLabel("Starting pickups:");
        JLabel coinIcon = new JLabel(new ImageIcon("src/icons/pickups/Penny.png"));
        TextField coins = new TextField("0");
        JLabel bombIcon = new JLabel(new ImageIcon("src/icons/pickups/Bomb.png"));
        TextField bombs = new TextField("0");
        JLabel keyIcon = new JLabel(new ImageIcon("src/icons/pickups/Key.png"));
        TextField key = new TextField("0");
        JLabel trinketLabel = new JLabel("Trinket:");
        JButton randomTrinket = new JButton("Get random trinket");
        JLabel pickupLabel = new JLabel("Card/Pill/Rune/Soul Stone:");
        JButton randomPickup = new JButton("Get random pickup:");
        JButton createCharacterButton = new JButton("Create a character");
        //interfaces
        JCheckBox noRedHealth = new JCheckBox("Can't have red health");
        JCheckBox canHavePocketItem = new JCheckBox("Can have pocket item");
        //set frame icon
        /*
        ImageIcon coinIcon2 = new ImageIcon("src/icons/pickups/Penny.png");
        characterCreator.setIconImage(coinIcon2.getImage());
        */


        //set sizes of elements
        characterNameLabel.setBounds(15, -35, 125, 100);
        characterName.setBounds(150, 5, 130, 25);
        category1.setBounds(15, 45, 75, 30);
        category2.setBounds(100, 45, 75, 30);
        category3.setBounds(185, 45, 150, 30);
        startingHealthLabel.setBounds(15,85,100, 30);
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
        startingActiveItem.setBounds(150,120,100,20);
        //startingPickups.setBounds(15,390,100,30);
        //pickupLabel.setBounds(15,370,150,50);
        startingPickups.setBounds(15,350,100,30);
        coinIcon.setBounds(15,400,30,30);
        coins.setBounds(50,405,50,20);
        bombIcon.setBounds(15,430,30,30);
        bombs.setBounds(50,435,50,20);
        keyIcon.setBounds(15,460,30,30);
        key.setBounds(50,465,50,20);
        noRedHealth.setBounds(150,210,150,25);
        canHavePocketItem.setBounds(150,235,150,50);
        //randomTrinket.setBounds(200,100,150,25);

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
        characterCreator.add(randomTrinket);
        characterCreator.add(pickupLabel);
        characterCreator.add(startingPickups);
        characterCreator.add(coinIcon);
        characterCreator.add(coins);
        characterCreator.add(bombIcon);
        characterCreator.add(bombs);
        characterCreator.add(keyIcon);
        characterCreator.add(key);
        characterCreator.add(randomPickup);
        characterCreator.add(noRedHealth);
        characterCreator.add(canHavePocketItem);


        //add elements to groups
        characterCategory.add(category1);
        characterCategory.add(category2);
        characterCategory.add(category3);


        //action listeners
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
        randomActiveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        randomTrinket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int trinketID = rng.nextInt(1,189);
                JOptionPane.showMessageDialog(null,"Trinket ID: "+trinketID);
            }
        });
        noRedHealth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(noRedHealth.isSelected()){
                    redHearts.setEditable(false);
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
        //redHearts.setText(String.valueOf(super.redHeartCounter));
    }
    public static void main(String[] args) {
        createGUI();
    }
}
