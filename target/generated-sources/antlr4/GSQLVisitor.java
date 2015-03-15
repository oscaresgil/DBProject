// Generated from GSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GSQLParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull GSQLParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(@NotNull GSQLParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#tableInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableInstruction(@NotNull GSQLParser.TableInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(@NotNull GSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#eqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(@NotNull GSQLParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#selectFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFrom(@NotNull GSQLParser.SelectFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionAddColumn}
	 * labeled alternative in {@link GSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAddColumn(@NotNull GSQLParser.ActionAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#updateSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSet(@NotNull GSQLParser.UpdateSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqRelExpression}
	 * labeled alternative in {@link GSQLParser#eqExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqRelExpression(@NotNull GSQLParser.EqRelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GSQLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(@NotNull GSQLParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull GSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#orOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(@NotNull GSQLParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionDropConstraint}
	 * labeled alternative in {@link GSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDropConstraint(@NotNull GSQLParser.ActionDropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(@NotNull GSQLParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(@NotNull GSQLParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#andOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(@NotNull GSQLParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#deleteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFrom(@NotNull GSQLParser.DeleteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#unExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnExpression(@NotNull GSQLParser.UnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpression}
	 * labeled alternative in {@link GSQLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpression(@NotNull GSQLParser.CondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionDropColumn}
	 * labeled alternative in {@link GSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDropColumn(@NotNull GSQLParser.ActionDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAndExpression}
	 * labeled alternative in {@link GSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAndExpression(@NotNull GSQLParser.ExpAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#float_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_literal(@NotNull GSQLParser.Float_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relSumExpression}
	 * labeled alternative in {@link GSQLParser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelSumExpression(@NotNull GSQLParser.RelSumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(@NotNull GSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(@NotNull GSQLParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(@NotNull GSQLParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(@NotNull GSQLParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOpExpression}
	 * labeled alternative in {@link GSQLParser#eqExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOpExpression(@NotNull GSQLParser.EqOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOrExpression}
	 * labeled alternative in {@link GSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOrExpression(@NotNull GSQLParser.CondOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(@NotNull GSQLParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionAddConstraint}
	 * labeled alternative in {@link GSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAddConstraint(@NotNull GSQLParser.ActionAddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(@NotNull GSQLParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(@NotNull GSQLParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqAndExpression}
	 * labeled alternative in {@link GSQLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqAndExpression(@NotNull GSQLParser.EqAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(@NotNull GSQLParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionAlterTable}
	 * labeled alternative in {@link GSQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAlterTable(@NotNull GSQLParser.ActionAlterTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOpExpression}
	 * labeled alternative in {@link GSQLParser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOpExpression(@NotNull GSQLParser.RelOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#showDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabase(@NotNull GSQLParser.ShowDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull GSQLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameAlterTable}
	 * labeled alternative in {@link GSQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameAlterTable(@NotNull GSQLParser.RenameAlterTableContext ctx);
