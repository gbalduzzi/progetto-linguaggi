import java.lang.*;

import org.antlr.v4.runtime.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Scanner {
    public Scanner() {
    }

    public static void main(String[] args) {

        //risultati con commenti
        boolean verbosity = false;
        File f = null;
        BufferedReader b = null;
        String readLine = "";

        //per la lettura della stringa da console
        if (args != null && args.length != 0) {
            //controllare verbosity option
            if (args.length > 1) {
                System.out.println("num param: " + args.length + "param 2:" + args[1]);
                if (args[1].equals("verbose"))
                    verbosity = true;
                else
                    System.out.println("Parametro 2 non riconosciuto");
            }
            //lettura delle espressioni da file
            try {
                f = new File("../../../" + args[0]);
                b = new BufferedReader(new FileReader(f));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                //parsing di ogni linea
                while ((readLine = b.readLine()) != null) {
                    if (readLine.equals(""))
                        continue;
                    //creazione input stream
                    CharStream in_str = CharStreams.fromString(readLine);
                    if (verbosity) {
                        System.out.println("\n------\n");
                        System.out.println("Frammento:\t" + in_str.toString());
                    }

                    //istanziazione del lexer generato da antlr
                    EmmetLexer lexer = null;
                    try {
                        lexer = new EmmetLexer(in_str);
                        lexer.removeErrorListeners();
                        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
                    } catch (Exception e) {
                        if (verbosity) {
                            System.out.print("Lexer error: ");
                            System.out.println(e.getMessage());
                        }
                        continue;
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
                        if (verbosity) {
                            System.out.print("Parser error: ");
                            System.out.println(e.getMessage());
                        }
                        continue;
                    }
                    //stampa dei risultati
                    if (verbosity)
                        System.out.println("Risultato:");

                    System.out.print("\n");
                    System.out.println(s);
                }
            } catch (IOException e) {
                if (verbosity) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
                System.out.println("No input found");
            return;
        }


    }
}