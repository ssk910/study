package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;

/**
 * [이름]
 *      활
 *
 * [사거리]
 *      10
 *
 * [무기 종류]
 *      활
 *
 * [공격력]
 *      24
 *
 * [내구도]
 *      10
 */
public class Bow extends WeaponImpl {
    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Bow() {
        this("활", 10, WeaponType.BOW, 24, 10);
    }

    public Bow(String name, int range, WeaponType weaponType, int weaponAttackPower, int durability) {
        super(name, range, weaponType, weaponAttackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
