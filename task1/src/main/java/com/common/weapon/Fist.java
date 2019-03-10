package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;

/**
 * [이름]
 *      주먹
 *
 * [사거리]
 *      1
 *
 * [무기 종류]
 *      주먹
 *
 * [공격력]
 *      1
 *
 * [내구도]
 *      0 (공격 불가)
 */
public class Fist extends WeaponImpl {
    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Fist() {
        this("주먹", 1, WeaponType.FIST, 1, 0);
    }

    public Fist(String name, int range, WeaponType weaponType, int weaponAttackPower, int durability) {
        super(name, range, weaponType, weaponAttackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
