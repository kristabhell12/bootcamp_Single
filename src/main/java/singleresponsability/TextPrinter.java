package singleresponsability;

public class TextPrinter {
    public void printText(TextManipulator textManipulator) {
        System.out.println(textManipulator.getText());
    }
    public void printOutEachWordOfText(TextManipulator textManipulator) {
        System.out.println(textManipulator.getText().split(" "));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex,TextManipulator textManipulator) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}
