// Generated from /home/gbalduzzi/Code/progetto-linguaggi/Emmet.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link EmmetVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class EmmetWorkingVisitor extends AbstractParseTreeVisitor<String> implements EmmetVisitor<String> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitS(EmmetParser.SContext ctx) {
        System.out.println("Visito s: " + ctx.getText());
        /*System.out.println("Figli di ctx: " + ctx.children.size());
        System.out.println(ctx.tag_list().tag().TAG());*/
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitTag_list(EmmetParser.Tag_listContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitTag_list2(EmmetParser.Tag_list2Context ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitMult(EmmetParser.MultContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitTag(EmmetParser.TagContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitAttr_list(EmmetParser.Attr_listContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitCustom(EmmetParser.CustomContext ctx) {
        return " " + ctx.ATTRIBUTE() + "=\"" + ctx.ATTRIBUTE_FREE_TEXT() + "\"";
    }
}