// $ANTLR 3.4 TestSuite.g 2013-06-12 12:17:52
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */
 
package org.tzi.use.parser.testsuite;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.soil.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.parser.ocl.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestSuiteParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'!'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assert'", "'assign'", "'begin'", "'beginVariation'", "'between'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endVariation'", "'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'invalid'", "'invs'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'openter'", "'opexit'", "'or'", "'post'", "'pre'", "'set'", "'setup'", "'testcase'", "'testsuite'", "'then'", "'true'", "'valid'", "'while'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int COLON=7;
    public static final int COLON_COLON=8;
    public static final int COLON_EQUAL=9;
    public static final int COMMA=10;
    public static final int DOT=11;
    public static final int DOTDOT=12;
    public static final int EQUAL=13;
    public static final int ESC=14;
    public static final int GREATER=15;
    public static final int GREATER_EQUAL=16;
    public static final int HASH=17;
    public static final int HEX_DIGIT=18;
    public static final int IDENT=19;
    public static final int INT=20;
    public static final int LBRACE=21;
    public static final int LBRACK=22;
    public static final int LESS=23;
    public static final int LESS_EQUAL=24;
    public static final int LPAREN=25;
    public static final int MINUS=26;
    public static final int ML_COMMENT=27;
    public static final int NEWLINE=28;
    public static final int NON_OCL_STRING=29;
    public static final int NOT_EQUAL=30;
    public static final int PLUS=31;
    public static final int RANGE_OR_INT=32;
    public static final int RBRACE=33;
    public static final int RBRACK=34;
    public static final int REAL=35;
    public static final int RPAREN=36;
    public static final int SEMI=37;
    public static final int SLASH=38;
    public static final int SL_COMMENT=39;
    public static final int STAR=40;
    public static final int STRING=41;
    public static final int VOCAB=42;
    public static final int WS=43;

    // delegates
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
    }

    // delegators


    public TestSuiteParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestSuiteParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TestSuiteParser.tokenNames; }
    public String getGrammarFileName() { return "TestSuite.g"; }



    // $ANTLR start "testSuite"
    // TestSuite.g:90:1: testSuite returns [ASTTestSuite suite] : 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF ;
    public final ASTTestSuite testSuite() throws RecognitionException {
        ASTTestSuite suite = null;


        Token suiteName=null;
        String modelFile =null;

        ASTStatement c =null;

        List tests =null;



          List setupStatements = new ArrayList();

        try {
            // TestSuite.g:94:3: ( 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF )
            // TestSuite.g:95:3: 'testsuite' suiteName= IDENT 'for' 'model' modelFile= filename ( 'setup' ( '!' c= shellCommandOnly )* 'end' )? tests= testCases EOF
            {
            match(input,100,FOLLOW_100_in_testSuite61); if (state.failed) return suite;

            suiteName=(Token)match(input,IDENT,FOLLOW_IDENT_in_testSuite71); if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite = new ASTTestSuite(suiteName); }

            match(input,71,FOLLOW_71_in_testSuite82); if (state.failed) return suite;

            match(input,83,FOLLOW_83_in_testSuite84); if (state.failed) return suite;

            pushFollow(FOLLOW_filename_in_testSuite93);
            modelFile=filename();

            state._fsp--;
            if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite.setModelFile(suiteName); }

            // TestSuite.g:101:3: ( 'setup' ( '!' c= shellCommandOnly )* 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==98) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // TestSuite.g:101:4: 'setup' ( '!' c= shellCommandOnly )* 'end'
                    {
                    match(input,98,FOLLOW_98_in_testSuite105); if (state.failed) return suite;

                    // TestSuite.g:102:4: ( '!' c= shellCommandOnly )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==44) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // TestSuite.g:102:5: '!' c= shellCommandOnly
                    	    {
                    	    match(input,44,FOLLOW_44_in_testSuite112); if (state.failed) return suite;

                    	    pushFollow(FOLLOW_shellCommandOnly_in_testSuite118);
                    	    c=shellCommandOnly();

                    	    state._fsp--;
                    	    if (state.failed) return suite;

                    	    if ( state.backtracking==0 ) { setupStatements.add(c); }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,66,FOLLOW_66_in_testSuite124); if (state.failed) return suite;

                    if ( state.backtracking==0 ) { suite.setSetupStatements(setupStatements); }

                    }
                    break;

            }


            pushFollow(FOLLOW_testCases_in_testSuite145);
            tests=testCases();

            state._fsp--;
            if (state.failed) return suite;

            if ( state.backtracking==0 ) { suite.setTestCases(tests); }

            match(input,EOF,FOLLOW_EOF_in_testSuite154); if (state.failed) return suite;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return suite;
    }
    // $ANTLR end "testSuite"



    // $ANTLR start "filename"
    // TestSuite.g:110:1: filename returns [String filename] : name= IDENT '.' suffix= IDENT ;
    public final String filename() throws RecognitionException {
        String filename = null;


        Token name=null;
        Token suffix=null;

        try {
            // TestSuite.g:111:4: (name= IDENT '.' suffix= IDENT )
            // TestSuite.g:112:4: name= IDENT '.' suffix= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename172); if (state.failed) return filename;

            match(input,DOT,FOLLOW_DOT_in_filename174); if (state.failed) return filename;

            suffix=(Token)match(input,IDENT,FOLLOW_IDENT_in_filename178); if (state.failed) return filename;

            if ( state.backtracking==0 ) {filename = (name!=null?name.getText():null) + "." + (suffix!=null?suffix.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return filename;
    }
    // $ANTLR end "filename"



    // $ANTLR start "testCases"
    // TestSuite.g:115:1: testCases returns [List testCases] : (test= testCase )+ ;
    public final List testCases() throws RecognitionException {
        List testCases = null;


        ASTTestCase test =null;


         testCases = new ArrayList(); 
        try {
            // TestSuite.g:117:3: ( (test= testCase )+ )
            // TestSuite.g:118:3: (test= testCase )+
            {
            // TestSuite.g:118:3: (test= testCase )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==99) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // TestSuite.g:118:4: test= testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_testCases205);
            	    test=testCase();

            	    state._fsp--;
            	    if (state.failed) return testCases;

            	    if ( state.backtracking==0 ) { testCases.add(test); }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return testCases;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return testCases;
    }
    // $ANTLR end "testCases"



    // $ANTLR start "testCase"
    // TestSuite.g:121:1: testCase returns [ASTTestCase n] : 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' ;
    public final ASTTestCase testCase() throws RecognitionException {
        ASTTestCase n = null;


        Token name=null;
        Token b=null;
        Token e=null;
        ASTStatement c =null;

        ASTAssert a =null;


        try {
            // TestSuite.g:122:3: ( 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end' )
            // TestSuite.g:123:3: 'testcase' name= IDENT ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )* 'end'
            {
            match(input,99,FOLLOW_99_in_testCase224); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_testCase228); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTestCase(name); }

            // TestSuite.g:124:3: ( '!' c= shellCommandOnly |a= assertStatement |b= 'beginVariation' |e= 'endVariation' )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt4=1;
                    }
                    break;
                case 54:
                    {
                    alt4=2;
                    }
                    break;
                case 57:
                    {
                    alt4=3;
                    }
                    break;
                case 67:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // TestSuite.g:125:7: '!' c= shellCommandOnly
            	    {
            	    match(input,44,FOLLOW_44_in_testCase242); if (state.failed) return n;

            	    pushFollow(FOLLOW_shellCommandOnly_in_testCase248);
            	    c=shellCommandOnly();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(c); }

            	    }
            	    break;
            	case 2 :
            	    // TestSuite.g:127:7: a= assertStatement
            	    {
            	    pushFollow(FOLLOW_assertStatement_in_testCase267);
            	    a=assertStatement();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(a); }

            	    }
            	    break;
            	case 3 :
            	    // TestSuite.g:129:7: b= 'beginVariation'
            	    {
            	    b=(Token)match(input,57,FOLLOW_57_in_testCase285); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(new ASTVariationStart(b)); }

            	    }
            	    break;
            	case 4 :
            	    // TestSuite.g:131:7: e= 'endVariation'
            	    {
            	    e=(Token)match(input,67,FOLLOW_67_in_testCase303); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStatement(new ASTVariationEnd(e)); }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,66,FOLLOW_66_in_testCase315); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "testCase"



    // $ANTLR start "assertStatement"
    // TestSuite.g:136:1: assertStatement returns [ASTAssert n] : s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? ;
    public final ASTAssert assertStatement() throws RecognitionException {
        ASTAssert n = null;


        Token s=null;
        Token classname=null;
        Token invname=null;
        Token msg=null;
        TestSuiteParser.expression_return exp =null;

        ASTAssertPre pre =null;

        ASTAssertPost post =null;


         boolean valid = true; 
        try {
            // TestSuite.g:138:3: (s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )? )
            // TestSuite.g:139:3: s= 'assert' ( 'valid' | 'invalid' ) (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] ) ( COMMA msg= STRING )?
            {
            s=(Token)match(input,54,FOLLOW_54_in_assertStatement336); if (state.failed) return n;

            // TestSuite.g:140:3: ( 'valid' | 'invalid' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==103) ) {
                alt5=1;
            }
            else if ( (LA5_0==79) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // TestSuite.g:140:4: 'valid'
                    {
                    match(input,103,FOLLOW_103_in_assertStatement341); if (state.failed) return n;

                    if ( state.backtracking==0 ) { valid = true; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:140:32: 'invalid'
                    {
                    match(input,79,FOLLOW_79_in_assertStatement347); if (state.failed) return n;

                    if ( state.backtracking==0 ) {valid = false; }

                    }
                    break;

            }


            // TestSuite.g:141:3: (exp= expression | 'invs' | 'invs' classname= IDENT | 'inv' classname= IDENT COLON_COLON invname= IDENT |pre= assertionStatementPre[s=$s, valid=valid] |post= assertionStatementPost[s=$s, valid=valid] )
            int alt6=6;
            switch ( input.LA(1) ) {
            case AT:
            case HASH:
            case IDENT:
            case INT:
            case LPAREN:
            case MINUS:
            case PLUS:
            case REAL:
            case STRING:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 70:
            case 73:
            case 81:
            case 82:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 102:
                {
                alt6=1;
                }
                break;
            case 80:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==IDENT) ) {
                    alt6=3;
                }
                else if ( (LA6_2==COMMA||LA6_2==44||LA6_2==54||LA6_2==57||(LA6_2 >= 66 && LA6_2 <= 67)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 78:
                {
                alt6=4;
                }
                break;
            case 96:
                {
                alt6=5;
                }
                break;
            case 95:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // TestSuite.g:142:7: exp= expression
                    {
                    pushFollow(FOLLOW_expression_in_assertStatement366);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertOclExpression((exp!=null?exp.n:null).getStartToken(), input.LT(-1), valid, (exp!=null?exp.n:null)); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:144:7: 'invs'
                    {
                    match(input,80,FOLLOW_80_in_assertStatement382); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertGlobalInvariants(s, input.LT(-1), valid); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:146:7: 'invs' classname= IDENT
                    {
                    match(input,80,FOLLOW_80_in_assertStatement398); if (state.failed) return n;

                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement402); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertClassInvariants(s, input.LT(-1), valid, classname); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:148:7: 'inv' classname= IDENT COLON_COLON invname= IDENT
                    {
                    match(input,78,FOLLOW_78_in_assertStatement418); if (state.failed) return n;

                    classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement422); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertStatement424); if (state.failed) return n;

                    invname=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertStatement428); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAssertSingleInvariant(s, input.LT(-1), valid, classname, invname); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:150:7: pre= assertionStatementPre[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPre_in_assertStatement448);
                    pre=assertionStatementPre(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = pre; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:152:7: post= assertionStatementPost[s=$s, valid=valid]
                    {
                    pushFollow(FOLLOW_assertionStatementPost_in_assertStatement469);
                    post=assertionStatementPost(s=s, valid=valid);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = post; }

                    }
                    break;

            }


            // TestSuite.g:154:3: ( COMMA msg= STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COMMA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // TestSuite.g:155:5: COMMA msg= STRING
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_assertStatement486); if (state.failed) return n;

                    msg=(Token)match(input,STRING,FOLLOW_STRING_in_assertStatement490); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setMessage(msg); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertStatement"



    // $ANTLR start "assertionStatementPre"
    // TestSuite.g:159:1: assertionStatementPre[Token s, boolean valid] returns [ASTAssertPre n] : 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? ;
    public final ASTAssertPre assertionStatementPre(Token s, boolean valid) throws RecognitionException {
        ASTAssertPre n = null;


        Token opName=null;
        Token name=null;
        TestSuiteParser.expression_return objExp =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:160:3: ( 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )? )
            // TestSuite.g:161:3: 'pre' objExp= expression opName= IDENT LPAREN (e= expression ( COMMA e= expression )* )? RPAREN ( COLON_COLON name= IDENT )?
            {
            match(input,96,FOLLOW_96_in_assertionStatementPre513); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_assertionStatementPre517);
            objExp=expression();

            state._fsp--;
            if (state.failed) return n;

            opName=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre521); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssertPre(s, null, valid, (objExp!=null?objExp.n:null), opName); }

            match(input,LPAREN,FOLLOW_LPAREN_in_assertionStatementPre527); if (state.failed) return n;

            // TestSuite.g:163:5: (e= expression ( COMMA e= expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AT||LA9_0==HASH||(LA9_0 >= IDENT && LA9_0 <= INT)||(LA9_0 >= LPAREN && LA9_0 <= MINUS)||LA9_0==PLUS||LA9_0==REAL||LA9_0==STRING||(LA9_0 >= 45 && LA9_0 <= 51)||LA9_0==70||LA9_0==73||(LA9_0 >= 81 && LA9_0 <= 82)||(LA9_0 >= 85 && LA9_0 <= 91)||LA9_0==102) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TestSuite.g:163:7: e= expression ( COMMA e= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_assertionStatementPre538);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addArg((e!=null?e.n:null)); }

                    // TestSuite.g:163:41: ( COMMA e= expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // TestSuite.g:163:43: COMMA e= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_assertionStatementPre544); if (state.failed) return n;

                    	    pushFollow(FOLLOW_expression_in_assertionStatementPre548);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addArg((e!=null?e.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_assertionStatementPre561); if (state.failed) return n;

            // TestSuite.g:164:10: ( COLON_COLON name= IDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLON_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // TestSuite.g:164:11: COLON_COLON name= IDENT
                    {
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_assertionStatementPre564); if (state.failed) return n;

                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPre568); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setConditionName(name); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertionStatementPre"



    // $ANTLR start "assertionStatementPost"
    // TestSuite.g:168:1: assertionStatementPost[Token s, boolean valid] returns [ASTAssertPost n] : 'post' (name= IDENT )? ;
    public final ASTAssertPost assertionStatementPost(Token s, boolean valid) throws RecognitionException {
        ASTAssertPost n = null;


        Token name=null;

        try {
            // TestSuite.g:169:3: ( 'post' (name= IDENT )? )
            // TestSuite.g:170:3: 'post' (name= IDENT )?
            {
            match(input,95,FOLLOW_95_in_assertionStatementPost593); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssertPost(s, null, valid); }

            // TestSuite.g:171:3: (name= IDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // TestSuite.g:171:4: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_assertionStatementPost602); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setConditionName(name); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n.setEnd(input.LT(-1)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "assertionStatementPost"



    // $ANTLR start "expressionOnly"
    // TestSuite.g:201:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        TestSuiteParser.expression_return nExp =null;


        try {
            // TestSuite.g:202:5: (nExp= expression EOF )
            // TestSuite.g:203:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly637);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly639); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = (nExp!=null?nExp.n:null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "expressionOnly"


    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };


    // $ANTLR start "expression"
    // TestSuite.g:210:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final TestSuiteParser.expression_return expression() throws RecognitionException {
        TestSuiteParser.expression_return retval = new TestSuiteParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // TestSuite.g:216:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // TestSuite.g:217:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // TestSuite.g:218:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==82) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // TestSuite.g:219:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,82,FOLLOW_82_in_expression687); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression698); if (state.failed) return retval;

            	    // TestSuite.g:220:18: ( COLON t= type )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==COLON) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // TestSuite.g:220:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression702); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression706);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression711); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression715);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	             if ( firstLet == null ) 
            	                 firstLet = nextLet;
            	             if ( prevLet != null ) 
            	                 prevLet.setInExpr(nextLet);
            	             prevLet = nextLet;
            	          }

            	    // TestSuite.g:230:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==COMMA) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // TestSuite.g:231:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression753); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression765); if (state.failed) return retval;

            	    	    // TestSuite.g:232:20: ( COLON t= type )?
            	    	    int alt13=2;
            	    	    int LA13_0 = input.LA(1);

            	    	    if ( (LA13_0==COLON) ) {
            	    	        alt13=1;
            	    	    }
            	    	    switch (alt13) {
            	    	        case 1 :
            	    	            // TestSuite.g:232:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression769); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression773);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression778); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression782);
            	    	    e1=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;

            	    	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	    	               if ( firstLet == null ) 
            	    	                   firstLet = nextLet;
            	    	               if ( prevLet != null ) 
            	    	                   prevLet.setInExpr(nextLet);
            	    	               prevLet = nextLet;
            	    	            }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    match(input,75,FOLLOW_75_in_expression823); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression839);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
                	 retval.n = nCndImplies;
                     retval.n.setStartToken(tok);
                  }
                  
                  if ( prevLet != null ) { 
                     prevLet.setInExpr(retval.n);
                     retval.n = firstLet;
                     retval.n.setStartToken(tok);
                  }
                }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "paramList"
    // TestSuite.g:264:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // TestSuite.g:266:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // TestSuite.g:267:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList872); if (state.failed) return paramList;

            // TestSuite.g:268:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // TestSuite.g:269:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList889);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // TestSuite.g:270:7: ( COMMA v= variableDeclaration )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // TestSuite.g:270:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList901); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList905);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList925); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return paramList;
    }
    // $ANTLR end "paramList"



    // $ANTLR start "idList"
    // TestSuite.g:278:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // TestSuite.g:280:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // TestSuite.g:281:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList954); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // TestSuite.g:282:5: ( COMMA idn= IDENT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TestSuite.g:282:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList964); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList968); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // TestSuite.g:290:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // TestSuite.g:291:5: (name= IDENT COLON t= type )
            // TestSuite.g:292:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration999); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1001); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1005);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableDeclaration(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "conditionalImpliesExpression"
    // TestSuite.g:300:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:301:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // TestSuite.g:302:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1041);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // TestSuite.g:303:5: (op= 'implies' n1= conditionalOrExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==74) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // TestSuite.g:303:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,74,FOLLOW_74_in_conditionalImpliesExpression1054); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1058);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // TestSuite.g:312:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:313:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // TestSuite.g:314:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1103);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // TestSuite.g:315:5: (op= 'or' n1= conditionalXOrExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==94) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TestSuite.g:315:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,94,FOLLOW_94_in_conditionalOrExpression1116); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1120);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // TestSuite.g:324:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:325:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // TestSuite.g:326:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1164);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // TestSuite.g:327:5: (op= 'xor' n1= conditionalAndExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==105) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // TestSuite.g:327:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,105,FOLLOW_105_in_conditionalXOrExpression1177); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1181);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // TestSuite.g:336:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // TestSuite.g:337:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // TestSuite.g:338:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1225);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // TestSuite.g:339:5: (op= 'and' n1= equalityExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // TestSuite.g:339:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,53,FOLLOW_53_in_conditionalAndExpression1238); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1242);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // TestSuite.g:348:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:350:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // TestSuite.g:351:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1290);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // TestSuite.g:352:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EQUAL||LA23_0==NOT_EQUAL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // TestSuite.g:352:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1319);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // TestSuite.g:362:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:364:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // TestSuite.g:365:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1368);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // TestSuite.g:366:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= GREATER && LA24_0 <= GREATER_EQUAL)||(LA24_0 >= LESS && LA24_0 <= LESS_EQUAL)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TestSuite.g:366:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1404);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // TestSuite.g:376:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:378:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // TestSuite.g:379:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1454);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // TestSuite.g:380:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // TestSuite.g:380:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1482);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // TestSuite.g:391:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // TestSuite.g:393:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // TestSuite.g:394:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1532);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // TestSuite.g:395:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==SLASH||LA26_0==STAR||LA26_0==63) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // TestSuite.g:395:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==63 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1564);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // TestSuite.g:407:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // TestSuite.g:409:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==MINUS||LA27_0==PLUS||LA27_0==85) ) {
                alt27=1;
            }
            else if ( (LA27_0==AT||LA27_0==HASH||(LA27_0 >= IDENT && LA27_0 <= INT)||LA27_0==LPAREN||LA27_0==REAL||LA27_0==STRING||(LA27_0 >= 45 && LA27_0 <= 51)||LA27_0==70||LA27_0==73||LA27_0==81||(LA27_0 >= 86 && LA27_0 <= 91)||LA27_0==102) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // TestSuite.g:410:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // TestSuite.g:410:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // TestSuite.g:410:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==85 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1650);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // TestSuite.g:414:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1670);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPosExp; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "postfixExpression"
    // TestSuite.g:422:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // TestSuite.g:424:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // TestSuite.g:425:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1703);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // TestSuite.g:426:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DOT) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==IDENT) ) {
                        int LA29_4 = input.LA(3);

                        if ( (LA29_4==EOF||(LA29_4 >= ARROW && LA29_4 <= BAR)||(LA29_4 >= COMMA && LA29_4 <= EQUAL)||(LA29_4 >= GREATER && LA29_4 <= GREATER_EQUAL)||LA29_4==IDENT||(LA29_4 >= LBRACE && LA29_4 <= MINUS)||(LA29_4 >= NOT_EQUAL && LA29_4 <= PLUS)||(LA29_4 >= RBRACE && LA29_4 <= RBRACK)||(LA29_4 >= RPAREN && LA29_4 <= SLASH)||LA29_4==STAR||LA29_4==44||(LA29_4 >= 53 && LA29_4 <= 55)||LA29_4==57||LA29_4==59||(LA29_4 >= 61 && LA29_4 <= 69)||(LA29_4 >= 74 && LA29_4 <= 76)||LA29_4==82||LA29_4==94||LA29_4==97||LA29_4==101||LA29_4==105) ) {
                            alt29=1;
                        }


                    }
                    else if ( (LA29_2==81||LA29_2==87||(LA29_2 >= 89 && LA29_2 <= 90)) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==ARROW) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // TestSuite.g:427:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // TestSuite.g:427:6: ( ARROW | DOT )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==ARROW) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==DOT) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // TestSuite.g:427:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1721); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // TestSuite.g:427:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1727); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1738);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // TestSuite.g:443:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        TestSuiteParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // TestSuite.g:444:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt32=6;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STRING:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 70:
            case 86:
            case 88:
            case 91:
            case 102:
                {
                alt32=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt32=1;
                    }
                    break;
                case EOF:
                case ARROW:
                case AT:
                case BAR:
                case COMMA:
                case DOTDOT:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case IDENT:
                case LBRACE:
                case LBRACK:
                case LESS:
                case LESS_EQUAL:
                case LPAREN:
                case MINUS:
                case NOT_EQUAL:
                case PLUS:
                case RBRACE:
                case RBRACK:
                case RPAREN:
                case SEMI:
                case SLASH:
                case STAR:
                case 44:
                case 53:
                case 54:
                case 55:
                case 57:
                case 59:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 74:
                case 75:
                case 76:
                case 82:
                case 94:
                case 97:
                case 101:
                case 105:
                    {
                    alt32=3;
                    }
                    break;
                case DOT:
                    {
                    int LA32_7 = input.LA(3);

                    if ( (LA32_7==52) ) {
                        alt32=6;
                    }
                    else if ( (LA32_7==IDENT||LA32_7==81||LA32_7==87||(LA32_7 >= 89 && LA32_7 <= 90)) ) {
                        alt32=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt32=2;
                }
                break;
            case 81:
            case 87:
            case 89:
            case 90:
                {
                alt32=3;
                }
                break;
            case LPAREN:
                {
                alt32=4;
                }
                break;
            case 73:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // TestSuite.g:445:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1778);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:446:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1792);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:447:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1804);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // TestSuite.g:448:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1815); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1819);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1821); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:449:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1833);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:450:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1845); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1847); if (state.failed) return n;

                    match(input,52,FOLLOW_52_in_primaryExpression1849); if (state.failed) return n;

                    // TestSuite.g:450:36: ( LPAREN RPAREN )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPAREN) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // TestSuite.g:450:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1853); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1855); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // TestSuite.g:452:7: ( AT 'pre' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==AT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // TestSuite.g:452:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1876); if (state.failed) return n;

                            match(input,96,FOLLOW_96_in_primaryExpression1878); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "objectReference"
    // TestSuite.g:456:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // TestSuite.g:457:3: ( AT objectName= IDENT )
            // TestSuite.g:458:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1905); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1913); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTObjectReferenceExpression(objectName); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objectReference"



    // $ANTLR start "propertyCall"
    // TestSuite.g:472:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        TestSuiteParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // TestSuite.g:473:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt33=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA33_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case 81:
                {
                alt33=2;
                }
                break;
            case 87:
            case 89:
            case 90:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // TestSuite.g:477:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1978);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:480:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1991);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:481:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2004);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:482:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2017);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "propertyCall"



    // $ANTLR start "queryExpression"
    // TestSuite.g:491:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        TestSuiteParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // TestSuite.g:492:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // TestSuite.g:493:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2052); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2059); if (state.failed) return n;

            // TestSuite.g:495:5: (decls= elemVarsDeclaration BAR )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENT) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1 >= BAR && LA34_1 <= COLON)||LA34_1==COMMA) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // TestSuite.g:495:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2070);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2074); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2085);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2091); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "queryExpression"



    // $ANTLR start "iterateExpression"
    // TestSuite.g:509:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        TestSuiteParser.expression_return nExp =null;


        try {
            // TestSuite.g:509:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // TestSuite.g:510:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,81,FOLLOW_81_in_iterateExpression2123); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2129); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2137);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2139); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2147);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2149); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2157);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2163); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterateExpression"


    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };


    // $ANTLR start "operationExpression"
    // TestSuite.g:531:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final TestSuiteParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        TestSuiteParser.operationExpression_return retval = new TestSuiteParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        TestSuiteParser.expression_return rolename =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:533:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // TestSuite.g:534:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2207); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // TestSuite.g:540:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LBRACK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // TestSuite.g:540:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2229); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2242);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // TestSuite.g:542:9: ( COMMA rolename= expression )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==COMMA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // TestSuite.g:542:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2255); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2259);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2271); if (state.failed) return retval;

                    // TestSuite.g:545:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LBRACK) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // TestSuite.g:545:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2288); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2303);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // TestSuite.g:547:11: ( COMMA rolename= expression )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==COMMA) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // TestSuite.g:547:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2318); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2322);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2336); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // TestSuite.g:552:5: ( AT 'pre' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==AT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // TestSuite.g:552:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2361); if (state.failed) return retval;

                    match(input,96,FOLLOW_96_in_operationExpression2363); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // TestSuite.g:554:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LPAREN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // TestSuite.g:555:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2388); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // TestSuite.g:556:7: (e= expression ( COMMA e= expression )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AT||LA41_0==HASH||(LA41_0 >= IDENT && LA41_0 <= INT)||(LA41_0 >= LPAREN && LA41_0 <= MINUS)||LA41_0==PLUS||LA41_0==REAL||LA41_0==STRING||(LA41_0 >= 45 && LA41_0 <= 51)||LA41_0==70||LA41_0==73||(LA41_0 >= 81 && LA41_0 <= 82)||(LA41_0 >= 85 && LA41_0 <= 91)||LA41_0==102) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // TestSuite.g:557:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2409);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // TestSuite.g:558:7: ( COMMA e= expression )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // TestSuite.g:558:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2421); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2425);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2445); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.n.setStartToken(((Token)retval.start)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operationExpression"



    // $ANTLR start "typeExpression"
    // TestSuite.g:571:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // TestSuite.g:574:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // TestSuite.g:575:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==87||(input.LA(1) >= 89 && input.LA(1) <= 90) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2510); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2514);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2516); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTypeArgExpression(opToken, source, t, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeExpression"



    // $ANTLR start "elemVarsDeclaration"
    // TestSuite.g:586:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // TestSuite.g:587:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // TestSuite.g:588:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2554); if (state.failed) return n;

            // TestSuite.g:589:17: ( COLON t= type )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COLON) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // TestSuite.g:589:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2557); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2561);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // TestSuite.g:590:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // TestSuite.g:590:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2571); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2577); if (state.failed) return n;

            	    // TestSuite.g:590:24: ( COLON tN= type )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==COLON) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // TestSuite.g:590:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2580); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2586);
            	            tN=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {n.addDeclaration(varN, tN); }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // TestSuite.g:598:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:599:5: (name= IDENT COLON t= type EQUAL e= expression )
            // TestSuite.g:600:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2614); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2616); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2620);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2622); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2626);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableInitialization"



    // $ANTLR start "ifExpression"
    // TestSuite.g:609:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        TestSuiteParser.expression_return cond =null;

        TestSuiteParser.expression_return t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:610:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // TestSuite.g:611:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,73,FOLLOW_73_in_ifExpression2658); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2662);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,101,FOLLOW_101_in_ifExpression2664); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2668);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,65,FOLLOW_65_in_ifExpression2670); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2674);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,68,FOLLOW_68_in_ifExpression2676); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "ifExpression"



    // $ANTLR start "literal"
    // TestSuite.g:630:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;


        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        ASTCollectionLiteral nColIt =null;

        ASTEmptyCollectionLiteral nEColIt =null;

        ASTUndefinedLiteral nUndLit =null;

        ASTTupleLiteral nTupleLit =null;


        try {
            // TestSuite.g:631:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt46=11;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt46=1;
                }
                break;
            case 70:
                {
                alt46=2;
                }
                break;
            case INT:
                {
                alt46=3;
                }
                break;
            case REAL:
                {
                alt46=4;
                }
                break;
            case STRING:
                {
                alt46=5;
                }
                break;
            case HASH:
                {
                alt46=6;
                }
                break;
            case IDENT:
                {
                alt46=7;
                }
                break;
            case 45:
            case 47:
            case 48:
            case 49:
                {
                int LA46_8 = input.LA(2);

                if ( (LA46_8==LPAREN) ) {
                    alt46=9;
                }
                else if ( (LA46_8==LBRACE) ) {
                    alt46=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 8, input);

                    throw nvae;

                }
                }
                break;
            case 46:
            case 88:
                {
                alt46=9;
                }
                break;
            case 51:
            case 86:
            case 91:
                {
                alt46=10;
                }
                break;
            case 50:
                {
                alt46=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // TestSuite.g:632:7: t= 'true'
                    {
                    t=(Token)match(input,102,FOLLOW_102_in_literal2715); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:633:7: f= 'false'
                    {
                    f=(Token)match(input,70,FOLLOW_70_in_literal2729); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:634:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2742); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:635:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2757); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // TestSuite.g:636:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2771); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // TestSuite.g:637:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2781); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2785); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // TestSuite.g:638:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2797); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2799); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2803); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // TestSuite.g:639:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2815);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:640:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2827);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // TestSuite.g:641:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2839);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // TestSuite.g:642:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2851);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "literal"



    // $ANTLR start "collectionLiteral"
    // TestSuite.g:650:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // TestSuite.g:652:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // TestSuite.g:653:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||(input.LA(1) >= 47 && input.LA(1) <= 49) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { n = new ASTCollectionLiteral(op); }

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2918); if (state.failed) return n;

            // TestSuite.g:657:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==AT||LA48_0==HASH||(LA48_0 >= IDENT && LA48_0 <= INT)||(LA48_0 >= LPAREN && LA48_0 <= MINUS)||LA48_0==PLUS||LA48_0==REAL||LA48_0==STRING||(LA48_0 >= 45 && LA48_0 <= 51)||LA48_0==70||LA48_0==73||(LA48_0 >= 81 && LA48_0 <= 82)||(LA48_0 >= 85 && LA48_0 <= 91)||LA48_0==102) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // TestSuite.g:658:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2935);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // TestSuite.g:659:7: ( COMMA ci= collectionItem )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // TestSuite.g:659:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2948); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2952);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2971); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"



    // $ANTLR start "collectionItem"
    // TestSuite.g:668:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        TestSuiteParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // TestSuite.g:670:5: (e= expression ( DOTDOT e= expression )? )
            // TestSuite.g:671:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3000);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // TestSuite.g:672:5: ( DOTDOT e= expression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DOTDOT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // TestSuite.g:672:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3011); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3015);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setSecond((e!=null?e.n:null)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionItem"



    // $ANTLR start "emptyCollectionLiteral"
    // TestSuite.g:682:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // TestSuite.g:683:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            else if ( ((LA50_0 >= 45 && LA50_0 <= 49)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // TestSuite.g:684:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,88,FOLLOW_88_in_emptyCollectionLiteral3044); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3046); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3050);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3052); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:687:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3068);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3070); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3072); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"



    // $ANTLR start "undefinedLiteral"
    // TestSuite.g:698:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // TestSuite.g:699:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt51=1;
                }
                break;
            case 51:
                {
                alt51=2;
                }
                break;
            case 86:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==LPAREN) ) {
                    alt51=3;
                }
                else if ( (LA51_3==EOF||LA51_3==ARROW||LA51_3==BAR||(LA51_3 >= COMMA && LA51_3 <= EQUAL)||(LA51_3 >= GREATER && LA51_3 <= GREATER_EQUAL)||LA51_3==IDENT||LA51_3==LBRACE||(LA51_3 >= LESS && LA51_3 <= LESS_EQUAL)||LA51_3==MINUS||(LA51_3 >= NOT_EQUAL && LA51_3 <= PLUS)||(LA51_3 >= RBRACE && LA51_3 <= RBRACK)||(LA51_3 >= RPAREN && LA51_3 <= SLASH)||LA51_3==STAR||LA51_3==44||(LA51_3 >= 53 && LA51_3 <= 55)||LA51_3==57||LA51_3==59||(LA51_3 >= 61 && LA51_3 <= 69)||(LA51_3 >= 74 && LA51_3 <= 76)||LA51_3==82||LA51_3==94||LA51_3==97||LA51_3==101||LA51_3==105) ) {
                    alt51=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // TestSuite.g:700:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,91,FOLLOW_91_in_undefinedLiteral3102); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3104); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3108);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3110); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:703:5: 'Undefined'
                    {
                    match(input,51,FOLLOW_51_in_undefinedLiteral3124); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:706:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3138); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3140); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3144);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3146); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:709:5: 'null'
                    {
                    match(input,86,FOLLOW_86_in_undefinedLiteral3160); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"



    // $ANTLR start "tupleLiteral"
    // TestSuite.g:719:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // TestSuite.g:721:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // TestSuite.g:722:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,50,FOLLOW_50_in_tupleLiteral3199); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3205); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3213);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // TestSuite.g:725:5: ( COMMA ti= tupleItem )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // TestSuite.g:725:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3224); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3228);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3239); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleLiteral(tiList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"



    // $ANTLR start "tupleItem"
    // TestSuite.g:733:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:734:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // TestSuite.g:735:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3270); if (state.failed) return n;

            // TestSuite.g:736:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COLON) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred1_TestSuite()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA53_0==EQUAL) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // TestSuite.g:739:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3309); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3313);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3315); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3319);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:742:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_tupleItem3351);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?e.n:null)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleItem"



    // $ANTLR start "type"
    // TestSuite.g:753:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // TestSuite.g:755:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // TestSuite.g:756:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // TestSuite.g:757:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt54=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt54=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt54=2;
                }
                break;
            case 50:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // TestSuite.g:758:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3417);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:759:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3429);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:760:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3441);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTTuple; if (n != null) n.setStartToken(tok); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "type"



    // $ANTLR start "typeOnly"
    // TestSuite.g:765:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // TestSuite.g:766:5: (nT= type EOF )
            // TestSuite.g:767:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3473);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3475); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nT; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeOnly"



    // $ANTLR start "simpleType"
    // TestSuite.g:777:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // TestSuite.g:778:5: (name= IDENT )
            // TestSuite.g:779:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3503); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSimpleType(name); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "simpleType"



    // $ANTLR start "collectionType"
    // TestSuite.g:787:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // TestSuite.g:789:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // TestSuite.g:790:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 45 && input.LA(1) <= 49) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3568); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3572);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3574); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTCollectionType(op, elemType); if (n != null) n.setStartToken(op);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionType"



    // $ANTLR start "tupleType"
    // TestSuite.g:800:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // TestSuite.g:802:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // TestSuite.g:803:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,50,FOLLOW_50_in_tupleType3608); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3610); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3619);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // TestSuite.g:805:5: ( COMMA tp= tuplePart )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // TestSuite.g:805:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3630); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3634);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3646); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleType(tpList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleType"



    // $ANTLR start "tuplePart"
    // TestSuite.g:814:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // TestSuite.g:815:5: (name= IDENT COLON t= type )
            // TestSuite.g:816:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3678); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3680); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3684);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTuplePart(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tuplePart"



    // $ANTLR start "shellCommandOnly"
    // TestSuite.g:823:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s =null;

        TestSuiteParser.legacyStat_return l =null;


        try {
            // TestSuite.g:824:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==SEMI) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==66) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==44) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==54) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==57) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==67) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==82) ) {
                int LA56_7 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt56=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==MINUS||LA56_0==PLUS||LA56_0==85) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==102) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==70) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==INT) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==REAL) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==STRING) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==HASH) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==IDENT) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==45||(LA56_0 >= 47 && LA56_0 <= 49)) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==88) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==46) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==91) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==51) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==86) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==50) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==AT) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==81) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==87||(LA56_0 >= 89 && LA56_0 <= 90)) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==LPAREN) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==73) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==84) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==62) ) {
                int LA56_29 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt56=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==76) ) {
                int LA56_30 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt56=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 30, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==61) ) {
                int LA56_31 = input.LA(2);

                if ( (synpred2_TestSuite()) ) {
                    alt56=1;
                }
                else if ( (synpred3_TestSuite()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 31, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==71) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==104) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==56) && (synpred2_TestSuite())) {
                alt56=1;
            }
            else if ( (LA56_0==92) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else if ( (LA56_0==93) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else if ( (LA56_0==59) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else if ( (LA56_0==55) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else if ( (LA56_0==69) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else if ( (LA56_0==97) && (synpred3_TestSuite())) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // TestSuite.g:825:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly3721);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:828:3: ( legacyStat )=>l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly3742);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "shellCommandOnly"



    // $ANTLR start "shellCommand"
    // TestSuite.g:836:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.legacyStat_return l =null;

        TestSuiteParser.stat_return s =null;


        try {
            // TestSuite.g:837:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==92) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==93) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==59) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==55) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==82) ) {
                int LA57_5 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt57=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA57_0==69) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==62) ) {
                int LA57_7 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt57=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA57_0==97) && (synpred4_TestSuite())) {
                alt57=1;
            }
            else if ( (LA57_0==76) ) {
                int LA57_9 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt57=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA57_0==61) ) {
                int LA57_10 = input.LA(2);

                if ( (synpred4_TestSuite()) ) {
                    alt57=1;
                }
                else if ( (synpred5_TestSuite()) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA57_0==SEMI) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==EOF) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==MINUS||LA57_0==PLUS||LA57_0==85) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==102) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==70) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==INT) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==REAL) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==STRING) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==HASH) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==IDENT) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==45||(LA57_0 >= 47 && LA57_0 <= 49)) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==88) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==46) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==91) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==51) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==86) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==50) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==AT) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==81) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==87||(LA57_0 >= 89 && LA57_0 <= 90)) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==LPAREN) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==73) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==84) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==71) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==104) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else if ( (LA57_0==56) && (synpred5_TestSuite())) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // TestSuite.g:838:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand3774);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand3776); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:841:3: ( stat )=>s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand3797);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand3799); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "shellCommand"


    public static class legacyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyStat"
    // TestSuite.g:851:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final TestSuiteParser.legacyStat_return legacyStat() throws RecognitionException {
        TestSuiteParser.legacyStat_return retval = new TestSuiteParser.legacyStat_return();
        retval.start = input.LT(1);


        ASTEnterOperationStatement loe =null;

        ASTStatement lox =null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:855:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt59=1;
                }
                break;
            case 93:
                {
                alt59=2;
                }
                break;
            case 55:
            case 59:
            case 61:
            case 62:
            case 69:
            case 76:
            case 82:
            case 97:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // TestSuite.g:856:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat3833);
                    loe=legacyOpEnter();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = loe;
                        if (retval.n != null) {
                          retval.n.setSourcePosition(((Token)retval.start));
                        }
                      }

                    }
                    break;
                case 2 :
                    // TestSuite.g:864:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat3849);
                    lox=legacyOpExit();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = lox; 
                        if (retval.n != null) {
                          retval.n.setSourcePosition(((Token)retval.start));
                        }
                      }

                    }
                    break;
                case 3 :
                    // TestSuite.g:872:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3862);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;

                    // TestSuite.g:873:3: ( nextLegacyStat[seq] )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==55||LA58_0==59||(LA58_0 >= 61 && LA58_0 <= 62)||LA58_0==69||LA58_0==76||LA58_0==82||LA58_0==97) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // TestSuite.g:874:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat3873);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { 
                        retval.n = seq.simplify();
                        retval.n.setSourcePosition(((Token)retval.start));
                      }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyStat"


    public static class nextLegacyStat_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nextLegacyStat"
    // TestSuite.g:887:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final TestSuiteParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextLegacyStat_return retval = new TestSuiteParser.nextLegacyStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // TestSuite.g:888:3: (s= singleLegacyStat ( SEMI )? )
            // TestSuite.g:889:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat3907);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;

            // TestSuite.g:890:3: ( SEMI )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SEMI) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // TestSuite.g:890:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat3911); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if ((s != null) && (!s.isEmptyStatement())) { 
                  seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nextLegacyStat"



    // $ANTLR start "singleLegacyStat"
    // TestSuite.g:903:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.legacyCreate_return lcr =null;

        TestSuiteParser.legacyCreateAssign_return lca =null;

        TestSuiteParser.legacyCreateInsert_return lci =null;

        ASTVariableAssignmentStatement llt =null;

        ASTStatement lex =null;

        TestSuiteParser.objDestroyStat_return ods =null;

        TestSuiteParser.expression_return e =null;

        ASTAttributeAssignmentStatement aas =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;


        try {
            // TestSuite.g:904:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
            int alt61=9;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==IDENT) ) {
                    int LA61_9 = input.LA(3);

                    if ( (LA61_9==COLON) ) {
                        int LA61_10 = input.LA(4);

                        if ( (LA61_10==IDENT) ) {
                            int LA61_12 = input.LA(5);

                            if ( (LA61_12==58) ) {
                                alt61=3;
                            }
                            else if ( (LA61_12==EOF||LA61_12==SEMI||LA61_12==44||(LA61_12 >= 54 && LA61_12 <= 55)||LA61_12==57||LA61_12==59||(LA61_12 >= 61 && LA61_12 <= 62)||(LA61_12 >= 66 && LA61_12 <= 67)||LA61_12==69||LA61_12==76||LA61_12==82||LA61_12==97) ) {
                                alt61=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return n;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA61_9==COMMA) ) {
                        alt61=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }
                }
                break;
            case 55:
                {
                alt61=2;
                }
                break;
            case 82:
                {
                alt61=4;
                }
                break;
            case 69:
                {
                alt61=5;
                }
                break;
            case 62:
                {
                alt61=6;
                }
                break;
            case 97:
                {
                alt61=7;
                }
                break;
            case 76:
                {
                alt61=8;
                }
                break;
            case 61:
                {
                alt61=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // TestSuite.g:905:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat3944);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lcr!=null?lcr.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:906:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat3963);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lca!=null?lca.n:null); }

                    }
                    break;
                case 3 :
                    // TestSuite.g:907:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat3976);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lci!=null?lci.n:null); }

                    }
                    break;
                case 4 :
                    // TestSuite.g:908:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat3989);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = llt; }

                    }
                    break;
                case 5 :
                    // TestSuite.g:911:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat4017);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lex; }

                    }
                    break;
                case 6 :
                    // TestSuite.g:912:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat4035);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 7 :
                    // TestSuite.g:913:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,97,FOLLOW_97_in_singleLegacyStat4048); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_singleLegacyStat4052);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat4058);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;
                case 8 :
                    // TestSuite.g:914:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat4071);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:915:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat4092);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "singleLegacyStat"


    public static class legacyCreate_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreate"
    // TestSuite.g:928:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final TestSuiteParser.legacyCreate_return legacyCreate() throws RecognitionException {
        TestSuiteParser.legacyCreate_return retval = new TestSuiteParser.legacyCreate_return();
        retval.start = input.LT(1);


        List<String> objNames =null;

        ASTSimpleType objType =null;


        try {
            // TestSuite.g:929:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // TestSuite.g:930:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,59,FOLLOW_59_in_legacyCreate4128); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreate4136);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreate4140); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreate4148);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { 
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (String objName : objNames) {
                  seq.addStatement(
                    new ASTNewObjectStatement(
                      objType, 
                      new ASTStringLiteral(objName)), 
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreate"


    public static class legacyCreateAssign_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreateAssign"
    // TestSuite.g:962:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final TestSuiteParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        TestSuiteParser.legacyCreateAssign_return retval = new TestSuiteParser.legacyCreateAssign_return();
        retval.start = input.LT(1);


        List<String> varNames =null;

        ASTSimpleType objType =null;


        try {
            // TestSuite.g:963:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // TestSuite.g:964:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,55,FOLLOW_55_in_legacyCreateAssign4185); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign4193);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign4197); if (state.failed) return retval;

            match(input,59,FOLLOW_59_in_legacyCreateAssign4201); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign4209);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (String varName : varNames) {
                  seq.addStatement(
                    new ASTVariableAssignmentStatement(
                      varName, 
                      new ASTRValueNewObject(objType)),
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreateAssign"


    public static class legacyCreateInsert_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };


    // $ANTLR start "legacyCreateInsert"
    // TestSuite.g:998:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final TestSuiteParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        TestSuiteParser.legacyCreateInsert_return retval = new TestSuiteParser.legacyCreateInsert_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTSimpleType asClassName =null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return participants =null;


        try {
            // TestSuite.g:999:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // TestSuite.g:1000:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,59,FOLLOW_59_in_legacyCreateInsert4243); if (state.failed) return retval;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert4251); if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert4255); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert4263);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            match(input,58,FOLLOW_58_in_legacyCreateInsert4267); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert4271); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4281);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert4285); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTNewLinkObjectStatement nlo = 
                  new ASTNewLinkObjectStatement(
                    asClassName, 
                    (participants!=null?participants.participans:null),
                    (participants!=null?participants.qualifiers:null),
                    new ASTStringLiteral(name));
                    
                nlo.setSourcePosition(((Token)retval.start));
              
                retval.n = new ASTVariableAssignmentStatement(
                  (name!=null?name.getText():null),
                  new ASTRValueNewLinkObject(nlo));
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "legacyCreateInsert"



    // $ANTLR start "legacyLet"
    // TestSuite.g:1036:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;


        Token varName=null;
        ASTType varType =null;

        ASTExpression e =null;


        try {
            // TestSuite.g:1037:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // TestSuite.g:1038:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,82,FOLLOW_82_in_legacyLet4318); if (state.failed) return n;

            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet4326); if (state.failed) return n;

            // TestSuite.g:1040:3: ( COLON varType= type )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COLON) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // TestSuite.g:1041:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet4336); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_legacyLet4346);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet4355); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyLet4363);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), e, varType); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyLet"



    // $ANTLR start "legacyOpEnter"
    // TestSuite.g:1062:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;


        Token op=null;
        ASTExpression obj =null;

        List<ASTExpression> args =null;


        try {
            // TestSuite.g:1063:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // TestSuite.g:1064:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,92,FOLLOW_92_in_legacyOpEnter4396); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter4404);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter4412); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter4416); if (state.failed) return n;

            pushFollow(FOLLOW_exprList_in_legacyOpEnter4426);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter4430); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEnterOperationStatement(obj, (op!=null?op.getText():null), args); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyOpEnter"



    // $ANTLR start "legacyOpExit"
    // TestSuite.g:1087:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression retVal =null;


        try {
            // TestSuite.g:1088:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // TestSuite.g:1089:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,93,FOLLOW_93_in_legacyOpExit4465); if (state.failed) return n;

            // TestSuite.g:1089:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==82) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==MINUS||LA63_0==PLUS||LA63_0==85) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==102) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==70) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==INT) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==REAL) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==STRING) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==HASH) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==IDENT) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==45||(LA63_0 >= 47 && LA63_0 <= 49)) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==88) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==46) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==91) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==51) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==86) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==50) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==AT) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==81) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==87||(LA63_0 >= 89 && LA63_0 <= 90)) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==LPAREN) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==73) && (synpred6_TestSuite())) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||LA63_0==44||LA63_0==54||LA63_0==57||(LA63_0 >= 66 && LA63_0 <= 67)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // TestSuite.g:1089:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit4477);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // TestSuite.g:1089:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit4481);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTExitOperationStatement(retVal); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyOpExit"



    // $ANTLR start "legacyExecute"
    // TestSuite.g:1104:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;


        try {
            // TestSuite.g:1105:3: ( 'execute' expression )
            // TestSuite.g:1106:3: 'execute' expression
            {
            match(input,69,FOLLOW_69_in_legacyExecute4514); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_legacyExecute4518);
            expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { 
                reportWarning("the execute command is not supported in this version"); 
                n = new ASTEmptyStatement();
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "legacyExecute"



    // $ANTLR start "statOnly"
    // TestSuite.g:1150:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s =null;


        try {
            // TestSuite.g:1151:3: (s= stat EOF )
            // TestSuite.g:1152:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly4564);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly4568); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOnly"


    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "stat"
    // TestSuite.g:1162:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final TestSuiteParser.stat_return stat() throws RecognitionException {
        TestSuiteParser.stat_return retval = new TestSuiteParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // TestSuite.g:1166:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // TestSuite.g:1167:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat4599);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // TestSuite.g:1168:3: ( SEMI nextStat[seq] )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==SEMI) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // TestSuite.g:1169:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat4610); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat4616);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            if ( state.backtracking==0 ) { 
                retval.n = seq.simplify();
                if ((retval.n != null) && (!retval.n.isEmptyStatement())) {
                  retval.n.setSourcePosition(((Token)retval.start));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class nextStat_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nextStat"
    // TestSuite.g:1185:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final TestSuiteParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        TestSuiteParser.nextStat_return retval = new TestSuiteParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // TestSuite.g:1186:3: (s= singleStat )
            // TestSuite.g:1187:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat4650);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                if ((s != null) && (!s.isEmptyStatement())) {
                  seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nextStat"



    // $ANTLR start "singleStat"
    // TestSuite.g:1199:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        TestSuiteParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // TestSuite.g:1203:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt65=11;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==EOF||LA65_0==SEMI||LA65_0==44||LA65_0==54||LA65_0==57||(LA65_0 >= 65 && LA65_0 <= 67)) ) {
                alt65=1;
            }
            else if ( (LA65_0==82) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==MINUS||LA65_0==PLUS||LA65_0==85) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==102) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==70) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==INT) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==REAL) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==STRING) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==HASH) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==IDENT) ) {
                int LA65_17 = input.LA(2);

                if ( (synpred7_TestSuite()) ) {
                    alt65=2;
                }
                else if ( (true) ) {
                    alt65=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 17, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==45||(LA65_0 >= 47 && LA65_0 <= 49)) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==88) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==46) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==91) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==51) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==86) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==50) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==AT) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==81) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==87||(LA65_0 >= 89 && LA65_0 <= 90)) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==LPAREN) && (synpred7_TestSuite())) {
                alt65=2;
            }
            else if ( (LA65_0==73) ) {
                int LA65_29 = input.LA(2);

                if ( (synpred7_TestSuite()) ) {
                    alt65=2;
                }
                else if ( (true) ) {
                    alt65=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==84) ) {
                alt65=4;
            }
            else if ( (LA65_0==62) ) {
                alt65=5;
            }
            else if ( (LA65_0==76) ) {
                alt65=6;
            }
            else if ( (LA65_0==61) ) {
                alt65=7;
            }
            else if ( (LA65_0==71) ) {
                alt65=9;
            }
            else if ( (LA65_0==104) ) {
                alt65=10;
            }
            else if ( (LA65_0==56) ) {
                alt65=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // TestSuite.g:1204:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4687);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1206:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4713);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // TestSuite.g:1207:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4725);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // TestSuite.g:1208:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4739);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // TestSuite.g:1209:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4753);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // TestSuite.g:1210:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4766);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // TestSuite.g:1211:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4783);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // TestSuite.g:1212:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4800);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // TestSuite.g:1213:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4817);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // TestSuite.g:1215:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4839);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // TestSuite.g:1216:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat4857);
                    blk=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = blk; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "singleStat"



    // $ANTLR start "emptyStat"
    // TestSuite.g:1223:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // TestSuite.g:1224:3: ( nothing )
            // TestSuite.g:1225:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4884);
            nothing();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEmptyStatement(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyStat"



    // $ANTLR start "statStartingWithExpr"
    // TestSuite.g:1230:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // TestSuite.g:1231:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // TestSuite.g:1232:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4910);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1233:3: (aas= attAssignStat[$expr.n] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==DOT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // TestSuite.g:1234:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4924);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (aas == null) {
                  n = new ASTOperationCallStatement(expr); 
                }
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statStartingWithExpr"



    // $ANTLR start "varAssignStat"
    // TestSuite.g:1246:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        TestSuiteParser.rValue_return rVal =null;


        try {
            // TestSuite.g:1247:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // TestSuite.g:1248:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4962); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4966); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat4974);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {
                n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), (rVal!=null?rVal.n:null));
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "varAssignStat"



    // $ANTLR start "attAssignStat"
    // TestSuite.g:1316:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        TestSuiteParser.rValue_return r =null;


        try {
            // TestSuite.g:1317:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // TestSuite.g:1318:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat5005); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat5014); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat5018); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat5026);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAttributeAssignmentStatement(exp, (attName!=null?attName.getText():null), (r!=null?r.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "attAssignStat"



    // $ANTLR start "objCreateStat"
    // TestSuite.g:1330:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1331:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // TestSuite.g:1332:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,84,FOLLOW_84_in_objCreateStat5052); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat5060);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1334:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LPAREN) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // TestSuite.g:1335:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5070); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat5082);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5088); if (state.failed) return n;

                    }
                    break;

            }


            // TestSuite.g:1340:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==58) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // TestSuite.g:1341:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,58,FOLLOW_58_in_objCreateStat5106); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5114); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5128);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5136); if (state.failed) return n;

                    if ( state.backtracking==0 ) { 
                        n = new ASTNewLinkObjectStatement(ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                        }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (n == null) {
                  n = new ASTNewObjectStatement(ident, objName);
                }
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objCreateStat"


    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objDestroyStat"
    // TestSuite.g:1360:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final TestSuiteParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        TestSuiteParser.objDestroyStat_return retval = new TestSuiteParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // TestSuite.g:1361:3: ( 'destroy' el= exprListMin1 )
            // TestSuite.g:1362:3: 'destroy' el= exprListMin1
            {
            match(input,62,FOLLOW_62_in_objDestroyStat5172); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat5180);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement();
                
                for (ASTExpression expression : el) {
                  seq.addStatement(
                    new ASTObjectDestructionStatement(expression),
                    ((Token)retval.start),
                    input.toString(retval.start,input.LT(-1)));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objDestroyStat"



    // $ANTLR start "lnkInsStat"
    // TestSuite.g:1383:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1384:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // TestSuite.g:1385:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,76,FOLLOW_76_in_lnkInsStat5206); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat5210); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5220);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat5224); if (state.failed) return n;

            match(input,77,FOLLOW_77_in_lnkInsStat5228); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat5236); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTLinkInsertionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "lnkInsStat"


    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };


    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // TestSuite.g:1395:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final TestSuiteParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return retval = new TestSuiteParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        TestSuiteParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // TestSuite.g:1401:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // TestSuite.g:1402:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5265);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // TestSuite.g:1403:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LBRACE) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // TestSuite.g:1404:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5276); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5285);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5292); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5308); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5319);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // TestSuite.g:1416:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LBRACE) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // TestSuite.g:1417:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5330); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5339);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5346); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // TestSuite.g:1426:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // TestSuite.g:1427:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5368); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5383);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // TestSuite.g:1431:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==LBRACE) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // TestSuite.g:1432:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5403); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5414);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5423); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          retval.qualifiers.add(currentQualifiers);
            	          currentQualifiers = Collections.emptyList();
            	        }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rValListMin2WithOptionalQualifiers"



    // $ANTLR start "lnkDelStat"
    // TestSuite.g:1447:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        TestSuiteParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // TestSuite.g:1448:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // TestSuite.g:1449:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,61,FOLLOW_61_in_lnkDelStat5464); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5468); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5478);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5482); if (state.failed) return n;

            match(input,72,FOLLOW_72_in_lnkDelStat5486); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5495); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTLinkDeletionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "lnkDelStat"



    // $ANTLR start "condExStat"
    // TestSuite.g:1463:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // TestSuite.g:1467:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // TestSuite.g:1468:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,73,FOLLOW_73_in_condExStat5526); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat5535);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,101,FOLLOW_101_in_condExStat5539); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5548);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // TestSuite.g:1472:3: ( 'else' es= statOrImplicitBlock )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==65) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // TestSuite.g:1473:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,65,FOLLOW_65_in_condExStat5559); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5571);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,66,FOLLOW_66_in_condExStat5583); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTConditionalExecutionStatement(con, ts, elseStat); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "condExStat"



    // $ANTLR start "iterStat"
    // TestSuite.g:1484:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // TestSuite.g:1485:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // TestSuite.g:1486:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,71,FOLLOW_71_in_iterStat5608); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5616); if (state.failed) return n;

            match(input,75,FOLLOW_75_in_iterStat5620); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat5628);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_iterStat5632); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5640);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,66,FOLLOW_66_in_iterStat5645); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterationStatement((var!=null?var.getText():null), set, s); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterStat"



    // $ANTLR start "whileStat"
    // TestSuite.g:1501:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // TestSuite.g:1502:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // TestSuite.g:1503:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,104,FOLLOW_104_in_whileStat5671); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat5679);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_whileStat5683); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5691);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,66,FOLLOW_66_in_whileStat5696); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTWhileStatement(cond, s); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "whileStat"



    // $ANTLR start "blockStat"
    // TestSuite.g:1515:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        TestSuiteParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // TestSuite.g:1519:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // TestSuite.g:1520:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,56,FOLLOW_56_in_blockStat5726); if (state.failed) return n;

            // TestSuite.g:1521:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==60) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // TestSuite.g:1521:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,60,FOLLOW_60_in_blockStat5731); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat5737);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // TestSuite.g:1521:72: ( COMMA vd1= variableDeclaration )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==COMMA) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // TestSuite.g:1521:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat5743); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat5749);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat5756); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat5766);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,66,FOLLOW_66_in_blockStat5771); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "blockStat"



    // $ANTLR start "implicitBlockStat"
    // TestSuite.g:1530:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        TestSuiteParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // TestSuite.g:1534:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // TestSuite.g:1535:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,60,FOLLOW_60_in_implicitBlockStat5797); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5803);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // TestSuite.g:1535:71: ( COMMA vd1= variableDeclaration )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // TestSuite.g:1535:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5809); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5815);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5822); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat5830);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "implicitBlockStat"



    // $ANTLR start "statOrImplicitBlock"
    // TestSuite.g:1539:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        TestSuiteParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // TestSuite.g:1540:3: ( (s1= stat |s2= implicitBlockStat ) )
            // TestSuite.g:1541:3: (s1= stat |s2= implicitBlockStat )
            {
            // TestSuite.g:1541:3: (s1= stat |s2= implicitBlockStat )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==AT||LA77_0==HASH||(LA77_0 >= IDENT && LA77_0 <= INT)||(LA77_0 >= LPAREN && LA77_0 <= MINUS)||LA77_0==PLUS||LA77_0==REAL||LA77_0==SEMI||LA77_0==STRING||(LA77_0 >= 45 && LA77_0 <= 51)||LA77_0==56||(LA77_0 >= 61 && LA77_0 <= 62)||(LA77_0 >= 65 && LA77_0 <= 66)||(LA77_0 >= 70 && LA77_0 <= 71)||LA77_0==73||LA77_0==76||(LA77_0 >= 81 && LA77_0 <= 82)||(LA77_0 >= 84 && LA77_0 <= 91)||LA77_0==102||LA77_0==104) ) {
                alt77=1;
            }
            else if ( (LA77_0==60) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // TestSuite.g:1541:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock5853);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1541:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5863);
                    s2=implicitBlockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = s2; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOrImplicitBlock"



    // $ANTLR start "nothing"
    // TestSuite.g:1555:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // TestSuite.g:1556:1: ()
            // TestSuite.g:1557:1: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "nothing"


    public static class rValue_return extends ParserRuleReturnScope {
        public ASTRValue n;
    };


    // $ANTLR start "rValue"
    // TestSuite.g:1563:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final TestSuiteParser.rValue_return rValue() throws RecognitionException {
        TestSuiteParser.rValue_return retval = new TestSuiteParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // TestSuite.g:1564:5: (e= inSoilExpression |oc= objCreateStat )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==AT||LA78_0==HASH||(LA78_0 >= IDENT && LA78_0 <= INT)||(LA78_0 >= LPAREN && LA78_0 <= MINUS)||LA78_0==PLUS||LA78_0==REAL||LA78_0==STRING||(LA78_0 >= 45 && LA78_0 <= 51)||LA78_0==70||LA78_0==73||(LA78_0 >= 81 && LA78_0 <= 82)||(LA78_0 >= 85 && LA78_0 <= 91)||LA78_0==102) ) {
                alt78=1;
            }
            else if ( (LA78_0==84) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // TestSuite.g:1565:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5909);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1566:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5921);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        oc.setSourcePosition(((Token)retval.start));
                        if (oc instanceof ASTNewLinkObjectStatement)
                        	retval.n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)oc);
                        else
                        	retval.n = new ASTRValueNewObject((ASTNewObjectStatement)oc);
                      }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rValue"



    // $ANTLR start "rValList"
    // TestSuite.g:1580:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // TestSuite.g:1581:3: ( nothing |rl= rValListMin1 )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RBRACE) ) {
                alt79=1;
            }
            else if ( (LA79_0==AT||LA79_0==HASH||(LA79_0 >= IDENT && LA79_0 <= INT)||(LA79_0 >= LPAREN && LA79_0 <= MINUS)||LA79_0==PLUS||LA79_0==REAL||LA79_0==STRING||(LA79_0 >= 45 && LA79_0 <= 51)||LA79_0==70||LA79_0==73||(LA79_0 >= 81 && LA79_0 <= 82)||(LA79_0 >= 84 && LA79_0 <= 91)||LA79_0==102) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // TestSuite.g:1582:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5944);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1585:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5971);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = rl; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValList"



    // $ANTLR start "rValListMin1"
    // TestSuite.g:1593:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        TestSuiteParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1597:3: (r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1598:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin16004);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // TestSuite.g:1600:3: ( COMMA r= rValue )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // TestSuite.g:1601:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin16018); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin16028);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // TestSuite.g:1611:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        TestSuiteParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // TestSuite.g:1615:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // TestSuite.g:1616:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin26067);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin26075); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin26083);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // TestSuite.g:1621:3: ( COMMA r= rValue )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // TestSuite.g:1622:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin26097); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin26107);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // TestSuite.g:1632:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        TestSuiteParser.expression_return e =null;


        try {
            // TestSuite.g:1633:3: (e= expression )
            // TestSuite.g:1634:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression6141);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }

            if ( state.backtracking==0 ) { n = (e!=null?e.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "inSoilExpression"



    // $ANTLR start "exprList"
    // TestSuite.g:1643:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // TestSuite.g:1644:3: ( nothing |el= exprListMin1 )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RPAREN) ) {
                alt82=1;
            }
            else if ( (LA82_0==AT||LA82_0==HASH||(LA82_0 >= IDENT && LA82_0 <= INT)||(LA82_0 >= LPAREN && LA82_0 <= MINUS)||LA82_0==PLUS||LA82_0==REAL||LA82_0==STRING||(LA82_0 >= 45 && LA82_0 <= 51)||LA82_0==70||LA82_0==73||(LA82_0 >= 81 && LA82_0 <= 82)||(LA82_0 >= 85 && LA82_0 <= 91)||LA82_0==102) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // TestSuite.g:1645:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList6170);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1648:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList6188);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = el; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprList"



    // $ANTLR start "exprListMin1"
    // TestSuite.g:1656:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1660:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1661:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin16221);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // TestSuite.g:1663:3: ( COMMA e= inSoilExpression )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==COMMA) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // TestSuite.g:1664:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin16236); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin16246);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // TestSuite.g:1674:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // TestSuite.g:1678:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // TestSuite.g:1679:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26286);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin26294); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26302);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // TestSuite.g:1684:3: ( COMMA e= inSoilExpression )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // TestSuite.g:1685:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin26316); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin26326);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // TestSuite.g:1695:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // TestSuite.g:1696:3: ( nothing |il= identListMin1 )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EOF||LA85_0==RBRACE||(LA85_0 >= RPAREN && LA85_0 <= SEMI)||LA85_0==44||LA85_0==54||LA85_0==57||(LA85_0 >= 65 && LA85_0 <= 67)) ) {
                alt85=1;
            }
            else if ( (LA85_0==IDENT) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // TestSuite.g:1697:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList6356);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // TestSuite.g:1700:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList6373);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = il; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identList"



    // $ANTLR start "identListMin1"
    // TestSuite.g:1708:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // TestSuite.g:1712:3: (id= IDENT ( COMMA id= IDENT )* )
            // TestSuite.g:1713:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16407); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // TestSuite.g:1715:3: ( COMMA id= IDENT )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // TestSuite.g:1716:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin16421); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16431); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_TestSuite
    public final void synpred1_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:739:7: ( COLON type EQUAL )
        // TestSuite.g:739:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_TestSuite3300); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_TestSuite3302);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_TestSuite3304); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_TestSuite

    // $ANTLR start synpred2_TestSuite
    public final void synpred2_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:825:3: ( stat )
        // TestSuite.g:825:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred2_TestSuite3713);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_TestSuite

    // $ANTLR start synpred3_TestSuite
    public final void synpred3_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:828:3: ( legacyStat )
        // TestSuite.g:828:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_TestSuite3734);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TestSuite

    // $ANTLR start synpred4_TestSuite
    public final void synpred4_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:838:3: ( legacyStat )
        // TestSuite.g:838:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred4_TestSuite3766);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_TestSuite

    // $ANTLR start synpred5_TestSuite
    public final void synpred5_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:841:3: ( stat )
        // TestSuite.g:841:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred5_TestSuite3789);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_TestSuite

    // $ANTLR start synpred6_TestSuite
    public final void synpred6_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:1089:13: ( inSoilExpression )
        // TestSuite.g:1089:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred6_TestSuite4469);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_TestSuite

    // $ANTLR start synpred7_TestSuite
    public final void synpred7_TestSuite_fragment() throws RecognitionException {
        // TestSuite.g:1206:5: ( statStartingWithExpr )
        // TestSuite.g:1206:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4705);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_TestSuite

    // Delegated rules

    public final boolean synpred2_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_TestSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TestSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_100_in_testSuite61 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_testSuite71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_testSuite82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_testSuite84 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_filename_in_testSuite93 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_testSuite105 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44_in_testSuite112 = new BitSet(new long[]{0x698FE208861A0020L,0x000001423FF612E0L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testSuite118 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_testSuite124 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_testCases_in_testSuite145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testSuite154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_filename172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_filename174 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_filename178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testCase_in_testCases205 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_testCase224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_testCase228 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_44_in_testCase242 = new BitSet(new long[]{0x698FE208861A0020L,0x000001423FF612E0L});
    public static final BitSet FOLLOW_shellCommandOnly_in_testCase248 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_assertStatement_in_testCase267 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_57_in_testCase285 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_67_in_testCase303 = new BitSet(new long[]{0x0240100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_testCase315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_assertStatement336 = new BitSet(new long[]{0x0000000000000000L,0x0000008000008000L});
    public static final BitSet FOLLOW_103_in_assertStatement341 = new BitSet(new long[]{0x000FE208861A0020L,0x000000418FE74240L});
    public static final BitSet FOLLOW_79_in_assertStatement347 = new BitSet(new long[]{0x000FE208861A0020L,0x000000418FE74240L});
    public static final BitSet FOLLOW_expression_in_assertStatement366 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_80_in_assertStatement382 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_80_in_assertStatement398 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement402 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_78_in_assertStatement418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertStatement424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertStatement428 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_assertionStatementPre_in_assertStatement448 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_assertionStatementPost_in_assertStatement469 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_assertStatement486 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_assertStatement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_assertionStatementPre513 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre521 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_assertionStatementPre527 = new BitSet(new long[]{0x000FE218861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre538 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_assertionStatementPre544 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_assertionStatementPre548 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_assertionStatementPre561 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_COLON_in_assertionStatementPre564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPre568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_assertionStatementPost593 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENT_in_assertionStatementPost602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_expression687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression698 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression702 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression706 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression711 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_expression715 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_expression753 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression765 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression769 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression773 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression778 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_expression823 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList872 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList889 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList901 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList905 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList954 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList964 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList968 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration999 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1001 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conditionalImpliesExpression1054 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1103 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_conditionalOrExpression1116 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1120 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1164 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_conditionalXOrExpression1177 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1181 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1225 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalAndExpression1238 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1242 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1290 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1309 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1319 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1368 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1386 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1404 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1454 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1472 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1482 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1532 = new BitSet(new long[]{0x8000014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1550 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1564 = new BitSet(new long[]{0x8000014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1626 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE20240L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1703 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1721 = new BitSet(new long[]{0x0000000000080000L,0x0000000006820000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1727 = new BitSet(new long[]{0x0000000000080000L,0x0000000006820000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1738 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1815 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1819 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1845 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1847 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primaryExpression1849 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1853 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1855 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_primaryExpression1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1905 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2059 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2074 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_queryExpression2085 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_iterateExpression2123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2129 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2137 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2149 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2157 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2207 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2229 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2242 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2255 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2259 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2271 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2288 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2303 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2318 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2322 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2336 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_operationExpression2363 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2388 = new BitSet(new long[]{0x000FE218861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2409 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2421 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_operationExpression2425 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2494 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2510 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2514 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2554 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2557 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2561 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2571 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2577 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2580 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2586 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2614 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2616 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2622 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ifExpression2658 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2662 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ifExpression2664 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifExpression2670 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_ifExpression2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ifExpression2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_literal2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_literal2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2781 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2797 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2799 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2889 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2918 = new BitSet(new long[]{0x000FE20A861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2935 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2948 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2952 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3000 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3011 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_collectionItem3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_emptyCollectionLiteral3044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3046 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3050 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3068 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3070 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_undefinedLiteral3102 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3104 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3108 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_undefinedLiteral3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3138 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3140 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3144 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_undefinedLiteral3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleLiteral3199 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3205 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3213 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3228 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3270 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3309 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3313 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3315 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_tupleItem3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3341 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_tupleItem3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3541 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3568 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3572 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleType3608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3619 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3634 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3678 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3680 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommandOnly3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand3774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand3797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3862 = new BitSet(new long[]{0x6880000000000002L,0x0000000200041020L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat3873 = new BitSet(new long[]{0x6880000000000002L,0x0000000200041020L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat3907 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_singleLegacyStat4048 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat4052 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_legacyCreate4128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate4136 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate4140 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_legacyCreateAssign4185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign4193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign4197 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_legacyCreateAssign4201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_legacyCreateInsert4243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert4251 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert4255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert4263 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_legacyCreateInsert4267 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert4271 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert4281 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_legacyLet4318 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet4326 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_legacyLet4336 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_legacyLet4346 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet4355 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_legacyOpEnter4396 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter4404 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter4412 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter4416 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter4426 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_legacyOpExit4465 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_legacyExecute4514 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_expression_in_legacyExecute4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat4599 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat4610 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_nextStat_in_stat4616 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4910 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4962 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4966 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat5005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat5014 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat5018 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_objCreateStat5052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat5060 = new BitSet(new long[]{0x0400000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5070 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat5082 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5088 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_objCreateStat5106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5114 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5128 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_objDestroyStat5172 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_lnkInsStat5206 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat5210 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5220 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_lnkInsStat5228 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5265 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5276 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5285 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5292 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5308 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5319 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5330 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5339 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5346 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5368 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5383 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5403 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5414 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5423 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_61_in_lnkDelStat5464 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5468 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5478 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_lnkDelStat5486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_condExStat5526 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat5535 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_condExStat5539 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_condExStat5559 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_condExStat5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_iterStat5608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat5616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_iterStat5620 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iterStat5632 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterStat5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_whileStat5671 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_whileStat5683 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_whileStat5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_blockStat5726 = new BitSet(new long[]{0x710FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_60_in_blockStat5731 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5737 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat5743 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5749 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat5756 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_stat_in_blockStat5766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_blockStat5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_implicitBlockStat5797 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5803 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5809 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5815 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5822 = new BitSet(new long[]{0x610FE208861A0020L,0x000001400FF612C0L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin16004 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin16018 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin16028 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26067 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin26075 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26083 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin26097 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FF60240L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26107 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16221 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin16236 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16246 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26286 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26294 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26302 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26316 = new BitSet(new long[]{0x000FE208861A0020L,0x000000400FE60240L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26326 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16407 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin16421 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16431 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_TestSuite3300 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_TestSuite3302 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_TestSuite3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred2_TestSuite3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_TestSuite3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred4_TestSuite3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred5_TestSuite3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred6_TestSuite4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_TestSuite4705 = new BitSet(new long[]{0x0000000000000002L});

}