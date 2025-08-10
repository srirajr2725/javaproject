
//class staff
//{
//    String book;
//
//    staff(String met)
//    {
//    book=met;
//    }
//}
//class students
//{
//   staff aaa;
//
//   students(staff aaa)
//   {
//       this.aaa=aaa;
//   }
//   public void couchingby()
//        {
//            System.out.println("staff couching by "+aaa.book);
//        }
//}


import java.util.Objects;

public class inheritance {

    String txt;
    inheritance(String txt)
    {

        this.txt=txt;
    }

    @Override
    public String toString() {
        return txt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        inheritance that = (inheritance) o;
        return Objects.equals(txt, that.txt);
    }





    public static void main(String[] args) {
//        staff aaa=new staff("java");
//        students s1=new students(aaa);
//        s1.couchingby();

        inheritance inheritance=new inheritance("this is from inhr");
        inheritance inheritance1=new inheritance("this is from inhr");


        String str=new String("hii");
        String str1=new String("hii");
        System.out.println(str.equals(str1));

        System.out.println(inheritance.equals(inheritance1));


    }

}
