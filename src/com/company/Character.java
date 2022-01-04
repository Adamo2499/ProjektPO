package com.company;

public class Character {
    public final int HP_LIMIT = 12;
    public String name;
    public String category;
    public int redHeartCounter;
    public int soulHeartCounter;
    public int blackHeartCounter;
    public int boneHeartCounter;
    public int brokenHeartCounter;
    public double speed;
    public double damage;
    public double tears;
    public double shotSpeed;
    public double range;
    public double luck;
    public int coins;
    public int bombs;
    public int keys;
    public String activeItem;
    public String passiveItem1;
    public String passiveItem2;
    public String passiveItem3;
    public String pocket;
    public String trinket;
    public String pocketItem;
    public boolean canHaveRedHealth;
    public boolean canHavePocketItem;

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

    }

    @Override
    public String toString(){
        return "Name: "+this.name+"\nCategory: "+this.category+"\nRed hearts: "+this.redHeartCounter+
                "\nSoul hearts: "+this.soulHeartCounter+"\nBlack hearts: "+this.blackHeartCounter+"\nBone hearts: "+this.boneHeartCounter+"\nBroken hearts: "+this.brokenHeartCounter+"\nSpeed: "+this.speed+"\nDamage: "+this.damage+"\nTears: "+this.tears+"\nShot Speed: "+this.shotSpeed+"\nRange: "+this.range+"\nLuck: "+this.luck+"\nCoins: "+this.coins+"\nBombs:"+this.bombs+"\nKeys: "+this.keys+"\nStarting active item: "+this.activeItem+"\nStarting passive items: \n"+this.passiveItem1+"\n"+this.passiveItem2+"\n"+this.passiveItem3+"\nPocket: "+this.pocket+"\nTrinket: "+this.trinket+"\nCan have red health: "+canHaveRedHealth+"\nCan have Pocket Item: "+canHavePocketItem+"\nPocket item: "+this.pocketItem;
    }
}
