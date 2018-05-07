import java.io.FileReader;
import java.lang.*;

import org.antlr.v4.runtime.*;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {
        Token tk;
        try {
            CharStream inputStream= new CharStream("p.ciao");
            EmmetLexer lexer = new EmmetLexer(inputStream);

        } catch (Exception e) {
            System.out.println("Lexer aborted: " + e.getMessage());
        }
    }
}