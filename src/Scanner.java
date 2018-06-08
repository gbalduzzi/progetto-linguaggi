import java.lang.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {
        //creazione input stream
        CharStream in_str = CharStreams.fromString("head>tit+h");
        System.out.println("Input:\t" + in_str.toString());

        //istanziazione del lexer generato da antlr
        EmmetLexer lexer = null;
        try {
            lexer = new EmmetLexer(in_str);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        } catch (Exception e) {
            System.out.print("Lexer error: ");
            System.out.println(e.getMessage());
            return;
        }

        //creazione del token stream
        CommonTokenStream tk_stream = new CommonTokenStream(lexer, Token.DEFAULT_CHANNEL);

        //creazione del parser
        EmmetParser parser = null;
        parser = new EmmetParser(tk_stream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        //creazione del visitor
        EmmetGiorgioVisitor ewv = new EmmetGiorgioVisitor();
        //invocazione del vistor
        String s = "";
        try {
            s = ewv.visitS(parser.s());
        } catch (Exception e) {
            System.out.print("Parser error: ");
            System.out.println(e.getMessage());
            return;
        }

        //stampa dei risultati
        System.out.println(s);


    }
}