public class MakingDecisions {

    public static void main(String[] args) {
        //thoroughly test the evenOdd
        //call the method with an even number
        evenOdd(4); // expect EVEN

        //call the method with an odd number
        evenOdd(5); // expect ODD

        //call the method with negative numbers
        evenOdd(-4); // expect EVEN
        evenOdd(-5); // expect ODD


} // end of main

/**
 * This method prints EVEN if num is even, otherwise odd
 * @param num - whole number
 */
    public static void evenOdd(int num) {
        // if even num
       if (num % 2 == 0) {
        //print EVEN
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    } // end of evenOdd

} // end of class