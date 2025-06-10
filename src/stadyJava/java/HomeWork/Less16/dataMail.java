package HomeWork.Less16;


public class dataMail {
    String mail = "ya@yaho.com;  on@mail.ru;  ona@gmail.com;";
    public static void mails( String mails) {
        int d1=0;//@
        int d2=0;//.
        int d3=0;//;
        int a = mails.length();
        while (d3 < mails.length()){
            d1 = mails.indexOf('@',d3);
            d2=mails.indexOf('.',d3);
   
            d3 = mails.indexOf(';',d3+1);
            System.out.println(mails.substring(d1+1, d2));

        }



    }


    public static void main(String[] args) {
        dataMail d = new dataMail();
        mails("ya@yaho.com; on@mail.ru; ona@gmail.com;");
      // System.out.println( d.mail.substring(2,5));

    }
}



//            if (d1 == '@') {
//                System.out.println(mails.substring((i + 1), mails.indexOf('.')));
//            }
