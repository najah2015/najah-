package com;

public class PrimitiveTypeConversion {
public static void main(String[] args) {
	byte a = 10;
    int  b = 20;
    byte c = (byte)b; //  Explicit  Narrowing 
    int  d = a; // Auto-widening 

    System.out.println("c = "+c);
    System.out.println("d = "+d); 
    
     int e = 130;   
     byte f = (byte)e;
     System.out.println("f = "+f);  
}
}
// Assing char value to int and vice versa 