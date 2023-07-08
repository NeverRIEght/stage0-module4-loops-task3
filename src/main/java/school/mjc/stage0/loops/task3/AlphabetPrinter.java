package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        //English symbols in ASCII are from 97 to 122
        for (int i = 97; i < 97 + 26; i++) {
            System.out.println((char) i);
        }
    }
}
