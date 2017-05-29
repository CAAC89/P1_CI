import java_cup.runtime.*;
import java.io.Reader;

%% //inicio de las opciones

/* Seccion de opciones y declaraciones de JFLEX */
%class analysis_lexical
%line
%column
%cup

%{
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type , Object value){
        return new Symbol(type, yyline, yycolumn , value);
    }

%}

L = [a-zA-Z_]
D = [0-9]
E = [%]
P = [.]
EX = [^]


%%  //fin de las opciones

/*------- Seccion de reglas lexicas ----------*/

<YYINITIAL> {

[+-]?{D}+({EX}[+-]?{D}+({P}{D}+)?)? {return symbol(sym.INT , new String(yytext()));}

[_]?({L}|{D})* {return symbol(sym.IDENT , new String(yytext()));}

";" {return symbol(sym.PYC);}
"(" {return symbol(sym.PD);}
")" {return symbol{sym.PI};}
"{" {return symbol{sym.LI};}
"}" {return symbol{sym.LD};}

"+" {return symbol{sym.SUMA};}
"-" {return symbol{sym.RESTA};}
"*" {return symbol{sym.MULT};}
"/" {return symbol{sym.DIV};}

">" {return symbol{sym.MAYOR};}
"<" {return symbol{sym.MENOR};}
"==" {return symbol{sym.IGUAL};}
"!=" {return symbol{sym.DIFERENTE};}

"=" {return symbol{sym.ASIG};}

"||" {return symbol{sym.OR};}
"&&" {return symbol{sym.AND};}

[i][f] {return symbol{sym.IF};}
[e][l][s][e] {return symbol{sym.ELSE};}
[w][h][i][l][e] {return symbol{sym.WHILE};}
[r][e][t][u][r][n] {return symbol{sym.RETURN};}
[b][r][e][a][k] {return symbol{sym.BREAK};}
[S][y][s][t][e][m][.][o][u][t][.][p][r][i][n][t][l][n] {return symbol{sym.PUTS};}
[S][y][s][t][e][m][.][o][u][t][.][p][r][i][n][t][l] {return symbol{sym.PUTW};}
[p][u][b][l][i][c][][s][t][a][t][i][c][][v][o][i][d][][m][a][i][n]{return symbol{sym.main};}
}