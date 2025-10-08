//take a character array & take input from user,print charcters. 

import java.util.*;
class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size de:");
        int size = sc.nextInt();

        char array[] = new char[size];
        
        System.out.println("elements taka:");
        for(int i=0; i<array.length; i++){
            array[i] = sc.next().charAt(0);
        }
        System.out.println("3rd index vala character: ");
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }
}


