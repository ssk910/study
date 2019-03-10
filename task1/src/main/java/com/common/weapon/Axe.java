package com.common.weapon;

import com.common.Character;
import com.common.WeaponImpl;

/**
 * [이름]
 *      도끼
 *
 * [사거리]
 *      3
 *
 * [무기 종류]
 *      도끼
 *
 * [공격력]
 *      36
 *
 * [내구도]
 *      7
 */
public class Axe extends WeaponImpl {
    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Axe() {
        this("도끼", 3, WeaponType.AXE, 36, 7);
    }

    public Axe(String name, int range, WeaponType weaponType, int weaponAttackPower, int durability) {
        super(name, range, weaponType, weaponAttackPower, durability);
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
}
