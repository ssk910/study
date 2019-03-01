package com.common.charClass;

import com.common.Character;
import com.common.*;
import com.common.skill.special.Invincible;

/**
 * 전사 클래스
 */
public class Warrior extends CharClassImpl {
    private Character character;        // 캐릭터
    private Skill specialSkill;         // 특수 스킬
    private WeaponType availableWeapon; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Warrior(Character character) {
        this(character, new Invincible(character), WeaponType.SWORD, 99, Species.HUMAN);
    }

    public Warrior(Character character, Skill specialSkill, WeaponType availableWeapon, int requiredLevel, Species requiredSpecies) {
        super(character, specialSkill, availableWeapon, requiredLevel, requiredSpecies);
        this.character = character;
        this.specialSkill = specialSkill;
        this.availableWeapon = availableWeapon;
        this.requiredLevel = requiredLevel;
        this.requiredSpecies = requiredSpecies;
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
    @Override
    public boolean checkLevel() {
        return super.checkLevel();
    }

    @Override
    public boolean checkSpecies() {
        return super.checkSpecies();
    }

    @Override
    public boolean canChangeClass() {
        return super.canChangeClass();
    }

    @Override
    public boolean canChangeClassTo(CharClass targetClass) {
        return super.canChangeClassTo(targetClass);
    }

    @Override
    public WeaponType getAvailableWeapon() {
        return super.getAvailableWeapon();
    }

    @Override
    public void changeClass(CharClass targetClass) {
        super.changeClass(targetClass);
    }
}
