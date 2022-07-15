package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char ch;
        for( ch = 'A' ; ch <= 'Z' ; ch++ )
            System.out.println(ch);
    }

    public static void main(String[] args) {
        AlphabetPrinter a = new AlphabetPrinter();
        a.printAlphabet();
    }
}
