package lab4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        StringProcessor text = new StringProcessor();
        String textLine = text.readInputText();

        String result = text.processText(textLine);
        System.out.println(result);

    }

}