package com.common;

public interface Skill {
    /* 스킬 종류 */
    enum SkillType {
        PASSIVE,    // 패시브 스킬
        ACTIVE      // 액티브 스킬
    }

    /* 시전자 존재 여부 (null 확인) */
    boolean casterExists();

    /* 대상자 존재 여부 (null 확인) */
    boolean targetExists();

    /* 스킬시전 가능 여부 */
    boolean castAvailable();

    /* 스킬시전 가능한 MP 확인 */
    boolean hasEnoughMp();

    /* 시전자 MP 차감 */
    void decreaseCasterMp();

    /* 시전자에 대한 영향 */
    void affectToCaster();

    /* 대상자에 대한 영향 */
    void affectToTarget();

    /* 스킬시전 */
    void castSkill();
}
