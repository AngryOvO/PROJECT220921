import java.util.Random;
import java.util.Scanner;

public class updown
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int a = r.nextInt(100);
        int n = sc.nextInt();

        while (n != a)
        {
            if (n > a)
                System.out.println("down");
            else if (n < a)
                System.out.println("up");

            n = sc.nextInt();
        }
        System.out.println(a + " 정답");
        System.out.println("re?(y/n)");

        String c = sc.next();
        while(true)
        {
            if (c.equals("y"))
            {
                a = r.nextInt(100);
                n = sc.nextInt();
                while (n != a)
                {
                    if (n > a)
                        System.out.println("down");
                    else if (n < a)
                        System.out.println("up");
                    n = sc.nextInt();

                }
                System.out.println(a + " 정답");
                System.out.println("re?(y/n)");
            }
            else if (c.equals("n"))
                break;
            c = sc.next();
        }
    }
}
