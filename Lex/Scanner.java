import java.lang.*;

import org.antlr.v4.runtime.*;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {
        Token tk;
        int i = 0;
        try {

            //creazione input stream
            org.antlr.v4.runtime.ANTLRInputStream in_str = new org.antlr.v4.runtime.ANTLRInputStream("p>h.class");
            //istanziazione del lexer generato da antlr
            EmmetLexer lexer = new EmmetLexer(in_str);
            //lettura del primo token
            tk = lexer.nextToken();
            while (tk.getType() != Token.EOF) {
                i++;
                System.out.println(i + "->[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" +
                        " TokenType:" + tk.getType() + "\t:" + tk.getText());
                tk = lexer.nextToken();
            }
        } catch (Exception e) {
            System.out.println("Lexer aborted: " + e.getMessage());
        }
    }
}