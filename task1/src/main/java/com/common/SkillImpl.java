package com.common;

public class SkillImpl implements Skill {
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
    public SkillImpl(String name, Character caster, Character target, int requiredMp, SkillType skillType) {
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
    public boolean casterExists(Character caster) {
        return caster != null;
    }

    public boolean targetExists(Character target) {
        return target != null;
    }

    public boolean castAvailable(Character caster, Character target) {
        return false;
    }

    public boolean hasEnoughMp(Character caster) {
        return caster.getMp() >= requiredMp;
    }

    public void decreaseCasterMp(Character caster) {
        if (hasEnoughMp(caster)) {
            caster.setMp(caster.getMp() - requiredMp);
        }
    }

    public void affectToCaster(Character caster, Character target) {
        decreaseCasterMp(caster);
    }

    public void affectToTarget(Character caster, Character target) {

    }

    public void castSkill(Character caster, Character target) {
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

    public Character getCaster() {
        return caster;
    }

    public void setCaster(Character caster) {
        this.caster = caster;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
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
}
