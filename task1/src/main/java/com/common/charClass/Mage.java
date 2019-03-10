package com.common.charClass;

import com.common.*;
import com.common.skill.special.Meteor;

/**
 * 마법사 클래스
 */
public class Mage extends Freshman {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponList; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Mage() {
        this(new Meteor(), new Weapon.WeaponType[]{Weapon.WeaponType.STAFF}, 99, Species.HUMAN);
    }

    public Mage(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponList, int requiredLevel, Species requiredSpecies) {
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
