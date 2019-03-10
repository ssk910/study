package com.common.skill.special;

import com.common.CharacterImpl;
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
 * [스킬 공격력]
 *      0
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
    private CharacterImpl caster;       // 시전자
    private CharacterImpl target;       // 대상자
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Invincible() {
        this("무적", 40, SkillType.ACTIVE, 0);
    }

    public Invincible(String name, int requiredMp, SkillType skillType, int attackPower) {
        super(name, requiredMp, skillType, attackPower);
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
        caster.setInvincible(true);
        caster.setInvincibleTime(10);
        super.affectToCaster(caster, target);
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
