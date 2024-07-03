

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
        System.out.println("Result 1: " + result);
        
        int a1 = 2;
        int b1 = -3;
        int c1 = -2;
        
        double upperDivision1 = Math.sqrt(Math.pow(b1, 2) - (4 * a1 * c1));
        double lowerDivision1 = 2 * a1;
        double add_upperDivision1 = -b1 + upperDivision1;
        double result1 = add_upperDivision1 / lowerDivision1;
        System.out.println("Result 2: " + result1);
        
        int a2 = 3;
        int b2 = 5;
        int c2 = 2;
        
        double upperDivision2 = Math.sqrt(Math.pow(b2, 2) - (4 * a2 * c2));
        double lowerDivision2 = 2 * a2;
        double add_upperDivision2 = -b2 + upperDivision2;
        double result2 = add_upperDivision2 / lowerDivision2;
        System.out.println("Result 3: " + result2);
        
    }
}
