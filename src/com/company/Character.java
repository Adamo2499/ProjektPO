package com.company;

public class Character {
    public final int MAX_HP = 12;
    public String name = "Isaac";
    public int redHeartCounter = 3;
    public int soulHeartCounter = 0;
    public int blackHeartCounter = 0;
    public int boneHeartCounter = 0;
    public int brokenHeartCounter = 0;
    public double damage = 3.50;
    public double tears = 2.73;
    public double shotSpeed = 1.00;
    public double range = 6.50;
    public double luck  = 1.00;
    public int coins = 0;
    public int bombs = 0;
    public int keys = 0;
    public boolean canHaveRedHealth = true;

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
