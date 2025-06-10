package HomeWork.Less2;

public class PrimitiveDataTipe {
    public static void main(String[] args) {
       // numeric
        byte b1 =10 ;
        byte b2 =  127;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0 ;

        int i1=600;

        long l1 = 10000;
        long l2= 100000000000000L;

        // floating-point
        double d1 = 0.223;
        float f1 = 3.14F;

        //symbol
        char c1='e';
        char c2='E';
        // визов юніт кода
        char c3 = 77;//10- річна система вирахування
        char c4 = '\u1234';//16- річна система вирахування

        boolean bool1=true;
        boolean bool2=false;

        int a1=60; //десятирічна система
        int a2=0B111100;//бінарна система
        int a3=074;//восьмирічна система
        int a4=0x3c;// 16-річна система
        int a5= 1_000_000_000;

        System.out.println(a1 );
        System.out.println(a2 );
        System.out.println(a3 );
        System.out.println(a5 );
    }
}
