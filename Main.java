package com.company;

public class Main {

    public static void main(String[] args) {
        //  A for-i loop to generate the variable "i" (1-10) for the writeSequence method
        for (int i = 1; i < 11; i++) {
            writeSequence(i);
            System.out.println();
        }
    }

    //  writeSequence method
    public static void writeSequence(int i) {
//        checks if "i" is greater then zero / i don't know
// if this is called a base case or not
        if(i < 1)
            throw new IllegalArgumentException();
//      i think this is the base case - if "i" = 1
        if(i == 1) {
            System.out.print("1");
            return;
        }
//      second base case - if "i" = 2
        if(i == 2) {
            System.out.print("1 1");
            return;
        }
//      this is the recursive part of the method
//      it took me a while to figure out how to make Java round up
//      to the next whole number to make this print right Math.ceil does it.
        int outSideNumbers = (int) Math.ceil(i/2.0);
//        prints the number(s) to the right of the sequence
        System.out.print(outSideNumbers + " ");
//        method calls itself - checks new number prints middle number(s) or repeats above
        writeSequence(i-2);
//        finishes method and prints the remaining numbers to the left of the middle
        System.out.print(" " + outSideNumbers);
    }
}
