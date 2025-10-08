// take i/p from user where size of array should be 10 & print the O/p of user given elements in array


import java.util.Scanner;
class Q2{
  public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);
     int arr[] = new int[10];

     /*arr[0] = 10;
     arr[1] = 20;
     arr[2] = 30;
     arr[3] = 40;
     arr[4] = 50;
     arr[5] = 60;
     arr[6] = 70;
     arr[7] = 80;
     arr[8] = 90;
     arr[9] = 100;*/
     System.out.println("Enter elemets in array:");
     for(int i=0; i<arr.length;i++){
      arr[i]=sc.nextInt(); // input device through ip ghte  
     }

     System.out.println("elements in array are: ");
     for(int i=0; i<arr.length;i++){
      System.out.println(arr[i]);  
     }
     
  }
}
