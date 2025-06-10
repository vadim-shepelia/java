package HomeWork.less20;

import java.util.ArrayList;
import java.util.Collections;

public class less20 {

        ArrayList <String> abc(String... s){
                ArrayList<String> al = new ArrayList<>();
            for (String s1: s) {
                if(!al.contains(s1)){
                    al.add(s1);
                }

        }
            Collections.sort(al);
            System.out.println(al);
            return al;

        }


    public static void main(String[] args) {
        less20 l20  = new less20();
        l20.abc("a","d","v","t","D","c","o");
    }

}


