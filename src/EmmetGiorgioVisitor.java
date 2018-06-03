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

    int tabCounter = 0;

	@Override public String visitS(EmmetParser.SContext ctx) {
	    System.out.println("Inizio parsing!");
	    if (ctx.tag_list() != null) return visitTag_list(ctx.tag_list());

		return "";
	}

	@Override public String visitTag_list(EmmetParser.Tag_listContext ctx) {
	    return parseTagListElements(ctx.tag(), ctx.mult(), ctx.TAG_LINKER(), ctx.tag_list(), ctx.tag_list2());
	}

	@Override public String visitTag_list2(EmmetParser.Tag_list2Context ctx) {
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

	@Override public String visitMult(EmmetParser.MultContext ctx) { return visitChildren(ctx); }

	@Override public String visitTag(EmmetParser.TagContext ctx) {
	    tabCounter++;
	    return tabSpaces() + '<' + ctx.TAG().getText() + visitAttr_list(ctx.attr_list());
	}

	@Override public String visitAttr_list(EmmetParser.Attr_listContext ctx) {
	    if (ctx != null) {
	        // TODO
	        return ">";
        } else {
	        return ">";
        }
	}

	@Override public String visitCustom(EmmetParser.CustomContext ctx) { return visitChildren(ctx); }

	private String parseTagListElements(EmmetParser.TagContext tag, EmmetParser.MultContext mult, TerminalNode linker, EmmetParser.Tag_listContext list, EmmetParser.Tag_list2Context list2) {
        String openTag = visitTag(tag);
        String closeTag = tabSpaces() + "</" + tag.TAG().getText() + ">\n";

        // caso base
        String returnString = openTag + closeTag;

        if (linker != null) {
            if (linker.getSymbol().getText().equals("+")) {
                // Caso di concatenazione
                String nextTags = "";
                tabCounter = tabCounter - 1;

                if (list != null) nextTags = visitTag_list(list);
                if (list2 != null) nextTags = visitTag_list2(list2);

                returnString = openTag + closeTag + nextTags;

            } else if (linker.getSymbol().getText().equals(">")) {
                // Caso di nesting
                String nextTags = "";

                if (list != null) nextTags = visitTag_list(list);
                if (list2 != null) nextTags = visitTag_list2(list2);
                tabCounter = tabCounter - 1;

                returnString = openTag + "\n" + nextTags + closeTag;
            }
        }

        if (mult != null) {
            int size =mult.DIGIT().size();
            StringBuilder s = new StringBuilder();
            for(int i=0; i < size; i++){
                s.append(mult.DIGIT(i).getText());
            }

            int n = Integer.parseInt(s.toString());
            // Ripeto la string n volte
            returnString = new String(new char[n]).replace("\0", returnString);
        }

        return returnString;

    }

    private String tabSpaces() {
        char[] charArray = new char[(tabCounter-1)*4];
        Arrays.fill(charArray, ' ');

        return new String(charArray);
    }
}