package com.common;

/**
 * 캐릭터 직업. (클래스)
 */
public interface CharClass {
    /* 레벨 충족 여부 */
    boolean checkLevel(CharacterImpl character);

    /* 종족 충족 여부 */
    boolean checkSpecies(CharacterImpl character);

    /* 전직 가능 여부 */
    boolean canChangeClass(CharacterImpl character);

    /* 특정 클래스로 전직 가능 여부 */
    boolean canChangeClassTo(CharacterImpl character, CharClassImpl targetClass);

    /* 전직 */
    boolean changeClass(CharacterImpl character, CharClassImpl targetClass);
}
