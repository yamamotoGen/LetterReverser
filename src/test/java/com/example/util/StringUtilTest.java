package com.example.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {
    StringUtil stringUtil;

    @BeforeEach
    void setUp() {
        stringUtil = new StringUtil();
    }

    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsNull() {
        assertEquals("", stringUtil.reverseLetters(null));
    }

    @Test
    void reverseLetters_shouldReturnEmptyString_ifContainsIsEmpty() {
        assertEquals("", stringUtil.reverseLetters(""));
    }

    @Test
    void reverseLetters_shouldReverseLettersAndLeaveSymbolsInPlace_ifContainsLettersAndSymbols() {
        assertEquals("t@eb eht av$J!123", stringUtil.reverseLetters("J@va the be$t!123"));
        assertEquals("a  M1", stringUtil.reverseLetters("M  a1"));
    }

    @Test
    void reverseLetters_shouldReverseLetters_ifContainsHasOnlyLetters() {
        assertEquals("retteb si nohtyP", stringUtil.reverseLetters("Python is better"));
    }

    @Test
    void reverseLetters_shouldLeaveSymbolsInPlace_ifContainsHasOnlySymbols() {
        assertEquals("1234%5!-", stringUtil.reverseLetters("1234%5!-"));
    }

    @Test
    void reverseLetters_shouldReverseLetters_ifContainsHasOnlyOneLetterWithSpaces() {
        assertEquals(" A   ", stringUtil.reverseLetters("   A "));
        assertEquals("A   ", stringUtil.reverseLetters("   A"));
    }

}