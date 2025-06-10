package HomeWork;


class balankAccount{
    int id =10;
    String name = "Peter";
    double balance =100;
    void popolnenieScheta(double suma){
        System.out.println("Balans do poplnenia " + balance);
        System.out.println("Popolnenia balansa na " + suma);
        balance+=suma;
        System.out.println("Balans poslia popolenia" + balance);
        System.out.println();

    }
    void snyatieSoScheta(double suma){
        System.out.println("Balans do snyatia " + balance);
        System.out.println("Snyatia balansa na " + suma);
        balance-=suma;
        System.out.println("Balans poslia snyatia" + balance);
        System.out.println();

    }


}
class bankAccountTest {
    public static void main(String[] args) {
        balankAccount myBalankAccount = new balankAccount ();
        myBalankAccount.popolnenieScheta(203.34);
        myBalankAccount.snyatieSoScheta(34.433);
    }


}

public class Employee{

    public Employee(int id2, String surname2 , int age2, String department2){
        id = id2;
        surname= surname2;
        age = age2;
        department = department2;
    };
     private Employee(int id2, String surname2 , int age2,int salary2, String department2){
        id = id2;
        surname= surname2;
        age = age2;
        salary = salary2;
        department = department2;
    };
    public Employee(){};



    int id = 0 ;
    public String surname = "test1";
    int age = 18;
    private int salary = 200;
    String department = "tester";
    int newSalary (){
        salary*=2;
        System.out.println("New salary "+ surname +" "+  salary);
        return salary;
    }
    public void youSurname(){
        System.out.println("you surname :" + surname);
    };
    public void youSalary(){
        System.out.println("you salary :" + salary);
    };
    public void youId(){
        System.out.println("you id number :" + id);
    };
}






//class EmployeeTest {
//    public static void main(String[] args) {
//        Employee e1Pb = new Employee(2, "Pavlo", 27, "QA");
////        Employee e2Pr= new Employee(4, "Paul" , 25,123 , "228");
//        Employee e3Df = new Employee();
////        e1Pb.newSalary();
////        e3Df.newSalary();
//        e1Pb.youId();
//        e1Pb.youSalary();
//        e1Pb.youSalary();
////        e2Pr.youId();
////        e2Pr.youSalary();
////        e2Pr.youSalary();
//        e3Df.youId();
//        e3Df.youSalary();
//        e3Df.youSalary();
//    }

