package com.common;

public class WeaponImpl implements Weapon {
    private String name;            // 무기 이름
    private int range;              // 사거리
    private WeaponType weaponType;  // 무기 종류
    private int attackPower;        // 공격력
    private int durability;         // 내구도
    private int attackCount;        // 공격 횟수

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public WeaponImpl(String name, int range, WeaponType weaponType, int attackPower, int durability) {
        this.name = name;
        this.range = range;
        this.weaponType = weaponType;
        this.attackPower = attackPower;
        this.durability = durability;
        this.attackCount = 0;
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
    public boolean isCapableOfEquip(Character owner) {
        return weaponType.equals(owner.getCharClass().getAvailableWeapon());
    }

    public boolean isAttackable(Character owner, Character target) {
        return owner.isAlive()              // 소유자 생존
                && target.isAlive()         // 대상자 생존
                && !target.isInvincible()   // 대상자 무적 아님
                && durability > 0;          // 내구도 0 초과
    }

    public void affectToWeapon() {
        increaseAttackCnt();
        decreaseDurability();
        initializeAttackCnt();
    }

    public void affectToOwner(Character owner, Character target) {

    }

    public void affectToTarget(Character owner, Character target) {
        /* 대상자가 회피 성공함 */
        if (hasTargetDodged(target)) {
            return;
        }

        /* 대상자의 HP 감소 */
        decreaseTargetHp(owner, target);
    }

    public void attack(Character owner, Character target) {
        if (isAttackable(owner, target) && isCapableOfEquip(owner)) {
            affectToWeapon();
            affectToOwner(owner, target);
            affectToTarget(target, target);
        }
    }

    /*
     +------------------+
     |  Private Methods |
     +------------------+
     */
    /* 공격횟수 증가 */
    private void increaseAttackCnt() {
        attackCount = attackCount + 1;
    }

    /* 내구도 감소 */
    private void decreaseDurability() {
        if (attackCount >= 100) {
            durability = durability <= 0
                    ? 0
                    : durability - 1;
        }
    }

    /* 공격횟수 초기화 */
    private void initializeAttackCnt() {
        // 100회 넘을 때마다 초기화
        attackCount = attackCount % 100;
    }

    private boolean hasTargetDodged(Character target) {
        // 회피율
        double dodgeRate = Math.random() * 100 + 1;

        // 성공여부 판단
        return target.getDodgePower() >= dodgeRate;
    }

    /* 대상자의 HP 감소 */
    private void decreaseTargetHp(Character owner, Character target) {
        // 공격력
        int attack = owner.getAttackPower() + attackPower;

        // 방어력
        int defense = target.getDefensePower();

        // 데미지
        int damage = attack - defense;
        damage = (damage <= 0)
                ? 0
                : damage;

        // 공격 대상자 HP 결과
        int targetResultHp = target.getHp() - damage;
        targetResultHp = (targetResultHp <= 0)
                ? 0
                : targetResultHp;

        // HP 감소
        target.setHp(targetResultHp);
    }
}
