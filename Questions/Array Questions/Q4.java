// print sum of odd elements in an array.  take i/p from user.
//Enter size:10
// Array-> [1,2,3,4,2,5,6,2,8,10]
//outpu -> sum of odd elements = 9

import java.util.Scanner;
class Q4{
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements in array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();     // array madhe elements takte
        }

        for(int i=0; i<size; i++){
        if(arr[i]%2 != 0){
            sum = sum + arr[i];   
        }
    }
        System.out.println("Sum of odd elements is: "+sum);
    }
}