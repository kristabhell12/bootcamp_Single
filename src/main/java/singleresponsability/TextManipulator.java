package singleresponsability;

public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

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