
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jun 05 11:30:09 CST 2017
//----------------------------------------------------

package P1_C1;

import java.io.*;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jun 05 11:30:09 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\002\004\000\002\020\010\000\002\020" +
    "\007\000\002\017\005\000\002\016\016\000\002\016\016" +
    "\000\002\016\016\000\002\016\016\000\002\014\007\000" +
    "\002\015\007\000\002\006\007\000\002\007\013\000\002" +
    "\007\013\000\002\007\013\000\002\007\013\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\012\005\000\002\013\005\000\002\005\006\000\002\004" +
    "\005\000\002\003\003\000\002\003\003\000\002\002\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\117\000\006\026\004\034\007\001\002\000\004\004" +
    "\116\001\002\000\004\026\016\001\002\000\006\014\014" +
    "\015\012\001\002\000\006\014\uffe2\015\uffe2\001\002\000" +
    "\004\002\011\001\002\000\004\002\001\001\002\000\014" +
    "\007\uffe3\014\uffe3\015\uffe3\016\uffe3\017\uffe3\001\002\000" +
    "\004\016\015\001\002\000\014\007\uffe4\014\uffe4\015\uffe4" +
    "\016\uffe4\017\uffe4\001\002\000\004\026\uffe5\001\002\000" +
    "\004\004\017\001\002\000\006\014\014\015\012\001\002" +
    "\000\004\017\113\001\002\000\004\030\022\001\002\000" +
    "\004\006\042\001\002\000\004\032\026\001\002\000\004" +
    "\005\025\001\002\000\004\002\000\001\002\000\004\006" +
    "\036\001\002\000\004\033\030\001\002\000\004\006\032" +
    "\001\002\000\004\005\ufffe\001\002\000\006\014\014\015" +
    "\012\001\002\000\004\007\034\001\002\000\004\016\035" +
    "\001\002\000\004\005\ufff8\001\002\000\006\014\014\015" +
    "\012\001\002\000\004\007\040\001\002\000\004\016\041" +
    "\001\002\000\010\005\ufff9\032\ufff9\033\ufff9\001\002\000" +
    "\004\014\043\001\002\000\012\022\044\023\045\024\047" +
    "\025\046\001\002\000\004\015\103\001\002\000\004\015" +
    "\073\001\002\000\004\015\063\001\002\000\004\015\050" +
    "\001\002\000\004\007\051\001\002\000\004\004\052\001" +
    "\002\000\004\014\053\001\002\000\004\017\054\001\002" +
    "\000\006\014\014\015\012\001\002\000\004\016\061\001" +
    "\002\000\006\014\014\015\012\001\002\000\006\014\014" +
    "\015\012\001\002\000\010\014\uffe7\015\uffe7\016\uffe7\001" +
    "\002\000\004\005\062\001\002\000\004\032\ufffb\001\002" +
    "\000\004\007\064\001\002\000\004\004\065\001\002\000" +
    "\004\014\066\001\002\000\004\017\067\001\002\000\006" +
    "\014\014\015\012\001\002\000\004\016\071\001\002\000" +
    "\004\005\072\001\002\000\004\032\ufffa\001\002\000\004" +
    "\007\074\001\002\000\004\004\075\001\002\000\004\014" +
    "\076\001\002\000\004\017\077\001\002\000\006\014\014" +
    "\015\012\001\002\000\004\016\101\001\002\000\004\005" +
    "\102\001\002\000\004\032\ufffc\001\002\000\004\007\104" +
    "\001\002\000\004\004\105\001\002\000\004\014\106\001" +
    "\002\000\004\017\107\001\002\000\006\014\014\015\012" +
    "\001\002\000\004\016\111\001\002\000\004\005\112\001" +
    "\002\000\004\032\ufffd\001\002\000\006\014\014\015\012" +
    "\001\002\000\004\016\115\001\002\000\004\030\uffe6\001" +
    "\002\000\004\032\026\001\002\000\004\032\026\001\002" +
    "\000\004\005\121\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\117\000\010\002\005\004\004\020\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\012\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\003\017\005\020\001" +
    "\001\000\002\001\001\000\006\016\022\017\023\001\001" +
    "\000\002\001\001\000\004\014\026\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\003\036\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\003\055\013" +
    "\054\001\001\000\002\001\001\000\006\003\055\013\056" +
    "\001\001\000\004\003\057\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\003" +
    "\055\013\067\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\055\013\077" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\055\013\107\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\113\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\014\116\001\001\000\004\014\117\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public void syntax_error(Symbol st){
    token t=(token)st.value;
    report_error("Error Sintactico:"+ t.getValor()+"- "+t.getX()+"-"+t.getY(),null);

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


   public void ImprimeValorCadena(String str){
        System.out.println(str) ;
   }

    public void ImprimeValorNumero(int str){
        System.out.println(str) ;
   }

   public int suma (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception: not a number"); 
        }
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        
        return aa+bb;
    }

    public int resta (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception: not a number"); 
        }
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        
        return aa-bb;
    }

    public int multiplicacion (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception: not a number"); 
        }
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        
        return aa*bb;
    }

    public  int division (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception: not a number"); 
        }
        
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        try {
  
           return aa/bb;    
        }catch(ArithmeticException e){
                System.out.println("Exception: Divided zero"); 
        }
        return aa/bb;
       
    }

    public boolean mayor (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("not a number"); 
        }
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        
        if (aa>bb){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean menor (String a, String b)
    {
        try{
        if ("".equals(a) || "".equals(b)){
            System.out.println("Exception: null parameters");
            }
        }catch(NumberFormatException e){
            System.out.println("not a number"); 
        }
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        
        if (aa<bb){
            return true;
        }
        else{
            return false;
        }
    }


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // TIPOS_DATOS_NUMERICOS ::= intt 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS_DATOS_NUMERICOS",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // CONSTANTE ::= entero 
            {
              token RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token n = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONSTANTE",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // CONSTANTE ::= id 
            {
              token RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token i = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONSTANTE",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CONSTANTE_INT ::= TIPOS_DATOS_NUMERICOS CONSTANTE pyc_ 
            {
              token RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		token i = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONSTANTE_INT",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ASIG_ENTERA ::= CONSTANTE asignacion_ CONSTANTE pyc_ 
            {
              token RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		token i = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		token n = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIG_ENTERA",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ARITMETICA_COMPLETA ::= CONSTANTE ARITMETICA_COMPLETA CONSTANTE 
            {
              token RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		token e = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int acleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int acright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		token ac = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token f = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              String val1=e.getValor();
              String val2=f.getValor();

            if(ac.getValor().equals("+")){
                suma(val1,val2);
            }
            if(ac.getValor().equals("-")){
                resta(val1,val2);
            }  
            if(ac.getValor().equals("*")){
                multiplicacion(val1,val2);
            }
            if(ac.getValor().equals("/")){
                division(val1,val2);
            } 

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARITMETICA_COMPLETA",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COMPARACION_COMPLETA ::= CONSTANTE COMPARACION_COMPLETA CONSTANTE 
            {
              token RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		token a = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ccleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ccright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		token cc = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token b = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              String val1=a.getValor();
              String val2=b.getValor();

            if(cc.getValor().equals(">")){
                mayor(val1,val2);
            }
            if(cc.getValor().equals("<")){
                menor(val1,val2);
            }                          

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION_COMPLETA",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMPARACION ::= menor 
            {
              token RESULT =null;
		int meleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int meright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token me = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMPARACION ::= mayor 
            {
              token RESULT =null;
		int maleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int maright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token ma = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // COMPARACION ::= no_igual 
            {
              token RESULT =null;
		int nileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int niright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token ni = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COMPARACION ::= igual_igual 
            {
              token RESULT =null;
		int iileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iiright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token ii = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // COMPARACION ::= and_ 
            {
              token RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token a = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // COMPARACION ::= or_ 
            {
              token RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token o = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("COMPARACION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ARITMETICAS ::= division 
            {
              token RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token d = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARITMETICAS",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ARITMETICAS ::= multiplicacion 
            {
              token RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token m = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARITMETICAS",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ARITMETICAS ::= resta 
            {
              token RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token r = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARITMETICAS",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ARITMETICAS ::= suma 
            {
              token RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		token s = (token)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ARITMETICAS",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // BLOQUE_IF_SIMPLE ::= iff open_par id menor entero close_par open_lla ASIG_ENTERA close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_IF_SIMPLE",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // BLOQUE_IF_SIMPLE ::= iff open_par id mayor entero close_par open_lla ASIG_ENTERA close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_IF_SIMPLE",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // BLOQUE_IF_SIMPLE ::= iff open_par id no_igual entero close_par open_lla ASIG_ENTERA close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_IF_SIMPLE",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // BLOQUE_IF_SIMPLE ::= iff open_par id igual_igual entero close_par open_lla ASIG_ENTERA close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_IF_SIMPLE",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // BLOQUE_IF_COMPUESTO ::= BLOQUE_IF_SIMPLE elsee open_lla ASIG_ENTERA close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_IF_COMPUESTO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // IMPRESOR_NUMERO ::= putw open_par CONSTANTE close_par pyc_ 
            {
              token RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		token i = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 
                            int val1=i.getValor();
                            ImprimeValorNumero(val1);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRESOR_NUMERO",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // IMPRESOR_VARIABLE ::= puts open_par CONSTANTE close_par pyc_ 
            {
              token RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		token i = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 
                            String val1=i.getValor();
                            ImprimeValorCadena(val1);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRESOR_VARIABLE",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // BLOQUE_WHILE_SIMPLE ::= whilee open_par id menor entero close_par open_lla id asignacion_ ARITMETICA_COMPLETA pyc_ close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_WHILE_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // BLOQUE_WHILE_SIMPLE ::= whilee open_par id mayor entero close_par open_lla id asignacion_ ARITMETICA_COMPLETA pyc_ close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_WHILE_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // BLOQUE_WHILE_SIMPLE ::= whilee open_par id no_igual entero close_par open_lla id asignacion_ ARITMETICA_COMPLETA pyc_ close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_WHILE_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // BLOQUE_WHILE_SIMPLE ::= whilee open_par id igual_igual entero close_par open_lla id asignacion_ ARITMETICA_COMPLETA pyc_ close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_WHILE_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // BLOQUE_WHILE_COMPUESTO ::= BLOQUE_WHILE_SIMPLE IMPRESOR_VARIABLE IMPRESOR_NUMERO 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_WHILE_COMPUESTO",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BLOQUE_MAIN ::= main open_lla IMPRESOR_VARIABLE IMPRESOR_VARIABLE close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_MAIN",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // BLOQUE_MAIN ::= CONSTANTE_INT main open_lla ASIG_ENTERA BLOQUE_WHILE_COMPUESTO close_lla 
            {
              token RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE_MAIN",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= BLOQUE_MAIN EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		token start_val = (token)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
      }
    }
}
