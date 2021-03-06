package com.company;

import javax.swing.*;

public class Character extends TemplateCharacter implements isaacEntities {
    public Character(){
        name = "Isaac";
        category = "normal";
        redHeartCounter = 3;
        soulHeartCounter = 0;
        blackHeartCounter = 0;
        boneHeartCounter = 0;
        brokenHeartCounter = 0;
        damage = 3.50;
        tears = 2.73;
        shotSpeed = 1.00;
        speed = 1.00;
        range = 6.50;
        luck  = 1.00;
        coins = 0;
        bombs = 0;
        keys = 0;
        canHaveRedHealth = true;
        canHavePocketItem = false;
        isaacEntities.add(this);
    }


    @Override
    public String toString(){
        String charInfo ="Name: "+this.name+"\nCategory: "+this.category+"\nRed hearts: "+this.redHeartCounter+
                "\nSoul hearts: "+this.soulHeartCounter+"\nBlack hearts: "+this.blackHeartCounter+"\nBone hearts: "+this.boneHeartCounter+"\nBroken hearts: "+this.brokenHeartCounter+"\nSpeed: "+this.speed+"\nDamage: "+this.damage+"\nTears: "+this.tears+"\nShot Speed: "+this.shotSpeed+"\nRange: "+this.range+"\nLuck: "+this.luck+"\nCoins: "+this.coins+"\nBombs:"+this.bombs+"\nKeys: "+this.keys+"\nStarting active item: "+this.activeItem+"\nStarting passive items: \n"+this.passiveItem1+"\n"+this.passiveItem2+"\n"+this.passiveItem3+"\nPocket: "+this.pocket+"\nTrinket: "+this.trinket;
        if(canHaveRedHealth){
            charInfo += "\nCan have red health: Yes";
        }
        else {
            charInfo += "\nCan have red health: No";
        }
        if(canHavePocketItem){
            charInfo += "\nCan have pocket item: Yes\nPocket item: "+this.pocketItem;
        }
        else {
            charInfo += "\nCan have pocket item: No";
        }
        return charInfo;
    }
    public void showEntities(){
        for(int i=0;i<isaacEntities.size();i++){
            JOptionPane.showMessageDialog(null,"Postać nr: "+i+"\r\n"+ isaacEntities.get(i).toString());
        }
    }
}
