package com.common.charClass;

import com.common.*;
import com.common.skill.special.Invincible;

/**
 * 전사 클래스
 */
public class Warrior extends Freshman {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponList; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Warrior() {
        this(new Invincible(), new Weapon.WeaponType[]{Weapon.WeaponType.SWORD, Weapon.WeaponType.AXE}, 99, Species.HUMAN);
    }

    public Warrior(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponList, int requiredLevel, Species requiredSpecies) {
        super(specialSkill, availableWeaponList, requiredLevel, requiredSpecies);
        this.specialSkill = specialSkill;
        this.availableWeaponList = availableWeaponList;
        this.requiredLevel = requiredLevel;
        this.requiredSpecies = requiredSpecies;
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
