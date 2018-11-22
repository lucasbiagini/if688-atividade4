// Generated from /Users/lucasbiagini/Documents/UFPE/2018.2/Compiladores if688/if688.github.io/atividades/04-MiniJavaAST/src/br/ufpe/cin/if688/minijava/atividade4/minijava.g4 by ANTLR 4.7
package br.ufpe.cin.if688.minijava.atividade4.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minijavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minijavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minijavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(minijavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(minijavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#classDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclList(minijavaParser.ClassDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(minijavaParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#classDeclSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclSimple(minijavaParser.ClassDeclSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#classDeclExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclExtends(minijavaParser.ClassDeclExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#methodDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclList(minijavaParser.MethodDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(minijavaParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#varDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclList(minijavaParser.VarDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(minijavaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalList(minijavaParser.FormalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(minijavaParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#intArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayType(minijavaParser.IntArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(minijavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(minijavaParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#identifierType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(minijavaParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(minijavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(minijavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(minijavaParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(minijavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(minijavaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(minijavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#if_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stm(minijavaParser.If_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#while_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stm(minijavaParser.While_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(minijavaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(minijavaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#arrayAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(minijavaParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#expList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpList(minijavaParser.ExpListContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(minijavaParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#true_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_stm(minijavaParser.True_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#false_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_stm(minijavaParser.False_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#this_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_stm(minijavaParser.This_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#newArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(minijavaParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(minijavaParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#identifierExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExp(minijavaParser.IdentifierExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link minijavaParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(minijavaParser.NotContext ctx);
}