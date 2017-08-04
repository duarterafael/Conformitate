// $ANTLR 3.4 Soil.g 2013-06-12 12:17:37

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
 
package org.tzi.use.parser.soil;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SoilParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'begin'", "'between'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'then'", "'true'", "'while'", "'xor'"
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


    public SoilParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SoilParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SoilParser.tokenNames; }
    public String getGrammarFileName() { return "Soil.g"; }



    // $ANTLR start "statOnly"
    // Soil.g:116:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        SoilParser.stat_return s =null;


        try {
            // Soil.g:117:3: (s= stat EOF )
            // Soil.g:118:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly76);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly80); if (state.failed) return n;

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
    // Soil.g:128:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final SoilParser.stat_return stat() throws RecognitionException {
        SoilParser.stat_return retval = new SoilParser.stat_return();
        retval.start = input.LT(1);



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // Soil.g:132:3: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // Soil.g:133:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat111);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;

            // Soil.g:134:3: ( SEMI nextStat[seq] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMI) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Soil.g:135:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat122); if (state.failed) return retval;

            	    pushFollow(FOLLOW_nextStat_in_stat128);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // Soil.g:151:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final SoilParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        SoilParser.nextStat_return retval = new SoilParser.nextStat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;


        try {
            // Soil.g:152:3: (s= singleStat )
            // Soil.g:153:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat162);
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
    // Soil.g:165:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ASTStatement sse =null;

        ASTStatement vas =null;

        ASTStatement ocs =null;

        SoilParser.objDestroyStat_return ods =null;

        ASTLinkInsertionStatement lis =null;

        ASTLinkDeletionStatement lds =null;

        ASTConditionalExecutionStatement ces =null;

        ASTIterationStatement its =null;

        ASTWhileStatement whs =null;

        ASTBlockStatement blk =null;


        try {
            // Soil.g:169:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt2=11;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==SEMI||(LA2_0 >= 60 && LA2_0 <= 61)) ) {
                alt2=1;
            }
            else if ( (LA2_0==72) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==74) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==84) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==63) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==INT) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==REAL) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==STRING) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==HASH) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==IDENT) ) {
                int LA2_13 = input.LA(2);

                if ( (synpred1_Soil()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==77) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==45) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==80) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==50) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==75) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==49) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==AT) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==71) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==76||(LA2_0 >= 78 && LA2_0 <= 79)) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==LPAREN) && (synpred1_Soil())) {
                alt2=2;
            }
            else if ( (LA2_0==66) ) {
                int LA2_25 = input.LA(2);

                if ( (synpred1_Soil()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 25, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==73) ) {
                alt2=4;
            }
            else if ( (LA2_0==57) ) {
                alt2=5;
            }
            else if ( (LA2_0==69) ) {
                alt2=6;
            }
            else if ( (LA2_0==56) ) {
                alt2=7;
            }
            else if ( (LA2_0==64) ) {
                alt2=9;
            }
            else if ( (LA2_0==85) ) {
                alt2=10;
            }
            else if ( (LA2_0==53) ) {
                alt2=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Soil.g:170:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat199);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Soil.g:172:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat225);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = sse; }

                    }
                    break;
                case 3 :
                    // Soil.g:173:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat237);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Soil.g:174:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat251);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ocs; }

                    }
                    break;
                case 5 :
                    // Soil.g:175:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat265);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Soil.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat278);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lis; }

                    }
                    break;
                case 7 :
                    // Soil.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat295);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lds; }

                    }
                    break;
                case 8 :
                    // Soil.g:178:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat312);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = ces; }

                    }
                    break;
                case 9 :
                    // Soil.g:179:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat329);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = its; }

                    }
                    break;
                case 10 :
                    // Soil.g:181:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat351);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = whs; }

                    }
                    break;
                case 11 :
                    // Soil.g:182:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat369);
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
    // Soil.g:189:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Soil.g:190:3: ( nothing )
            // Soil.g:191:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat396);
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
    // Soil.g:196:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Soil.g:197:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Soil.g:198:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr422);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:199:3: (aas= attAssignStat[$expr.n] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DOT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Soil.g:200:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr436);
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
    // Soil.g:212:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        SoilParser.rValue_return rVal =null;


        try {
            // Soil.g:213:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Soil.g:214:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat474); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat478); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat486);
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
    // Soil.g:282:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        SoilParser.rValue_return r =null;


        try {
            // Soil.g:283:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Soil.g:284:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat517); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat526); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat530); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat538);
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
    // Soil.g:296:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:297:3: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Soil.g:298:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,73,FOLLOW_73_in_objCreateStat564); if (state.failed) return n;

            pushFollow(FOLLOW_simpleType_in_objCreateStat572);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:300:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Soil.g:301:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat582); if (state.failed) return n;

                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat594);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat600); if (state.failed) return n;

                    }
                    break;

            }


            // Soil.g:306:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Soil.g:307:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,54,FOLLOW_54_in_objCreateStat618); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat626); if (state.failed) return n;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat640);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat648); if (state.failed) return n;

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
    // Soil.g:326:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final SoilParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        SoilParser.objDestroyStat_return retval = new SoilParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Soil.g:327:3: ( 'destroy' el= exprListMin1 )
            // Soil.g:328:3: 'destroy' el= exprListMin1
            {
            match(input,57,FOLLOW_57_in_objDestroyStat684); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat692);
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
    // Soil.g:349:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;


        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:350:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Soil.g:351:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,69,FOLLOW_69_in_lnkInsStat718); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat722); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat732);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat736); if (state.failed) return n;

            match(input,70,FOLLOW_70_in_lnkInsStat740); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat748); if (state.failed) return n;

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
    // Soil.g:361:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final SoilParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        SoilParser.rValListMin2WithOptionalQualifiers_return retval = new SoilParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        SoilParser.rValue_return r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Soil.g:367:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Soil.g:368:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers777);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // Soil.g:369:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LBRACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Soil.g:370:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers788); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers797);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers804); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers820); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers831);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            // Soil.g:382:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LBRACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Soil.g:383:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers842); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers851);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers858); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Soil.g:392:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Soil.g:393:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers880); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers895);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add((r!=null?r.n:null)); }

            	    // Soil.g:397:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==LBRACE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Soil.g:398:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers915); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers926);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers935); if (state.failed) return retval;

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
            	    break loop9;
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
    // Soil.g:413:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;


        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Soil.g:414:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Soil.g:415:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,56,FOLLOW_56_in_lnkDelStat976); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat980); if (state.failed) return n;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat990);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat994); if (state.failed) return n;

            match(input,65,FOLLOW_65_in_lnkDelStat998); if (state.failed) return n;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat1007); if (state.failed) return n;

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
    // Soil.g:429:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Soil.g:433:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Soil.g:434:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,66,FOLLOW_66_in_condExStat1038); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat1047);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_condExStat1051); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1060);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            // Soil.g:438:3: ( 'else' es= statOrImplicitBlock )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==60) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Soil.g:439:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,60,FOLLOW_60_in_condExStat1071); if (state.failed) return n;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat1083);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,61,FOLLOW_61_in_condExStat1095); if (state.failed) return n;

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
    // Soil.g:450:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Soil.g:451:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Soil.g:452:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,64,FOLLOW_64_in_iterStat1120); if (state.failed) return n;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat1128); if (state.failed) return n;

            match(input,68,FOLLOW_68_in_iterStat1132); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat1140);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_iterStat1144); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat1152);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_iterStat1157); if (state.failed) return n;

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
    // Soil.g:467:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Soil.g:468:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Soil.g:469:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,85,FOLLOW_85_in_whileStat1183); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat1191);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_whileStat1195); if (state.failed) return n;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat1203);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_whileStat1208); if (state.failed) return n;

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
    // Soil.g:481:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ASTBlockStatement blockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        SoilParser.stat_return s =null;



          n = new ASTBlockStatement(org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Soil.g:485:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Soil.g:486:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,53,FOLLOW_53_in_blockStat1238); if (state.failed) return n;

            // Soil.g:487:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==55) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Soil.g:487:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,55,FOLLOW_55_in_blockStat1243); if (state.failed) return n;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat1249);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

                    // Soil.g:487:72: ( COMMA vd1= variableDeclaration )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Soil.g:487:74: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat1255); if (state.failed) return n;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat1261);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat1268); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat1278);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setBody((s!=null?s.n:null)); }

            match(input,61,FOLLOW_61_in_blockStat1283); if (state.failed) return n;

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
    // Soil.g:496:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ASTBlockStatement implicitBlockStat() throws RecognitionException {
        ASTBlockStatement n = null;


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        SoilParser.stat_return s =null;



          n = new ASTBlockStatement(false);

        try {
            // Soil.g:500:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Soil.g:501:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,55,FOLLOW_55_in_implicitBlockStat1309); if (state.failed) return n;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1315);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addVariableDeclaration(vd);}

            // Soil.g:501:71: ( COMMA vd1= variableDeclaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Soil.g:501:73: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat1321); if (state.failed) return n;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat1327);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat1334); if (state.failed) return n;

            pushFollow(FOLLOW_stat_in_implicitBlockStat1342);
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
    // Soil.g:505:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        SoilParser.stat_return s1 =null;

        ASTBlockStatement s2 =null;


        try {
            // Soil.g:506:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Soil.g:507:3: (s1= stat |s2= implicitBlockStat )
            {
            // Soil.g:507:3: (s1= stat |s2= implicitBlockStat )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AT||LA14_0==HASH||(LA14_0 >= IDENT && LA14_0 <= INT)||(LA14_0 >= LPAREN && LA14_0 <= MINUS)||LA14_0==PLUS||LA14_0==REAL||LA14_0==SEMI||LA14_0==STRING||(LA14_0 >= 44 && LA14_0 <= 50)||LA14_0==53||(LA14_0 >= 56 && LA14_0 <= 57)||(LA14_0 >= 60 && LA14_0 <= 61)||(LA14_0 >= 63 && LA14_0 <= 64)||LA14_0==66||LA14_0==69||(LA14_0 >= 71 && LA14_0 <= 80)||(LA14_0 >= 84 && LA14_0 <= 85)) ) {
                alt14=1;
            }
            else if ( (LA14_0==55) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Soil.g:507:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock1365);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Soil.g:507:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock1375);
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
    // Soil.g:521:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Soil.g:522:1: ()
            // Soil.g:523:1: 
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
    // Soil.g:529:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final SoilParser.rValue_return rValue() throws RecognitionException {
        SoilParser.rValue_return retval = new SoilParser.rValue_return();
        retval.start = input.LT(1);


        ASTExpression e =null;

        ASTStatement oc =null;


        try {
            // Soil.g:530:5: (e= inSoilExpression |oc= objCreateStat )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AT||LA15_0==HASH||(LA15_0 >= IDENT && LA15_0 <= INT)||(LA15_0 >= LPAREN && LA15_0 <= MINUS)||LA15_0==PLUS||LA15_0==REAL||LA15_0==STRING||(LA15_0 >= 44 && LA15_0 <= 50)||LA15_0==63||LA15_0==66||(LA15_0 >= 71 && LA15_0 <= 72)||(LA15_0 >= 74 && LA15_0 <= 80)||LA15_0==84) ) {
                alt15=1;
            }
            else if ( (LA15_0==73) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Soil.g:531:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue1421);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Soil.g:532:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue1433);
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
    // Soil.g:546:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Soil.g:547:3: ( nothing |rl= rValListMin1 )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RBRACE) ) {
                alt16=1;
            }
            else if ( (LA16_0==AT||LA16_0==HASH||(LA16_0 >= IDENT && LA16_0 <= INT)||(LA16_0 >= LPAREN && LA16_0 <= MINUS)||LA16_0==PLUS||LA16_0==REAL||LA16_0==STRING||(LA16_0 >= 44 && LA16_0 <= 50)||LA16_0==63||LA16_0==66||(LA16_0 >= 71 && LA16_0 <= 80)||LA16_0==84) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Soil.g:548:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList1456);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Soil.g:551:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList1483);
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
    // Soil.g:559:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        SoilParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:563:3: (r= rValue ( COMMA r= rValue )* )
            // Soil.g:564:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin11516);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // Soil.g:566:3: ( COMMA r= rValue )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Soil.g:567:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin11530); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin11540);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

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
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // Soil.g:577:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        SoilParser.rValue_return r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:581:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Soil.g:582:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin21579);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin21587); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin21595);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

            // Soil.g:587:3: ( COMMA r= rValue )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Soil.g:588:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin21609); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin21619);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add((r!=null?r.n:null)); }

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
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // Soil.g:598:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        SoilParser.expression_return e =null;


        try {
            // Soil.g:599:3: (e= expression )
            // Soil.g:600:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression1653);
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
    // Soil.g:609:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Soil.g:610:3: ( nothing |el= exprListMin1 )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF) ) {
                alt19=1;
            }
            else if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||LA19_0==STRING||(LA19_0 >= 44 && LA19_0 <= 50)||LA19_0==63||LA19_0==66||(LA19_0 >= 71 && LA19_0 <= 72)||(LA19_0 >= 74 && LA19_0 <= 80)||LA19_0==84) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Soil.g:611:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList1682);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Soil.g:614:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList1700);
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
    // Soil.g:622:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:626:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:627:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin11733);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Soil.g:629:3: ( COMMA e= inSoilExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Soil.g:630:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin11748); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin11758);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // Soil.g:640:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:644:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:645:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21798);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin21806); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21814);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Soil.g:650:3: ( COMMA e= inSoilExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Soil.g:651:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin21828); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin21838);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // Soil.g:661:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Soil.g:662:3: ( nothing |il= identListMin1 )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||LA22_0==RBRACE||LA22_0==SEMI||(LA22_0 >= 60 && LA22_0 <= 61)) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENT) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Soil.g:663:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList1868);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Soil.g:666:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList1885);
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
    // Soil.g:674:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Soil.g:678:3: (id= IDENT ( COMMA id= IDENT )* )
            // Soil.g:679:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11919); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Soil.g:681:3: ( COMMA id= IDENT )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Soil.g:682:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin11933); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11943); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

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
    // $ANTLR end "identListMin1"



    // $ANTLR start "expressionOnly"
    // Soil.g:719:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        SoilParser.expression_return nExp =null;


        try {
            // Soil.g:720:5: (nExp= expression EOF )
            // Soil.g:721:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly1982);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly1984); if (state.failed) return n;

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
    // Soil.g:728:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final SoilParser.expression_return expression() throws RecognitionException {
        SoilParser.expression_return retval = new SoilParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Soil.g:734:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Soil.g:735:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Soil.g:736:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==72) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Soil.g:737:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,72,FOLLOW_72_in_expression2032); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2043); if (state.failed) return retval;

            	    // Soil.g:738:18: ( COLON t= type )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==COLON) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Soil.g:738:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression2047); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression2051);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2056); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression2060);
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

            	    // Soil.g:748:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==COMMA) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // Soil.g:749:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression2098); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2110); if (state.failed) return retval;

            	    	    // Soil.g:750:20: ( COLON t= type )?
            	    	    int alt25=2;
            	    	    int LA25_0 = input.LA(1);

            	    	    if ( (LA25_0==COLON) ) {
            	    	        alt25=1;
            	    	    }
            	    	    switch (alt25) {
            	    	        case 1 :
            	    	            // Soil.g:750:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression2114); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression2118);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2123); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression2127);
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
            	    	    break loop26;
            	        }
            	    } while (true);


            	    match(input,68,FOLLOW_68_in_expression2168); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression2184);
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
    // Soil.g:782:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Soil.g:784:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Soil.g:785:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList2217); if (state.failed) return paramList;

            // Soil.g:786:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Soil.g:787:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList2234);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Soil.g:788:7: ( COMMA v= variableDeclaration )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Soil.g:788:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList2246); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList2250);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList2270); if (state.failed) return paramList;

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
    // Soil.g:796:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Soil.g:798:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Soil.g:799:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2299); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Soil.g:800:5: ( COMMA idn= IDENT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Soil.g:800:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList2309); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2313); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // Soil.g:808:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Soil.g:809:5: (name= IDENT COLON t= type )
            // Soil.g:810:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2344); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration2346); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration2350);
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
    // Soil.g:818:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:819:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Soil.g:820:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2386);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Soil.g:821:5: (op= 'implies' n1= conditionalOrExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==67) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Soil.g:821:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,67,FOLLOW_67_in_conditionalImpliesExpression2399); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2403);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // Soil.g:830:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:831:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Soil.g:832:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2448);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Soil.g:833:5: (op= 'or' n1= conditionalXOrExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==81) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Soil.g:833:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,81,FOLLOW_81_in_conditionalOrExpression2461); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2465);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Soil.g:842:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:843:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Soil.g:844:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2509);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Soil.g:845:5: (op= 'xor' n1= conditionalAndExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==86) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Soil.g:845:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalXOrExpression2522); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2526);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // Soil.g:854:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Soil.g:855:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Soil.g:856:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2570);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Soil.g:857:5: (op= 'and' n1= equalityExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Soil.g:857:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression2583); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2587);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // Soil.g:866:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:868:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Soil.g:869:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2635);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Soil.g:870:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==EQUAL||LA35_0==NOT_EQUAL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Soil.g:870:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2664);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // Soil.g:880:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:882:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Soil.g:883:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2713);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Soil.g:884:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0 >= GREATER && LA36_0 <= GREATER_EQUAL)||(LA36_0 >= LESS && LA36_0 <= LESS_EQUAL)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Soil.g:884:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2749);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // Soil.g:894:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:896:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Soil.g:897:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2799);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Soil.g:898:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==MINUS||LA37_0==PLUS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Soil.g:898:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2827);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // Soil.g:909:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Soil.g:911:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Soil.g:912:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2877);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Soil.g:913:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==SLASH||LA38_0==STAR||LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Soil.g:913:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==58 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2909);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // Soil.g:925:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Soil.g:927:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==MINUS||LA39_0==PLUS||LA39_0==74) ) {
                alt39=1;
            }
            else if ( (LA39_0==AT||LA39_0==HASH||(LA39_0 >= IDENT && LA39_0 <= INT)||LA39_0==LPAREN||LA39_0==REAL||LA39_0==STRING||(LA39_0 >= 44 && LA39_0 <= 50)||LA39_0==63||LA39_0==66||LA39_0==71||(LA39_0 >= 75 && LA39_0 <= 80)||LA39_0==84) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Soil.g:928:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Soil.g:928:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Soil.g:928:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==74 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2995);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Soil.g:932:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3015);
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
    // Soil.g:940:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Soil.g:942:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Soil.g:943:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression3048);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Soil.g:944:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==DOT) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==IDENT) ) {
                        int LA41_4 = input.LA(3);

                        if ( (LA41_4==EOF||(LA41_4 >= ARROW && LA41_4 <= BAR)||(LA41_4 >= COMMA && LA41_4 <= EQUAL)||(LA41_4 >= GREATER && LA41_4 <= GREATER_EQUAL)||(LA41_4 >= LBRACE && LA41_4 <= MINUS)||(LA41_4 >= NOT_EQUAL && LA41_4 <= PLUS)||(LA41_4 >= RBRACE && LA41_4 <= RBRACK)||(LA41_4 >= RPAREN && LA41_4 <= SLASH)||LA41_4==STAR||LA41_4==52||(LA41_4 >= 58 && LA41_4 <= 62)||(LA41_4 >= 67 && LA41_4 <= 68)||LA41_4==81||LA41_4==83||LA41_4==86) ) {
                            alt41=1;
                        }


                    }
                    else if ( (LA41_2==71||LA41_2==76||(LA41_2 >= 78 && LA41_2 <= 79)) ) {
                        alt41=1;
                    }


                }
                else if ( (LA41_0==ARROW) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Soil.g:945:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Soil.g:945:6: ( ARROW | DOT )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==ARROW) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==DOT) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // Soil.g:945:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression3066); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Soil.g:945:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression3072); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression3083);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // Soil.g:961:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        SoilParser.expression_return nExp =null;

        ASTExpression nIfExp =null;


        try {
            // Soil.g:962:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt44=6;
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
            case 63:
            case 75:
            case 77:
            case 80:
            case 84:
                {
                alt44=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt44=1;
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
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 67:
                case 68:
                case 81:
                case 83:
                case 86:
                    {
                    alt44=3;
                    }
                    break;
                case DOT:
                    {
                    int LA44_7 = input.LA(3);

                    if ( (LA44_7==51) ) {
                        alt44=6;
                    }
                    else if ( (LA44_7==IDENT||LA44_7==71||LA44_7==76||(LA44_7 >= 78 && LA44_7 <= 79)) ) {
                        alt44=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt44=2;
                }
                break;
            case 71:
            case 76:
            case 78:
            case 79:
                {
                alt44=3;
                }
                break;
            case LPAREN:
                {
                alt44=4;
                }
                break;
            case 66:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // Soil.g:963:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3123);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Soil.g:964:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression3137);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Soil.g:965:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression3149);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Soil.g:966:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3160); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression3164);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3166); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Soil.g:967:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression3178);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Soil.g:968:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3190); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3192); if (state.failed) return n;

                    match(input,51,FOLLOW_51_in_primaryExpression3194); if (state.failed) return n;

                    // Soil.g:968:36: ( LPAREN RPAREN )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LPAREN) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // Soil.g:968:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3198); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3200); if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Soil.g:970:7: ( AT 'pre' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==AT) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Soil.g:970:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression3221); if (state.failed) return n;

                            match(input,82,FOLLOW_82_in_primaryExpression3223); if (state.failed) return n;

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
    // Soil.g:974:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Soil.g:975:3: ( AT objectName= IDENT )
            // Soil.g:976:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference3250); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference3258); if (state.failed) return n;

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
    // Soil.g:990:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        SoilParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;


        try {
            // Soil.g:991:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] )
            int alt45=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA45_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }
                }
                break;
            case 71:
                {
                alt45=2;
                }
                break;
            case 76:
            case 78:
            case 79:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // Soil.g:995:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall3323);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Soil.g:998:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall3336);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Soil.g:999:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall3349);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Soil.g:1000:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall3362);
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
    // Soil.g:1009:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        SoilParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Soil.g:1010:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Soil.g:1011:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3397); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3404); if (state.failed) return n;

            // Soil.g:1013:5: (decls= elemVarsDeclaration BAR )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1 >= BAR && LA46_1 <= COLON)||LA46_1==COMMA) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // Soil.g:1013:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3415);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression3419); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression3430);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression3436); if (state.failed) return n;

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
    // Soil.g:1027:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        SoilParser.expression_return nExp =null;


        try {
            // Soil.g:1027:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Soil.g:1028:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,71,FOLLOW_71_in_iterateExpression3468); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression3474); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression3482);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression3484); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression3492);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression3494); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression3502);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression3508); if (state.failed) return n;

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
    // Soil.g:1049:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final SoilParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        SoilParser.operationExpression_return retval = new SoilParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        SoilParser.expression_return rolename =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1051:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Soil.g:1052:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression3552); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Soil.g:1058:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LBRACK) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Soil.g:1058:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3574); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression3587);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Soil.g:1060:9: ( COMMA rolename= expression )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // Soil.g:1060:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3600); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression3604);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3616); if (state.failed) return retval;

                    // Soil.g:1063:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==LBRACK) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // Soil.g:1063:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3633); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression3648);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Soil.g:1065:11: ( COMMA rolename= expression )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==COMMA) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // Soil.g:1065:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3663); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression3667);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3681); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Soil.g:1070:5: ( AT 'pre' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==AT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Soil.g:1070:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression3706); if (state.failed) return retval;

                    match(input,82,FOLLOW_82_in_operationExpression3708); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Soil.g:1072:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LPAREN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Soil.g:1073:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression3733); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Soil.g:1074:7: (e= expression ( COMMA e= expression )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AT||LA53_0==HASH||(LA53_0 >= IDENT && LA53_0 <= INT)||(LA53_0 >= LPAREN && LA53_0 <= MINUS)||LA53_0==PLUS||LA53_0==REAL||LA53_0==STRING||(LA53_0 >= 44 && LA53_0 <= 50)||LA53_0==63||LA53_0==66||(LA53_0 >= 71 && LA53_0 <= 72)||(LA53_0 >= 74 && LA53_0 <= 80)||LA53_0==84) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Soil.g:1075:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression3754);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Soil.g:1076:7: ( COMMA e= expression )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==COMMA) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // Soil.g:1076:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3766); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression3770);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression3790); if (state.failed) return retval;

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
    // Soil.g:1089:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Soil.g:1092:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // Soil.g:1093:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==76||(input.LA(1) >= 78 && input.LA(1) <= 79) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3855); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression3859);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3861); if (state.failed) return n;

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
    // Soil.g:1104:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Soil.g:1105:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Soil.g:1106:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3899); if (state.failed) return n;

            // Soil.g:1107:17: ( COLON t= type )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==COLON) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Soil.g:1107:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3902); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3906);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Soil.g:1108:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Soil.g:1108:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration3916); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3922); if (state.failed) return n;

            	    // Soil.g:1108:24: ( COLON tN= type )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==COLON) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // Soil.g:1108:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3925); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration3931);
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
            	    break loop57;
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
    // Soil.g:1116:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1117:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Soil.g:1118:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3959); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization3961); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization3965);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3967); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization3971);
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
    // Soil.g:1127:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        SoilParser.expression_return cond =null;

        SoilParser.expression_return t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1128:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Soil.g:1129:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,66,FOLLOW_66_in_ifExpression4003); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4007);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_ifExpression4009); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4013);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression4015); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4019);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_ifExpression4021); if (state.failed) return n;

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
    // Soil.g:1148:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral );
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
            // Soil.g:1149:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral )
            int alt58=11;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt58=1;
                }
                break;
            case 63:
                {
                alt58=2;
                }
                break;
            case INT:
                {
                alt58=3;
                }
                break;
            case REAL:
                {
                alt58=4;
                }
                break;
            case STRING:
                {
                alt58=5;
                }
                break;
            case HASH:
                {
                alt58=6;
                }
                break;
            case IDENT:
                {
                alt58=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA58_8 = input.LA(2);

                if ( (LA58_8==LPAREN) ) {
                    alt58=9;
                }
                else if ( (LA58_8==LBRACE) ) {
                    alt58=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 77:
                {
                alt58=9;
                }
                break;
            case 50:
            case 75:
            case 80:
                {
                alt58=10;
                }
                break;
            case 49:
                {
                alt58=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // Soil.g:1150:7: t= 'true'
                    {
                    t=(Token)match(input,84,FOLLOW_84_in_literal4060); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Soil.g:1151:7: f= 'false'
                    {
                    f=(Token)match(input,63,FOLLOW_63_in_literal4074); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Soil.g:1152:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal4087); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Soil.g:1153:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal4102); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Soil.g:1154:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal4116); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Soil.g:1155:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal4126); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4130); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Soil.g:1156:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4142); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal4144); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4148); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Soil.g:1157:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal4160);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Soil.g:1158:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal4172);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Soil.g:1159:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal4184);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Soil.g:1160:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal4196);
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
    // Soil.g:1168:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Soil.g:1170:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Soil.g:1171:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral4263); if (state.failed) return n;

            // Soil.g:1175:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AT||LA60_0==HASH||(LA60_0 >= IDENT && LA60_0 <= INT)||(LA60_0 >= LPAREN && LA60_0 <= MINUS)||LA60_0==PLUS||LA60_0==REAL||LA60_0==STRING||(LA60_0 >= 44 && LA60_0 <= 50)||LA60_0==63||LA60_0==66||(LA60_0 >= 71 && LA60_0 <= 72)||(LA60_0 >= 74 && LA60_0 <= 80)||LA60_0==84) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Soil.g:1176:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4280);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Soil.g:1177:7: ( COMMA ci= collectionItem )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // Soil.g:1177:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4293); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4297);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4316); if (state.failed) return n;

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
    // Soil.g:1186:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        SoilParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Soil.g:1188:5: (e= expression ( DOTDOT e= expression )? )
            // Soil.g:1189:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem4345);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Soil.g:1190:5: ( DOTDOT e= expression )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==DOTDOT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // Soil.g:1190:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4356); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem4360);
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
    // Soil.g:1200:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Soil.g:1201:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==77) ) {
                alt62=1;
            }
            else if ( ((LA62_0 >= 44 && LA62_0 <= 48)) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // Soil.g:1202:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,77,FOLLOW_77_in_emptyCollectionLiteral4389); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4391); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4395);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4397); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Soil.g:1205:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4413);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4415); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4417); if (state.failed) return n;

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
    // Soil.g:1216:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Soil.g:1217:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt63=1;
                }
                break;
            case 50:
                {
                alt63=2;
                }
                break;
            case 75:
                {
                int LA63_3 = input.LA(2);

                if ( (LA63_3==LPAREN) ) {
                    alt63=3;
                }
                else if ( (LA63_3==EOF||LA63_3==ARROW||LA63_3==BAR||(LA63_3 >= COMMA && LA63_3 <= EQUAL)||(LA63_3 >= GREATER && LA63_3 <= GREATER_EQUAL)||LA63_3==LBRACE||(LA63_3 >= LESS && LA63_3 <= LESS_EQUAL)||LA63_3==MINUS||(LA63_3 >= NOT_EQUAL && LA63_3 <= PLUS)||(LA63_3 >= RBRACE && LA63_3 <= RBRACK)||(LA63_3 >= RPAREN && LA63_3 <= SLASH)||LA63_3==STAR||LA63_3==52||(LA63_3 >= 58 && LA63_3 <= 62)||(LA63_3 >= 67 && LA63_3 <= 68)||LA63_3==81||LA63_3==83||LA63_3==86) ) {
                    alt63=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // Soil.g:1218:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,80,FOLLOW_80_in_undefinedLiteral4447); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4449); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral4453);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4455); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Soil.g:1221:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral4469); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Soil.g:1224:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,75,FOLLOW_75_in_undefinedLiteral4483); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4485); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral4489);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4491); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Soil.g:1227:5: 'null'
                    {
                    match(input,75,FOLLOW_75_in_undefinedLiteral4505); if (state.failed) return n;

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
    // Soil.g:1237:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Soil.g:1239:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Soil.g:1240:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral4544); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral4550); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral4558);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Soil.g:1243:5: ( COMMA ti= tupleItem )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Soil.g:1243:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral4569); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral4573);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral4584); if (state.failed) return n;

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
    // Soil.g:1251:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        SoilParser.expression_return e =null;


        try {
            // Soil.g:1252:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Soil.g:1253:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem4615); if (state.failed) return n;

            // Soil.g:1254:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==COLON) ) {
                int LA65_1 = input.LA(2);

                if ( (synpred2_Soil()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==EQUAL) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // Soil.g:1257:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem4654); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem4658);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem4660); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem4664);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Soil.g:1260:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem4696);
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
    // Soil.g:1271:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Soil.g:1273:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Soil.g:1274:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Soil.g:1275:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt66=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt66=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt66=2;
                }
                break;
            case 49:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // Soil.g:1276:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type4762);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Soil.g:1277:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type4774);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Soil.g:1278:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4786);
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
    // Soil.g:1283:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Soil.g:1284:5: (nT= type EOF )
            // Soil.g:1285:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4818);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly4820); if (state.failed) return n;

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
    // Soil.g:1295:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Soil.g:1296:5: (name= IDENT )
            // Soil.g:1297:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4848); if (state.failed) return n;

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
    // Soil.g:1305:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Soil.g:1307:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Soil.g:1308:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4913); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType4917);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4919); if (state.failed) return n;

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
    // Soil.g:1318:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Soil.g:1320:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Soil.g:1321:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType4953); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4955); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType4964);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Soil.g:1323:5: ( COMMA tp= tuplePart )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Soil.g:1323:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4975); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4979);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4991); if (state.failed) return n;

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
    // Soil.g:1332:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Soil.g:1333:5: (name= IDENT COLON t= type )
            // Soil.g:1334:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart5023); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart5025); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart5029);
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

    // $ANTLR start synpred1_Soil
    public final void synpred1_Soil_fragment() throws RecognitionException {
        // Soil.g:172:5: ( statStartingWithExpr )
        // Soil.g:172:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred1_Soil217);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Soil

    // $ANTLR start synpred2_Soil
    public final void synpred2_Soil_fragment() throws RecognitionException {
        // Soil.g:1257:7: ( COLON type EQUAL )
        // Soil.g:1257:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred2_Soil4645); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred2_Soil4647);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_Soil4649); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Soil

    // Delegated rules

    public final boolean synpred1_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stat_in_statOnly76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat111 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat122 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_nextStat_in_stat128 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_singleStat_in_nextStat162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr422 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat474 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat478 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat517 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat526 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat530 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_objCreateStat564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat572 = new BitSet(new long[]{0x0040000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat582 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat594 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat600 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_objCreateStat618 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat626 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_objDestroyStat684 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_lnkInsStat718 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat722 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat732 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_lnkInsStat740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers777 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers788 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers797 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers804 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers820 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers831 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers842 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers851 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers858 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers880 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers895 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers915 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers926 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers935 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_56_in_lnkDelStat976 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat980 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat990 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_lnkDelStat998 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_condExStat1038 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_condExStat1051 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1060 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_60_in_condExStat1071 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat1083 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_condExStat1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_iterStat1120 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterStat1132 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat1140 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_iterStat1144 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat1152 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_iterStat1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_whileStat1183 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat1191 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whileStat1195 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat1203 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_whileStat1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_blockStat1238 = new BitSet(new long[]{0x83A7F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_55_in_blockStat1243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat1249 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat1255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat1261 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat1268 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_stat_in_blockStat1278 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_blockStat1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_implicitBlockStat1309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1315 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat1321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat1327 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat1334 = new BitSet(new long[]{0x8327F208861A0020L,0x000000000031FFA5L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11516 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin11530 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11540 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21579 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21587 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21595 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21609 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FF84L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21619 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11733 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin11748 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11758 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21798 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21806 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21814 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21828 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21838 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11919 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin11933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11943 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_expressionOnly1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_expression2032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression2043 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression2047 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression2051 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2056 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_expression2060 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_expression2098 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression2110 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression2114 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression2118 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2123 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_expression2127 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expression2168 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList2217 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2234 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList2246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2250 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList2299 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList2309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList2313 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration2344 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration2346 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditionalImpliesExpression2399 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalOrExpression2461 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalXOrExpression2522 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2570 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalAndExpression2583 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2587 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2635 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression2654 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2664 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2713 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression2731 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2749 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2799 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression2817 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2827 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2877 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2895 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2909 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression2971 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FC84L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression3048 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression3066 = new BitSet(new long[]{0x0000000000080000L,0x000000000000D080L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression3072 = new BitSet(new long[]{0x0000000000080000L,0x000000000000D080L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression3083 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3160 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3164 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3192 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primaryExpression3194 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3198 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3200 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_primaryExpression3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference3250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression3397 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression3404 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression3419 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_queryExpression3430 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_iterateExpression3468 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression3474 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression3482 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression3484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression3492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression3494 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_iterateExpression3502 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression3552 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3574 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3587 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3600 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3604 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3616 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3633 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3648 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3663 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3667 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3681 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_operationExpression3708 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression3733 = new BitSet(new long[]{0x8007F218861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3754 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3766 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_operationExpression3770 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3855 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression3859 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3899 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3902 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3906 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration3916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3922 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3925 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3931 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3959 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3961 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3967 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifExpression4003 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression4007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ifExpression4009 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression4013 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression4015 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_ifExpression4019 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_literal4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_literal4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal4126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal4142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal4144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral4234 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral4263 = new BitSet(new long[]{0x8007F20A861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4280 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral4293 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4297 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem4345 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem4356 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_collectionItem4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_emptyCollectionLiteral4389 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4391 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4395 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4413 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4415 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_undefinedLiteral4447 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4449 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4453 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_undefinedLiteral4483 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4485 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4489 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_undefinedLiteral4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral4544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral4550 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4558 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral4569 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4573 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem4615 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem4654 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem4658 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem4660 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_tupleItem4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem4686 = new BitSet(new long[]{0x8007F208861A0020L,0x000000000011FD84L});
    public static final BitSet FOLLOW_expression_in_tupleItem4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4886 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4913 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType4917 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType4953 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4964 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4975 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4979 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart5023 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart5025 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred1_Soil217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred2_Soil4645 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred2_Soil4647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred2_Soil4649 = new BitSet(new long[]{0x0000000000000002L});

}