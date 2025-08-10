




abstract class Vechile{

    abstract void direction();
    public String Vech()
    {
        return "vvechile class";
    }

}
class Bike extends Vechile{

    public void direction()
    {
        System.out.println("bike moving left corner side");
    }
public String engine()
{
    return "bike engine";
}

}




public class Abs {
    public static void main(String[] args) {

        Vechile bike=new Bike();

        bike.direction();
        bike.Vech();

        Bike b2=(Bike) bike;
        b2.engine();

    }
}
