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
public class token {
    
    int posicionX;
    int posicionY;
    String valor;
    
    public token(String val,int x,int y){
       this.valor=val;
       this.posicionX=x;
       this.posicionY=y;
    }
        public int getX(){return this.posicionX;}
        public int getY(){ return this.posicionY;}
        public String getValor(){return this.valor;}
    }

