package com.company;

import javax.swing.*;

public class CheckForm extends GUI{
    Character newCharacter = new Character();
    public boolean okHealth(){
        int charMAXHP = newCharacter.HP_LIMIT - newCharacter.brokenHeartCounter;
        int charHP = newCharacter.redHeartCounter+newCharacter.soulHeartCounter+newCharacter.blackHeartCounter+newCharacter.boneHeartCounter;
        if(charHP > charMAXHP || charHP == 0){
            return false;
        }
        else {
            return true;
        }

    }

    public boolean formOK(){
        boolean okForm = true;
        if(!okHealth()){
            okForm = false;
            JOptionPane.showMessageDialog(null,"Nieprawidłowa ilość serc!");
            redHearts.requestFocus();
        }
        else {
            newCharacter.redHeartCounter = Integer.parseInt(redHearts.getText());
        }
        String charName = characterName.getText();
        if(charName.equals("") || charName.equals(null)){
            okForm = false;
            JOptionPane.showMessageDialog(null,"Proszę podać imię dla postaci!");
            characterName.requestFocus();
        }
        else {
            newCharacter.name = characterName.getText();
        }
        if (!startingActiveItem.getSelectedItem().equals(null)) {
            newCharacter.activeItem = startingActiveItem.getSelectedItem().toString();

        }
        else {
                JOptionPane.showMessageDialog(null, "Proszę wybrać item aktywny!");
                statsOK = false;
                startingActiveItem.requestFocus();
        }
        if (!startingActiveItem.getSelectedItem().equals(null) && startingActiveItem.getSelectedIndex() != 0) {
            newCharacter.activeItem = startingActiveItem.getSelectedItem().toString();
        } else {
                JOptionPane.showMessageDialog(null, "Proszę wybrać item aktywny!");
                statsOK = false;
                startingActiveItem.requestFocus();
        }


        return okForm;
    }
}
