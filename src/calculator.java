import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class calculator {


    public static int addi(int num[]) {
        int re = 0;
        for (int n : num) {
            re += n;
        }
        return re;
    }

    public static int sub(int num[]) {
        int re = num[0];
        for (int a=1;a<num.length;a++) {
            re -= num[a];
        }
        return re;
    }

    public static int multi(int num[]) {
        int re = 1;
        for (int n=0;n<num.length;n++) {
            re *= num[n];
        }
        return re;
    }
public static int div(int num[])
{
    int a=num[0];

    for (int i=1;i<num.length;i++)
    {
        a/=num[i];
    }
    return a;
}

    public static void main(String[] args) {

        boolean exe = true;

        while (exe) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter your digits");
            int digi = sc.nextInt();

            int[] nums = new int[digi];

            for (int a = 0; a < nums.length; a++) {
                System.out.println("enter your values" + a + 1);
                nums[a] = sc.nextInt();
            }

            System.out.println("Enter operator --> '+', '*', '-', '/' (to exit) enter x :");
            char opertor = sc.next().charAt(0);

//        System.out.println("Enter number 1 :");
//        double num1 = sc.nextDouble();
//

//
//        System.out.println("Enter number 2 :");
//        double num2 = sc.nextDouble();

            int result;


            switch (opertor) {

                case '+':
                    result = addi(nums);
                    System.out.println(result);
                    break;
                case '-':
                    result = sub(nums);
                    System.out.println(result);
                    break;
                case '*':
                    result = multi(nums);
                    System.out.println(result);
                    break;
            case '/' :
                    result =div(nums);
                    System.out.println(result);
                    break;
                case 'x':
                    exe=false;

                default:
                    System.out.println("Not divisible 0");

            }
        }
    }

    }
