package HomeWork.Less14;

public class less14 {
    public static void time(){
       OUTER:
       for (int chas=0;chas<=6;chas++){
           MIDLE:
           for (int minut =0; minut<60;minut++){
               if (chas > 1 && minut % 10 ==0) {
                   System.out.println("Break 1");
                   break OUTER ;
               }
               INNER:
                for (int secund =0;secund<60;secund++){
                    if ((secund*chas) > minut){
                        System.out.println("Break 2");
                        continue MIDLE;
                    }
                    System.out.println(chas +":"+minut+":"+secund);
                }
            }

        }
    }

    public static void main(String[] args) {
        less14 t = new less14();
        t.time();
    }
}


