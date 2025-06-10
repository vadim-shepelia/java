package HomeWork;

public class less2 {
    public static void main(String[] args) {
        byte b_10=12;
        byte b_0_1=0b1100;
        byte b_8=014;
        byte b_16=0xC;
        System.out.println(b_10);
        System.out.println(b_0_1);
        System.out.println(b_8);
        System.out.println(b_16);
        System.out.println("");

       short s_10=1300;
       short s_0_1=0b10100010100;
       short s_8=02424;
       short s_16=0x514;
        System.out.println(s_10);
        System.out.println(s_0_1);
        System.out.println(s_8);
        System.out.println(s_16);
        System.out.println("");

       int i_10 = 0;
       int i_0_1 = 0b0;
       int i_8=00;
       int i_16=0x0;
        System.out.println(i_10);
        System.out.println(i_0_1);
        System.out.println(i_8);
        System.out.println(i_16);
        System.out.println("");

       long l_10=123456789;
       long l_0_1=0b111010110111100110100010101;
       long l_8=0726746425;
       long l_16=0x75BCD15;
        System.out.println(l_10);
        System.out.println(l_0_1);
        System.out.println(l_8);
        System.out.println(l_16);
        System.out.println("");

        float f1=0.4f;
        float f2=5.44F;
        double d1=12.435;
        double d2=43.324;
        boolean bool1=true;
        boolean bool2=false;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println("");

        char c1='a';
        char c2='A';
        char c3=00;
        char c4='\u1345';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


    }

    public static class less3 {
        public static void main(String[] args) {
            int i1= 5;
            int i2=11;
            double d1=5.5;
            double d2=1.3;
            double result = 0;
            long l=20L;
            result = i2/d1 +d2%i1-l;
            System.out.println(result);

            int a=5;
            int b=8;

            int result2 = a-- - --a + ++a + a++ + a;//-13-  15
            int result3 = ++b - b++ + ++b - --b;//1
            System.out.println(result2);
            System.out.println(result3);
        }
    }
}
