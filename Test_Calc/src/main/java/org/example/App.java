package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

    }

    public static double add(double[] x){
        double result = 0;
        for (int i = 0; i < x.length; i++){
            result += x[i];
        }
        return result;
    }

    public static double sub(double[] x){
        double result = x[0];
        for (int i = 1; i < x.length; i++){
            result -= x[i];
        }
        return result;
    }

    public static double div(double x , double y){
        return x/y;
    }
}
