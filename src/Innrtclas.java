
class Outer{
  static   class Inner{

        public void helloall()
        {
            System.out.println("inner class called");
        }



    }




}


public class Innrtclas {
    public static void main(String[] args) {
        Outer.Inner outer=new Outer.Inner();

//        Outer.Inner inn=outer.new Inner();

//        inn.helloall();

        outer.helloall();

    }
}
