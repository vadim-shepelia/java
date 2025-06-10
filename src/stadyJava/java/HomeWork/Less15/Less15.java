package HomeWork.Less15;

public class Less15 {
    public static void timeWhile(){

        int chas=0;
        OUTER:
        while (chas<=6){
            int minut =-1;
            MIDLE:
                do {
                    minut++;
                    if (chas > 1 && minut % 10 == 0) {
                        System.out.println("Break 1");
                        break OUTER;
                    }

                    int secund = 0;

                    INNER:
                    while (secund < 60) {
                        secund++;
                        if ((secund * chas) > minut) {
                            System.out.println("Break 2");
                            continue MIDLE;
                        }
                        System.out.println(chas + ":" + minut + ":" + secund);
                    }
                }
            while( minut<60);
            chas++;
            }
        }
    public static void main(String[] args) {
        Less15 t = new Less15();
        t.timeWhile();
    }

}
