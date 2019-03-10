package com.common.skill.common;

import com.common.CharacterImpl;
import com.common.SkillImpl;

/**
 * [이름]
 *      힐
 *
 * [소모 MP]
 *      25
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
 *      - HP 40 증가.
 *
 * [대상자에 대한 효과]
 *      - 없음. (시전자 자신에게 시전)
 */
public class Heal extends SkillImpl {
    private String name;            // 스킬 이름
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Heal() {
        this("힐", 25, SkillType.ACTIVE, 0);
    }

    public Heal(String name, int requiredMp, SkillType skillType, int skillAttackPower) {
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
        int maxHp = caster.getMaxHp();
        int currentHp = caster.getHp();
        int healedHp = 40;
        int resultHp = (currentHp + healedHp) > maxHp
                ? maxHp
                : (currentHp + healedHp);

        super.affectToCaster(caster, target);
        caster.setHp(resultHp);
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
