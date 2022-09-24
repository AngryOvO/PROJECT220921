import java.util.Scanner;

public class BreakExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            String text = sc.nextLine();

            if(text.equals("exit"))
                break;
            else
                System.out.println(text);
        }
        System.out.println("프로그램을 종료합니다. 안녕~");

        sc.close();
    }
}
