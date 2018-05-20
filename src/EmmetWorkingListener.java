// Generated from /home/gbalduzzi/Code/progetto-linguaggi/Emmet.g4 by ANTLR 4.7

import java.lang.*;

import org.antlr.v4.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link EmmetListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class EmmetWorkingListener implements EmmetListener {

    String output = "";
    private EmmetParser parser = null;

    public void setParser(EmmetParser pp) {
        parser = pp;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterS(EmmetParser.SContext ctx) {
        System.out.println("Inizio parsing!");
        //System.out.println(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitS(EmmetParser.SContext ctx) {
        System.out.println("Fine parsing, risultato: ");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTag_list(EmmetParser.Tag_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTag_list(EmmetParser.Tag_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTag_list2(EmmetParser.Tag_list2Context ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTag_list2(EmmetParser.Tag_list2Context ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMult(EmmetParser.MultContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMult(EmmetParser.MultContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTag(EmmetParser.TagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTag(EmmetParser.TagContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAttr_list(EmmetParser.Attr_listContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String s = "";
        if (ctx != null)
            s = tokens.getText();
        System.out.println(s);
        System.out.println(ctx.SYMBOL().toString());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAttr_list(EmmetParser.Attr_listContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCustom(EmmetParser.CustomContext ctx) {
		/*System.out.println("Custom");
		System.out.println(ctx.getText());*/
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCustom(EmmetParser.CustomContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}