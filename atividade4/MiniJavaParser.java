package br.ufpe.cin.if688.minijava.atividade4;

import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.atividade4.antlr.minijavaParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MiniJavaParser implements br.ufpe.cin.if688.minijava.atividade4.antlr.minijavaVisitor {
    @Override
    public Program visitProgram(br.ufpe.cin.if688.minijava.atividade4.antlr.minijavaParser.ProgramContext ctx) {

        return new Program(
                (MainClass) ctx.mainClass().accept(this),
                (ClassDeclList) ctx.classDeclList().accept(this)
        );

    }

    @Override
    public MainClass visitMainClass(minijavaParser.MainClassContext ctx) {

        return new MainClass(
                (Identifier) ctx.identifier(0).accept(this),
                (Identifier) ctx.identifier(1).accept(this),
                (Statement) ctx.statement().accept(this)
        );

    }

    @Override
    public ClassDeclList visitClassDeclList(minijavaParser.ClassDeclListContext ctx) {

        ClassDeclList cdl = new ClassDeclList();

        for (minijavaParser.ClassDeclContext l : ctx.classDecl()) {
            cdl.addElement((ClassDecl) l.accept(this));
        }

        return cdl;

    }

    @Override
    public ClassDecl visitClassDecl(minijavaParser.ClassDeclContext ctx) {

        ParseTree ps = ctx.children.get(0);

        if (ps instanceof minijavaParser.ClassDeclSimpleContext) {
            return (ClassDeclSimple) ctx.classDeclSimple().accept(this);
        } else {
            return (ClassDeclExtends) ctx.classDeclExtends().accept(this);
        }

    }

    @Override
    public ClassDeclSimple visitClassDeclSimple(minijavaParser.ClassDeclSimpleContext ctx) {
        return new ClassDeclSimple(
                (Identifier) ctx.identifier().accept(this),
                (VarDeclList) ctx.varDeclList().accept(this),
                (MethodDeclList) ctx.methodDeclList().accept(this)
        );
    }

    @Override
    public ClassDeclExtends visitClassDeclExtends(minijavaParser.ClassDeclExtendsContext ctx) {
        return new ClassDeclExtends(
                (Identifier) ctx.identifier(0).accept(this),
                (Identifier) ctx.identifier(1).accept(this),
                (VarDeclList) ctx.varDeclList().accept(this),
                (MethodDeclList) ctx.methodDeclList().accept(this)
        );
    }

    @Override
    public MethodDeclList visitMethodDeclList(minijavaParser.MethodDeclListContext ctx) {

        MethodDeclList mdl = new MethodDeclList();

        for (minijavaParser.MethodDeclContext mdc : ctx.methodDecl()) {
            mdl.addElement((MethodDecl) mdc.accept(this));
        }

        return mdl;
    }

    @Override
    public MethodDecl visitMethodDecl(minijavaParser.MethodDeclContext ctx) {
        return new MethodDecl(
                (Type) ctx.type().accept(this),
                (Identifier) ctx.identifier().accept(this),
                (FormalList) ctx.formalList().accept(this),
                (VarDeclList) ctx.varDeclList().accept(this),
                (StatementList) ctx.statementList().accept(this),
                (Exp) ctx.exp().accept(this)
        );
    }

    @Override
    public VarDeclList visitVarDeclList(minijavaParser.VarDeclListContext ctx) {

        VarDeclList vdl = new VarDeclList();

        for (minijavaParser.VarDeclContext vdc : ctx.varDecl()) {
            vdl.addElement((VarDecl) vdc.accept(this));
        }

        return vdl;
    }

    @Override
    public VarDecl visitVarDecl(minijavaParser.VarDeclContext ctx) {
        return new VarDecl(
                (Type) ctx.type().accept(this),
                (Identifier) ctx.identifier().accept(this)
        );
    }

    @Override
    public FormalList visitFormalList(minijavaParser.FormalListContext ctx) {

        FormalList fl = new FormalList();

        for (minijavaParser.FormalContext flc : ctx.formal()) {
            fl.addElement((Formal) flc.accept(this));
        }

        return fl;
    }

    @Override
    public Formal visitFormal(minijavaParser.FormalContext ctx) {
        return new Formal(
                (Type) ctx.type().accept(this),
                (Identifier) ctx.identifier().accept(this)
        );
    }

    @Override
    public IntArrayType visitIntArrayType(minijavaParser.IntArrayTypeContext ctx) {
        return new IntArrayType();
    }

    @Override
    public BooleanType visitBooleanType(minijavaParser.BooleanTypeContext ctx) {
        return new BooleanType();
    }

    @Override
    public IntegerType visitIntegerType(minijavaParser.IntegerTypeContext ctx) {
        return new IntegerType();
    }

    @Override
    public IdentifierType visitIdentifierType(minijavaParser.IdentifierTypeContext ctx) {
        return new IdentifierType(
                ctx.getText()
        );
    }

    @Override
    public Identifier visitIdentifier(minijavaParser.IdentifierContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public Type visitType(minijavaParser.TypeContext ctx) {

        ParseTree ps = ctx.children.get(0);

        if (ps instanceof minijavaParser.IntegerTypeContext) {
            return (IntegerType) ctx.integerType().accept(this);
        } else if (ps instanceof minijavaParser.BooleanTypeContext){
            return (BooleanType) ctx.booleanType().accept(this);
        } else if (ps instanceof minijavaParser.IntArrayTypeContext) {
            return (IntArrayType) ctx.intArrayType().accept(this);
        } else {
            return (IdentifierType) ctx.identifierType().accept(this);
        }
    }

    @Override
    public StatementList visitStatementList(minijavaParser.StatementListContext ctx) {

        StatementList sl = new StatementList();

        for (minijavaParser.StatementContext sc : ctx.statement()) {
            sl.addElement((Statement) sc.accept(this));
        }

        return sl;
    }

    @Override
    public Statement visitStatement(minijavaParser.StatementContext ctx) {

        ParseTree ps = ctx.children.get(0);

        if (ps instanceof minijavaParser.BlockContext) {
            return (Block) ctx.block().accept(this);
        } else if (ps instanceof minijavaParser.PrintContext) {
            return (Print) ctx.print().accept(this);
        } else if (ps instanceof minijavaParser.AssignContext) {
            return (Assign) ctx.assign().accept(this);
        } else if (ps instanceof minijavaParser.ArrayAssignContext) {
            return (ArrayAssign) ctx.arrayAssign().accept(this);
        } else if (ps instanceof minijavaParser.If_stmContext) {
            return (If) ctx.if_stm().accept(this);
        } else { // if (ps instanceof minijavaParser.While_stmContext) {
            return (While) ctx.while_stm().accept(this);
        }
    }

    @Override
    public Exp visitExp(minijavaParser.ExpContext ctx) {

        ParseTree ps = ctx.children.get(0);

        if (ps instanceof minijavaParser.AndContext) {
            return (And) ctx.and().accept(this);
        } else if (ps instanceof minijavaParser.LessThanContext) {
            return (LessThan) ctx.lessThan().accept(this);
        } else if (ps instanceof minijavaParser.PlusContext) {
            return (Plus) ctx.plus().accept(this);
        } else if (ps instanceof minijavaParser.MinusContext) {
            return (Minus) ctx.minus().accept(this);
        } else if (ps instanceof minijavaParser.TimesContext) {
            return (Times) ctx.times().accept(this);
        } else if (ps instanceof minijavaParser.ArrayLookupContext) {
            return (ArrayLookup) ctx.arrayLookup().accept(this);
        } else if (ps instanceof minijavaParser.ArrayLengthContext) {
            return (ArrayLength) ctx.arrayLength().accept(this);
        } else if (ps instanceof minijavaParser.CallContext) {
            return (Call) ctx.call().accept(this);
        } else if (ps instanceof minijavaParser.IntegerLiteralContext) {
            return (IntegerLiteral) ctx.integerLiteral().accept(this);
        } else if (ps instanceof minijavaParser.True_stmContext) {
            return (True) ctx.true_stm().accept(this);
        } else if (ps instanceof minijavaParser.False_stmContext) {
            return (False) ctx.false_stm().accept(this);
        } else if (ps instanceof minijavaParser.NotContext) {
            return (Not) ctx.not().accept(this);
        } else if (ps instanceof minijavaParser.This_stmContext) {
            return (This) ctx.this_stm().accept(this);
        } else if (ps instanceof minijavaParser.NewArrayContext) {
            return (NewArray) ctx.newArray().accept(this);
        } else if (ps instanceof minijavaParser.NewObjectContext) {
            return (NewObject) ctx.newObject().accept(this);
        } else { //if (ps instanceof minijavaParser.IdentifierExpContext) {
            return (IdentifierExp) ctx.identifierExp().accept(this);
        }
    }

    @Override
    public Block visitBlock(minijavaParser.BlockContext ctx) {
        return new Block((StatementList) ctx.statementList().accept(this));
    }

    @Override
    public If visitIf_stm(minijavaParser.If_stmContext ctx) {
        return new If(
                (Exp) ctx.exp().accept(this),
                (Statement) ctx.statement(0).accept(this),
                (Statement) ctx.statement(1).accept(this)
        );
    }

    @Override
    public While visitWhile_stm(minijavaParser.While_stmContext ctx) {
        return new While(
                (Exp) ctx.exp().accept(this),
                (Statement) ctx.statement().accept(this)
        );
    }

    @Override
    public Print visitPrint(minijavaParser.PrintContext ctx) {
        return new Print(
                (Exp) ctx.exp().accept(this)
        );
    }

    @Override
    public Assign visitAssign(minijavaParser.AssignContext ctx) {
        return new Assign(
                (Identifier) ctx.identifier().accept(this),
                (Exp) ctx.exp().accept(this)
        );
    }

    @Override
    public ArrayAssign visitArrayAssign(minijavaParser.ArrayAssignContext ctx) {
        return new ArrayAssign(
                (Identifier) ctx.identifier().accept(this),
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public And visitAnd(minijavaParser.AndContext ctx) {
        return new And(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public LessThan visitLessThan(minijavaParser.LessThanContext ctx) {
        return new LessThan(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public Plus visitPlus(minijavaParser.PlusContext ctx) {
        return new Plus(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public Minus visitMinus(minijavaParser.MinusContext ctx) {
        return new Minus(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public Times visitTimes(minijavaParser.TimesContext ctx) {
        return new Times(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public ArrayLookup visitArrayLookup(minijavaParser.ArrayLookupContext ctx) {
        return new ArrayLookup(
                (Exp) ctx.exp(0).accept(this),
                (Exp) ctx.exp(1).accept(this)
        );
    }

    @Override
    public ArrayLength visitArrayLength(minijavaParser.ArrayLengthContext ctx) {
        return new ArrayLength(
                (Exp) ctx.exp().accept(this)
        );
    }

    @Override
    public Call visitCall(minijavaParser.CallContext ctx) {
        return new Call(
                (Exp) ctx.exp().accept(this),
                (Identifier) ctx.identifier().accept(this),
                (ExpList) ctx.expList().accept(this)
        );
    }

    @Override
    public ExpList visitExpList(minijavaParser.ExpListContext ctx) {

        ExpList el = new ExpList();

        for (minijavaParser.ExpContext ec : ctx.exp()) {
            el.addElement((Exp) ec.accept(this));
        }

        return el;
    }

    @Override
    public IntegerLiteral visitIntegerLiteral(minijavaParser.IntegerLiteralContext ctx) {

        String il = "";

        for (TerminalNode n : ctx.NUMBER()) {
            il = il.concat(n.getText());
        }

        return new IntegerLiteral(
                Integer.parseInt(il)
        );
    }

    @Override
    public True visitTrue_stm(minijavaParser.True_stmContext ctx) {
        return new True();
    }

    @Override
    public False visitFalse_stm(minijavaParser.False_stmContext ctx) {
        return new False();
    }

    @Override
    public This visitThis_stm(minijavaParser.This_stmContext ctx) {
        return new This();
    }

    @Override
    public Object visitNewArray(minijavaParser.NewArrayContext ctx) {
        return null;
    }

    @Override
    public NewObject visitNewObject(minijavaParser.NewObjectContext ctx) {
        return new NewObject(
                (Identifier) ctx.identifier().accept(this)
        );
    }

    @Override
    public IdentifierExp visitIdentifierExp(minijavaParser.IdentifierExpContext ctx) {
        return new IdentifierExp(
                ctx.getText()
        );
    }

    @Override
    public Not visitNot(minijavaParser.NotContext ctx) {
        return new Not(
                (Exp) ctx.exp().accept(this)
        );
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
