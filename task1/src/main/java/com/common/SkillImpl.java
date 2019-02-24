package com.common;

public class SkillImpl implements Skill {
    private Character caster;       // 시전자
    private Character target;       // 대상자
    private int requiredMp;         // 필요 MP
    private SkillType skillType;    // 스킬 타입

    /* Constructor */
    public SkillImpl(Character caster, Character target, int requiredMp, SkillType skillType) {
        this.caster = caster;
        this.target = target;
        this.requiredMp = requiredMp;
        this.skillType = skillType;
    }

    @Override
    public boolean casterExists() {
        return caster != null;
    }

    @Override
    public boolean targetExists() {
        return target != null;
    }

    @Override
    public boolean castAvailable() {
        return false;
    }

    @Override
    public boolean hasEnoughMp() {
        return caster.getMp() >= requiredMp;
    }

    @Override
    public void decreaseCasterMp() {
        if (hasEnoughMp()) {
            caster.setMp(caster.getMp() - requiredMp);
        }
    }

    @Override
    public void affectToCaster() {
        decreaseCasterMp();
    }

    @Override
    public void affectToTarget() {

    }

    @Override
    public void castSkill() {
        if (!castAvailable()) {
            return;
        }

        affectToCaster();
        affectToTarget();
    }
}
