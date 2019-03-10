package com.common;

public class SkillImpl implements Skill {
    private String name;            // 스킬 이름
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입
    private int skillAttackPower;        // 스킬 공격력

    /*
     +--------------+
     |  Constructor |
     +--------------+
     */
    public SkillImpl(String name, int requiredMp, SkillType skillType, int skillAttackPower) {
        this.name = name;
        this.requiredMp = requiredMp;
        this.skillType = skillType;
        this.skillAttackPower = skillAttackPower;
    }

    /*
     +------------------+
     |  private Methods |
     +------------------+
     */
    /* 시전자 MP 차감 */
    private void decreaseCasterMp(CharacterImpl caster) {
        if (hasEnoughMp(caster)) {
            caster.setMp(caster.getMp() - requiredMp);
        }
    }

    /* 대상자의 HP 감소 */
    private void decreaseTargetHp(CharacterImpl target) {
        if (targetExists(target)) {
            // 공격 대상자 HP 결과
            int targetResultHp = target.getHp() - skillAttackPower;
            targetResultHp = (targetResultHp <= 0)
                    ? 0
                    : targetResultHp;

            // HP 감소
            target.setHp(targetResultHp);
        }
    }

    /*
     +---------------------+
     |  Overridden Methods |
     +---------------------+
     */
    public boolean casterExists(CharacterImpl caster) {
        return caster != null;
    }

    public boolean targetExists(CharacterImpl target) {
        return target != null;
    }

    public boolean castAvailable(CharacterImpl caster, CharacterImpl target) {
        return false;
    }

    public boolean hasEnoughMp(CharacterImpl caster) {
        return caster.getMp() >= requiredMp;
    }

    public void affectToCaster(CharacterImpl caster, CharacterImpl target) {
        decreaseCasterMp(caster);
    }

    public void affectToTarget(CharacterImpl caster, CharacterImpl target) {
        decreaseTargetHp(target);
    }

    public void castSkill(CharacterImpl caster, CharacterImpl target) {
        if (!castAvailable(caster, target)) {
            return;
        }

        affectToCaster(caster, target);
        affectToTarget(caster, target);
    }

    /*
     +------------------+
     |  Getter & Setter |
     +------------------+
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredMp() {
        return requiredMp;
    }

    public void setRequiredMp(int requiredMp) {
        this.requiredMp = requiredMp;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }

    public int getSkillAttackPower() {
        return skillAttackPower;
    }

    public void setSkillAttackPower(int skillAttackPower) {
        this.skillAttackPower = skillAttackPower;
    }
}
