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
    public boolean casterExists() {
        return caster != null;
    }

    public boolean targetExists() {
        return target != null;
    }

    public boolean castAvailable() {
        return false;
    }

    public boolean hasEnoughMp() {
        return caster.getMp() >= requiredMp;
    }

    public void decreaseCasterMp() {
        if (hasEnoughMp()) {
            caster.setMp(caster.getMp() - requiredMp);
        }
    }

    public void affectToCaster() {
        decreaseCasterMp();
    }

    public void affectToTarget() {

    }

    public void castSkill() {
        if (!castAvailable()) {
            return;
        }

        affectToCaster();
        affectToTarget();
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
