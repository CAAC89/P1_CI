import java_cup.runtime.*;

%%

/* Declaraciones */

%cup

%%

/*  Expresiones y reglas  */

/*  Operador aritmetico  */
"+"    {return new Symbol(sym.MAS);}
"-"    {return new Symbol(sym.MENOS);}
"*"    {return new Symbol(sym.MULT);}
"/"    {return new Symbol(sym.DIV);}

/*  Operador de asignacion  */
"="    {return new Symbol(sym.ASIG); }


/*  Operador delimitadores  */
"("    {return new Symbol(sym.AP); }
")"    {return new Symbol(sym.CP); }
"{"    {return new Symbol(sym.AL); }
"}"    {return new Symbol(sym.CL); }
";"    {return new Symbol(sym.PYC); }

/*  Operador relacional  */
"=="   {return new Symbol(sym.EQUAL); }
"!="   {return new Symbol(sym.NOTEQUAL); }
"<"    {return new Symbol(sym.LT); }
">"    {return new Symbol(sym.GT); }

/*  Operador logico  */
"||"   {return new Symbol(sym.OR); }
"&&"   {return new Symbol(sym.AND); }

/*  palabras reservadas  */
"if"   {return new Symbol(sym.IF); }
"else" {return new Symbol(sym.ELSE); }
"main" {return new Symbol(sym.MAIN); }
"while" {return new Symbol(sym.WHILE); }
"putw" {return new Symbol(sym.PUTW); }
"puts" {return new Symbol(sym.PUTS); }
"integer"  {return new Symbol(sym.INTEGER);}
"break" {return new Symbol(sys.BREAK);}

/*  Numero, cadenas , espacios, tabuladores  */
0|[1-9][0-9]*  {return new Symbol(sym.NUM, new Integer(yytext()) ); }
[a-z][a-zA-Z0-9_-]* {return new Symbol(sym.ID, yytext()); }
\r|\n              	{ }   
\ |\t|\f            	{ }  
[^]                	{ throw new Error("Illegal character <"+yytext()+">"); }