package com.common;

/**
 * 무기
 */
public interface Weapon {
    /* 무기 장착가능 여부 */
    boolean isCapableOfEquip(Character owner);

    /* 공격가능 여부 */
    boolean isAttackable(Character owner, Character target);

    /* 무기에 대한 영향 */
    void affectToWeapon();

    /* 소유자에 대한 영향 */
    void affectToOwner(Character owner, Character target);

    /* 대상자에 대한 영향 */
    void affectToTarget(Character owner, Character target);

    /* 공격 */
    void attack(Character owner, Character target);
}
