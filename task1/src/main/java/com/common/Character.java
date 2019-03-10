package com.common;

/**
 * 캐릭터
 */
public interface Character {
    /* 생존 여부 */
    boolean isAlive();

    /* 최대 레벨에 도달했는지 체크 */
    boolean isMaxLevel();

    /* 레벨업 */
    boolean levelUp();
}