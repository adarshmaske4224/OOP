import java.util.*;
public class Ifelseifladder {
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks: ");
      int marks = sc.nextInt();
      
      if(marks>=90){
         System.out.println("Grade A");
      }
      else if(marks >=75){
         System.out.println("greade B");
      }
      else if(marks >=50){
         System.out.println("greade c");
      }
      else if(marks >=35){
         System.out.println("greade d");
      }
      else{
         System.out.println("fail");
      }

      
      }
   }
