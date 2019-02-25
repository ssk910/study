package com.common;

import java.util.List;

/**
 * 캐릭터
 */
public class Character {
    private int maxLevel;       // 최대 레벨
    private int maxExp;         // 최대 경험치
    private int maxHp;          // 최대 HP
    private int maxMp;          // 최대 MP
    private int level;          // 레벨
    private int exp;            // 경험치
    private int hp;             // 현재 HP
    private int mp;             // 현재 MP
    private int attackPower;    // 공격력
    private int defensePower;   // 방어력
    private int dodgePower;     // 회피력

    private Species species;                    // 종족
    private CharClass charClass;                // 클래스
    private List<CharClass> classChangeList;    // 전직 가능한 클래스

    /**
     * 생존 여부
     * @return  {@code true}    생존
     *          {@code false}   사망
     */
    public boolean isAlive() {
        return hp > 0;
    }

    /**
     * 최대 레벨에 도달했는지 체크
     * @return
     */
    public boolean isMaxLevel() {
        return level >= maxLevel;
    }

    /*
     +------------------+
     |  Getter & Setter |
     +------------------+
     */
    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public CharClass getCharClass() {
        return charClass;
    }

    public void setCharClass(CharClass charClass) {
        this.charClass = charClass;
    }

    public List<CharClass> getClassChangeList() {
        return classChangeList;
    }

    public void setClassChangeList(List<CharClass> classChangeList) {
        this.classChangeList = classChangeList;
    }
}
