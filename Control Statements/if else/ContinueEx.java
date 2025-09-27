public class ContinueEx {
  
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {

            switch (num) {
                case 3:
                    System.out.println("Number is 3, skip this iteration");
                    continue;// go to next loop iteration
                default:
                    System.out.println("Number: " + num);
            }

            System.out.println("End of this iteration");
        }
    }


}
