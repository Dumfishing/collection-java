package com.dumfishing.dwasearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifyTest {
    @Test
    void players() {
        assertEquals(Players.Command.PLAYERS, Players.classify("players"));
    }

    @Test
    void resultWithName() {
        assertEquals(Players.Command.RESULT, Players.classify("result women 3m springboard"));
    }

    @Test
    void bareResult() {
        assertEquals(Players.Command.RESULT_NO_NAME, Players.classify("result"));
    }

    @Test
    void playersExtraIsUnknown() {
        assertEquals(Players.Command.UNKNOWN, Players.classify("players extra"));
    }

    @Test
    void capitalIsUnknown() {
        assertEquals(Players.Command.UNKNOWN, Players.classify("Players"));
    }
}
