import java.util.*;
class Array1 {
    public static void main(String[] args){   
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size: ");
       int size = sc.nextInt();  //5
       
       int arr[] = new int[size];
       System.out.println("Enter jersy no.: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        /*for(int i =0; i<arr.length;i++){
        System.out.println(i+1+ " jersy no's "+ arr[0]);
        }*/
        System.out.println( "jersy no of player is: "+arr[1]);
    }
}
 

