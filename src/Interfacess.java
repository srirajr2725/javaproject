
interface Engine
{
  void enginetyepe();
}

interface wheel{
    String wheeltpe();

    default void concreate()
    {
        System.out.println("normal methods");
    }
}
class Car implements Engine,wheel{
    @Override
    public void enginetyepe() {
        System.out.println("car engine");
    }

    @Override
    public String wheeltpe() {
        return "car 4 wheel";
    }
}

public class Interfacess {
    public static void main(String[] args) {
        Car car=new Car();
        car.enginetyepe();
    }
}
