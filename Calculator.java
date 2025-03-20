import java.lang.Math;

public class Calculator {

    public double addition(double num1, double num2){
        //Does addition
        return num1 + num2;
    }

    public double subtraction(double num1, double num2){
        //does subtraction
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        //does multiplication
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        //does division
        if (num2 == 0) {
            return -1;
        } else {
            return num1 / num2;
        }
    }

    public double modulo(double num1, double num2){
        //does modulo calculations
        return num1 % num2;
    }

    public double exponent(double num1, double num2){
        //does exponential calculations
        if(num2 != 0){
            return (num1 * exponent(num1, num2 - 1));
        } else if (num2 < 0) {
            return (num1 * exponent(num1, num2 + 1));
        } else{
            return 1;
        }
    }
}
