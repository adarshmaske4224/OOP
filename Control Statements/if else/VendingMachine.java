import java.util.*;
public class VendingMachine {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      char ch;
     
        System.out.println("Welcome to vending machine ..!");
        System.out.println("1.coca cola");
        System.out.println("2.Pepsi");
        System.out.println("3.Smooth");
        System.out.println("4.Chai");
        System.out.println("5.Coffee");
        System.out.println("6. kingfisher");
      do{ 
        System.out.println("Plz Select your choice");
          //input gheil
      
        int choice = sc.nextInt();
          
        switch(choice){
             
            case 1:System.out.println("Coca cola");
            break;
            case 2: System.out.println("Pepsi");
            break;
            case 3: System.out.println("Smooth");
            break;
            case 4: System.out.println("chai");
            break;
            case 5: System.out.println("Coffee");
            break;
            case 6: System.out.println("Kingfisher");
            break;
            default:System.out.println(" plz enter valid number ..!");
            }
            System.out.println("Do you want to countinue ? ");
        
        ch = sc.next().charAt(0); 
        }
        while(ch == 'y' || ch == 'Y'); 
        
    }
}
