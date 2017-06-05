/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_c1;

import java.io.File;
import java.io.FileReader;



/**
 *
 * @author Carlos
 */
public class P1_C1 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        File file=new File("C:\\Users\\Carlos\\Desktop\\P1_CI\\P1_C1\\src\\p1_c1\\ejemplo.txt.txt");
        try{
        
        FileReader fr=new FileReader(file);
        Yylex lex=new Yylex(fr);
        parser miParser=new parser(lex);
        miParser.parse();
        
	}catch(Exception e){ 
            System.out.println(e);
     
        }
    }
}