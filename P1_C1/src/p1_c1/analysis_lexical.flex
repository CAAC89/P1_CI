package P1_C1;
import java_cup.runtime.Symbol;

%%
%public
%char
%line
%ignorecase
%cup
%full
%type java_cup.runtime.Symbol
%implements java_cup.runtime.Scanner
%eofval{
    System.out.println("FINARCHIVO");
    return null;
%eofval}

%eofval{
  System.out.println("FINARCHIVO");
  return null;
%eofval}

letra=[a-zA-z]
entero=[0-9]
id=[letra][A-Za-z0-9]*

%% 
"{" {return new Symbol(sym.open_lla,new token(yytext(),yychar,yyline));}
      
"}" {return new Symbol(sym.close_lla,new token(yytext(),yychar,yyline));}
     
"(" {return new Symbol(sym.open_par,new token(yytext(),yychar,yyline));}
      
")" {return new Symbol(sym.close_par,new token(yytext(),yychar,yyline));}
   
"true" {return new Symbol(sym.true_,new token(yytext(),yychar,yyline));}
      
"false" {return new Symbol(sym.false_,new token(yytext(),yychar,yyline));}

";" {return new Symbol(sym.pyc_,new token(yytext(),yychar,yyline));}
      
"=" {return new Symbol(sym.asignacion_,new token(yytext(),yychar,yyline));}

"<" {return new Symbol(sym.menor,new token(yytext(),yychar,yyline));}

">" {return new Symbol(sym.mayor,new token(yytext(),yychar,yyline));}

"||" {return new Symbol(sym.or_,new token(yytext(),yychar,yyline));}
      
"&&" {return new Symbol(sym.and_,new token(yytext(),yychar,yyline));}
    
"==" {return new Symbol(sym.igual_igual,new token(yytext(),yychar,yyline));}

"!=" {return new Symbol(sym.no_igual,new token(yytext(),yychar,yyline));}

"+"  {return new Symbol(sym.suma,new token(yytext(),yychar,yyline));}

"-"  {return new Symbol(sym.resta,new token(yytext(),yychar,yyline));}

"*" {return new Symbol(sym.multiplicacion,new token(yytext(),yychar,yyline));}

"/" {return new Symbol(sym.division,new token(yytext(),yychar,yyline));}

"main" {return new Symbol(sym.main,new token(yytext(),yychar,yyline));}

"if" {return new Symbol(sym.iff,new token(yytext(),yychar,yyline));}

"while" {return new Symbol(sym.whilee,new token(yytext(),yychar,yyline));}

"else" {return new Symbol(sym.elsee,new token(yytext(),yychar,yyline));}

"putw" {return new Symbol(sym.putw,new token(yytext(),yychar,yyline));}

"puts" {return new Symbol(sym.puts,new token(yytext(),yychar,yyline));}

"int" {return new Symbol(sym.intt,new token(yytext(),yychar,yyline));}
        
({id})+("_")*({id})* {	return new Symbol(sym.id,new token(yytext(),yychar,yyline));}
	
{entero}+ {return new Symbol(sym.entero,new token(yytext(),yychar,yyline));}
