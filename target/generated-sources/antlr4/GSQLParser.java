// Generated from GSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, INT=38, CHAR=39, 
		FLOAT=40, Id=41, Num=42, Char=43, Comments=44, WhitespaceDeclaration=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'TO'", "','", "'-'", "'('", "'<'", "'CONSTRAINT'", "'TABLES'", 
		"'FOREIGN'", "'<='", "'OR'", "'PRIMARY'", "'RENAME'", "'COLUMNS'", "'AND'", 
		"')'", "'.'", "'TABLE'", "'COLUMN'", "'<>'", "'='", "'ALTER'", "'ADD'", 
		"';'", "'SHOW'", "'KEY'", "'CREATE'", "'DATABASES'", "'REFERENCES'", "'>'", 
		"'DROP'", "'DATABASE'", "'USE'", "'FROM'", "'/'", "'>='", "'NOT'", "'CHECK'", 
		"'int'", "'char'", "'float'", "Id", "Num", "Char", "Comments", "WhitespaceDeclaration"
	};
	public static final int
		RULE_database = 0, RULE_createDatabase = 1, RULE_alterDatabase = 2, RULE_dropDatabase = 3, 
		RULE_useDatabase = 4, RULE_showDatabase = 5, RULE_table = 6, RULE_createTable = 7, 
		RULE_constraint = 8, RULE_type = 9, RULE_expression = 10, RULE_andExpression = 11, 
		RULE_eqExpression = 12, RULE_relExpression = 13, RULE_unExpression = 14, 
		RULE_eqOp = 15, RULE_relOp = 16, RULE_orOp = 17, RULE_andOp = 18, RULE_alterTable = 19, 
		RULE_action = 20, RULE_dropTable = 21, RULE_showTables = 22, RULE_showColumns = 23, 
		RULE_literal = 24, RULE_int_literal = 25, RULE_float_literal = 26, RULE_char_literal = 27;
	public static final String[] ruleNames = {
		"database", "createDatabase", "alterDatabase", "dropDatabase", "useDatabase", 
		"showDatabase", "table", "createTable", "constraint", "type", "expression", 
		"andExpression", "eqExpression", "relExpression", "unExpression", "eqOp", 
		"relOp", "orOp", "andOp", "alterTable", "action", "dropTable", "showTables", 
		"showColumns", "literal", "int_literal", "float_literal", "char_literal"
	};

	@Override
	public String getGrammarFileName() { return "GSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DatabaseContext extends ParserRuleContext {
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public ShowDatabaseContext showDatabase() {
			return getRuleContext(ShowDatabaseContext.class,0);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_database);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); createDatabase();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); alterDatabase();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); dropDatabase();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(59); useDatabase();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(60); showDatabase();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitCreateDatabase(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__11);
			setState(64); match(T__6);
			setState(65); match(Id);
			setState(66); match(T__14);
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

	public static class AlterDatabaseContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(GSQLParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(GSQLParser.Id, i);
		}
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterAlterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitAlterDatabase(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__16);
			setState(69); match(T__6);
			setState(70); match(Id);
			setState(71); match(T__25);
			setState(72); match(T__36);
			setState(73); match(Id);
			setState(74); match(T__14);
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

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitDropDatabase(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(T__7);
			setState(77); match(T__6);
			setState(78); match(Id);
			setState(79); match(T__14);
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

	public static class UseDatabaseContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterUseDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitUseDatabase(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_useDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__5);
			setState(82); match(T__6);
			setState(83); match(Id);
			setState(84); table();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__13) | (1L << T__11) | (1L << T__7))) != 0)) {
				{
				{
				setState(85); table();
				}
				}
				setState(90);
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

	public static class ShowDatabaseContext extends ParserRuleContext {
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterShowDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitShowDatabase(this);
		}
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__13);
			setState(92); match(T__10);
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

	public static class TableContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); alterTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96); dropTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); showTables();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98); showColumns();
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

	public static class CreateTableContext extends ParserRuleContext {
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public List<TerminalNode> Id() { return getTokens(GSQLParser.Id); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode Id(int i) {
			return getToken(GSQLParser.Id, i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(T__11);
			setState(102); match(T__20);
			setState(103); match(Id);
			setState(104); match(T__33);
			setState(121);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(105); match(Id);
				setState(106); type();
				setState(108);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(107); constraint();
					}
				}

				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(110); match(T__35);
					setState(111); match(Id);
					setState(112); type();
					setState(114);
					_la = _input.LA(1);
					if (_la==Id) {
						{
						setState(113); constraint();
						}
					}

					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123); match(T__22);
			setState(124); match(T__14);
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

	public static class ConstraintContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(GSQLParser.Id); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Id(int i) {
			return getToken(GSQLParser.Id, i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraint);
		int _la;
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(Id);
				setState(127); match(T__26);
				setState(128); match(T__12);
				setState(129); match(T__33);
				setState(130); match(Id);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(131); match(T__35);
					setState(132); match(Id);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138); match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(Id);
				setState(140); match(T__29);
				setState(141); match(T__12);
				setState(142); match(T__33);
				setState(143); match(Id);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(144); match(T__35);
					setState(145); match(Id);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151); match(T__22);
				setState(152); match(T__9);
				setState(153); match(Id);
				setState(154); match(T__33);
				setState(155); match(Id);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(156); match(T__35);
					setState(157); match(Id);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163); match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164); match(Id);
				setState(165); match(T__0);
				setState(166); match(T__33);
				setState(167); expression(0);
				setState(168); match(T__22);
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> Num() { return getTokens(GSQLParser.Num); }
		public TerminalNode FLOAT() { return getToken(GSQLParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(GSQLParser.INT, 0); }
		public TerminalNode Num(int i) {
			return getToken(GSQLParser.Num, i);
		}
		public TerminalNode CHAR() { return getToken(GSQLParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(FLOAT);
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); match(Num);
				setState(175); match(T__34);
				setState(176); match(Num);
				setState(177); match(T__34);
				setState(178); match(Num);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); match(CHAR);
				setState(180); match(T__33);
				setState(181); match(Num);
				setState(182); match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpAndExpressionContext extends ExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExpAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterExpAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitExpAndExpression(this);
		}
	}
	public static class CondOrExpressionContext extends ExpressionContext {
		public OrOpContext orOp() {
			return getRuleContext(OrOpContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CondOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterCondOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitCondOrExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpAndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(186); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(188);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(189); orOp();
					setState(190); andExpression(0);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqAndExpressionContext extends AndExpressionContext {
		public EqExpressionContext eqExpression() {
			return getRuleContext(EqExpressionContext.class,0);
		}
		public EqAndExpressionContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterEqAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitEqAndExpression(this);
		}
	}
	public static class CondExpressionContext extends AndExpressionContext {
		public EqExpressionContext eqExpression() {
			return getRuleContext(EqExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndOpContext andOp() {
			return getRuleContext(AndOpContext.class,0);
		}
		public CondExpressionContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterCondExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitCondExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqAndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(198); eqExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondExpressionContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(201); andOp();
					setState(202); eqExpression(0);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class EqExpressionContext extends ParserRuleContext {
		public EqExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpression; }
	 
		public EqExpressionContext() { }
		public void copyFrom(EqExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqRelExpressionContext extends EqExpressionContext {
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public EqRelExpressionContext(EqExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterEqRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitEqRelExpression(this);
		}
	}
	public static class EqOpExpressionContext extends EqExpressionContext {
		public EqExpressionContext eqExpression() {
			return getRuleContext(EqExpressionContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public EqOpExpressionContext(EqExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterEqOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitEqOpExpression(this);
		}
	}

	public final EqExpressionContext eqExpression() throws RecognitionException {
		return eqExpression(0);
	}

	private EqExpressionContext eqExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpressionContext _localctx = new EqExpressionContext(_ctx, _parentState);
		EqExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_eqExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqRelExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(210); relExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqOpExpressionContext(new EqExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpression);
					setState(212);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(213); eqOp();
					setState(214); relExpression(0);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class RelExpressionContext extends ParserRuleContext {
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
	 
		public RelExpressionContext() { }
		public void copyFrom(RelExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOpExpressionContext extends RelExpressionContext {
		public UnExpressionContext unExpression() {
			return getRuleContext(UnExpressionContext.class,0);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public RelOpExpressionContext(RelExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterRelOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitRelOpExpression(this);
		}
	}
	public static class RelSumExpressionContext extends RelExpressionContext {
		public UnExpressionContext unExpression() {
			return getRuleContext(UnExpressionContext.class,0);
		}
		public RelSumExpressionContext(RelExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterRelSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitRelSumExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		return relExpression(0);
	}

	private RelExpressionContext relExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, _parentState);
		RelExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelSumExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(222); unExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelOpExpressionContext(new RelExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExpression);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225); relOp();
					setState(226); unExpression();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class UnExpressionContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public UnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterUnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitUnExpression(this);
		}
	}

	public final UnExpressionContext unExpression() throws RecognitionException {
		UnExpressionContext _localctx = new UnExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unExpression);
		int _la;
		try {
			setState(238);
			switch (_input.LA(1)) {
			case T__1:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(233); match(T__1);
					}
				}

				setState(236); match(Id);
				}
				break;
			case Num:
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EqOpContext extends ParserRuleContext {
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitEqOp(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__28) | (1L << T__8) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OrOpContext extends ParserRuleContext {
		public OrOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitOrOp(this);
		}
	}

	public final OrOpContext orOp() throws RecognitionException {
		OrOpContext _localctx = new OrOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(T__27);
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

	public static class AndOpContext extends ParserRuleContext {
		public AndOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitAndOp(this);
		}
	}

	public final AndOpContext andOp() throws RecognitionException {
		AndOpContext _localctx = new AndOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(T__23);
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

	public static class AlterTableContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(GSQLParser.Id); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public TerminalNode Id(int i) {
			return getToken(GSQLParser.Id, i);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitAlterTable(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alterTable);
		try {
			int _alt;
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(T__16);
				setState(249); match(T__20);
				setState(250); match(Id);
				setState(251); match(T__25);
				setState(252); match(T__36);
				setState(253); match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); match(T__16);
				setState(255); match(T__20);
				setState(256); match(Id);
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257); action();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
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

	public static class ActionContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_action);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(T__15);
				setState(266); match(T__19);
				setState(267); match(Id);
				setState(268); type();
				setState(269); match(T__31);
				setState(270); constraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); match(T__15);
				setState(273); match(T__31);
				setState(274); constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); match(T__7);
				setState(276); match(T__19);
				setState(277); match(Id);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); match(T__7);
				setState(279); match(T__31);
				setState(280); match(Id);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitDropTable(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(T__7);
			setState(284); match(T__20);
			setState(285); match(Id);
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

	public static class ShowTablesContext extends ParserRuleContext {
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitShowTables(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(T__13);
			setState(288); match(T__30);
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

	public static class ShowColumnsContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GSQLParser.Id, 0); }
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitShowColumns(this);
		}
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_showColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(T__13);
			setState(291); match(T__24);
			setState(292); match(T__4);
			setState(293); match(Id);
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

	public static class LiteralContext extends ParserRuleContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); int_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); char_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297); float_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(GSQLParser.Num, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(Num);
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

	public static class Float_literalContext extends ParserRuleContext {
		public List<TerminalNode> Num() { return getTokens(GSQLParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(GSQLParser.Num, i);
		}
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitFloat_literal(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_float_literal);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(Num);
				setState(303); match(T__21);
				setState(304); match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(Num);
				setState(306); match(T__3);
				setState(307); match(Num);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(GSQLParser.Char, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSQLListener ) ((GSQLListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(Char);
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
		case 10: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 12: return eqExpression_sempred((EqExpressionContext)_localctx, predIndex);
		case 13: return relExpression_sempred((RelExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relExpression_sempred(RelExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExpression_sempred(EqExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\5\2@\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t\3"+
		"\t\5\tu\n\t\7\tw\n\t\f\t\16\tz\13\t\5\t|\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ba"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e7\n\17\f\17\16\17\u00ea\13\17"+
		"\3\20\5\20\u00ed\n\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u0105\n\25\f\25\16\25\u0108\13\25\5\25\u010a\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011c"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u012d\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0137\n\34\3\35\3\35\3\35\2\6\26\30\32\34\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2\25\26\6\2\7\7\13\13\37\37"+
		"%%\u0141\2?\3\2\2\2\4A\3\2\2\2\6F\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\f]\3\2"+
		"\2\2\16e\3\2\2\2\20g\3\2\2\2\22\u00ac\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb"+
		"\3\2\2\2\30\u00c7\3\2\2\2\32\u00d3\3\2\2\2\34\u00df\3\2\2\2\36\u00f0\3"+
		"\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2\2&\u00f8\3\2\2\2(\u0109"+
		"\3\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u0121\3\2\2\2\60\u0124\3\2\2\2"+
		"\62\u012c\3\2\2\2\64\u012e\3\2\2\2\66\u0136\3\2\2\28\u0138\3\2\2\2:@\5"+
		"\4\3\2;@\5\6\4\2<@\5\b\5\2=@\5\n\6\2>@\5\f\7\2?:\3\2\2\2?;\3\2\2\2?<\3"+
		"\2\2\2?=\3\2\2\2?>\3\2\2\2@\3\3\2\2\2AB\7\34\2\2BC\7!\2\2CD\7+\2\2DE\7"+
		"\31\2\2E\5\3\2\2\2FG\7\27\2\2GH\7!\2\2HI\7+\2\2IJ\7\16\2\2JK\7\3\2\2K"+
		"L\7+\2\2LM\7\31\2\2M\7\3\2\2\2NO\7 \2\2OP\7!\2\2PQ\7+\2\2QR\7\31\2\2R"+
		"\t\3\2\2\2ST\7\"\2\2TU\7!\2\2UV\7+\2\2VZ\5\16\b\2WY\5\16\b\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\7\32\2\2^_\7"+
		"\35\2\2_\r\3\2\2\2`f\5\20\t\2af\5(\25\2bf\5,\27\2cf\5.\30\2df\5\60\31"+
		"\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\7\34"+
		"\2\2hi\7\23\2\2ij\7+\2\2j{\7\6\2\2kl\7+\2\2ln\5\24\13\2mo\5\22\n\2nm\3"+
		"\2\2\2no\3\2\2\2ox\3\2\2\2pq\7\4\2\2qr\7+\2\2rt\5\24\13\2su\5\22\n\2t"+
		"s\3\2\2\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2{k\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\21\2\2~\177\7\31"+
		"\2\2\177\21\3\2\2\2\u0080\u0081\7+\2\2\u0081\u0082\7\r\2\2\u0082\u0083"+
		"\7\33\2\2\u0083\u0084\7\6\2\2\u0084\u0089\7+\2\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0088\7+\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u00ad\7\21\2\2\u008d\u008e\7+\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7\33"+
		"\2\2\u0090\u0091\7\6\2\2\u0091\u0096\7+\2\2\u0092\u0093\7\4\2\2\u0093"+
		"\u0095\7+\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\21\2\2\u009a\u009b\7\36\2\2\u009b\u009c\7+\2\2\u009c\u009d\7"+
		"\6\2\2\u009d\u00a2\7+\2\2\u009e\u009f\7\4\2\2\u009f\u00a1\7+\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00ad\7\21\2\2\u00a6"+
		"\u00a7\7+\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\5\26"+
		"\f\2\u00aa\u00ab\7\21\2\2\u00ab\u00ad\3\2\2\2\u00ac\u0080\3\2\2\2\u00ac"+
		"\u008d\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00ba\7(\2\2"+
		"\u00af\u00ba\7*\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3"+
		"\7,\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00ba\7,\2\2\u00b5\u00b6\7)\2\2\u00b6"+
		"\u00b7\7\6\2\2\u00b7\u00b8\7,\2\2\u00b8\u00ba\7\21\2\2\u00b9\u00ae\3\2"+
		"\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00bc\b\f\1\2\u00bc\u00bd\5\30\r\2\u00bd\u00c4\3\2\2"+
		"\2\u00be\u00bf\f\3\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\5\30\r\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\b\r\1\2\u00c8\u00c9\5\32\16\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\f\3\2\2"+
		"\u00cb\u00cc\5&\24\2\u00cc\u00cd\5\32\16\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\31\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\16\1\2\u00d4\u00d5\5\34"+
		"\17\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\f\3\2\2\u00d7\u00d8\5 \21\2\u00d8"+
		"\u00d9\5\34\17\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\33\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\b\17\1\2\u00e0\u00e1\5\36\20\2\u00e1\u00e8"+
		"\3\2\2\2\u00e2\u00e3\f\3\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\5\36\20"+
		"\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ed\7&\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f1\7+\2\2\u00ef\u00f1\5\62\32\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f3\t\2\2\2\u00f3!\3\2\2\2\u00f4"+
		"\u00f5\t\3\2\2\u00f5#\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7%\3\2\2\2\u00f8"+
		"\u00f9\7\20\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7\23"+
		"\2\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\7\3\2\2\u00ff"+
		"\u010a\7+\2\2\u0100\u0101\7\27\2\2\u0101\u0102\7\23\2\2\u0102\u0106\7"+
		"+\2\2\u0103\u0105\5*\26\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u00fa\3\2\2\2\u0109\u0100\3\2\2\2\u010a)\3\2\2\2\u010b\u010c"+
		"\7\30\2\2\u010c\u010d\7\24\2\2\u010d\u010e\7+\2\2\u010e\u010f\5\24\13"+
		"\2\u010f\u0110\7\b\2\2\u0110\u0111\5\22\n\2\u0111\u011c\3\2\2\2\u0112"+
		"\u0113\7\30\2\2\u0113\u0114\7\b\2\2\u0114\u011c\5\22\n\2\u0115\u0116\7"+
		" \2\2\u0116\u0117\7\24\2\2\u0117\u011c\7+\2\2\u0118\u0119\7 \2\2\u0119"+
		"\u011a\7\b\2\2\u011a\u011c\7+\2\2\u011b\u010b\3\2\2\2\u011b\u0112\3\2"+
		"\2\2\u011b\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c+\3\2\2\2\u011d\u011e"+
		"\7 \2\2\u011e\u011f\7\23\2\2\u011f\u0120\7+\2\2\u0120-\3\2\2\2\u0121\u0122"+
		"\7\32\2\2\u0122\u0123\7\t\2\2\u0123/\3\2\2\2\u0124\u0125\7\32\2\2\u0125"+
		"\u0126\7\17\2\2\u0126\u0127\7#\2\2\u0127\u0128\7+\2\2\u0128\61\3\2\2\2"+
		"\u0129\u012d\5\64\33\2\u012a\u012d\58\35\2\u012b\u012d\5\66\34\2\u012c"+
		"\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\63\3\2\2"+
		"\2\u012e\u012f\7,\2\2\u012f\65\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132"+
		"\7\22\2\2\u0132\u0137\7,\2\2\u0133\u0134\7,\2\2\u0134\u0135\7$\2\2\u0135"+
		"\u0137\7,\2\2\u0136\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137\67\3\2\2\2"+
		"\u0138\u0139\7-\2\2\u01399\3\2\2\2\31?Zentx{\u0089\u0096\u00a2\u00ac\u00b9"+
		"\u00c4\u00d0\u00dc\u00e8\u00ec\u00f0\u0106\u0109\u011b\u012c\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}