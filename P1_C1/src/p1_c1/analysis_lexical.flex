import java_cup.runtime.Symbol;
%%

%public
%cup
%line
%full
%char
%ignorecase
%type java_cup.runtime.Symbol
%class Yylex
%{
  public void PrintToken(String str){
    System.out.println(str);}
%}

%eofval{
  return new Symbol(sym.EOF);
%eofval}
L = [a-zA-Z_]
LC = [a-zA-Z]
D = [0-9]
E = [%]
P = [.]
C = [#]
EX = [^]

%{
public String lexico = "";
public static int linea=1;
public static int pos=0;
public int ign = 0;
public int iign = 0;
public int st = 0;
%}
%%

[+-]?{D}+({EX}[+-]?{D}+({P}{D}+)?)? {if(ign == 0 & iign == 0){if(st == 0){lexico += yytext(); return new Symbol(sym.NUMERO);}else{lexico+=yytext();}}}

"=" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.ASIGNADOR);}else{lexico+=yytext();}}}

"+" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.SUMA);}else{lexico+=yytext();}}}
"-" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.RESTA);}else{lexico+=yytext();}}}
"*" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.MULTI);}else{lexico+=yytext();}}}
"/" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.DIVI);}else{lexico+=yytext();}}}

";" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.PUNTO_COMA);}else{lexico+=yytext();}}}

"!=" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.DIFERENTE);}else{lexico+=yytext();}}}
"==" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.EQUEQU);}else{lexico+=yytext();}}}
"||" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.OROR);}else{lexico+=yytext();}}}
"&&" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.ANDAND);}else{lexico+=yytext();}}}

"(" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.PARENT_AB);}else{lexico+=yytext();}}}
")" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.PARENT_CE);}else{lexico+=yytext();}}}
"{" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.LLAB_AB);}else{lexico+=yytext();}}}
"}" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.LLAB_CE);}else{lexico+=yytext();}}}

">" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.MAYOR);}else{lexico+=yytext();}}}
"<" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.MINOR);}else{lexico+=yytext();}}}
"'" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.COMILLAIZQ);}else{lexico+=yytext();}}}
"'" {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.COMILLADER);}else{lexico+=yytext();}}}

[S][y][s][t][e][m][.][o][u][t][.][p][r][i][n][t][l][n] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.PUTS);}else{lexico+=yytext();}}}
[S][y][s][t][e][m][.][o][u][t][.][p][r][i][n][t][l][n] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.PUTW);}else{lexico+=yytext();}}}
[p][u][b][l][i][c][][s][t][a][t][i][c][][v][o][i][d][][m][a][i][n] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.EJECUTAR);}else{lexico+=yytext();}}}
[b][r][e][a][k] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.BREAK);}else{lexico+=yytext();}}}
[e][l][s][e] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.ELSE);}else{lexico+=yytext();}}}
[i][f] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.IF);}else{lexico+=yytext();}}}
[i][n][t] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.INT);}else{lexico+=yytext();}}}
[w][h][i][l][e] {if(ign == 0 & iign == 0){if(st == 0){lexico+=yytext();return new Symbol(sym.WHILE);}else{lexico+=yytext();}}} 
[_]?({L}|{D})* {if(ign == 0 & iign == 0){if(st == 0){lexico=yytext();return new Symbol(sym.IDENTIFICADOR);}else{lexico+=yytext();}}}

