package HomeWork.Less17;

public class less17 {

    public void ravenstvo(StringBuilder obj1 , StringBuilder obj2){
        if (obj1.equals(obj2)){
            System.out.println("true");
        }else { System.out.println("false");}
    }

    public static void main(String[] args) {
        less17 m = new less17();
        StringBuilder a = new StringBuilder("fdsfsdfsd");;
        StringBuilder b = a;
        m.ravenstvo(a, b);
    }
}

