package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;
import com.common.WeaponType;

/**
 * [이름]
 *      검
 *
 * [사거리]
 *      3
 *
 * [무기 종류]
 *      검
 *
 * [공격력]
 *      30
 *
 * [내구도]
 *      10
 */
public class Sword extends WeaponImpl {
    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Sword() {
        this("검", 3, WeaponType.SWORD, 30, 10);
    }

    public Sword(String name, int range, WeaponType weaponType, int attackPower, int durability) {
        super(name, range, weaponType, attackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
    @Override
    public boolean isCapableOfEquip(Character owner) {
        return super.isCapableOfEquip(owner);
    }

    @Override
    public boolean isAttackable(Character owner, Character target) {
        return super.isAttackable(owner, target);
    }

    @Override
    public void affectToWeapon() {
        super.affectToWeapon();
    }

    @Override
    public void affectToOwner(Character owner, Character target) {
        super.affectToOwner(owner, target);
    }

    @Override
    public void affectToTarget(Character owner, Character target) {
        super.affectToTarget(owner, target);
    }

    @Override
    public void attack(Character owner, Character target) {
        super.attack(owner, target);
    }
}
