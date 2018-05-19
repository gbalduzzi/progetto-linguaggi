import java.lang.*;

import org.antlr.v4.runtime.*;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {
        Token tk;
        int i = 0;
        //try {
        //creazione input stream
        ANTLRInputStream in_str = new ANTLRInputStream("p>h.class");
        //istanziazione del lexer generato da antlr
        EmmetLexer lexer = new EmmetLexer(in_str);

        /**
         * La versione 1 del lexer, non si fa altro che iterare (lo lascio per velocizzare)
         */
        //lettura del primo token
            /*tk = lexer.nextToken();
            while (tk.getType() != Token.EOF) {
                i++;
                System.out.println(i + "->[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" +
                        " TokenType:" + tk.getType() + "\t:" + tk.getText());
                tk = lexer.nextToken();
            }
        } catch (Exception e) {
            System.out.println("Lexer aborted: " + e.getMessage());
        }*/

        /**
         * Ora sviluppo della versione 2, uno stream di token che viene inviato al parser(non stampiamo nulla a console)
         * In questo modo, potremo aggiungere la logica estendendo il listener
         */
        //creazione del token stream
        CommonTokenStream tk_stream = CommonTokenStream(lexer, Token.DEFAULT_CHANNEL);
        //creazione del parser
        EmmetParser parser = new EmmetParser(tk_stream);
        //chiamata al contesto (alla regola di partenza)
        parser.eval();
    }
}