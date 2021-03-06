package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;

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

    public Sword(String name, int range, WeaponType weaponType, int weaponAttackPower, int durability) {
        super(name, range, weaponType, weaponAttackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
