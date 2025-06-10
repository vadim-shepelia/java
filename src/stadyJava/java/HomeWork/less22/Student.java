package HomeWork.less22;

public class Student {

    int acx(){
    char v = 'h';
        return v;
    }

    private StringBuilder name ;
   private int course;
   private   double grade;

    public StringBuilder setName(StringBuilder name){
       if(name.length() < 3){
           System.out.println("name must be longer than 3 characters");
       }else
        this.name = name;
        return name;
    }
    public int setCourse (int i) {
        if (i>=1 && i <= 10) {
            this.course = i;
        }
        return course;
    }
    public double setGrade (int i) {
        if (i>=1 && i <= 4) {
            this.grade = i;
        }
        return grade;
    }

    public void sowInfo(StringBuilder name , int course , int grade){
        System.out.println("name : "+  this.setName(name));
        System.out.println("course : "+  this.setCourse(course));
        System.out.println("grade : "+   this.setGrade(grade));
    }

}
class TestStudent{
    public static void main(String[] args) {
        Student s = new Student();
        s.sowInfo(new StringBuilder("Iven"),4,3);
System.out.println(s.acx());

    }

}
