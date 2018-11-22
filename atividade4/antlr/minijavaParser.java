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
		RULE_expList = 27, RULE_integerLiteral = 28, RULE_true_stm = 29, RULE_false_stm = 30, 
		RULE_this_stm = 31, RULE_newArray = 32, RULE_newObject = 33, RULE_identifierExp = 34, 
		RULE_not = 35;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDeclList", "classDecl", "classDeclSimple", 
		"classDeclExtends", "methodDeclList", "methodDecl", "varDeclList", "varDecl", 
		"formalList", "formal", "intArrayType", "booleanType", "integerType", 
		"identifierType", "identifier", "type", "statementList", "statement", 
		"exp", "block", "if_stm", "while_stm", "print", "assign", "arrayAssign", 
		"expList", "integerLiteral", "true_stm", "false_stm", "this_stm", "newArray", 
		"newObject", "identifierExp", "not"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'main'", "'String'", null, "'if'", 
		"'else'", "'while'", "'length'", "'new'", "'true'", "'false'", "'this'", 
		"'boolean'", "'int'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "' '"
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
			setState(72);
			mainClass();
			setState(73);
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
			setState(75);
			match(CLASS);
			setState(76);
			identifier();
			setState(77);
			match(OPENING_BRACES);
			setState(78);
			match(PUBLIC);
			setState(79);
			match(STATIC);
			setState(80);
			match(VOID);
			setState(81);
			match(MAIN);
			setState(82);
			match(OPENING_PARENTHESIS);
			setState(83);
			match(STRING);
			setState(84);
			match(OPENING_BRACKETS);
			setState(85);
			match(CLOSING_BRACKETS);
			setState(86);
			identifier();
			setState(87);
			match(CLOSING_PARENTHESIS);
			setState(88);
			statement();
			setState(89);
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
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(91);
				classDecl();
				}
				}
				setState(96);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(97);
				classDeclSimple();
				}
				break;
			case 2:
				{
				setState(98);
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
			setState(101);
			match(CLASS);
			setState(102);
			identifier();
			setState(103);
			match(OPENING_BRACES);
			setState(104);
			varDeclList();
			setState(105);
			methodDeclList();
			setState(106);
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
			setState(108);
			match(CLASS);
			setState(109);
			identifier();
			setState(110);
			match(EXTENDS);
			setState(111);
			identifier();
			setState(112);
			match(OPENING_BRACES);
			setState(113);
			varDeclList();
			setState(114);
			methodDeclList();
			setState(115);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(117);
				methodDecl();
				}
				}
				setState(122);
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
			setState(123);
			match(PUBLIC);
			setState(124);
			type();
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(SEP);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEP );
			setState(130);
			identifier();
			setState(131);
			match(OPENING_PARENTHESIS);
			setState(132);
			formalList();
			setState(133);
			match(CLOSING_PARENTHESIS);
			setState(134);
			match(OPENING_BRACES);
			setState(135);
			varDeclList();
			setState(136);
			statementList();
			setState(137);
			match(RETURN);
			setState(138);
			exp(0);
			setState(139);
			match(SEMICOLON);
			setState(140);
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
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					varDecl();
					}
					} 
				}
				setState(147);
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
			setState(148);
			type();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(149);
				match(SEP);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			identifier();
			setState(156);
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
		public List<TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << LETTER) | (1L << ALPHANUMERIC))) != 0)) {
				{
				setState(158);
				formal();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(159);
					match(COLON);
					setState(160);
					formal();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			type();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(169);
				match(SEP);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(177);
			integerType();
			setState(178);
			match(OPENING_BRACKETS);
			setState(179);
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
			setState(181);
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
			setState(183);
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
			setState(185);
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
			setState(187);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				integerType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				intArrayType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT_STATEMENT) | (1L << OPENING_BRACES) | (1L << SEP) | (1L << LETTER) | (1L << ALPHANUMERIC))) != 0)) {
				{
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(195);
					match(SEP);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				statement();
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(202);
						match(SEP);
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				setState(212);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				arrayAssign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				if_stm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
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
		public TerminalNode OPENING_PARENTHESIS() { return getToken(minijavaParser.OPENING_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CLOSING_PARENTHESIS() { return getToken(minijavaParser.CLOSING_PARENTHESIS, 0); }
		public TerminalNode AND() { return getToken(minijavaParser.AND, 0); }
		public TerminalNode LESSTHAN() { return getToken(minijavaParser.LESSTHAN, 0); }
		public TerminalNode PLUS() { return getToken(minijavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(minijavaParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(minijavaParser.TIMES, 0); }
		public TerminalNode OPENING_BRACKETS() { return getToken(minijavaParser.OPENING_BRACKETS, 0); }
		public TerminalNode CLOSING_BRACKETS() { return getToken(minijavaParser.CLOSING_BRACKETS, 0); }
		public TerminalNode DOT() { return getToken(minijavaParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(minijavaParser.LENGTH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
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
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(223);
				true_stm();
				}
				break;
			case 3:
				{
				setState(224);
				false_stm();
				}
				break;
			case 4:
				{
				setState(225);
				not();
				}
				break;
			case 5:
				{
				setState(226);
				this_stm();
				}
				break;
			case 6:
				{
				setState(227);
				newArray();
				}
				break;
			case 7:
				{
				setState(228);
				newObject();
				}
				break;
			case 8:
				{
				setState(229);
				identifierExp();
				}
				break;
			case 9:
				{
				setState(230);
				match(OPENING_PARENTHESIS);
				setState(231);
				exp(0);
				setState(232);
				match(CLOSING_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(236);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(237);
						match(AND);
						setState(238);
						exp(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(240);
						match(LESSTHAN);
						setState(241);
						exp(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(242);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(243);
						match(PLUS);
						setState(244);
						exp(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(245);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(246);
						match(MINUS);
						setState(247);
						exp(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(248);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(249);
						match(TIMES);
						setState(250);
						exp(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(251);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(252);
						match(OPENING_BRACKETS);
						setState(253);
						exp(0);
						setState(254);
						match(CLOSING_BRACKETS);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(256);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(257);
						match(DOT);
						setState(258);
						match(LENGTH);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(259);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(260);
						match(DOT);
						setState(261);
						identifier();
						setState(262);
						match(OPENING_PARENTHESIS);
						setState(263);
						expList();
						setState(264);
						match(CLOSING_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			setState(271);
			match(OPENING_BRACES);
			setState(272);
			statementList();
			setState(273);
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
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IF);
			setState(276);
			match(OPENING_PARENTHESIS);
			setState(277);
			exp(0);
			setState(278);
			match(CLOSING_PARENTHESIS);
			setState(279);
			statement();
			setState(280);
			match(ELSE);
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case PRINT_STATEMENT:
			case OPENING_BRACES:
			case LETTER:
			case ALPHANUMERIC:
				{
				setState(281);
				statement();
				}
				break;
			case SEP:
				{
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					match(SEP);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEP );
				setState(287);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(290);
			match(WHILE);
			setState(291);
			match(OPENING_PARENTHESIS);
			setState(292);
			exp(0);
			setState(293);
			match(CLOSING_PARENTHESIS);
			setState(294);
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
			setState(296);
			match(PRINT_STATEMENT);
			setState(297);
			match(OPENING_PARENTHESIS);
			setState(298);
			exp(0);
			setState(299);
			match(CLOSING_PARENTHESIS);
			setState(300);
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
			setState(302);
			identifier();
			setState(303);
			match(EQUALS);
			setState(304);
			exp(0);
			setState(305);
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
			setState(307);
			identifier();
			setState(308);
			match(OPENING_BRACKETS);
			setState(309);
			exp(0);
			setState(310);
			match(CLOSING_BRACKETS);
			setState(311);
			match(EQUALS);
			setState(312);
			exp(0);
			setState(313);
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
		enterRule(_localctx, 54, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NOT) | (1L << OPENING_PARENTHESIS) | (1L << LETTER) | (1L << ALPHANUMERIC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(315);
				exp(0);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(316);
					match(COLON);
					setState(317);
					exp(0);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(327);
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
		enterRule(_localctx, 56, RULE_integerLiteral);
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
					match(NUMBER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 58, RULE_true_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 60, RULE_false_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 62, RULE_this_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
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
		enterRule(_localctx, 64, RULE_newArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(NEW);
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(SEP);
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEP );
			setState(345);
			integerType();
			setState(346);
			match(OPENING_BRACKETS);
			setState(347);
			exp(0);
			setState(348);
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
		public List<TerminalNode> SEP() { return getTokens(minijavaParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(minijavaParser.SEP, i);
		}
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
		enterRule(_localctx, 66, RULE_newObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(NEW);
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				match(SEP);
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEP );
			setState(356);
			identifier();
			setState(357);
			match(OPENING_PARENTHESIS);
			setState(358);
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
		enterRule(_localctx, 68, RULE_identifierExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		enterRule(_localctx, 70, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(NOT);
			setState(363);
			exp(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4_\n\4\f\4\16\4b\13\4\3\5\3"+
		"\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\6\t\u0081\n\t\r\t\16\t"+
		"\u0082\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\7\n\u0092\n"+
		"\n\f\n\16\n\u0095\13\n\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\5\f\u00a9"+
		"\n\f\3\r\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u00c4\n\23\3\24\7\24\u00c7\n\24\f\24\16\24\u00ca\13\24\3\24\3\24\7\24"+
		"\u00ce\n\24\f\24\16\24\u00d1\13\24\7\24\u00d3\n\24\f\24\16\24\u00d6\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00de\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ed\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u010d\n\26\f\26\16\26\u0110\13\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u011e\n\30\r\30\16\30\u011f\3\30\5"+
		"\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\7\35\u0141\n\35\f\35\16\35\u0144\13\35\7\35\u0146\n\35"+
		"\f\35\16\35\u0149\13\35\3\36\6\36\u014c\n\36\r\36\16\36\u014d\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\6\"\u0158\n\"\r\"\16\"\u0159\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\6#\u0163\n#\r#\16#\u0164\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\2\3*&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\3\3\2)*\2\u0176\2J\3\2\2\2\4M\3\2\2\2\6`\3\2\2\2\be\3\2\2\2\ng\3\2\2"+
		"\2\fn\3\2\2\2\16z\3\2\2\2\20}\3\2\2\2\22\u0093\3\2\2\2\24\u0096\3\2\2"+
		"\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2\2\32\u00b3\3\2\2\2\34\u00b7\3\2\2\2"+
		"\36\u00b9\3\2\2\2 \u00bb\3\2\2\2\"\u00bd\3\2\2\2$\u00c3\3\2\2\2&\u00d4"+
		"\3\2\2\2(\u00dd\3\2\2\2*\u00ec\3\2\2\2,\u0111\3\2\2\2.\u0115\3\2\2\2\60"+
		"\u0124\3\2\2\2\62\u012a\3\2\2\2\64\u0130\3\2\2\2\66\u0135\3\2\2\28\u0147"+
		"\3\2\2\2:\u014b\3\2\2\2<\u014f\3\2\2\2>\u0151\3\2\2\2@\u0153\3\2\2\2B"+
		"\u0155\3\2\2\2D\u0160\3\2\2\2F\u016a\3\2\2\2H\u016c\3\2\2\2JK\5\4\3\2"+
		"KL\5\6\4\2L\3\3\2\2\2MN\7\3\2\2NO\5\"\22\2OP\7\30\2\2PQ\7\5\2\2QR\7\6"+
		"\2\2RS\7\7\2\2ST\7\b\2\2TU\7\32\2\2UV\7\t\2\2VW\7\34\2\2WX\7\35\2\2XY"+
		"\5\"\22\2YZ\7\33\2\2Z[\5(\25\2[\\\7\31\2\2\\\5\3\2\2\2]_\5\b\5\2^]\3\2"+
		"\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\7\3\2\2\2b`\3\2\2\2cf\5\n\6\2df\5"+
		"\f\7\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\7\3\2\2hi\5\"\22\2ij\7\30\2\2"+
		"jk\5\22\n\2kl\5\16\b\2lm\7\31\2\2m\13\3\2\2\2no\7\3\2\2op\5\"\22\2pq\7"+
		"\4\2\2qr\5\"\22\2rs\7\30\2\2st\5\22\n\2tu\5\16\b\2uv\7\31\2\2v\r\3\2\2"+
		"\2wy\5\20\t\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3"+
		"\2\2\2}~\7\5\2\2~\u0080\5$\23\2\177\u0081\7&\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\5\"\22\2\u0085\u0086\7\32\2\2\u0086\u0087\5\26\f\2\u0087"+
		"\u0088\7\33\2\2\u0088\u0089\7\30\2\2\u0089\u008a\5\22\n\2\u008a\u008b"+
		"\5&\24\2\u008b\u008c\7\n\2\2\u008c\u008d\5*\26\2\u008d\u008e\7\36\2\2"+
		"\u008e\u008f\7\31\2\2\u008f\21\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\5$\23\2\u0097\u0099\7&\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\"\22\2"+
		"\u009e\u009f\7\36\2\2\u009f\25\3\2\2\2\u00a0\u00a5\5\30\r\2\u00a1\u00a2"+
		"\7\37\2\2\u00a2\u00a4\5\30\r\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2\2\u00aa"+
		"\u00ae\5$\23\2\u00ab\u00ad\7&\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\5\"\22\2\u00b2\31\3\2\2\2\u00b3\u00b4\5\36"+
		"\20\2\u00b4\u00b5\7\34\2\2\u00b5\u00b6\7\35\2\2\u00b6\33\3\2\2\2\u00b7"+
		"\u00b8\7\23\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba\37\3\2\2\2"+
		"\u00bb\u00bc\t\2\2\2\u00bc!\3\2\2\2\u00bd\u00be\t\2\2\2\u00be#\3\2\2\2"+
		"\u00bf\u00c4\5\36\20\2\u00c0\u00c4\5\34\17\2\u00c1\u00c4\5\32\16\2\u00c2"+
		"\u00c4\5 \21\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c7\7&\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5(\25\2\u00cc\u00ce\7&"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00c8\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\'\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00de\5,\27\2\u00d8\u00de\5\62\32"+
		"\2\u00d9\u00de\5\64\33\2\u00da\u00de\5\66\34\2\u00db\u00de\5.\30\2\u00dc"+
		"\u00de\5\60\31\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		")\3\2\2\2\u00df\u00e0\b\26\1\2\u00e0\u00ed\5:\36\2\u00e1\u00ed\5<\37\2"+
		"\u00e2\u00ed\5> \2\u00e3\u00ed\5H%\2\u00e4\u00ed\5@!\2\u00e5\u00ed\5B"+
		"\"\2\u00e6\u00ed\5D#\2\u00e7\u00ed\5F$\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea"+
		"\5*\26\2\u00ea\u00eb\7\33\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00df\3\2\2\2"+
		"\u00ec\u00e1\3\2\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4"+
		"\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ed\u010e\3\2\2\2\u00ee\u00ef\f\23\2\2\u00ef\u00f0\7"+
		"\26\2\2\u00f0\u010d\5*\26\24\u00f1\u00f2\f\22\2\2\u00f2\u00f3\7!\2\2\u00f3"+
		"\u010d\5*\26\23\u00f4\u00f5\f\21\2\2\u00f5\u00f6\7\"\2\2\u00f6\u010d\5"+
		"*\26\22\u00f7\u00f8\f\20\2\2\u00f8\u00f9\7#\2\2\u00f9\u010d\5*\26\21\u00fa"+
		"\u00fb\f\17\2\2\u00fb\u00fc\7$\2\2\u00fc\u010d\5*\26\20\u00fd\u00fe\f"+
		"\16\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\5*\26\2\u0100\u0101\7\35\2\2"+
		"\u0101\u010d\3\2\2\2\u0102\u0103\f\r\2\2\u0103\u0104\7%\2\2\u0104\u010d"+
		"\7\16\2\2\u0105\u0106\f\f\2\2\u0106\u0107\7%\2\2\u0107\u0108\5\"\22\2"+
		"\u0108\u0109\7\32\2\2\u0109\u010a\58\35\2\u010a\u010b\7\33\2\2\u010b\u010d"+
		"\3\2\2\2\u010c\u00ee\3\2\2\2\u010c\u00f1\3\2\2\2\u010c\u00f4\3\2\2\2\u010c"+
		"\u00f7\3\2\2\2\u010c\u00fa\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0102\3\2"+
		"\2\2\u010c\u0105\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f+\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\30\2\2"+
		"\u0112\u0113\5&\24\2\u0113\u0114\7\31\2\2\u0114-\3\2\2\2\u0115\u0116\7"+
		"\13\2\2\u0116\u0117\7\32\2\2\u0117\u0118\5*\26\2\u0118\u0119\7\33\2\2"+
		"\u0119\u011a\5(\25\2\u011a\u0122\7\f\2\2\u011b\u0123\5(\25\2\u011c\u011e"+
		"\7&\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\5(\25\2\u0122\u011b\3\2"+
		"\2\2\u0122\u011d\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\7\r\2\2\u0125\u0126"+
		"\7\32\2\2\u0126\u0127\5*\26\2\u0127\u0128\7\33\2\2\u0128\u0129\5(\25\2"+
		"\u0129\61\3\2\2\2\u012a\u012b\7\25\2\2\u012b\u012c\7\32\2\2\u012c\u012d"+
		"\5*\26\2\u012d\u012e\7\33\2\2\u012e\u012f\7\36\2\2\u012f\63\3\2\2\2\u0130"+
		"\u0131\5\"\22\2\u0131\u0132\7 \2\2\u0132\u0133\5*\26\2\u0133\u0134\7\36"+
		"\2\2\u0134\65\3\2\2\2\u0135\u0136\5\"\22\2\u0136\u0137\7\34\2\2\u0137"+
		"\u0138\5*\26\2\u0138\u0139\7\35\2\2\u0139\u013a\7 \2\2\u013a\u013b\5*"+
		"\26\2\u013b\u013c\7\36\2\2\u013c\67\3\2\2\2\u013d\u0142\5*\26\2\u013e"+
		"\u013f\7\37\2\2\u013f\u0141\5*\26\2\u0140\u013e\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u013d\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u01489\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c"+
		"\7+\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e;\3\2\2\2\u014f\u0150\7\20\2\2\u0150=\3\2\2\2\u0151"+
		"\u0152\7\21\2\2\u0152?\3\2\2\2\u0153\u0154\7\22\2\2\u0154A\3\2\2\2\u0155"+
		"\u0157\7\17\2\2\u0156\u0158\7&\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\5\36\20\2\u015c\u015d\7\34\2\2\u015d\u015e\5*\26\2\u015e\u015f"+
		"\7\35\2\2\u015fC\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0163\7&\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5\"\22\2\u0167\u0168\7\32\2\2\u0168"+
		"\u0169\7\33\2\2\u0169E\3\2\2\2\u016a\u016b\t\2\2\2\u016bG\3\2\2\2\u016c"+
		"\u016d\7\27\2\2\u016d\u016e\5*\26\2\u016eI\3\2\2\2\32`ez\u0082\u0093\u009a"+
		"\u00a5\u00a8\u00ae\u00c3\u00c8\u00cf\u00d4\u00dd\u00ec\u010c\u010e\u011f"+
		"\u0122\u0142\u0147\u014d\u0159\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}