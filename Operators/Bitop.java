//  &  (bitwise AND)
// | (bitwise or)
// ^ (bitwise xor)
// ~ (bitwise not)
//   left shift(<<)


public class Bitop {
    
    public static void main(String[] args){
       /*int a = 7; //0111
        int b = 3; //0011

        System.out.println(a|b);

*/
         int x = 5; //0101 
         System.out.println(x);
    }
}

// step 1 -> flip all the bits (1010).
// Step 2 -> first bit is sign bit so do not change while you   taking 2's complement.
// step 3 -> derive 2's complement.          