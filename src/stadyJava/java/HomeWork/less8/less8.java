package HomeWork.less8;

public class less8 {
    public static final double pe = 3.14;

   public static double metod1 (double a, double b, double  c){
       return a*b*c;
    }
    public static void  metod2 (int a, int b){
        System.out.println(a % b );
    }


   public double plochaKola (double radius){
       return pe* radius *radius;
   }
   public static double DlinaOkruglosty (double radius){
       return 2* pe * radius ;
   }
   public void SumaMetodov (double radius) {
       System.out.println("radius :" + radius);
      System.out.println("SumaMetodov plochaKola : " + plochaKola(radius));
      System.out.println("SumaMetodov DlinaOkruglosty : " + DlinaOkruglosty(radius));

   }
}

