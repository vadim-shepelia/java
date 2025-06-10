package HomeWork.less11;

public class Car {
    String color;
    String motor;
    int carDors;

    public Car(String color, String motor, int carDors) {
        this.color = color;
        this.motor = motor;
        this.carDors = carDors;
    }
}


class carTest {
    public void changeCarDors(Car c, int dor) {
        c.carDors = dor;

    }

    public void changeObj(Car obj1, Car obj2) {
        String color = obj1.color;
        obj1.color = obj2.color;
        obj2.color = color;
        System.out.println("new   obj1.color :" + obj1.color + " " + obj1.motor);
        System.out.println("new   obj2.color :" + obj2.color + " " + obj2.motor);

    }

    public static void main(String[] args) {

        Car c = new Car("red", "V8", 1);
        Car b1 = new Car("blue", "V6", 2);
        carTest cT = new carTest();
        cT.changeCarDors(c, 3);
        cT.changeObj(c, b1);
        System.out.println(c.color);
        System.out.println(b1.color);
        System.out.println(c.motor);
        System.out.println(b1.motor);
    }

}
