package com.common;

import com.common.skill.common.Fury;
import com.common.skill.common.Heal;

import java.util.LinkedList;
import java.util.List;

public class CharacterImpl implements Character {
    private int maxLevel;           // 최대 레벨
    private int maxExp;             // 최대 경험치
    private int maxHp;              // 최대 HP
    private int maxMp;              // 최대 MP
    private int level;              // 레벨
    private int exp;                // 경험치
    private int hp;                 // 현재 HP
    private int mp;                 // 현재 MP
    private int attackPower;        // 공격력
    private int defensePower;       // 방어력
    private double dodgePower;      // 회피력
    private boolean isInvincible;   // 무적 여부
    private int invincibleTime;     // 무적상태 지속시간 (초)

    private Species species;                    // 종족
    private CharClassImpl charClass;                // 클래스

    private WeaponImpl weapon;          // 장착중인 무기
    private List<SkillImpl> skillList;  // 사용 가능한 스킬.

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public CharacterImpl(int maxLevel, int maxExp, int maxHp, int maxMp, int level, int exp, int hp, int mp, int attackPower, int defensePower, double dodgePower, boolean isInvincible, int invincibleTime, Species species, CharClassImpl charClass, WeaponImpl weapon) {
        this.maxLevel = maxLevel;
        this.maxExp = maxExp;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.dodgePower = dodgePower;
        this.isInvincible = isInvincible;
        this.invincibleTime = invincibleTime;
        this.species = species;
        this.charClass = charClass;
        this.weapon = weapon;

        skillList = new LinkedList<>();
        skillList.add(new Fury());
        skillList.add(new Heal());
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
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

    /**
     * 레벨업
     * @return
     */
    public boolean levelUp() {
        if (!canLevelUp()) {
            return false;
        }

        increaseMaxExp();
        increaseMaxHp();
        increaseMaxMp();
        increaseLevel();
        return true;
    }

    @Override
    public String toString() {
        return "CharacterImpl{" +
                "maxLevel=" + maxLevel +
                ", maxExp=" + maxExp +
                ", maxHp=" + maxHp +
                ", maxMp=" + maxMp +
                ", level=" + level +
                ", exp=" + exp +
                ", hp=" + hp +
                ", mp=" + mp +
                ", attackPower=" + attackPower +
                ", defensePower=" + defensePower +
                ", dodgePower=" + dodgePower +
                ", isInvincible=" + isInvincible +
                ", invincibleTime=" + invincibleTime +
                ", species=" + species +
                ", charClass=" + charClass +
                ", weapon=" + weapon +
                ", skillList=" + skillList +
                '}';
    }

    /*
     +-----------------+
     |  public Methods |
     +-----------------+
     */
    /**
     * 무기 장착
     * @param weaponToEquip
     * @return
     */
    public boolean equipWeapon(WeaponImpl weaponToEquip) {
        if (weaponToEquip.isCapableOfEquip(this)) {
            this.setWeapon(weaponToEquip);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 스킬 시전
     * @param skill
     * @param target
     * @return
     */
    public void castOneSkill(Skill skill, CharacterImpl target) {
        if (skillList.contains(skill)) {
            skill.castSkill(this, target);
        }
    }

    /**
     * 전직
     * @param target
     */
    public void changeClass(CharClassImpl target) {
        if (charClass.changeClass(this, target)) {
            skillList.add(target.getSpecialSkill());
        }
    }


    /*
     +------------------+
     |  private Methods |
     +------------------+
     */
    /**
     * 레벨업 가능 여부
     * @return
     */
    private boolean canLevelUp() {
        return isAlive() && !isMaxLevel() && (exp >= maxExp);
    }

    private void increaseMaxExp() {
        maxExp = (int) (maxExp * 2.7);
    }

    private void increaseMaxHp() {
        maxHp = (int) (maxHp * 1.8);
        hp = maxHp;
    }

    private void increaseMaxMp() {
        maxMp = (int) (maxMp * 1.8);
        mp = maxMp;
    }

    private void increaseLevel() {
        level++;
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

    public double getDodgePower() {
        return dodgePower;
    }

    public void setDodgePower(double dodgePower) {
        this.dodgePower = dodgePower;
    }

    public boolean isInvincible() {
        return isInvincible;
    }

    public void setInvincible(boolean invincible) {
        isInvincible = invincible;
    }

    public int getInvincibleTime() {
        return invincibleTime;
    }

    public void setInvincibleTime(int invincibleTime) {
        this.invincibleTime = invincibleTime;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public CharClassImpl getCharClass() {
        return charClass;
    }

    public void setCharClass(CharClassImpl charClass) {
        this.charClass = charClass;
    }

    public WeaponImpl getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponImpl weapon) {
        this.weapon = weapon;
    }

    public List<SkillImpl> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<SkillImpl> skillList) {
        this.skillList = skillList;
    }
}
