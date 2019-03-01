package com.common.skill.special;

import com.common.Character;
import com.common.SkillImpl;

/**
 * [이름]
 *      무적
 *
 * [소모 MP]
 *      40
 *
 * [타입]
 *      액티브
 *
 * [시전 조건]
 *      - 시전자 생존.
 *
 * [시전자에 대한 효과]
 *      - MP 차감.
 *      - 10초 동안 HP 차감 안됨.
 *
 * [대상자에 대한 효과]
 *      - 없음. (시전자 자신에게 시전)
 */
public class Invincible extends SkillImpl {
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
    public Invincible(Character caster) {
        this("무적", caster, null, 40, SkillType.ACTIVE);
    }

    public Invincible(String name, Character caster, Character target, int requiredMp, SkillType skillType) {
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
        caster.setInvincible(true);
        caster.setInvincibleTime(10);
        super.affectToCaster();
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
