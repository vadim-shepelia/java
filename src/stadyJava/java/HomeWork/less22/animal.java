package HomeWork.less22;

public class animal {
    public int eyes;
    public void eat (){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals grink");
    }
}

class pet extends animal {
    public void pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    public String name;
    public int tail = 1;
    public int paw = 4;

    public void run() {
        System.out.println("Pet run");
    }

    ;

    public void jump() {
        System.out.println("Pet jump");
    }

    ;
}

    class dog extends pet{
        public void dog(String name) {
            this.name = name;
            System.out.println("I am dog and my name is " + name);

        };
        public void play(){
            System.out.println("Dog play");
        };
    }


    class  cat extends pet {
        public void cat(String name) {
            this.name = name;
            System.out.println("I am cat and my name is " + name);
        };
        public void sleep(){
            System.out.println("Cat sleeps");
        };


    }
    class test {
        public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        System.out.println("paw in dog =" + d.paw);
        c.sleep();


        }
}



