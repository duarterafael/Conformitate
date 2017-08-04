// $ANTLR 3.4 ShellCommand.g 2013-06-12 12:17:45

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
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
 
 
package org.tzi.use.parser.shell;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ShellCommandParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assign'", "'begin'", "'between'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'openter'", "'opexit'", "'or'", "'pre'", "'set'", "'then'", "'true'", "'while'", "'xor'"
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


    public ShellCommandParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ShellCommandParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ShellCommandParser.tokenNames; }
    public String getGrammarFileName() { return "ShellCommand.g"; }



    // $ANTLR start "shellCommandOnly"
    // ShellCommand.g:85:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;

        ShellCommandParser.legacyStat_return l =null;


        try {
            // ShellCommand.g:86:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMI) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==75) ) {
                int LA1_3 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==MINUS||LA1_0==PLUS||LA1_0==77) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==90) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==66) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==INT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==REAL) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==STRING) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==HASH) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==IDENT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==44||(LA1_0 >= 46 && LA1_0 <= 48)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==80) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==45) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==83) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==50) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==78) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==49) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==AT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==74) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==79||(LA1_0 >= 81 && LA1_0 <= 82)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==LPAREN) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==69) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==76) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==59) ) {
                int LA1_25 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==72) ) {
                int LA1_26 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 26, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==58) ) {
                int LA1_27 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==67) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==91) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==54) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==84) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==85) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==56) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==53) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==65) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==88) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // ShellCommand.g:87:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly65);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:90:3: ( legacyStat )=>l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly86);
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
    // ShellCommand.g:98:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyStat_return l =null;

        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:99:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==84) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==85) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==56) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==53) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==75) ) {
                int LA2_5 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==65) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==88) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==72) ) {
                int LA2_9 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==58) ) {
                int LA2_10 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==SEMI) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==EOF) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==77) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==90) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==66) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==INT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==REAL) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==STRING) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==HASH) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==IDENT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==80) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==45) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==83) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==50) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==78) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==49) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==AT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==74) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==79||(LA2_0 >= 81 && LA2_0 <= 82)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==LPAREN) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==69) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==76) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==67) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==91) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==54) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ShellCommand.g:100:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand118);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand120); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:103:3: ( stat )=>s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand141);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand143); if (state.failed) return n;

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
    // ShellCommand.g:113:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final ShellCommandParser.legacyStat_return legacyStat() throws RecognitionException {
        ShellCommandParser.legacyStat_return retval = new ShellCommandParser.legacyStat_return();
        retval.start = input.LT(1);


        ASTEnterOperationStatement loe =null;

        ASTStatement lox =null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:117:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt4=1;
                }
                break;
            case 85:
                {
                alt4=2;
                }
                break;
            case 53:
            case 56:
            case 58:
            case 59:
            case 65:
            case 72:
            case 75:
            case 88:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // ShellCommand.g:118:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat177);
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
                    // ShellCommand.g:126:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat193);
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
                    // ShellCommand.g:134:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat206);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;

                    // ShellCommand.g:135:3: ( nextLegacyStat[seq] )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==53||LA3_0==56||(LA3_0 >= 58 && LA3_0 <= 59)||LA3_0==65||LA3_0==72||LA3_0==75||LA3_0==88) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ShellCommand.g:136:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat217);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // ShellCommand.g:149:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final ShellCommandParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextLegacyStat_return retval = new ShellCommandParser.nextLegacyStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // ShellCommand.g:150:3: (s= singleLegacyStat ( SEMI )? )
            // ShellCommand.g:151:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat251);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:152:3: ( SEMI )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ShellCommand.g:152:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat255); if (state.failed) return retval;

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
    // ShellCommand.g:165:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyCreate_return lcr =null;

        ShellCommandParser.legacyCreateAssign_return lca =null;

        ShellCommandParser.legacyCreateInsert_return lci =null;

        ASTVariableAssignmentStatement llt =null;

        ASTStatement lex =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ShellCommandParser.expression_return e =null;

        ASTAttributeAssignmentStatement aas =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;


        try {
            // ShellCommand.g:166:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    int LA6_9 = input.LA(3);

                    if ( (LA6_9==COLON) ) {
                        int LA6_10 = input.LA(4);

                        if ( (LA6_10==IDENT) ) {
                            int LA6_12 = input.LA(5);

                            if ( (LA6_12==55) ) {
                                alt6=3;
                            }
                            else if ( (LA6_12==EOF||LA6_12==SEMI||LA6_12==53||LA6_12==56||(LA6_12 >= 58 && LA6_12 <= 59)||LA6_12==65||LA6_12==72||LA6_12==75||LA6_12==88) ) {
                                alt6=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return n;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_9==COMMA) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                alt6=2;
                }
                break;
            case 75:
                {
                alt6=4;
                }
                break;
            case 65:
                {
                alt6=5;
                }
                break;
            case 59:
                {
                alt6=6;
                }
                break;
            case 88:
                {
                alt6=7;
                }
                break;
            case 72:
                {
                alt6=8;
                }
                break;
            case 58:
                {
                alt6=9;
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
                    // ShellCommand.g:167:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat288);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lcr!=null?lcr.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:168:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat307);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lca!=null?lca.n:null); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:169:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat320);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lci!=null?lci.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:170:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat333);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = llt; }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:173:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat361);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lex; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:174:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat379);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:175:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,88,FOLLOW_88_in_singleLegacyStat392); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_singleLegacyStat396);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat402);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat415);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat436);
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
    // ShellCommand.g:190:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final ShellCommandParser.legacyCreate_return legacyCreate() throws RecognitionException {
        ShellCommandParser.legacyCreate_return retval = new ShellCommandParser.legacyCreate_return();
        retval.start = input.LT(1);


        List<String> objNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:191:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // ShellCommand.g:192:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,56,FOLLOW_56_in_legacyCreate472); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreate480);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreate484); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreate492);
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
    // ShellCommand.g:224:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final ShellCommandParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        ShellCommandParser.legacyCreateAssign_return retval = new ShellCommandParser.legacyCreateAssign_return();
        retval.start = input.LT(1);


        List<String> varNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:225:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // ShellCommand.g:226:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,53,FOLLOW_53_in_legacyCreateAssign529); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign537);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign541); if (state.failed) return retval;

            match(input,56,FOLLOW_56_in_legacyCreateAssign545); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign553);
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
    // ShellCommand.g:260:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final ShellCommandParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        ShellCommandParser.legacyCreateInsert_return retval = new ShellCommandParser.legacyCreateInsert_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTSimpleType asClassName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return participants =null;


        try {
            // ShellCommand.g:261:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // ShellCommand.g:262:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,56,FOLLOW_56_in_legacyCreateInsert587); if (state.failed) return retval;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert595); if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert599); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert607);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            match(input,55,FOLLOW_55_in_legacyCreateInsert611); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert615); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert629); if (state.failed) return retval;

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
    // ShellCommand.g:298:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;


        Token varName=null;
        ASTType varType =null;

        ASTExpression e =null;


        try {
            // ShellCommand.g:299:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // ShellCommand.g:300:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,75,FOLLOW_75_in_legacyLet662); if (state.failed) return n;

            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet670); if (state.failed) return n;

            // ShellCommand.g:302:3: ( COLON varType= type )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ShellCommand.g:303:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet680); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_legacyLet690);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet699); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyLet707);
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
    // ShellCommand.g:324:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;


        Token op=null;
        ASTExpression obj =null;

        List<ASTExpression> args =null;


        try {
            // ShellCommand.g:325:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // ShellCommand.g:326:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,84,FOLLOW_84_in_legacyOpEnter740); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter748);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter756); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter760); if (state.failed) return n;

            pushFollow(FOLLOW_exprList_in_legacyOpEnter770);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter774); if (state.failed) return n;

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
    // ShellCommand.g:349:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression retVal =null;


        try {
            // ShellCommand.g:350:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // ShellCommand.g:351:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,85,FOLLOW_85_in_legacyOpExit809); if (state.failed) return n;

            // ShellCommand.g:351:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==75) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==MINUS||LA8_0==PLUS||LA8_0==77) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==90) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==66) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==INT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==REAL) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==STRING) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==HASH) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==IDENT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==44||(LA8_0 >= 46 && LA8_0 <= 48)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==80) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==45) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==83) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==50) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==78) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==49) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==AT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==74) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==79||(LA8_0 >= 81 && LA8_0 <= 82)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==LPAREN) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==69) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // ShellCommand.g:351:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit821);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:351:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit825);
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
    // ShellCommand.g:366:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;


        try {
            // ShellCommand.g:367:3: ( 'execute' expression )
            // ShellCommand.g:368:3: 'execute' expression
            {
            match(input,65,FOLLOW_65_in_legacyExecute858); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_legacyExecute862);
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



    // $ANTLR start "expressionOnly"
    // ShellCommand.g:404:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:405:5: (nExp= expression EOF )
            // ShellCommand.g:406:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly896);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly898); if (state.failed) return n;

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
    // ShellCommand.g:413:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ShellCommandParser.expression_return expression() throws RecognitionException {
        ShellCommandParser.expression_return retval = new ShellCommandParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // ShellCommand.g:419:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // ShellCommand.g:420:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // ShellCommand.g:421:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==75) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ShellCommand.g:422:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,75,FOLLOW_75_in_expression946); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression957); if (state.failed) return retval;

            	    // ShellCommand.g:423:18: ( COLON t= type )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COLON) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ShellCommand.g:423:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression961); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression965);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression970); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression974);
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

            	    // ShellCommand.g:433:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==COMMA) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ShellCommand.g:434:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression1012); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1024); if (state.failed) return retval;

            	    	    // ShellCommand.g:435:20: ( COLON t= type )?
            	    	    int alt10=2;
            	    	    int LA10_0 = input.LA(1);

            	    	    if ( (LA10_0==COLON) ) {
            	    	        alt10=1;
            	    	    }
            	    	    switch (alt10) {
            	    	        case 1 :
            	    	            // ShellCommand.g:435:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression1028); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression1032);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1037); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression1041);
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
            	    	    break loop11;
            	        }
            	    } while (true);


            	    match(input,71,FOLLOW_71_in_expression1082); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1098);
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
    // ShellCommand.g:467:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // ShellCommand.g:469:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // ShellCommand.g:470:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1131); if (state.failed) return paramList;

            // ShellCommand.g:471:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ShellCommand.g:472:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1148);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // ShellCommand.g:473:7: ( COMMA v= variableDeclaration )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ShellCommand.g:473:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1160); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1164);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1184); if (state.failed) return paramList;

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
    // ShellCommand.g:481:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // ShellCommand.g:483:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // ShellCommand.g:484:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1213); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // ShellCommand.g:485:5: ( COMMA idn= IDENT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ShellCommand.g:485:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1223); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1227); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ShellCommand.g:493:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:494:5: (name= IDENT COLON t= type )
            // ShellCommand.g:495:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1258); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1260); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1264);
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
    // ShellCommand.g:503:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:504:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // ShellCommand.g:505:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1300);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // ShellCommand.g:506:5: (op= 'implies' n1= conditionalOrExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==70) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ShellCommand.g:506:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,70,FOLLOW_70_in_conditionalImpliesExpression1313); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1317);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ShellCommand.g:515:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:516:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // ShellCommand.g:517:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1362);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // ShellCommand.g:518:5: (op= 'or' n1= conditionalXOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==86) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ShellCommand.g:518:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalOrExpression1375); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1379);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ShellCommand.g:527:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:528:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // ShellCommand.g:529:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1423);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // ShellCommand.g:530:5: (op= 'xor' n1= conditionalAndExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==92) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ShellCommand.g:530:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,92,FOLLOW_92_in_conditionalXOrExpression1436); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1440);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // ShellCommand.g:539:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:540:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // ShellCommand.g:541:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1484);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // ShellCommand.g:542:5: (op= 'and' n1= equalityExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ShellCommand.g:542:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression1497); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1501);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // ShellCommand.g:551:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:553:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // ShellCommand.g:554:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1549);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // ShellCommand.g:555:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOT_EQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ShellCommand.g:555:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1578);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // ShellCommand.g:565:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:567:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // ShellCommand.g:568:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1627);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // ShellCommand.g:569:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= GREATER && LA21_0 <= GREATER_EQUAL)||(LA21_0 >= LESS && LA21_0 <= LESS_EQUAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ShellCommand.g:569:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1663);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // ShellCommand.g:579:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:581:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // ShellCommand.g:582:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1713);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // ShellCommand.g:583:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ShellCommand.g:583:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1741);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // ShellCommand.g:594:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:596:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // ShellCommand.g:597:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1791);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // ShellCommand.g:598:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==SLASH||LA23_0==STAR||LA23_0==60) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ShellCommand.g:598:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==60 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1823);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // ShellCommand.g:610:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // ShellCommand.g:612:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==MINUS||LA24_0==PLUS||LA24_0==77) ) {
                alt24=1;
            }
            else if ( (LA24_0==AT||LA24_0==HASH||(LA24_0 >= IDENT && LA24_0 <= INT)||LA24_0==LPAREN||LA24_0==REAL||LA24_0==STRING||(LA24_0 >= 44 && LA24_0 <= 50)||LA24_0==66||LA24_0==69||LA24_0==74||(LA24_0 >= 78 && LA24_0 <= 83)||LA24_0==90) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // ShellCommand.g:613:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // ShellCommand.g:613:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // ShellCommand.g:613:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==77 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1909);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // ShellCommand.g:617:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1929);
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
    // ShellCommand.g:625:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // ShellCommand.g:627:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // ShellCommand.g:628:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1962);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // ShellCommand.g:629:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DOT) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==IDENT) ) {
                        int LA26_4 = input.LA(3);

                        if ( (LA26_4==EOF||(LA26_4 >= ARROW && LA26_4 <= BAR)||(LA26_4 >= COMMA && LA26_4 <= EQUAL)||(LA26_4 >= GREATER && LA26_4 <= GREATER_EQUAL)||LA26_4==IDENT||(LA26_4 >= LBRACE && LA26_4 <= MINUS)||(LA26_4 >= NOT_EQUAL && LA26_4 <= PLUS)||(LA26_4 >= RBRACE && LA26_4 <= RBRACK)||(LA26_4 >= RPAREN && LA26_4 <= SLASH)||LA26_4==STAR||(LA26_4 >= 52 && LA26_4 <= 53)||LA26_4==56||(LA26_4 >= 58 && LA26_4 <= 65)||(LA26_4 >= 70 && LA26_4 <= 72)||LA26_4==75||LA26_4==86||(LA26_4 >= 88 && LA26_4 <= 89)||LA26_4==92) ) {
                            alt26=1;
                        }


                    }
                    else if ( (LA26_2==74||LA26_2==79||(LA26_2 >= 81 && LA26_2 <= 82)) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==ARROW) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ShellCommand.g:630:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // ShellCommand.g:630:6: ( ARROW | DOT )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==ARROW) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==DOT) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ShellCommand.g:630:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1980); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // ShellCommand.g:630:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1986); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1997);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // ShellCommand.g:646:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        ShellCommandParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // ShellCommand.g:647:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt29=6;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STRING:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 66:
            case 78:
            case 80:
            case 83:
            case 90:
                {
                alt29=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt29=1;
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
                case 52:
                case 53:
                case 56:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 70:
                case 71:
                case 72:
                case 75:
                case 86:
                case 88:
                case 89:
                case 92:
                    {
                    alt29=3;
                    }
                    break;
                case DOT:
                    {
                    int LA29_7 = input.LA(3);

                    if ( (LA29_7==51) ) {
                        alt29=6;
                    }
                    else if ( (LA29_7==IDENT||LA29_7==74||LA29_7==79||(LA29_7 >= 81 && LA29_7 <= 82)) ) {
                        alt29=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt29=2;
                }
                break;
            case 74:
            case 79:
            case 81:
            case 82:
                {
                alt29=3;
                }
                break;
            case LPAREN:
                {
                alt29=4;
                }
                break;
            case 69:
                {
                alt29=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // ShellCommand.g:648:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2037);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:649:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2051);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:650:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2063);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:651:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2074); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2078);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2080); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:652:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2092);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:653:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2104); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2106); if (state.failed) return n;

                    match(input,51,FOLLOW_51_in_primaryExpression2108); if (state.failed) return n;

                    // ShellCommand.g:653:36: ( LPAREN RPAREN )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==LPAREN) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ShellCommand.g:653:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2112); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2114); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // ShellCommand.g:655:7: ( AT 'pre' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==AT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ShellCommand.g:655:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2135); if (state.failed) return n;

                            match(input,87,FOLLOW_87_in_primaryExpression2137); if (state.failed) return n;

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
    // ShellCommand.g:659:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // ShellCommand.g:660:3: ( AT objectName= IDENT )
            // ShellCommand.g:661:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2164); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2172); if (state.failed) return n;

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
    // ShellCommand.g:675:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        ShellCommandParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // ShellCommand.g:676:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt30=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA30_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                alt30=2;
                }
                break;
            case 79:
            case 81:
            case 82:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // ShellCommand.g:680:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2237);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:683:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2250);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:684:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2263);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:685:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2276);
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
    // ShellCommand.g:694:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ShellCommandParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // ShellCommand.g:695:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // ShellCommand.g:696:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2311); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2318); if (state.failed) return n;

            // ShellCommand.g:698:5: (decls= elemVarsDeclaration BAR )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1 >= BAR && LA31_1 <= COLON)||LA31_1==COMMA) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ShellCommand.g:698:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2329);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2333); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2344);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2350); if (state.failed) return n;

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
    // ShellCommand.g:712:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:712:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // ShellCommand.g:713:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,74,FOLLOW_74_in_iterateExpression2382); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2388); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2396);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2398); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2406);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2408); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2416);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2422); if (state.failed) return n;

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
    // ShellCommand.g:734:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final ShellCommandParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ShellCommandParser.operationExpression_return retval = new ShellCommandParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ShellCommandParser.expression_return rolename =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:736:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // ShellCommand.g:737:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2466); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // ShellCommand.g:743:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LBRACK) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ShellCommand.g:743:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2488); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2501);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // ShellCommand.g:745:9: ( COMMA rolename= expression )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==COMMA) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ShellCommand.g:745:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2514); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2518);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2530); if (state.failed) return retval;

                    // ShellCommand.g:748:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LBRACK) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ShellCommand.g:748:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2547); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2562);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // ShellCommand.g:750:11: ( COMMA rolename= expression )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ShellCommand.g:750:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2577); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2581);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2595); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // ShellCommand.g:755:5: ( AT 'pre' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ShellCommand.g:755:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2620); if (state.failed) return retval;

                    match(input,87,FOLLOW_87_in_operationExpression2622); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // ShellCommand.g:757:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LPAREN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ShellCommand.g:758:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2647); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // ShellCommand.g:759:7: (e= expression ( COMMA e= expression )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==AT||LA38_0==HASH||(LA38_0 >= IDENT && LA38_0 <= INT)||(LA38_0 >= LPAREN && LA38_0 <= MINUS)||LA38_0==PLUS||LA38_0==REAL||LA38_0==STRING||(LA38_0 >= 44 && LA38_0 <= 50)||LA38_0==66||LA38_0==69||(LA38_0 >= 74 && LA38_0 <= 75)||(LA38_0 >= 77 && LA38_0 <= 83)||LA38_0==90) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ShellCommand.g:760:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2668);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // ShellCommand.g:761:7: ( COMMA e= expression )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==COMMA) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ShellCommand.g:761:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2680); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2684);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2704); if (state.failed) return retval;

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
    // ShellCommand.g:774:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // ShellCommand.g:777:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // ShellCommand.g:778:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==79||(input.LA(1) >= 81 && input.LA(1) <= 82) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2769); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2773);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2775); if (state.failed) return n;

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
    // ShellCommand.g:789:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // ShellCommand.g:790:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // ShellCommand.g:791:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2813); if (state.failed) return n;

            // ShellCommand.g:792:17: ( COLON t= type )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==COLON) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ShellCommand.g:792:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2816); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2820);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // ShellCommand.g:793:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ShellCommand.g:793:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2830); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2836); if (state.failed) return n;

            	    // ShellCommand.g:793:24: ( COLON tN= type )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==COLON) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ShellCommand.g:793:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2839); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2845);
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
            	    break loop42;
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
    // ShellCommand.g:801:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:802:5: (name= IDENT COLON t= type EQUAL e= expression )
            // ShellCommand.g:803:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2873); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2875); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2879);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2881); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2885);
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
    // ShellCommand.g:812:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ShellCommandParser.expression_return cond =null;

        ShellCommandParser.expression_return t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:813:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // ShellCommand.g:814:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,69,FOLLOW_69_in_ifExpression2917); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2921);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,89,FOLLOW_89_in_ifExpression2923); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2927);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_ifExpression2929); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2933);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,64,FOLLOW_64_in_ifExpression2935); if (state.failed) return n;

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
    // ShellCommand.g:833:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
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
            // ShellCommand.g:834:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt43=11;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt43=1;
                }
                break;
            case 66:
                {
                alt43=2;
                }
                break;
            case INT:
                {
                alt43=3;
                }
                break;
            case REAL:
                {
                alt43=4;
                }
                break;
            case STRING:
                {
                alt43=5;
                }
                break;
            case HASH:
                {
                alt43=6;
                }
                break;
            case IDENT:
                {
                alt43=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA43_8 = input.LA(2);

                if ( (LA43_8==LPAREN) ) {
                    alt43=9;
                }
                else if ( (LA43_8==LBRACE) ) {
                    alt43=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 80:
                {
                alt43=9;
                }
                break;
            case 50:
            case 78:
            case 83:
                {
                alt43=10;
                }
                break;
            case 49:
                {
                alt43=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // ShellCommand.g:835:7: t= 'true'
                    {
                    t=(Token)match(input,90,FOLLOW_90_in_literal2974); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:836:7: f= 'false'
                    {
                    f=(Token)match(input,66,FOLLOW_66_in_literal2988); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:837:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3001); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:838:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3016); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:839:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3030); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:840:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3040); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3044); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // ShellCommand.g:841:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3056); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3058); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3062); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:842:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3074);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:843:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3086);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:844:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3098);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:845:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3110);
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
    // ShellCommand.g:853:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // ShellCommand.g:855:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // ShellCommand.g:856:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3177); if (state.failed) return n;

            // ShellCommand.g:860:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AT||LA45_0==HASH||(LA45_0 >= IDENT && LA45_0 <= INT)||(LA45_0 >= LPAREN && LA45_0 <= MINUS)||LA45_0==PLUS||LA45_0==REAL||LA45_0==STRING||(LA45_0 >= 44 && LA45_0 <= 50)||LA45_0==66||LA45_0==69||(LA45_0 >= 74 && LA45_0 <= 75)||(LA45_0 >= 77 && LA45_0 <= 83)||LA45_0==90) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ShellCommand.g:861:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3194);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // ShellCommand.g:862:7: ( COMMA ci= collectionItem )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==COMMA) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ShellCommand.g:862:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3207); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3211);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3230); if (state.failed) return n;

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
    // ShellCommand.g:871:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ShellCommandParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // ShellCommand.g:873:5: (e= expression ( DOTDOT e= expression )? )
            // ShellCommand.g:874:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3259);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // ShellCommand.g:875:5: ( DOTDOT e= expression )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DOTDOT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ShellCommand.g:875:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3270); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3274);
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
    // ShellCommand.g:885:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // ShellCommand.g:886:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==80) ) {
                alt47=1;
            }
            else if ( ((LA47_0 >= 44 && LA47_0 <= 48)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // ShellCommand.g:887:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,80,FOLLOW_80_in_emptyCollectionLiteral3303); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3305); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3309);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3311); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:890:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3327);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3329); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3331); if (state.failed) return n;

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
    // ShellCommand.g:901:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // ShellCommand.g:902:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt48=1;
                }
                break;
            case 50:
                {
                alt48=2;
                }
                break;
            case 78:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==LPAREN) ) {
                    alt48=3;
                }
                else if ( (LA48_3==EOF||LA48_3==ARROW||LA48_3==BAR||(LA48_3 >= COMMA && LA48_3 <= EQUAL)||(LA48_3 >= GREATER && LA48_3 <= GREATER_EQUAL)||LA48_3==IDENT||LA48_3==LBRACE||(LA48_3 >= LESS && LA48_3 <= LESS_EQUAL)||LA48_3==MINUS||(LA48_3 >= NOT_EQUAL && LA48_3 <= PLUS)||(LA48_3 >= RBRACE && LA48_3 <= RBRACK)||(LA48_3 >= RPAREN && LA48_3 <= SLASH)||LA48_3==STAR||(LA48_3 >= 52 && LA48_3 <= 53)||LA48_3==56||(LA48_3 >= 58 && LA48_3 <= 65)||(LA48_3 >= 70 && LA48_3 <= 72)||LA48_3==75||LA48_3==86||(LA48_3 >= 88 && LA48_3 <= 89)||LA48_3==92) ) {
                    alt48=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // ShellCommand.g:903:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,83,FOLLOW_83_in_undefinedLiteral3361); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3363); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3367);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3369); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:906:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral3383); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:909:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3397); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3399); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3403);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3405); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:912:5: 'null'
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3419); if (state.failed) return n;

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
    // ShellCommand.g:922:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // ShellCommand.g:924:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // ShellCommand.g:925:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral3458); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3464); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3472);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // ShellCommand.g:928:5: ( COMMA ti= tupleItem )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ShellCommand.g:928:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3483); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3487);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3498); if (state.failed) return n;

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
    // ShellCommand.g:936:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:937:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // ShellCommand.g:938:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3529); if (state.failed) return n;

            // ShellCommand.g:939:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred6_ShellCommand()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA50_0==EQUAL) ) {
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
                    // ShellCommand.g:942:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3568); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3572);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3574); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3578);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:945:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3610);
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
    // ShellCommand.g:956:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // ShellCommand.g:958:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // ShellCommand.g:959:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // ShellCommand.g:960:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt51=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt51=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt51=2;
                }
                break;
            case 49:
                {
                alt51=3;
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
                    // ShellCommand.g:961:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3676);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:962:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3688);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:963:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3700);
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
    // ShellCommand.g:968:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // ShellCommand.g:969:5: (nT= type EOF )
            // ShellCommand.g:970:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3732);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3734); if (state.failed) return n;

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
    // ShellCommand.g:980:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // ShellCommand.g:981:5: (name= IDENT )
            // ShellCommand.g:982:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3762); if (state.failed) return n;

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
    // ShellCommand.g:990:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // ShellCommand.g:992:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // ShellCommand.g:993:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3827); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3831);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3833); if (state.failed) return n;

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
    // ShellCommand.g:1003:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // ShellCommand.g:1005:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // ShellCommand.g:1006:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType3867); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3869); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3878);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // ShellCommand.g:1008:5: ( COMMA tp= tuplePart )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ShellCommand.g:1008:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3889); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3893);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3905); if (state.failed) return n;

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
    // ShellCommand.g:1017:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:1018:5: (name= IDENT COLON t= type )
            // ShellCommand.g:1019:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3937); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3939); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3943);
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



    // $ANTLR start "statOnly"
    // ShellCommand.g:1058:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:1059:3: (s= stat EOF )
            // ShellCommand.g:1060:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly3992);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly3996); if (state.failed) return n;

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
    // ShellCommand.g:1070:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final ShellCommandParser.stat_return stat() throws RecognitionException {
        ShellCommandParser.stat_return retval = new ShellCommandParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:1074:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // ShellCommand.g:1075:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat4027);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:1076:3: ( SEMI nextStat[seq] )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==SEMI) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ShellCommand.g:1077:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat4038); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat4044);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ShellCommand.g:1093:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final ShellCommandParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextStat_return retval = new ShellCommandParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // ShellCommand.g:1094:3: (s= singleStat )
            // ShellCommand.g:1095:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat4078);
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
    // ShellCommand.g:1107:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // ShellCommand.g:1111:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt54=11;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EOF||LA54_0==SEMI||(LA54_0 >= 62 && LA54_0 <= 63)) ) {
                alt54=1;
            }
            else if ( (LA54_0==75) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==MINUS||LA54_0==PLUS||LA54_0==77) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==90) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==66) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==INT) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==REAL) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==STRING) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==HASH) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==IDENT) ) {
                int LA54_13 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt54=2;
                }
                else if ( (true) ) {
                    alt54=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==44||(LA54_0 >= 46 && LA54_0 <= 48)) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==80) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==45) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==83) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==50) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==78) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==49) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==AT) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==74) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==79||(LA54_0 >= 81 && LA54_0 <= 82)) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==LPAREN) && (synpred7_ShellCommand())) {
                alt54=2;
            }
            else if ( (LA54_0==69) ) {
                int LA54_25 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt54=2;
                }
                else if ( (true) ) {
                    alt54=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==76) ) {
                alt54=4;
            }
            else if ( (LA54_0==59) ) {
                alt54=5;
            }
            else if ( (LA54_0==72) ) {
                alt54=6;
            }
            else if ( (LA54_0==58) ) {
                alt54=7;
            }
            else if ( (LA54_0==67) ) {
                alt54=9;
            }
            else if ( (LA54_0==91) ) {
                alt54=10;
            }
            else if ( (LA54_0==54) ) {
                alt54=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // ShellCommand.g:1112:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4115);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1114:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4141);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1115:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4153);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1116:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4167);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:1117:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4181);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:1118:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4194);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:1119:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4211);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:1120:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4228);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:1121:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4245);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:1123:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4267);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:1124:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat4285);
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
    // ShellCommand.g:1131:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // ShellCommand.g:1132:3: ( nothing )
            // ShellCommand.g:1133:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4312);
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
    // ShellCommand.g:1138:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // ShellCommand.g:1139:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // ShellCommand.g:1140:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4338);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1141:3: (aas= attAssignStat[$expr.n] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DOT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ShellCommand.g:1142:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4352);
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
    // ShellCommand.g:1154:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ShellCommandParser.rValue_return rVal =null;


        try {
            // ShellCommand.g:1155:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // ShellCommand.g:1156:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4390); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4394); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat4402);
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
    // ShellCommand.g:1224:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ShellCommandParser.rValue_return r =null;


        try {
            // ShellCommand.g:1225:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // ShellCommand.g:1226:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4433); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4442); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4446); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat4454);
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
    // ShellCommand.g:1238:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1239:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // ShellCommand.g:1240:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,76,FOLLOW_76_in_objCreateStat4480); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat4488);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1242:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LPAREN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ShellCommand.g:1243:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4498); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4510);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4516); if (state.failed) return n;

                    }
                    break;

            }


            // ShellCommand.g:1248:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ShellCommand.g:1249:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,55,FOLLOW_55_in_objCreateStat4534); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4542); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4556);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4564); if (state.failed) return n;

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
    // ShellCommand.g:1268:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final ShellCommandParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        ShellCommandParser.objDestroyStat_return retval = new ShellCommandParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1269:3: ( 'destroy' el= exprListMin1 )
            // ShellCommand.g:1270:3: 'destroy' el= exprListMin1
            {
            match(input,59,FOLLOW_59_in_objDestroyStat4600); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat4608);
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
    // ShellCommand.g:1291:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1292:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // ShellCommand.g:1293:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,72,FOLLOW_72_in_lnkInsStat4634); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat4638); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4648);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat4652); if (state.failed) return n;

            match(input,73,FOLLOW_73_in_lnkInsStat4656); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat4664); if (state.failed) return n;

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
    // ShellCommand.g:1303:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final ShellCommandParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return retval = new ShellCommandParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ShellCommandParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // ShellCommand.g:1309:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // ShellCommand.g:1310:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4693);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // ShellCommand.g:1311:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LBRACE) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ShellCommand.g:1312:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4704); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4713);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4720); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4736); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4747);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // ShellCommand.g:1324:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LBRACE) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ShellCommand.g:1325:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4758); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4767);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4774); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // ShellCommand.g:1334:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ShellCommand.g:1335:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4796); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4811);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // ShellCommand.g:1339:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==LBRACE) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ShellCommand.g:1340:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4831); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4842);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4851); if (state.failed) return retval;

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
            	    break loop61;
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
    // ShellCommand.g:1355:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1356:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // ShellCommand.g:1357:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,58,FOLLOW_58_in_lnkDelStat4892); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat4896); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4906);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat4910); if (state.failed) return n;

            match(input,68,FOLLOW_68_in_lnkDelStat4914); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat4923); if (state.failed) return n;

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
    // ShellCommand.g:1371:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // ShellCommand.g:1375:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // ShellCommand.g:1376:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,69,FOLLOW_69_in_condExStat4954); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat4963);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,89,FOLLOW_89_in_condExStat4967); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat4976);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // ShellCommand.g:1380:3: ( 'else' es= statOrImplicitBlock )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ShellCommand.g:1381:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,62,FOLLOW_62_in_condExStat4987); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat4999);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,63,FOLLOW_63_in_condExStat5011); if (state.failed) return n;

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
    // ShellCommand.g:1392:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1393:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1394:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,67,FOLLOW_67_in_iterStat5036); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5044); if (state.failed) return n;

            match(input,71,FOLLOW_71_in_iterStat5048); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat5056);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_iterStat5060); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5068);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,63,FOLLOW_63_in_iterStat5073); if (state.failed) return n;

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
    // ShellCommand.g:1409:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1410:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1411:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,91,FOLLOW_91_in_whileStat5099); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat5107);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_whileStat5111); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5119);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,63,FOLLOW_63_in_whileStat5124); if (state.failed) return n;

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
    // ShellCommand.g:1423:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // ShellCommand.g:1427:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // ShellCommand.g:1428:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,54,FOLLOW_54_in_blockStat5154); if (state.failed) return n;

            // ShellCommand.g:1429:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==57) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ShellCommand.g:1429:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,57,FOLLOW_57_in_blockStat5159); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat5165);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // ShellCommand.g:1429:72: ( COMMA vd1= variableDeclaration )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==COMMA) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ShellCommand.g:1429:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat5171); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat5177);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat5184); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat5194);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,63,FOLLOW_63_in_blockStat5199); if (state.failed) return n;

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
    // ShellCommand.g:1438:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // ShellCommand.g:1442:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // ShellCommand.g:1443:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,57,FOLLOW_57_in_implicitBlockStat5225); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5231);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // ShellCommand.g:1443:71: ( COMMA vd1= variableDeclaration )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ShellCommand.g:1443:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5237); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5243);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5250); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat5258);
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
    // ShellCommand.g:1447:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // ShellCommand.g:1448:3: ( (s1= stat |s2= implicitBlockStat ) )
            // ShellCommand.g:1449:3: (s1= stat |s2= implicitBlockStat )
            {
            // ShellCommand.g:1449:3: (s1= stat |s2= implicitBlockStat )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==AT||LA66_0==HASH||(LA66_0 >= IDENT && LA66_0 <= INT)||(LA66_0 >= LPAREN && LA66_0 <= MINUS)||LA66_0==PLUS||LA66_0==REAL||LA66_0==SEMI||LA66_0==STRING||(LA66_0 >= 44 && LA66_0 <= 50)||LA66_0==54||(LA66_0 >= 58 && LA66_0 <= 59)||(LA66_0 >= 62 && LA66_0 <= 63)||(LA66_0 >= 66 && LA66_0 <= 67)||LA66_0==69||LA66_0==72||(LA66_0 >= 74 && LA66_0 <= 83)||(LA66_0 >= 90 && LA66_0 <= 91)) ) {
                alt66=1;
            }
            else if ( (LA66_0==57) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // ShellCommand.g:1449:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock5281);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1449:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5291);
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
    // ShellCommand.g:1463:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // ShellCommand.g:1464:1: ()
            // ShellCommand.g:1465:1: 
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
    // ShellCommand.g:1471:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ShellCommandParser.rValue_return rValue() throws RecognitionException {
        ShellCommandParser.rValue_return retval = new ShellCommandParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // ShellCommand.g:1472:5: (e= inSoilExpression |oc= objCreateStat )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==AT||LA67_0==HASH||(LA67_0 >= IDENT && LA67_0 <= INT)||(LA67_0 >= LPAREN && LA67_0 <= MINUS)||LA67_0==PLUS||LA67_0==REAL||LA67_0==STRING||(LA67_0 >= 44 && LA67_0 <= 50)||LA67_0==66||LA67_0==69||(LA67_0 >= 74 && LA67_0 <= 75)||(LA67_0 >= 77 && LA67_0 <= 83)||LA67_0==90) ) {
                alt67=1;
            }
            else if ( (LA67_0==76) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // ShellCommand.g:1473:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5337);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1474:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5349);
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
    // ShellCommand.g:1488:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // ShellCommand.g:1489:3: ( nothing |rl= rValListMin1 )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RBRACE) ) {
                alt68=1;
            }
            else if ( (LA68_0==AT||LA68_0==HASH||(LA68_0 >= IDENT && LA68_0 <= INT)||(LA68_0 >= LPAREN && LA68_0 <= MINUS)||LA68_0==PLUS||LA68_0==REAL||LA68_0==STRING||(LA68_0 >= 44 && LA68_0 <= 50)||LA68_0==66||LA68_0==69||(LA68_0 >= 74 && LA68_0 <= 83)||LA68_0==90) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // ShellCommand.g:1490:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5372);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1493:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5399);
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
    // ShellCommand.g:1501:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ShellCommandParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1505:3: (r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1506:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15432);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // ShellCommand.g:1508:3: ( COMMA r= rValue )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ShellCommand.g:1509:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15446); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin15456);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // ShellCommand.g:1519:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ShellCommandParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1523:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1524:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25495);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25503); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin25511);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // ShellCommand.g:1529:3: ( COMMA r= rValue )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ShellCommand.g:1530:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25525); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin25535);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // ShellCommand.g:1540:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:1541:3: (e= expression )
            // ShellCommand.g:1542:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression5569);
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
    // ShellCommand.g:1551:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1552:3: ( nothing |el= exprListMin1 )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RPAREN) ) {
                alt71=1;
            }
            else if ( (LA71_0==AT||LA71_0==HASH||(LA71_0 >= IDENT && LA71_0 <= INT)||(LA71_0 >= LPAREN && LA71_0 <= MINUS)||LA71_0==PLUS||LA71_0==REAL||LA71_0==STRING||(LA71_0 >= 44 && LA71_0 <= 50)||LA71_0==66||LA71_0==69||(LA71_0 >= 74 && LA71_0 <= 75)||(LA71_0 >= 77 && LA71_0 <= 83)||LA71_0==90) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // ShellCommand.g:1553:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList5598);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1556:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList5616);
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
    // ShellCommand.g:1564:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1568:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1569:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin15649);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1571:3: ( COMMA e= inSoilExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ShellCommand.g:1572:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin15664); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin15674);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // ShellCommand.g:1582:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1586:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1587:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25714);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin25722); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25730);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1592:3: ( COMMA e= inSoilExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ShellCommand.g:1593:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin25744); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin25754);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // ShellCommand.g:1603:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // ShellCommand.g:1604:3: ( nothing |il= identListMin1 )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==EOF||LA74_0==RBRACE||(LA74_0 >= RPAREN && LA74_0 <= SEMI)||(LA74_0 >= 62 && LA74_0 <= 63)) ) {
                alt74=1;
            }
            else if ( (LA74_0==IDENT) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // ShellCommand.g:1605:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList5784);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1608:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList5801);
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
    // ShellCommand.g:1616:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // ShellCommand.g:1620:3: (id= IDENT ( COMMA id= IDENT )* )
            // ShellCommand.g:1621:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15835); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // ShellCommand.g:1623:3: ( COMMA id= IDENT )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ShellCommand.g:1624:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin15849); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15859); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop75;
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

    // $ANTLR start synpred1_ShellCommand
    public final void synpred1_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:87:3: ( stat )
        // ShellCommand.g:87:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred1_ShellCommand57);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_ShellCommand

    // $ANTLR start synpred2_ShellCommand
    public final void synpred2_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:90:3: ( legacyStat )
        // ShellCommand.g:90:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred2_ShellCommand78);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_ShellCommand

    // $ANTLR start synpred3_ShellCommand
    public final void synpred3_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:100:3: ( legacyStat )
        // ShellCommand.g:100:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_ShellCommand110);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_ShellCommand

    // $ANTLR start synpred4_ShellCommand
    public final void synpred4_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:103:3: ( stat )
        // ShellCommand.g:103:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred4_ShellCommand133);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_ShellCommand

    // $ANTLR start synpred5_ShellCommand
    public final void synpred5_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:351:13: ( inSoilExpression )
        // ShellCommand.g:351:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred5_ShellCommand813);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_ShellCommand

    // $ANTLR start synpred6_ShellCommand
    public final void synpred6_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:942:7: ( COLON type EQUAL )
        // ShellCommand.g:942:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred6_ShellCommand3559); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred6_ShellCommand3561);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred6_ShellCommand3563); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_ShellCommand

    // $ANTLR start synpred7_ShellCommand
    public final void synpred7_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:1114:5: ( statStartingWithExpr )
        // ShellCommand.g:1114:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4133);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_ShellCommand

    // Delegated rules

    public final boolean synpred7_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stat_in_shellCommandOnly65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat206 = new BitSet(new long[]{0x0D20000000000002L,0x0000000001000902L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat217 = new BitSet(new long[]{0x0D20000000000002L,0x0000000001000902L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat251 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_singleLegacyStat392 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat396 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_legacyCreate472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate480 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_legacyCreateAssign529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign541 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_legacyCreateAssign545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_legacyCreateInsert587 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert595 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert607 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_legacyCreateInsert611 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert615 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_legacyLet662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet670 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_legacyLet680 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_legacyLet690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet699 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_legacyOpEnter740 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter756 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter760 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_legacyOpExit809 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_legacyExecute858 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_legacyExecute862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_expression946 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression957 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression961 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression970 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_expression974 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression1012 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1024 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1028 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression1032 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1037 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_expression1041 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_expression1082 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1131 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1148 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1164 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1213 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1227 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1260 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_conditionalImpliesExpression1313 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalOrExpression1375 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1423 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_conditionalXOrExpression1436 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1440 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1484 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalAndExpression1497 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1501 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1549 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1568 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1578 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1627 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1645 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1663 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1713 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1731 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1741 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1791 = new BitSet(new long[]{0x1000014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1809 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1823 = new BitSet(new long[]{0x1000014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1885 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FE424L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1962 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1980 = new BitSet(new long[]{0x0000000000080000L,0x0000000000068400L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1986 = new BitSet(new long[]{0x0000000000080000L,0x0000000000068400L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1997 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2074 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2078 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2106 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primaryExpression2108 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2112 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2114 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_primaryExpression2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2311 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2318 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2333 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_queryExpression2344 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_iterateExpression2382 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2396 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2398 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2408 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2466 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2488 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2501 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2514 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2518 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2530 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2547 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2562 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2577 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2581 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2595 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_operationExpression2622 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2647 = new BitSet(new long[]{0x0007F218861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2668 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2680 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_operationExpression2684 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2753 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2769 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2773 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2813 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2816 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2820 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2836 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2839 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2845 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2873 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2875 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2879 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2881 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ifExpression2917 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ifExpression2923 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2927 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression2929 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_ifExpression2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifExpression2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_literal2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_literal2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3040 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3056 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3058 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3177 = new BitSet(new long[]{0x0007F20A861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3194 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3207 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3211 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3259 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3270 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_collectionItem3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_emptyCollectionLiteral3303 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3305 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3309 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3327 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3329 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_undefinedLiteral3361 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3363 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3367 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3397 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3399 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3403 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral3458 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3472 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3483 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3487 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3529 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3568 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3572 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3574 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_tupleItem3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3600 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_expression_in_tupleItem3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3800 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3827 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3831 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType3867 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3878 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3893 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3937 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3939 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat4027 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat4038 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_nextStat_in_stat4044 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4338 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4390 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4394 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4433 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4442 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4446 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_objCreateStat4480 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4488 = new BitSet(new long[]{0x0080000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4498 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4510 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4516 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_objCreateStat4534 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4542 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4556 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_objDestroyStat4600 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_lnkInsStat4634 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat4638 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4648 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_lnkInsStat4656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4693 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4704 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4713 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4720 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4736 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4747 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4758 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4767 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4774 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4796 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4811 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4831 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4842 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4851 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_58_in_lnkDelStat4892 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat4896 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4906 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat4910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_lnkDelStat4914 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_condExStat4954 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat4963 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_condExStat4967 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat4976 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_62_in_condExStat4987 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat4999 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_condExStat5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterStat5036 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat5044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterStat5048 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat5056 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_iterStat5060 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5068 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_iterStat5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_whileStat5099 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5107 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_whileStat5111 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5119 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_whileStat5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_blockStat5154 = new BitSet(new long[]{0x0E47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_57_in_blockStat5159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5165 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat5171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5177 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat5184 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_stat_in_blockStat5194 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_blockStat5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_implicitBlockStat5225 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5231 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5243 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5250 = new BitSet(new long[]{0x0C47F208861A0020L,0x000000000C0FFD2CL});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15432 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15446 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15456 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25495 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25503 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25511 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25525 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FFC24L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25535 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15649 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin15664 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15674 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25714 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25722 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25730 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25744 = new BitSet(new long[]{0x0007F208861A0020L,0x00000000040FEC24L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25754 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15835 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin15849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15859 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_stat_in_synpred1_ShellCommand57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred2_ShellCommand78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_ShellCommand110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred4_ShellCommand133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred5_ShellCommand813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred6_ShellCommand3559 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred6_ShellCommand3561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred6_ShellCommand3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4133 = new BitSet(new long[]{0x0000000000000002L});

}