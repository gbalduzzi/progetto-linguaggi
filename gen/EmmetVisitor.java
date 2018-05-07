// Generated from /home/dariofad/prog_LC/progetto-linguaggi/Emmet.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EmmetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EmmetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EmmetParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(EmmetParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmmetParser#tag_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_list(EmmetParser.Tag_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmmetParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(EmmetParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmmetParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(EmmetParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmmetParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(EmmetParser.Attr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmmetParser#custom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom(EmmetParser.CustomContext ctx);
}