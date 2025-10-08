//print elements which are less than 10. take i/p from user
//Size = take from user;
// array -> [10,2,3,56,43,9,67,5,43,8]
//o/p -> 2,3,9,5,8

import java.util.*;
class Q5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("array madhe element taka");
        for(int i=0; i<size; i++){ 
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements which are less than 10:");
        for(int i=0; i<arr.length;i++){
        if(arr[i] < 10){
            System.out.println(arr[i]);
        }
        }
    }
}