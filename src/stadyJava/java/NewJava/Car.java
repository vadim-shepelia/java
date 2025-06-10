package NewJava;

public class Car {
    public String model;
    public int year;
    public double speed;
    public double run;

    public void setVelueCar(String _model, int _year,double _speed,double _run ){
        model = _model;
        year=_year;
        speed = _speed;
        run = _run;
    }
    public double getMilRun(){
       double time = run/speed;
       return time;
    }
    public void InfoCar(){
        System.out.println("model : " + model + ". year : " + year + ". speed : " + speed+ ". run : " + run );
    }
}
