// Generated from Emmet.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmmetParser}.
 */
public interface EmmetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmmetParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(EmmetParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(EmmetParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmmetParser#tag_list}.
	 * @param ctx the parse tree
	 */
	void enterTag_list(EmmetParser.Tag_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#tag_list}.
	 * @param ctx the parse tree
	 */
	void exitTag_list(EmmetParser.Tag_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmmetParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(EmmetParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(EmmetParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmmetParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(EmmetParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(EmmetParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmmetParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(EmmetParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(EmmetParser.Attr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmmetParser#custom}.
	 * @param ctx the parse tree
	 */
	void enterCustom(EmmetParser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmmetParser#custom}.
	 * @param ctx the parse tree
	 */
	void exitCustom(EmmetParser.CustomContext ctx);
}