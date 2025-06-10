package HomeWork;

public class less4 {

}
class Student {
    Student(int numb, String fNamme, String lName ,int styear, double GradeM, double GradeL, double GradeE){
        numberStudCheck = numb;
        firstName =fNamme;
        lastName=lName;
        studyYear=styear;
        averageGradeMathematics=GradeM;
        averageGradelanguage =GradeL;
        averageGradelEconomy = GradeE;
    }
    public Student(int id , String name, String surname,int course)
    {
        this(id, name, surname,course ,0.0 ,0.0 , 0.0);
    }
    Student(){
    };


    int numberStudCheck ;
    String firstName;
    String lastName;
    int studyYear;
    double averageGradeMathematics;
    double averageGradelanguage;
    double averageGradelEconomy;

    void AverageGrade(){
        System.out.println("Average grade " + firstName +
                " " + ((averageGradelEconomy + averageGradelanguage + averageGradeMathematics)/3));
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student(12, "Sasha","Popka", 3,5.4,6.4,5.5);
        Student s2= new Student(3,"Poko","koko",4);
        Student s4 = new Student(5,"Poko","koko",4);

        Student s3 = new Student();

        s2.averageGradeMathematics = 3.5;
        s2.averageGradelanguage = 4.1;
        s2.averageGradelEconomy = 3.9;

        s3.numberStudCheck = 327;
        s3.firstName ="Vania";
        s3.lastName = "Shef";
        s3.studyYear = 2023;
        s3.averageGradeMathematics = 4.3;
        s3.averageGradelanguage = 3.9;
        s3.averageGradelEconomy = 4.2;
        s1.AverageGrade();
        s2.AverageGrade();
        s3.AverageGrade();


    }
}