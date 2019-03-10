package com.common.charClass;

import com.common.*;

/**
 * 흑마법사 클래스
 */
public class DarkMage extends Freshman {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponList; // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public DarkMage() {
        // 전방 30m 내 포이즌을 시전하는 스킬 구현 필요.
        this(null, new Weapon.WeaponType[]{Weapon.WeaponType.STAFF}, 99, Species.ORC);
    }

    public DarkMage(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponList, int requiredLevel, Species requiredSpecies) {
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
