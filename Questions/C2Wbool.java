class C2Wbool {
    public static void main(String[] args){
        boolean b1 = 1;
        boolean b2 = 0;
        System.out.println(b1);
        System.out.println(b2);

    }
}
// compiler will consider 1 & 0 as integer not boolean.
//evenif we know internally o & 1 are true & false respectively.
// so it will give error.