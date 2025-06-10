package HomeWork.CopyEmploee;

import HomeWork.Employee;

public class Emploee {
    public static void main(String[] args) {
        HomeWork.Employee e1Pb= new  HomeWork.Employee(2,"Pavlo",27,"QA");
        //HomeWork.Employee e2Pr= new  HomeWork.Employee(4, "Paul" , 25,123 , "228");
        HomeWork.Employee e3Df = new HomeWork.Employee();
        e1Pb.youId();
//        e1Pb.newSalary();
        
        e1Pb.youSalary();
        e1Pb.youSalary();
//        e2Pr.youId();
//        e2Pr.youSalary();
//        e2Pr.youSalary();
        e3Df.youId();
        e3Df.youSalary();
        e3Df.youSalary();
    }
}
