package com.common;

/**
 * 무기
 */
public interface Weapon {
    enum WeaponType {
        FIST,   // 주먹
        SWORD,  // 검
        AXE,    // 도끼
        STAFF,  // 지팡이
        BOW     // 활
    }

    /* 무기 장착가능 여부 */
    boolean isCapableOfEquip(CharacterImpl owner);

    /* 공격가능 여부 */
    boolean isAttackable(CharacterImpl owner, CharacterImpl target);

    /* 무기에 대한 영향 */
    void affectToWeapon();

    /* 소유자에 대한 영향 */
    void affectToOwner(CharacterImpl owner, CharacterImpl target);

    /* 대상자에 대한 영향 */
    void affectToTarget(CharacterImpl owner, CharacterImpl target);

    /* 공격 */
    void attack(CharacterImpl owner, CharacterImpl target);
}

