package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;

/**
 * [이름]
 *      지팡이
 *
 * [사거리]
 *      2
 *
 * [무기 종류]
 *      지팡이
 *
 * [공격력]
 *      10
 *
 * [내구도]
 *      10
 */
public class Staff extends WeaponImpl {
    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Staff() {
        this("지팡이", 2, WeaponType.STAFF, 10, 10);
    }

    public Staff(String name, int range, WeaponType weaponType, int weaponAttackPower, int durability) {
        super(name, range, weaponType, weaponAttackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
