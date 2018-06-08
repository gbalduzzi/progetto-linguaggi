// Generated from /home/gbalduzzi/Code/progetto-linguaggi/Emmet.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;

/**
 * This class provides an empty implementation of {@link EmmetVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 * operations with no return type.
 */
public class EmmetGiorgioVisitor extends AbstractParseTreeVisitor<String> implements EmmetVisitor<String> {

    private int tabCounter = 0;

    private String freeText;
    private String classes;
    private String ids;

    //padre corrente per la gestione delle eccezioni
    private String fatherTag;
    private boolean enabler = false;


    @Override
    public String visitS(EmmetParser.SContext ctx) {
        System.out.println("Inizio parsing!\n");
        if (ctx.tag_list() != null) return visitTag_list(ctx.tag_list());
        if (ctx.tag_list2() != null) return visitTag_list2(ctx.tag_list2());

        return "";
    }

    @Override
    public String visitTag_list(EmmetParser.Tag_listContext ctx) {
        return parseTagListElements(ctx.tag(), ctx.mult(), ctx.TAG_LINKER(), ctx.tag_list(), ctx.tag_list2());
    }

    @Override
    public String visitTag_list2(EmmetParser.Tag_list2Context ctx) {
        String firstSection = parseTagListElements(ctx.tag(), ctx.mult(), ctx.TAG_LINKER(0), ctx.tag_list(0), ctx.tag_list2(0));

        TerminalNode linker = ctx.TAG_LINKER(1);
        EmmetParser.Tag_listContext list = ctx.tag_list(1);
        EmmetParser.Tag_list2Context list2 = ctx.tag_list2(1);

        if (linker != null) {
            String nextTags = "";

            tabCounter = tabCounter - 1;
            if (list != null) nextTags = visitTag_list(list);
            if (list2 != null) nextTags = visitTag_list2(list2);

            return firstSection + nextTags;
        }

        return firstSection;
    }

    @Override
    public String visitMult(EmmetParser.MultContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTag(EmmetParser.TagContext ctx) {
        tabCounter++;
        initAttrList();

        //espansione del tag, ricostruzione del nome TAG HTML corretto
        String n = expandTag(ctx.TAG().getText().toLowerCase());
        if (enabler)
            exceptionChecker(n);

        return tabSpaces() + '<' + n + visitAttr_list(ctx.attr_list());
    }

    @Override
    public String visitAttr_list(EmmetParser.Attr_listContext ctx) {
        if (ctx != null) {
            if (ctx.SYMBOL() != null && ctx.SYMBOL().getText().equals(".")) { // Aggiungo classe
                if (classes != null)
                    classes += " " + ctx.ATTRIBUTE().getText();
                else
                    classes = ctx.ATTRIBUTE().getText();
            }

            if (ctx.SYMBOL() != null && ctx.SYMBOL().getText().equals("#")) { // Aggiungo id
                if (ids != null)
                    ids += " " + ctx.ATTRIBUTE().getText();
                else
                    ids = ctx.ATTRIBUTE().getText();
            }

            if (ctx.custom() != null) // Attributo custom
                return visitCustom(ctx.custom()) + visitAttr_list(ctx.attr_list());

            if (ctx.FREE_TEXT() != null) { // Free text
                freeText = ctx.FREE_TEXT().getText();
                freeText = freeText.substring(1, freeText.length() - 1);
            }

            if (ctx.HREF() != null) {
                return " href=\"" + ctx.HREFATTRIBUTE().getText().replace("^", "") + "\"" + visitAttr_list(ctx.attr_list());
            }

            return visitAttr_list(ctx.attr_list());

        } else {
            // End case: terminata la lista di attributi
            String classAttribute = (classes != null) ? " class=\"" + classes + "\"" : "";
            String idAttribute = (ids != null) ? " id=\"" + ids + "\"" : "";
            if (freeText != null) {
                tabCounter++;
                freeText = "\n" + tabSpaces() + freeText + "\n";
                tabCounter--;
                freeText += tabSpaces();
            } else {
                freeText = "";
            }

            return classAttribute + idAttribute + ">" + freeText;
        }

    }

    @Override
    public String visitCustom(EmmetParser.CustomContext ctx) {
        return " " + ctx.ATTRIBUTE().getText() + "=" + ctx.ATTRIBUTE_FREE_TEXT().getText();
    }

    private String parseTagListElements(EmmetParser.TagContext tag, EmmetParser.MultContext mult, TerminalNode linker, EmmetParser.Tag_listContext list, EmmetParser.Tag_list2Context list2) {

        String ct = expandTag(tag.TAG().getText());

        String openTag = visitTag(tag);
        String closeTag = "</" + ct + ">\n";

        // caso base
        String returnString = openTag + closeTag;

        int n = 1;
        if (mult != null) {
            int size = mult.DIGIT().size();
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < size; i++) {
                s.append(mult.DIGIT(i).getText());
            }

            n = Integer.parseInt(s.toString());
            // Ripeto la string n volte
        }

        if (linker != null) {
            if (linker.getSymbol().getText().equals("+")) {
                // Moltiplico prima di concatenare
                returnString = new String(new char[n]).replace("\0", returnString);

                // Caso di concatenazione
                String nextTags = "";
                tabCounter = tabCounter - 1;

                if (list != null) nextTags = visitTag_list(list);

                if (list2 != null) nextTags = visitTag_list2(list2);

                returnString += nextTags;

            } else if (linker.getSymbol().getText().equals(">")) {
                // Caso di nesting
                String nextTags = "";

                //impostazione del padre corrente
                fatherTag = ct;
                enabler = true;

                if (list != null) nextTags = visitTag_list(list);

                //re-impostazione del padre corrente
                fatherTag = ct;

                if (list2 != null) nextTags = visitTag_list2(list2);

                //re-impostazione del padre corrente
                fatherTag = ct;

                tabCounter = tabCounter - 1;

                returnString = openTag + "\n" + nextTags + tabSpaces() + closeTag;

                // Moltiplico dopo il nesting
                returnString = new String(new char[n]).replace("\0", returnString);
            }
        } else {
            // Moltiplico
            returnString = new String(new char[n]).replace("\0", returnString);
        }

        return returnString;

    }

    private String tabSpaces() {
        char[] charArray = new char[(tabCounter - 1) * 4];
        Arrays.fill(charArray, ' ');

        return new String(charArray);
    }

    private void initAttrList() {
        freeText = null;
        classes = null;
        ids = null;
    }

    private String expandTag(String n) {
        if (n.equals("h"))
            return "h1";
        else if (n.equals("m"))
            return "meta";
        else if (n.equals("tit"))
            return "title";
        return n;
    }

    private void exceptionChecker(String n) throws RuntimeException {
        //controllo comandi che non si possono inserire all'interno di head
        //System.out.println("checked: " + fatherTag + ">" + n);
        if (fatherTag.equals("head")) {
            if (!n.equals("meta") && !n.equals("title")) {
                throw new RuntimeException("Non puoi inserire il tag -" + n + "- all'interno di -" + fatherTag + "-");
            }
        }
    }
}