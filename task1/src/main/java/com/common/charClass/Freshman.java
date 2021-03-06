package com.common.charClass;

import com.common.*;

/**
 * 첫 클래스
 */
public class Freshman extends CharClassImpl {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponArr; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Freshman(Species species) {
        this(null, new Weapon.WeaponType[]{Weapon.WeaponType.FIST}, 1, species);
    }

    public Freshman(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponArr, int requiredLevel, Species requiredSpecies) {
        super(specialSkill, availableWeaponArr, requiredLevel, requiredSpecies);
        this.specialSkill = specialSkill;
        this.availableWeaponArr = availableWeaponArr;
        this.requiredLevel = requiredLevel;
        this.requiredSpecies = requiredSpecies;
    }
}
