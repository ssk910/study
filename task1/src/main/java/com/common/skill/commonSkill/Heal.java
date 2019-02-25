package com.common.skill.commonSkill;

import com.common.Character;
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
    private Character caster;       // 시전자
    private Character target;       // 대상자
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Heal(Character caster) {
        this("힐", caster, null, 25, SkillType.ACTIVE);
    }

    public Heal(String name, Character caster, Character target, int requiredMp, SkillType skillType) {
        super(name, caster, target, requiredMp, skillType);
        this.name = name;
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
        int maxHp = caster.getMaxHp();
        int currentHp = caster.getHp();
        int healedHp = 40;
        int resultHp = (currentHp + healedHp) > maxHp
                ? maxHp
                : (currentHp + healedHp);

        super.affectToCaster();
        caster.setHp(resultHp);
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
