import java.lang.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {
        Token tk;
        int i = 0;
        //try {
        //creazione input stream
        CharStream in_str = CharStreams.fromString("div.class.newClass>p#id#second+b[test=\"prova\"]+(p>div{Pippo}>p)+ul>li*2+a$^google.it^");
        System.out.println("Input:\t" + in_str.toString());
        //istanziazione del lexer generato da antlr
        EmmetLexer lexer = new EmmetLexer(in_str);


        //creazione del token stream
        CommonTokenStream tk_stream = new CommonTokenStream(lexer, Token.DEFAULT_CHANNEL);
        //creazione del parser
        EmmetParser parser = new EmmetParser(tk_stream);
        // Aggiungo il nostro listener che andremo a modificare
        /*
        EmmetWorkingListener ewl = new EmmetWorkingListener();
        parser.addParseListener(ewl);
        ewl.setParser(parser);
        ewl.setLexer(lexer);
        EmmetParser.SContext ctx = parser.s(); */

        //EmmetWorkingVisitor ewv = new EmmetWorkingVisitor();
        EmmetGiorgioVisitor ewv = new EmmetGiorgioVisitor();
        //invocazione del vistor
        String s = ewv.visitS(parser.s());
        //stampa dei risultati
        System.out.println(s);


    }
}