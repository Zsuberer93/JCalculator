/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucatolica.calculator;

/**
 *
 * @author Zsuberer88
 */
public class Arithmetic {
    
    public static Double adition (String number1, String number2, String sign){
        Double result;
        result = Double.parseDouble(number1) + Double.parseDouble(number2);
        return result;
    }
    
    public static Double substraction (String number1, String number2, String sign){
        Double result;
        result = Double.parseDouble(number1) - Double.parseDouble(number2);
        return result;
    }
    
    public static Double multiplication (String number1, String number2, String sign){
        Double result;
        result = Double.parseDouble(number1) * Double.parseDouble(number2);
        return result;
    }
    
    public static Double division (String number1, String number2, String sign){
        Double result;
        result = Double.parseDouble(number1) / Double.parseDouble(number2);
        return result;
    }
    
    
}
