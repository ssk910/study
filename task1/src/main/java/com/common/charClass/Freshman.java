package com.common.charClass;

import com.common.*;
import com.common.Character;

/**
 * 첫 클래스
 */
public class Freshman extends CharClassImpl {
    private Character character;        // 캐릭터
    private Skill specialSkill;         // 특수 스킬
    private Weapon exclusiveUseWeapon;  // 전용 무기
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Freshman(Character character, Species species) {
        // 엘프의 경우 전용 무기로 활 세팅하는 로직 추가 필요.
        this(character, null, null, 1, species);
    }

    public Freshman(Character character, Skill specialSkill, Weapon exclusiveUseWeapon, int requiredLevel, Species requiredSpecies) {
        super(character, specialSkill, exclusiveUseWeapon, requiredLevel, requiredSpecies);
        this.character = character;
        this.specialSkill = specialSkill;
        this.exclusiveUseWeapon = exclusiveUseWeapon;
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
    public void changeClass(CharClass targetClass) {
        super.changeClass(targetClass);
    }
}
