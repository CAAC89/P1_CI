/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_c1;



/**
 *
 * @author Carlos
 */
public class P1_C1 {

    /**
     * @param a
     * @param b
     */
    
    public static boolean suma (String a, String b)
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
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.print( suma("4","4"));
  
    }
}