

package com.mycompany.aprendiendogeneral;


public class AprendiendoGeneral {

    public static void main(String[] args) {
        
        int a = 2;
        int b = -3;
        int c = -2;
        
        
        
        double upperDivision = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double lowerDivision = 2 * a;
        double add_upperDivision = -b + upperDivision;
        double result = add_upperDivision / lowerDivision; 
        System.out.println(result);
        
    }
}
