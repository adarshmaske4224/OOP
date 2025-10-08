//Q1.WAP to print array with minimum 10 elements data.
//Array -> [10,20,30,40,50,60,70,80,90,100]
//output -> 10,20,30,40,50,60,70,80,90,100

class Q1{
    public static void main(String[] args) {
        
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100};

        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){   
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
       // System.out.println(arr.length);
    }
}
