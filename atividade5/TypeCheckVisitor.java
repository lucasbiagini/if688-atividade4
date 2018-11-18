package br.ufpe.cin.if688.minijava.atividade5;

import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.visitor.IVisitor;

public class TypeCheckVisitor implements IVisitor<Type> {

	private SymbolTable symbolTable;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	private Class currClass;
	private Method currMethod;

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {

		this.currClass = this.symbolTable.getClass(n.i1.s);
		this.currMethod = this.currClass.getMethod("main");

		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {

		this.currClass = this.symbolTable.getClass(n.i.s);
		this.currMethod = null;

		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {

		this.currClass = this.symbolTable.getClass(n.i.s);
		this.currMethod = null;

		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) { return null; }

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {

		this.currMethod = this.symbolTable.getMethod(n.i.s, this.currClass.getId());

		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}

		Type returnType = n.e.accept(this);

		if (!this.symbolTable.compareTypes(this.currMethod.type(), returnType)) {
			System.out.println("MethodDecl falhou: " +  this.currMethod.getId()+ " esta retornando o tipo errado");
			System.exit(0);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {return null;}

	public Type visit(IntArrayType n) {
		return null;
	}

	public Type visit(BooleanType n) {
		return null;
	}

	public Type visit(IntegerType n) {
		return null;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return null;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {

		Type t1 = n.e.accept(this);

		if (t1 instanceof BooleanType) {
			n.s1.accept(this);
			n.s2.accept(this);
		} else {
			System.out.println("If falhou: a expressão deve ser booleana");
			System.exit(0);
		}

		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {

		Type t = n.e.accept(this);

		if (t instanceof BooleanType) {
			n.s.accept(this);
		} else {
			System.out.println("While falhou: a expressão deve ser booleana");
			System.exit(0);
		}

		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {

		Type t1 = n.i.accept(this);
		Type t2 = n.e.accept(this);

		if (!this.symbolTable.compareTypes(t1,t2)) {
			System.out.println("Assign falhou");
			System.exit(0);
		}

		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {

		Type t1 = n.i.accept(this);
		Type t2 = n.e1.accept(this);
		Type t3 = n.e2.accept(this);


		if (!(t1 instanceof IntArrayType)) {
			System.out.println("Array Assign falhou - " + n.i.s + " deve ser um IntArrayType");
			System.exit(0);
		} else if (!(t2 instanceof IntegerType)) {
			System.out.println("Array index falhou");
			System.exit(0);
		} else if (!(t3 instanceof IntegerType)) {
			System.out.println("Array assign falhou");
			System.exit(0);
		}

		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof BooleanType) || !(t2 instanceof BooleanType)) {
			System.out.println("And falhou");
			System.exit(0);
		}

		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType) || !(t2 instanceof IntegerType)) {
			System.out.println("LessThan falhou");
			System.exit(0);
		}

		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType) || !(t2 instanceof IntegerType)) {
			System.out.println("Plus falhou");
			System.exit(0);
		}

		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType) || !(t2 instanceof IntegerType)) {
			System.out.println("Minus falhou");
			System.exit(0);
		}

		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType) || !(t2 instanceof IntegerType)) {
			System.out.println("Times falhou");
			System.exit(0);
		}

		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntArrayType) || !(t2 instanceof IntegerType)) {
			System.out.println("ArrayLookup falhou");
			System.exit(0);
		}

		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {

		Type t = n.e.accept(this);

		if (!(t instanceof IntArrayType)) {
			System.out.println("ArrayLength falhou");
			System.exit(0);
		}

		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {

		Type t1 = n.e.accept(this);

		if (t1 instanceof IdentifierType) {

			Method m = this.symbolTable.getMethod(n.i.s, ((IdentifierType) t1).s);

			for (int i = 0; i < n.el.size(); i++) {
				Type t2 = n.el.elementAt(i).accept(this);

				if (!this.symbolTable.compareTypes(t2, m.getParamAt(i).type())) {
					System.out.println("Call falhou: " + (i+1) + "º parametro possui tipo errado");
					System.exit(0);
				}

			}

		} else {
			System.out.println("Call falhou: a expressão deve ser do tipo IdentifierType");
			System.exit(0);
		}

		return this.symbolTable.getMethodType(n.i.s, ((IdentifierType) t1).s);
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) { return new BooleanType(); }

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);
	}

	public Type visit(This n) {
		return new IdentifierType(currClass.getId());
	}

	// Exp e;
	public Type visit(NewArray n) {

		Type t = n.e.accept(this);

		if (!(t instanceof IntegerType)) {
			System.out.println("NewArray falhou: expressão deve ser IntegerType");
			System.exit(0);
		}

		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {

		if (!this.symbolTable.containsClass(n.i.s)) {
			System.out.println("New Object falhou: a classe " + n.i.s + " não existe");
			System.exit(0);
		}

		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {

		Type t = n.e.accept(this);

		if (!(t instanceof BooleanType)) {
			System.out.println("Not falhou: expressão deve ser BooleanType");
			System.exit(0);
		}

		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);
	}
}
