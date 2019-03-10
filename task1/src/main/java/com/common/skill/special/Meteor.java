package com.common.skill.special;

import com.common.CharacterImpl;
import com.common.SkillImpl;

/**
 * [이름]
 *      메테오
 *
 * [소모 MP]
 *      75
 *
 * [타입]
 *      액티브
 *
 * [스킬 공격력]
 *      100
 *
 * [시전 조건]
 *      - 시전자 생존.
 *
 * [시전자에 대한 효과]
 *      - MP 차감.
 *
 * [대상자에 대한 효과]
 *      - 대상자 HP 100 차감.
 */
public class Meteor extends SkillImpl {
    private String name;            // 스킬 이름
    private CharacterImpl caster;       // 시전자
    private CharacterImpl target;       // 대상자
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입
    private int attackPower;        // 스킬 공격력

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public Meteor() {
        this("메테오", 75, SkillType.ACTIVE, 100);
    }

    public Meteor(String name, int requiredMp, SkillType skillType, int attackPower) {
        super(name, requiredMp, skillType, attackPower);
        this.name = name;
        this.requiredMp = requiredMp;
        this.skillType = skillType;
        this.attackPower = attackPower;
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
        super.affectToCaster(caster, target);
    }

    @Override
    public void affectToTarget(CharacterImpl caster, CharacterImpl target) {
        super.affectToTarget(caster, target);
        // decrease Target's HP
    }

    @Override
    public void castSkill(CharacterImpl caster, CharacterImpl target) {
        super.castSkill(caster, target);
    }
}
