import java.util.EnumSet;
import java.util.Scanner;

enum Sign{
    RED("stop"),
    GREEN("go"),
    YELLOW("ready");

   private String sigmsg;
    Sign(String sigmsg)
    {
        this.sigmsg=sigmsg;
    }

    public String getSigmsg() {
        return sigmsg;
    }

    public void setSigmsg(Sign sigmsg) {
      switch (sigmsg){
          case RED ->
              System.out.println(sigmsg.getSigmsg());

          case GREEN ->
              System.out.println(sigmsg.getSigmsg());

          case YELLOW ->
              System.out.println(sigmsg.getSigmsg());
          default -> System.out.println("not matched");

      }
    }
}

public class Signals {
    public static void main(String[] args) {
try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your signal :");
    String string = sc.nextLine();
    String uppercase = string.toUpperCase();
    Sign sign=Sign.valueOf(uppercase);
    sign.setSigmsg(sign);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}




    }
}
