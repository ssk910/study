package com.common;

public interface Skill {
    /* 스킬 종류 */
    enum SkillType {
        PASSIVE,    // 패시브 스킬
        ACTIVE      // 액티브 스킬
    }

    /* 시전자 존재 여부 (null 확인) */
    boolean casterExists(Character caster);

    /* 대상자 존재 여부 (null 확인) */
    boolean targetExists(Character target);

    /* 스킬시전 가능 여부 */
    boolean castAvailable(Character caster, Character target);

    /* 스킬시전 가능한 MP 확인 */
    boolean hasEnoughMp(Character caster);

    /* 시전자 MP 차감 */
    // 이 메소드를 SkillImple의 private으로 넣자
    void decreaseCasterMp(Character caster);

    /* 시전자에 대한 영향 */
    void affectToCaster(Character caster, Character target);

    /* 대상자에 대한 영향 */
    void affectToTarget(Character caster, Character target);

    /* 스킬시전 */
    void castSkill(Character caster, Character target);
}
