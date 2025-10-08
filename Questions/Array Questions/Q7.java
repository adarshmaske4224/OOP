//print ele of arr which is divisible by 4.

import java.util.*;
class Q7{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements:");
        for(int i=0; i<size; i++){ 
            arr[i] = s.nextInt();
        }
        System.out.println("Elements divisible by 4 :");
        for(int i=0; i<arr.length; i++){
        if(arr[i] % 4 ==0){
            System.out.println(arr[i]);
        }
      }
    }
}