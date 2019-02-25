package com.common;

/**
 * 캐릭터 직업. (클래스)
 */
public interface CharClass {
    /* 레벨 충족 여부 */
    boolean checkLevel();

    /* 종족 충족 여부 */
    boolean checkSpecies();

    /* 전직 가능 여부 */
    boolean canChangeClass();

    /* 특정 클래스로 전직 가능 여부 */
    boolean canChangeClassTo(CharClass targetClass);

    /* 전직 */
    void changeClass(CharClass targetClass);
}
