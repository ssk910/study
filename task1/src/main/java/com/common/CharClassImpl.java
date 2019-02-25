package com.common;

public class CharClassImpl implements CharClass {
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
    public CharClassImpl(Character character, Skill specialSkill, Weapon exclusiveUseWeapon, int requiredLevel, Species requiredSpecies) {
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
    public boolean checkLevel() {
        return (requiredLevel > 0) && (character.getLevel() >= requiredLevel);
    }

    public boolean checkSpecies() {
        return character.getSpecies().equals(requiredSpecies);
    }

    public boolean canChangeClass() {
        return character.isAlive() && checkLevel() && checkSpecies();
    }

    public boolean canChangeClassTo(CharClass targetClass) {
        return canChangeClass() && (character.getClassChangeList().contains(targetClass));
    }

    public void changeClass(CharClass targetClass) {
        if (!canChangeClassTo(targetClass)) {
            return;
        }

        character.setCharClass(targetClass);
        character.setClassChangeList(null);
    }
}
