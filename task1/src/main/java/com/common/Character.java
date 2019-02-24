package com.common;

/**
 * 캐릭터
 */
public class Character {
    private int maxHp;          // 최대 HP
    private int maxMp;          // 최대 MP
    private int hp;             // 현재 HP
    private int mp;             // 현재 MP
    private int attackPower;    // 공격력
    private int defensePower;   // 방어력
    private int dodgePower;     // 회피력

    public boolean isAlive() {
        return hp > 0;
    }

    /*
     +------------------+
     |  Getter & Setter |
     +------------------+
     */
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getDodgePower() {
        return dodgePower;
    }

    public void setDodgePower(int dodgePower) {
        this.dodgePower = dodgePower;
    }
}
