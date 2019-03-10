package com.common;

public class CharClassImpl implements CharClass {
    private SkillImpl specialSkill;         // 특수 스킬
    private Weapon.WeaponType[] availableWeaponArr; // 전용 무기 리스트
    private int requiredLevel;          // 전직시 필요 레벨
    private Species requiredSpecies;    // 전직시 필요 종족

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public CharClassImpl(SkillImpl specialSkill, Weapon.WeaponType[] availableWeaponArr, int requiredLevel, Species requiredSpecies) {
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
    public boolean checkLevel(CharacterImpl character) {
        return (requiredLevel > 0) && (character.getLevel() >= requiredLevel);
    }

    public boolean checkSpecies(CharacterImpl character) {
        return character.getSpecies().equals(requiredSpecies);
    }

    public boolean canChangeClass(CharacterImpl character) {
        return character.isAlive() && checkLevel(character) && checkSpecies(character);
    }

    public boolean canChangeClassTo(CharacterImpl character, CharClassImpl targetClass) {
        return canChangeClass(character);
    }

    public boolean changeClass(CharacterImpl character, CharClassImpl targetClass) {
        if (!canChangeClassTo(character, targetClass)) {
            return false;
        }

        character.setCharClass(targetClass);
        return true;
    }

    /*
     +------------------+
     |  Getter & Setter |
     +------------------+
     */
    public SkillImpl getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(SkillImpl specialSkill) {
        this.specialSkill = specialSkill;
    }

    public Weapon.WeaponType[] getAvailableWeaponArr() {
        return availableWeaponArr;
    }

    public void setAvailableWeaponArr(Weapon.WeaponType[] availableWeaponArr) {
        this.availableWeaponArr = availableWeaponArr;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Species getRequiredSpecies() {
        return requiredSpecies;
    }

    public void setRequiredSpecies(Species requiredSpecies) {
        this.requiredSpecies = requiredSpecies;
    }
}
