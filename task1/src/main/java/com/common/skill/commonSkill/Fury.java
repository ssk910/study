package com.common.skill.commonSkill;

import com.common.Character;
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
    private Character caster;       // 시전자
    private Character target;       // 대상자
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Fury(Character caster) {
        this(caster, null, 20, SkillType.ACTIVE);
    }

    public Fury(Character caster, Character target, int requiredMp, SkillType skillType) {
        super(caster, target, requiredMp, skillType);
        this.caster = caster;
        this.target = target;
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
    public boolean castAvailable() {
        return super.casterExists() && super.hasEnoughMp() && caster.isAlive();
    }

    @Override
    public void affectToCaster() {
        int atk = caster.getAttackPower();
        int def = caster.getDefensePower();

        // 소수점 버림
        int resultAtk = (int) (atk + atk * 0.3);
        int resultDef = (int) (def - def * 0.2);

        super.affectToCaster();
        caster.setAttackPower(resultAtk);
        caster.setDefensePower(resultDef);
    }

    @Override
    public void affectToTarget() {
        super.affectToTarget();
        // Nothing affected to target
    }

    @Override
    public void castSkill() {
        super.castSkill();
    }
}
