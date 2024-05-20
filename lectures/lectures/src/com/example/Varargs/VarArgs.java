package com.example.Varargs;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(4,5));
//        System.out.println(sum(new int[] {4,5}));
        System.out.println(sum(6,7,6));
        System.out.println(sum(5,6,7,7));
    }

    //Here, we can sum one integer and also none, but
    // we want to the initiating condition that at least two integer required
    //So we use a new syntax that is called Varargs.
    // terminology (...) is called ellipsis.
    // it's introduced in: java 5.(varargs)
    public static int sum (int first,int second, int...a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
//    public static int sum(int[] a ) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
