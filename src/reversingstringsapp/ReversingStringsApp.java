/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversingstringsapp;

/**
 *
 * @author Andrey77
 */
public class ReversingStringsApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        if (args.length < 1 || args.length > 1) {
            System.out.println("Wrong number arguments!");
        } else {
            String inputString = args[0];
            System.out.print(inputString + "\n");
            System.out.print(reversingString(inputString) + "\n");
            measuringTime(inputString, 1000);
            measuringTime(inputString, 10000);
            measuringTime(inputString, 100000);
        }
    }

    public static String reversingString(String input) {
        char[] out = input.toCharArray();
        int length = input.length();
        for (int i = length; i > 0; i--) {
            out[length - i] = input.charAt(i - 1);
        }
        return new String(out);
    }

    private static void measuringTime(String inputString, int iterations) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            reversingString(inputString);
        }
        long end = System.currentTimeMillis();
        System.out.print(iterations + " times  -> " + (end - begin) + " ms" + "\n");
    }
    
}
