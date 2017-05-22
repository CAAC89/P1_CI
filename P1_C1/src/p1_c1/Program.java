/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_c1;

import java.util.*;


interface Expr { int run(HashMap<String,Integer> hm); }
interface Condition { boolean test(HashMap<String,Integer> hm); }
interface Statement { void run(HashMap<String,Integer> hm); }


/*
    Clase que implementa numero
*/
class NUM implements Expr
{
    Integer val;
    
    public NUM(Integer i)
    {
        val = i;
    }
    
    public int run(HashMap<String,Integer> hm)
    {
        return val;
    }
}

/*
   Clase que implemeta identificadores
*/

class ID implements Expr
{
    String name;
    
    public ID(String s)
    {
        name=s;
    }
    
    public int run(HashMap<String,Integer> hm)
    {
	return (hm.get(name));
    }
}


/*
    Clase de division
*/

class DivExpr implements Expr
{
    Expr left, right;
    
    public DivExpr(Expr l, Expr r)
    {
        left = l;
        right = r;
    }
    
    public int run(HashMap<String,Integer> hm)
    {
        int rval = right.run(hm);
		
	    if (rval == 0)
	    {
		System.out.println("Error: division by zero");
		System.exit(1);
	    }
		
	    return (left.run(hm) / rval); 
    }
}


/*
   clase multiplicacion
*/


class MultExpr implements Expr
{
	Expr left,right;
	
	public MultExpr(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public int run(HashMap<String,Integer> hm)
	{
		return (left.run(hm) * right.run(hm));
	}
}


/*
    clase resta
*/

class MinusExpr implements Expr
{
	Expr left,right;
	
	public MinusExpr(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public int run(HashMap<String,Integer> hm)
	{
		return (left.run(hm) - right.run(hm));
	}
}

/*
    clase suma
*/

class PlusExpr implements Expr
{
	Expr left,right;
	
	public PlusExpr(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public int run(HashMap<String,Integer> hm)
	{
		return (left.run(hm) + right.run(hm));
	}
}


/*
     clase numero negativo
*/

class InvExpr implements Expr
{
	Expr expr;
	
	public InvExpr(Expr e)
	{
		expr = e;
	}
	
	public int run(HashMap<String,Integer> hm)
	{
		return (-1 * expr.run(hm));
	}
}

/*  
    clase mayor

*/
class GT implements Condition
{
	Expr left,right;
	
	public GT(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public boolean test(HashMap<String,Integer> hm)
	{
		return (left.run(hm) > right.run(hm));
	}
}

/*  
    clase menor

*/
class LT implements Condition
{
	Expr left,right;
	
	public LT(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public boolean test(HashMap<String,Integer> hm)
	{
		return (left.run(hm) < right.run(hm));
	}
}


/*
    clase de diferente cond
*/

class NeqCond implements Condition
{
	Expr left,right;
	
	public NeqCond(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public boolean test(HashMap<String,Integer> hm)
	{
		return (left.run(hm) != right.run(hm));
	}
}


/* clase de igual cond*/

class EqCond implements Condition
{
	Expr left,right;
	
	public EqCond(Expr l,Expr r)
	{
		left = l;
		right = r;
	}
	
	public boolean test(HashMap<String,Integer> hm)
	{
		return (left.run(hm) == right.run(hm));
	}
}


/*Impresarores puts cadenas puts*/

class putsPrintStmt implements Statement
{
	Expr expr;
	
	public putsPrintStmt(Expr e)
	{
		expr = e;
	}
	
	public void run(HashMap<String,Integer> hm)
	{
		System.out.println(expr.run(hm));
	}
}

/*Impresarores putw numero putw*/

class putwPrintStmt implements Statement
{
	Expr expr;
	
	public putwPrintStmt(Expr e)
	{
		expr = e;
	}
	
	public void run(HashMap<String,Integer> hm)
	{
		System.out.println(expr.run(hm));
	}
}




/**
 *
 * @author Carlos
 */
public class Program {
    
    
    
}
