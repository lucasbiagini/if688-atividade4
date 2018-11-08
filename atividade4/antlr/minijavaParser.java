// Generated from /Users/lucasbiagini/Documents/UFPE/2018.2/Compiladores if688/if688.github.io/atividades/04-MiniJavaAST/src/br/ufpe/cin/if688/minijava/atividade4/minijava.g4 by ANTLR 4.7
package br.ufpe.cin.if688.minijava.atividade4.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minijavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, EXTENDS=2, PUBLIC=3, STATIC=4, VOID=5, MAIN=6, STRING=7, RETURN=8, 
		IF=9, ELSE=10, WHILE=11, LENGTH=12, NEW=13, TRUE=14, FALSE=15, THIS=16, 
		BOOLEAN=17, INT=18, PRINT_STATEMENT=19, AND=20, NOT=21, OPENING_BRACES=22, 
		CLOSING_BRACES=23, OPENING_PARENTHESIS=24, CLOSING_PARENTHESIS=25, OPENING_BRACKETS=26, 
		CLOSING_BRACKETS=27, SEMICOLON=28, COLON=29, EQUALS=30, LESSTHAN=31, PLUS=32, 
		MINUS=33, TIMES=34, DOT=35, SEP=36, SPACE=37, NEWLINE=38, LETTER=39, ALPHANUMERIC=40, 
		NUMBER=41, DIGIT=42;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclList = 2, RULE_classDecl = 3, 
		RULE_classDeclSimple = 4, RULE_classDeclExtends = 5, RULE_methodDeclList = 6, 
		RULE_methodDecl = 7, RULE_varDeclList = 8, RULE_varDecl = 9, RULE_formalList = 10, 
		RULE_formal = 11, RULE_intArrayType = 12, RULE_booleanType = 13, RULE_integerType = 14, 
		RULE_identifierType = 15, RULE_identifier = 16, RULE_type = 17, RULE_statementList = 18, 
		RULE_statement = 19, RULE_exp = 20, RULE_block = 21, RULE_if_stm = 22, 
		RULE_while_stm = 23, RULE_print = 24, RULE_assign = 25, RULE_arrayAssign = 26, 
		RULE_and = 27, RULE_lessThan = 28, RULE_plus = 29, RULE_minus = 30, RULE_times = 31, 
		RULE_arrayLookup = 32, RULE_arrayLength = 33, RULE_call = 34, RULE_expList = 35, 
		RULE_integerLiteral = 36, RULE_true_stm = 37, RULE_false_stm = 38, RULE_this_stm = 39, 
		RULE_newArray = 40, RULE_newObject = 41, RULE_identifierExp = 42, RULE_not = 43;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDeclList", "classDecl", "classDeclSimple", 
		"classDeclExtends", "methodDeclList", "methodDecl", "varDeclList", "varDecl", 
		"formalList", "formal", "intArrayType", "booleanType", "integerType", 
		"identifierType", "identifier", "type", "statementList", "statement", 
		"exp", "block", "if_stm", "while_stm", "print", "assign", "arrayAssign", 
		"and", "lessThan", "plus", "minus", "times", "arrayLookup", "arrayLength", 
		"call", "expList", "integerLiteral", "true_stm", "false_stm", "this_stm", 
		"newArray", "newObject", "identifierExp", "not"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'main'", "'String'", null, "'if'", 
		"'else'", "'while'", null, null, "'true'", "'false'", "'this'", "'boolean'", 
		"'int'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "EXTENDS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", 
		"RETURN", "IF", "ELSE", "WHILE", "LENGTH", "NEW", "TRUE", "FALSE", "THIS", 
		"BOOLEAN", "INT", "PRINT_STATEMENT", "AND", "NOT", "OPENING_BRACES", "CLOSING_BRACES", 
		"OPENING_PARENTHESIS", "CLOSING_PARENTHESIS", "OPENING_BRACKETS", "CLOSING_BRACKETS", 
		"SEMICOLON", "COLON", "EQUALS", "LESSTHAN", "PLUS", "MINUS", "TIMES", 
		"DOT", "SEP", "SPACE", "NEWLINE", "LETTER", "ALPHANUMERIC", "NUMBER", 
		"DIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "minijava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minijavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ClassDeclListContext classDeclList() {
			return getRuleContext(ClassDeclListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			mainClass();
			setState(89);
			classDeclList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OPENING_BRACES() { return getToken(minijavaParser.OPENING_BRACES, 0); }
		public TerminalNode PUBLIC() { return getToken(minijavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(minijavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(minijavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(minijavaParser.MAIN, 0); }
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public TerminalNode STRING() { return getToken(minijavaParser.STRING, 0); }
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLOSING_BRACES() { return getToken(minijavaParser.CLOSING_BRACES, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CLASS);
			setState(92);
			identifier();
			setState(93);
			match(OPENING_BRACES);
			setState(94);
			match(PUBLIC);
			setState(95);
			match(STATIC);
			setState(96);
			match(VOID);
			setState(97);
			match(MAIN);
			setState(98);
			match(OPENING_PARENTHESIS);
			setState(99);
			match(STRING);
			setState(100);
			match(OPENING_BRACKETS);
			setState(101);
			match(CLOSING_BRACKETS);
			setState(102);
			identifier();
			setState(103);
			match(CLOSING_PARENTHESIS);
			setState(104);
			statement();
			setState(105);
			match(CLOSING_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclListContext extends ParserRuleContext {
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ClassDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitClassDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclListContext classDeclList() throws RecognitionException {
		ClassDeclListContext _localctx = new ClassDeclListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(107);
				classDecl();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclSimpleContext classDeclSimple() {
			return getRuleContext(ClassDeclSimpleContext.class,0);
		}
		public ClassDeclExtendsContext classDeclExtends() {
			return getRuleContext(ClassDeclExtendsContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(113);
				classDeclSimple();
				}
				break;
			case 2:
				{
				setState(114);
				classDeclExtends();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclSimpleContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENING_BRACES() { return getToken(minijavaParser.OPENING_BRACES, 0); }
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public MethodDeclListContext methodDeclList() {
			return getRuleContext(MethodDeclListContext.class,0);
		}
		public TerminalNode CLOSING_BRACES() { return getToken(minijavaParser.CLOSING_BRACES, 0); }
		public ClassDeclSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitClassDeclSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclSimpleContext classDeclSimple() throws RecognitionException {
		ClassDeclSimpleContext _localctx = new ClassDeclSimpleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(CLASS);
			setState(118);
			identifier();
			setState(119);
			match(OPENING_BRACES);
			setState(120);
			varDeclList();
			setState(121);
			methodDeclList();
			setState(122);
			match(CLOSING_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclExtendsContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(minijavaParser.EXTENDS, 0); }
		public TerminalNode OPENING_BRACES() { return getToken(minijavaParser.OPENING_BRACES, 0); }
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public MethodDeclListContext methodDeclList() {
			return getRuleContext(MethodDeclListContext.class,0);
		}
		public TerminalNode CLOSING_BRACES() { return getToken(minijavaParser.CLOSING_BRACES, 0); }
		public ClassDeclExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitClassDeclExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclExtendsContext classDeclExtends() throws RecognitionException {
		ClassDeclExtendsContext _localctx = new ClassDeclExtendsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CLASS);
			setState(125);
			identifier();
			setState(126);
			match(EXTENDS);
			setState(127);
			identifier();
			setState(128);
			match(OPENING_BRACES);
			setState(129);
			varDeclList();
			setState(130);
			methodDeclList();
			setState(131);
			match(CLOSING_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclListContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MethodDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitMethodDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclListContext methodDeclList() throws RecognitionException {
		MethodDeclListContext _localctx = new MethodDeclListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(133);
				methodDecl();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(minijavaParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public TerminalNode OPENING_BRACES() { return getToken(minijavaParser.OPENING_BRACES, 0); }
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(minijavaParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public TerminalNode CLOSING_BRACES() { return getToken(minijavaParser.CLOSING_BRACES, 0); }
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PUBLIC);
			setState(140);
			type();
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(SEP);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEP );
			setState(146);
			identifier();
			setState(147);
			match(OPENING_PARENTHESIS);
			setState(148);
			formalList();
			setState(149);
			match(CLOSING_PARENTHESIS);
			setState(150);
			match(OPENING_BRACES);
			setState(151);
			varDeclList();
			setState(152);
			statementList();
			setState(153);
			match(RETURN);
			setState(154);
			exp();
			setState(155);
			match(SEMICOLON);
			setState(156);
			match(CLOSING_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclListContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitVarDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					varDecl();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(165);
				match(SEP);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			identifier();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(172);
				match(SEP);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalListContext extends ParserRuleContext {
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitFormalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << LETTER) | (1L << ALPHANUMERIC))) != 0)) {
				{
				{
				setState(180);
				formal();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			type();
			setState(187);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntArrayTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public IntArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIntArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrayTypeContext intArrayType() throws RecognitionException {
		IntArrayTypeContext _localctx = new IntArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			integerType();
			setState(190);
			match(OPENING_BRACKETS);
			setState(191);
			match(CLOSING_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(minijavaParser.BOOLEAN, 0); }
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(minijavaParser.INT, 0); }
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierTypeContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(minijavaParser.LETTER, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(minijavaParser.ALPHANUMERIC, 0); }
		public IdentifierTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierTypeContext identifierType() throws RecognitionException {
		IdentifierTypeContext _localctx = new IdentifierTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifierType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==ALPHANUMERIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(minijavaParser.LETTER, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(minijavaParser.ALPHANUMERIC, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==ALPHANUMERIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public IdentifierTypeContext identifierType() {
			return getRuleContext(IdentifierTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				integerType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				intArrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				identifierType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT_STATEMENT) | (1L << OPENING_BRACES) | (1L << SEP) | (1L << LETTER) | (1L << ALPHANUMERIC))) != 0)) {
				{
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(207);
					match(SEP);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				statement();
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						match(SEP);
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ArrayAssignContext arrayAssign() {
			return getRuleContext(ArrayAssignContext.class,0);
		}
		public If_stmContext if_stm() {
			return getRuleContext(If_stmContext.class,0);
		}
		public While_stmContext while_stm() {
			return getRuleContext(While_stmContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				arrayAssign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				if_stm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				while_stm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public True_stmContext true_stm() {
			return getRuleContext(True_stmContext.class,0);
		}
		public False_stmContext false_stm() {
			return getRuleContext(False_stmContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public This_stmContext this_stm() {
			return getRuleContext(This_stmContext.class,0);
		}
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public IdentifierExpContext identifierExp() {
			return getRuleContext(IdentifierExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				and();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				lessThan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				plus();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				minus();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				times();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				arrayLookup();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				arrayLength();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				integerLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				true_stm();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				false_stm();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(244);
				not();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(245);
				this_stm();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(246);
				newArray();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(247);
				newObject();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(248);
				identifierExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACES() { return getToken(minijavaParser.OPENING_BRACES, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode CLOSING_BRACES() { return getToken(minijavaParser.CLOSING_BRACES, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(OPENING_BRACES);
			setState(252);
			statementList();
			setState(253);
			match(CLOSING_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(minijavaParser.IF, 0); }
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(minijavaParser.ELSE, 0); }
		public If_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIf_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmContext if_stm() throws RecognitionException {
		If_stmContext _localctx = new If_stmContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IF);
			setState(256);
			match(OPENING_PARENTHESIS);
			setState(257);
			exp();
			setState(258);
			match(CLOSING_PARENTHESIS);
			setState(259);
			statement();
			setState(260);
			match(ELSE);
			setState(261);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(minijavaParser.WHILE, 0); }
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitWhile_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmContext while_stm() throws RecognitionException {
		While_stmContext _localctx = new While_stmContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(WHILE);
			setState(264);
			match(OPENING_PARENTHESIS);
			setState(265);
			exp();
			setState(266);
			match(CLOSING_PARENTHESIS);
			setState(267);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_STATEMENT() { return getToken(minijavaParser.PRINT_STATEMENT, 0); }
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(PRINT_STATEMENT);
			setState(270);
			match(OPENING_PARENTHESIS);
			setState(271);
			exp();
			setState(272);
			match(CLOSING_PARENTHESIS);
			setState(273);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(minijavaParser.EQUALS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			identifier();
			setState(276);
			match(EQUALS);
			setState(277);
			exp();
			setState(278);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public TerminalNode EQUALS() { return getToken(minijavaParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public ArrayAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignContext arrayAssign() throws RecognitionException {
		ArrayAssignContext _localctx = new ArrayAssignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			identifier();
			setState(281);
			match(OPENING_BRACKETS);
			setState(282);
			exp();
			setState(283);
			match(CLOSING_BRACKETS);
			setState(284);
			match(EQUALS);
			setState(285);
			exp();
			setState(286);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(minijavaParser.AND, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(OPENING_PARENTHESIS);
			setState(289);
			exp();
			setState(290);
			match(AND);
			setState(291);
			exp();
			setState(292);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanContext extends ParserRuleContext {
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(minijavaParser.LESSTHAN, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(OPENING_PARENTHESIS);
			setState(295);
			exp();
			setState(296);
			match(LESSTHAN);
			setState(297);
			exp();
			setState(298);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(minijavaParser.PLUS, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(OPENING_PARENTHESIS);
			setState(301);
			exp();
			setState(302);
			match(PLUS);
			setState(303);
			exp();
			setState(304);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(minijavaParser.MINUS, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OPENING_PARENTHESIS);
			setState(307);
			exp();
			setState(308);
			match(MINUS);
			setState(309);
			exp();
			setState(310);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimesContext extends ParserRuleContext {
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(minijavaParser.TIMES, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(OPENING_PARENTHESIS);
			setState(313);
			exp();
			setState(314);
			match(TIMES);
			setState(315);
			exp();
			setState(316);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLookupContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitArrayLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayLookup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(318);
					match(SEP);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(321); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(323);
			exp();
			setState(324);
			match(OPENING_BRACKETS);
			setState(325);
			exp();
			setState(326);
			match(CLOSING_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(minijavaParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(minijavaParser.LENGTH, 0); }
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayLength);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(328);
					match(SEP);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(333);
			exp();
			setState(334);
			match(DOT);
			setState(335);
			match(LENGTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> OPENING_PARENTHESIS() { return getTokens(minijavaParser.OPENING_PARENTHESIS); }
		public TerminalNode OPENING_PARENTHESIS(int i) {
			return getToken(minijavaParser.OPENING_PARENTHESIS, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(minijavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public List<TerminalNode> CLOSING_PARENTHESIS() { return getTokens(minijavaParser.CLOSING_PARENTHESIS); }
		public TerminalNode CLOSING_PARENTHESIS(int i) {
			return getToken(minijavaParser.CLOSING_PARENTHESIS, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(OPENING_PARENTHESIS);
			setState(338);
			exp();
			setState(339);
			match(DOT);
			setState(340);
			identifier();
			setState(341);
			match(OPENING_PARENTHESIS);
			setState(342);
			expList();
			setState(343);
			match(CLOSING_PARENTHESIS);
			setState(344);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpListContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NOT) | (1L << OPENING_PARENTHESIS) | (1L << SEP) | (1L << LETTER) | (1L << ALPHANUMERIC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(346);
				exp();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(347);
					match(COLON);
					setState(348);
					exp();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(minijavaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(minijavaParser.NUMBER, i);
		}
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_integerLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(359);
					match(NUMBER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_stmContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(minijavaParser.TRUE, 0); }
		public True_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitTrue_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_stmContext true_stm() throws RecognitionException {
		True_stmContext _localctx = new True_stmContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_true_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class False_stmContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(minijavaParser.FALSE, 0); }
		public False_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitFalse_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_stmContext false_stm() throws RecognitionException {
		False_stmContext _localctx = new False_stmContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_false_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class This_stmContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(minijavaParser.THIS, 0); }
		public This_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitThis_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final This_stmContext this_stm() throws RecognitionException {
		This_stmContext _localctx = new This_stmContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_this_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewArrayContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(minijavaParser.NEW, 0); }
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public NewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayContext newArray() throws RecognitionException {
		NewArrayContext _localctx = new NewArrayContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_newArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(NEW);
			setState(371);
			integerType();
			setState(372);
			match(OPENING_BRACKETS);
			setState(373);
			exp();
			setState(374);
			match(CLOSING_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewObjectContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(minijavaParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(NEW);
			setState(377);
			identifier();
			setState(378);
			match(OPENING_PARENTHESIS);
			setState(379);
			match(CLOSING_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierExpContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(minijavaParser.LETTER, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(minijavaParser.ALPHANUMERIC, 0); }
		public IdentifierExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitIdentifierExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierExpContext identifierExp() throws RecognitionException {
		IdentifierExpContext _localctx = new IdentifierExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifierExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==ALPHANUMERIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(minijavaParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minijavaVisitor ) return ((minijavaVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(NOT);
			setState(384);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\7\4o\n\4\f\4\16\4r\13\4\3\5\3\5\5\5v\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b\u0089"+
		"\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\t\6\t\u0091\n\t\r\t\16\t\u0092\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\7\n\u00a2\n\n\f\n\16"+
		"\n\u00a5\13\n\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13\13\3\13\3"+
		"\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\3\f\7\f\u00b8\n\f"+
		"\f\f\16\f\u00bb\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\24\7\24"+
		"\u00d3\n\24\f\24\16\24\u00d6\13\24\3\24\3\24\7\24\u00da\n\24\f\24\16\24"+
		"\u00dd\13\24\7\24\u00df\n\24\f\24\16\24\u00e2\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00ea\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fc\n\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\6\"\u0142\n\"\r\"\16\"\u0143\3\"\3\"\3\"\3\"\3\"\3#\6"+
		"#\u014c\n#\r#\16#\u014d\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\7%\u0160\n%\f%\16%\u0163\13%\7%\u0165\n%\f%\16%\u0168\13%\3&\6&\u016b"+
		"\n&\r&\16&\u016c\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3,\3,\3-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVX\2\3\3\2)*\2\u017f\2Z\3\2\2\2\4]\3\2\2"+
		"\2\6p\3\2\2\2\bu\3\2\2\2\nw\3\2\2\2\f~\3\2\2\2\16\u008a\3\2\2\2\20\u008d"+
		"\3\2\2\2\22\u00a3\3\2\2\2\24\u00a6\3\2\2\2\26\u00b9\3\2\2\2\30\u00bc\3"+
		"\2\2\2\32\u00bf\3\2\2\2\34\u00c3\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2"+
		"\2\"\u00c9\3\2\2\2$\u00cf\3\2\2\2&\u00e0\3\2\2\2(\u00e9\3\2\2\2*\u00fb"+
		"\3\2\2\2,\u00fd\3\2\2\2.\u0101\3\2\2\2\60\u0109\3\2\2\2\62\u010f\3\2\2"+
		"\2\64\u0115\3\2\2\2\66\u011a\3\2\2\28\u0122\3\2\2\2:\u0128\3\2\2\2<\u012e"+
		"\3\2\2\2>\u0134\3\2\2\2@\u013a\3\2\2\2B\u0141\3\2\2\2D\u014b\3\2\2\2F"+
		"\u0153\3\2\2\2H\u0166\3\2\2\2J\u016a\3\2\2\2L\u016e\3\2\2\2N\u0170\3\2"+
		"\2\2P\u0172\3\2\2\2R\u0174\3\2\2\2T\u017a\3\2\2\2V\u017f\3\2\2\2X\u0181"+
		"\3\2\2\2Z[\5\4\3\2[\\\5\6\4\2\\\3\3\2\2\2]^\7\3\2\2^_\5\"\22\2_`\7\30"+
		"\2\2`a\7\5\2\2ab\7\6\2\2bc\7\7\2\2cd\7\b\2\2de\7\32\2\2ef\7\t\2\2fg\7"+
		"\34\2\2gh\7\35\2\2hi\5\"\22\2ij\7\33\2\2jk\5(\25\2kl\7\31\2\2l\5\3\2\2"+
		"\2mo\5\b\5\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\7\3\2\2\2rp\3\2"+
		"\2\2sv\5\n\6\2tv\5\f\7\2us\3\2\2\2ut\3\2\2\2v\t\3\2\2\2wx\7\3\2\2xy\5"+
		"\"\22\2yz\7\30\2\2z{\5\22\n\2{|\5\16\b\2|}\7\31\2\2}\13\3\2\2\2~\177\7"+
		"\3\2\2\177\u0080\5\"\22\2\u0080\u0081\7\4\2\2\u0081\u0082\5\"\22\2\u0082"+
		"\u0083\7\30\2\2\u0083\u0084\5\22\n\2\u0084\u0085\5\16\b\2\u0085\u0086"+
		"\7\31\2\2\u0086\r\3\2\2\2\u0087\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u0090\5$\23\2\u008f\u0091"+
		"\7&\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\"\22\2\u0095\u0096\7"+
		"\32\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\33\2\2\u0098\u0099\7\30\2\2"+
		"\u0099\u009a\5\22\n\2\u009a\u009b\5&\24\2\u009b\u009c\7\n\2\2\u009c\u009d"+
		"\5*\26\2\u009d\u009e\7\36\2\2\u009e\u009f\7\31\2\2\u009f\21\3\2\2\2\u00a0"+
		"\u00a2\5\24\13\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00aa\5$\23\2\u00a7\u00a9\7&\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b1\5\"\22\2\u00ae\u00b0\7&\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\36\2\2\u00b5\25\3\2\2"+
		"\2\u00b6\u00b8\5\30\r\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00b9\3\2\2"+
		"\2\u00bc\u00bd\5$\23\2\u00bd\u00be\5\"\22\2\u00be\31\3\2\2\2\u00bf\u00c0"+
		"\5\36\20\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\7\35\2\2\u00c2\33\3\2\2\2"+
		"\u00c3\u00c4\7\23\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\37\3"+
		"\2\2\2\u00c7\u00c8\t\2\2\2\u00c8!\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca#\3"+
		"\2\2\2\u00cb\u00d0\5\36\20\2\u00cc\u00d0\5\34\17\2\u00cd\u00d0\5\32\16"+
		"\2\u00ce\u00d0\5 \21\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00d3\7&\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\5(\25\2\u00d8\u00da\7&"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00d4\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\'\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00ea\5,\27\2\u00e4\u00ea\5\62\32"+
		"\2\u00e5\u00ea\5\64\33\2\u00e6\u00ea\5\66\34\2\u00e7\u00ea\5.\30\2\u00e8"+
		"\u00ea\5\60\31\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3"+
		"\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		")\3\2\2\2\u00eb\u00fc\58\35\2\u00ec\u00fc\5:\36\2\u00ed\u00fc\5<\37\2"+
		"\u00ee\u00fc\5> \2\u00ef\u00fc\5@!\2\u00f0\u00fc\5B\"\2\u00f1\u00fc\5"+
		"D#\2\u00f2\u00fc\5F$\2\u00f3\u00fc\5J&\2\u00f4\u00fc\5L\'\2\u00f5\u00fc"+
		"\5N(\2\u00f6\u00fc\5X-\2\u00f7\u00fc\5P)\2\u00f8\u00fc\5R*\2\u00f9\u00fc"+
		"\5T+\2\u00fa\u00fc\5V,\2\u00fb\u00eb\3\2\2\2\u00fb\u00ec\3\2\2\2\u00fb"+
		"\u00ed\3\2\2\2\u00fb\u00ee\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f0\3\2"+
		"\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2"+
		"\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"+\3\2\2\2\u00fd\u00fe\7\30\2\2\u00fe\u00ff\5&\24\2\u00ff\u0100\7\31\2"+
		"\2\u0100-\3\2\2\2\u0101\u0102\7\13\2\2\u0102\u0103\7\32\2\2\u0103\u0104"+
		"\5*\26\2\u0104\u0105\7\33\2\2\u0105\u0106\5(\25\2\u0106\u0107\7\f\2\2"+
		"\u0107\u0108\5(\25\2\u0108/\3\2\2\2\u0109\u010a\7\r\2\2\u010a\u010b\7"+
		"\32\2\2\u010b\u010c\5*\26\2\u010c\u010d\7\33\2\2\u010d\u010e\5(\25\2\u010e"+
		"\61\3\2\2\2\u010f\u0110\7\25\2\2\u0110\u0111\7\32\2\2\u0111\u0112\5*\26"+
		"\2\u0112\u0113\7\33\2\2\u0113\u0114\7\36\2\2\u0114\63\3\2\2\2\u0115\u0116"+
		"\5\"\22\2\u0116\u0117\7 \2\2\u0117\u0118\5*\26\2\u0118\u0119\7\36\2\2"+
		"\u0119\65\3\2\2\2\u011a\u011b\5\"\22\2\u011b\u011c\7\34\2\2\u011c\u011d"+
		"\5*\26\2\u011d\u011e\7\35\2\2\u011e\u011f\7 \2\2\u011f\u0120\5*\26\2\u0120"+
		"\u0121\7\36\2\2\u0121\67\3\2\2\2\u0122\u0123\7\32\2\2\u0123\u0124\5*\26"+
		"\2\u0124\u0125\7\26\2\2\u0125\u0126\5*\26\2\u0126\u0127\7\33\2\2\u0127"+
		"9\3\2\2\2\u0128\u0129\7\32\2\2\u0129\u012a\5*\26\2\u012a\u012b\7!\2\2"+
		"\u012b\u012c\5*\26\2\u012c\u012d\7\33\2\2\u012d;\3\2\2\2\u012e\u012f\7"+
		"\32\2\2\u012f\u0130\5*\26\2\u0130\u0131\7\"\2\2\u0131\u0132\5*\26\2\u0132"+
		"\u0133\7\33\2\2\u0133=\3\2\2\2\u0134\u0135\7\32\2\2\u0135\u0136\5*\26"+
		"\2\u0136\u0137\7#\2\2\u0137\u0138\5*\26\2\u0138\u0139\7\33\2\2\u0139?"+
		"\3\2\2\2\u013a\u013b\7\32\2\2\u013b\u013c\5*\26\2\u013c\u013d\7$\2\2\u013d"+
		"\u013e\5*\26\2\u013e\u013f\7\33\2\2\u013fA\3\2\2\2\u0140\u0142\7&\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5*\26\2\u0146\u0147\7\34\2\2"+
		"\u0147\u0148\5*\26\2\u0148\u0149\7\35\2\2\u0149C\3\2\2\2\u014a\u014c\7"+
		"&\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5*\26\2\u0150\u0151\7%"+
		"\2\2\u0151\u0152\7\16\2\2\u0152E\3\2\2\2\u0153\u0154\7\32\2\2\u0154\u0155"+
		"\5*\26\2\u0155\u0156\7%\2\2\u0156\u0157\5\"\22\2\u0157\u0158\7\32\2\2"+
		"\u0158\u0159\5H%\2\u0159\u015a\7\33\2\2\u015a\u015b\7\33\2\2\u015bG\3"+
		"\2\2\2\u015c\u0161\5*\26\2\u015d\u015e\7\37\2\2\u015e\u0160\5*\26\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167I\3\2\2\2"+
		"\u0168\u0166\3\2\2\2\u0169\u016b\7+\2\2\u016a\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dK\3\2\2\2\u016e"+
		"\u016f\7\20\2\2\u016fM\3\2\2\2\u0170\u0171\7\21\2\2\u0171O\3\2\2\2\u0172"+
		"\u0173\7\22\2\2\u0173Q\3\2\2\2\u0174\u0175\7\17\2\2\u0175\u0176\5\36\20"+
		"\2\u0176\u0177\7\34\2\2\u0177\u0178\5*\26\2\u0178\u0179\7\35\2\2\u0179"+
		"S\3\2\2\2\u017a\u017b\7\17\2\2\u017b\u017c\5\"\22\2\u017c\u017d\7\32\2"+
		"\2\u017d\u017e\7\33\2\2\u017eU\3\2\2\2\u017f\u0180\t\2\2\2\u0180W\3\2"+
		"\2\2\u0181\u0182\7\27\2\2\u0182\u0183\5*\26\2\u0183Y\3\2\2\2\25pu\u008a"+
		"\u0092\u00a3\u00aa\u00b1\u00b9\u00cf\u00d4\u00db\u00e0\u00e9\u00fb\u0143"+
		"\u014d\u0161\u0166\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}