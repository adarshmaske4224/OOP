public class Unary {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        System.out.println(+x);
        System.out.println(-x);

        //pre and post
        System.out.println(++x);    //11
        System.out.println(x++);    //11
        System.out.println(x);      //12
        
    }
}
