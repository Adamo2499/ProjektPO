package com.company;

public class TemplateCharacter {
    public final int MAX_HP = 12;
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
    public TemplateCharacter(){
        redHeartCounter = 3;
        soulHeartCounter = 0;
        blackHeartCounter = 0;
        boneHeartCounter = 0;
        brokenHeartCounter = 0;
        damage = 3.50;
        tears = 2.73;
        shotSpeed = 1.00;
        range = 6.50;
        luck = 0.00;
        coins = 0;
        bombs = 1;
        keys = 0;
    }
}
