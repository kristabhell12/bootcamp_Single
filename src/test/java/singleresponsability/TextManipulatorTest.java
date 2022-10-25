package singleresponsability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextManipulatorTest {
    TextManipulator toTest;
    @Test
    void getText() {
        Assertions.assertEquals("hola", new TextManipulator("hola").getText());
    }

    @Test
    void appendText() {
        toTest = new TextManipulator("hola");
        toTest.appendText(" mundo");
        Assertions.assertEquals("hola mundo", toTest.getText());
    }

    @Test
    void findWordAndReplace() {
    }

    @Test
    void findWordAndDelete() {
    }

    @Test
    void printText() {
    }

    @Test
    void printOutEachWordOfText() {
    }

    @Test
    void printRangeOfCharacters() {
    }
}