package task1Test;

import com.common.Character;
import com.common.CharacterImpl;
import com.common.Species;
import com.common.charClass.Freshman;
import com.common.weapon.Fist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    CharacterImpl character;

    // 이거 한번만 테스트하도록 수정 필요
    @Test
    @DisplayName("Creating new Elf character.")
    CharacterImpl createNewElf() {
        return new CharacterImpl(
                200,
                20,
                200,
                200,
                1,
                0,
                200,
                200,
                15,
                15,
                5,
                false,
                0,
                Species.ELF,
                new Freshman(Species.ELF),
                new Fist()
        );
    }

    @RepeatedTest(99)
    @DisplayName("Leveling up to level 99.")
    void levelUpTo99(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();

        int level;
        character = createNewElf();
        System.out.println(character.toString());
        level = character.getLevel();

        character.setExp(character.getMaxExp());
        character.levelUp();

        assertTrue(level >= 99, "Became level 99 now.");
    }
}
