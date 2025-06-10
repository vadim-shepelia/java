package HomeWork.less13;

public class Month {
    public int NumberMonth ;
    Month(int NumberMonth ){
        this.NumberMonth = NumberMonth;
    }
    public static void main(String[] args) {
        Month m1 = new Month(13);
    switch (m1.NumberMonth){
        case 1: System.out.println("Январь : 31d"); break;
        case 2: System.out.println("Февраль : 28d"); break;
        case 3: System.out.println("Март : 31d"); break;
        case 4: System.out.println("Апрель : 30d"); break;
        case 5: System.out.println("Май : 31d"); break;
        case 6: System.out.println("Июнь : 30d"); break;
        case 7: System.out.println("Июль : 31d"); break;
        case 8: System.out.println("Август : 31d"); break;
        case 9: System.out.println("Сентябрь : 30d"); break;
        case 10: System.out.println("Октябрь : 31d"); break;
        case 11: System.out.println("Ноябрь : 30d"); break;
        case 12: System.out.println("Декабрь :31d"); break;
        default: System.out.println("Такого місяця нема в 2015 году");
    }
    }

}

