/*
 * Copyright 2019 Christopher Coe
 * https://github.com/chrisdcoe
 */

package generics;

/* @author Chris */
public class Generics {

    // Comparable: has a compareto function
    
    public static <T extends Comparable <T>> T findMax(T a, T b) {
        int n = a.compareTo(b); // -1 if a < b; 0 if a == b; 1 if a > b
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(findMax(2, 7));
        System.out.println(findMax(6, 3));
    
        System.out.println(findMax(2.0, 3.5));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("there", "hello"));
        

    }



    
}
