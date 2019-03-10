package com.common.charClass;

import com.common.*;

/**
 * 돌격병 클래스
 */
public class Berserker extends Freshman {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponArr; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Berserker() {
        // 30초동안 공격력이 5배 증가하는 스킬 구현 필요.
        this(null, new Weapon.WeaponType[]{Weapon.WeaponType.SWORD, Weapon.WeaponType.AXE}, 99, Species.ORC);
    }

    public Berserker(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponArr, int requiredLevel, Species requiredSpecies) {
        super(specialSkill, availableWeaponArr, requiredLevel, requiredSpecies);
        this.specialSkill = specialSkill;
        this.availableWeaponArr = availableWeaponArr;
        this.requiredLevel = requiredLevel;
        this.requiredSpecies = requiredSpecies;
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
