package com.common.skill.common;

import com.common.CharacterImpl;
import com.common.SkillImpl;

/**
 * [이름]
 *      분노
 *
 * [소모 MP]
 *      20
 *
 * [타입]
 *      액티브
 *
 * [스킬 공격력]
 *      0
 *
 * [시전 조건]
 *      - 시전자 생존.
 *
 * [시전자에 대한 효과]
 *      - MP 차감.
 *      - 방어력 20% 저하.
 *      - 공격력 30% 상승.
 *
 * [대상자에 대한 효과]
 *      - 없음. (시전자 자신에게 시전)
 */
public class Fury extends SkillImpl {
    private String name;            // 스킬 이름
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Fury() {
        this("분노", 20, SkillType.ACTIVE, 0);
    }

    public Fury(String name, int requiredMp, SkillType skillType, int skillAttackPower) {
        super(name, requiredMp, skillType, skillAttackPower);
        this.name = name;
        this.requiredMp = requiredMp;
        this.skillType = skillType;
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
    /**
     * 스킬시전 조건
     *      - 시전자가 존재 (null 아님)
     *      - MP
     *      - 시전자 생존
     * @return
     */
    @Override
    public boolean castAvailable(CharacterImpl caster, CharacterImpl target) {
        return super.casterExists(caster) && super.hasEnoughMp(caster) && caster.isAlive();
    }

    @Override
    public void affectToCaster(CharacterImpl caster, CharacterImpl target) {
        int atk = caster.getAttackPower();
        int def = caster.getDefensePower();

        // 소수점 버림
        int resultAtk = (int) (atk + atk * 0.3);
        int resultDef = (int) (def - def * 0.2);

        super.affectToCaster(caster, target);
        caster.setAttackPower(resultAtk);
        caster.setDefensePower(resultDef);
    }

    @Override
    public void affectToTarget(CharacterImpl caster, CharacterImpl target) {
        super.affectToTarget(caster, target);
        // Nothing affected to target
    }

    @Override
    public void castSkill(CharacterImpl caster, CharacterImpl target) {
        super.castSkill(caster, target);
    }
}
