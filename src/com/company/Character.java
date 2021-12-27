package com.company;

public class Character {
    public final int MAX_HP = 12;
    public String name;
    public int redHeartCounter;
    public int soulHeartCounter;
    public int blackHeartCounter;
    public int boneHeartCounter;
    public int brokenHeartCounter;
    public double damage;
    public double tears;
    public double shotSpeed;
    public double range;
    public double luck;
    public int coins;
    public int bombs;
    public int keys;
    public boolean canHaveRedHealth;
    public boolean canHavePocketItem;

    public Character(){
        name = "Isaac";
        redHeartCounter = 3;
        soulHeartCounter = 0;
        blackHeartCounter = 0;
        boneHeartCounter = 0;
        brokenHeartCounter = 0;
        damage = 3.50;
        tears = 2.73;
        shotSpeed = 1.00;
        range = 6.50;
        luck  = 1.00;
        coins = 0;
        bombs = 0;
        keys = 0;
        canHaveRedHealth = true;
        canHavePocketItem = false;
    }

    public Character(String name, int redHeartsNumber, int soulHeartNummber, int blackHeartNumber, int boneHeartNumber,
                             int brokenHeartNumber, double damage, double tears, double shotSpeed, double range,
                             double shotSpeedValue, double luck, int coinsNumber, int bombsNumber, int keyNumber,
                     boolean canHaveRedHealth) {
            this.name = name;
            this.redHeartCounter = redHeartsNumber;
            this.soulHeartCounter = soulHeartNummber;
            this.blackHeartCounter = blackHeartNumber;
            this.boneHeartCounter = boneHeartNumber;
            this.brokenHeartCounter = brokenHeartNumber;
            this.damage = damage;
            this.tears = tears;
            this.shotSpeed = shotSpeedValue;
            this.range = range;
            this.luck = luck;
            this.coins = coinsNumber;
            this.bombs = bombsNumber;
            this.keys = keyNumber;
            this.canHaveRedHealth = canHaveRedHealth;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"\n Red hearts: "+this.redHeartCounter+"\n Soul hearts: "+this.soulHeartCounter;
    }
}
