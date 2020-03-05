package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static int option, operator1, operator2, result;
    public static float result2;

    public static void main(String[] args) {

    }

    public static int sum(int operator1, int operator2) {


        return result;
    }

    public static int subtraction(int operator1, int operator2) {


        return result;
    }

    public static int multiply(int operator1, int operator2) throws Exception {
        try {

            if (operator1 == 0 || operator2 == 0) {

                throw new ArithmeticException("Operation invalid");

            } else {

                result = operator1 * operator2;
                //System.out.println("");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }


        return result;

    }

    public static float divide(int operator1, int operator2) {


        return result2;
    }

    public static int entireDivision(int operator1, int operator2) {


        return result;
    }

    public static int power(int operaador1, int operator2) {


        return result;
    }

    public static int module(int operaador1, int operator2) throws ArithmeticException {

        if (operator2 == 0) {
            //System.out.println("El divisor es inválido");
            throw new ArithmeticException("The divisor is invalid");
        } else {
            result = operaador1 % operator2;
            System.out.println("El resultado del modulo entre " + operaador1 + " % " + operator2);
            return result;
        }
    }

    public static float minimum(int operaador1, int operator2) {


        return result2;
    }

    public static float maximum(int operaador1, int operator2) {


        return result2;
    }

    public static void operatorsQuestion( ) throws IOException {

        try {

            System.out.println("¿Operator1?");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                operator1 = Integer.parseInt(br1.readLine());
            System.out.println("¿Operator2?");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                operator2 = Integer.parseInt(br2.readLine());

        }catch (Exception e){

            System.out.println("Error: "+e);
        }
    }

    public static void questionOption() {

    }

    public static void printMenu() {

    }
}
