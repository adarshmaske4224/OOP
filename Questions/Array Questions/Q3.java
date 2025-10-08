//print even elements in array.
// take input from user
//array->[11,12,13,14,15,16,17,18,19,20]
//o/p -> 12,14,16,18,20

import java.util.*;
class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt(); 
        
        int arr[] = new int[size];

        System.out.println("Enter elements in array: ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even elements are:");
        for(int i=0; i<size; i++){
        if(arr[i] % 2 == 0){
            System.out.println(arr[i]);
        }
        }

    }
}



   
