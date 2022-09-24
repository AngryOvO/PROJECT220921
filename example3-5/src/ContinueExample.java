import java.util.Scanner;

public class ContinueExample
{
    public static void main(String[] args)
    {
        int a;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 5개 입력하세요");
        for(int i = 0; i < 5; i++)
        {
            a = sc.nextInt();
            if(a < 0)
            {
                continue;
            }
            else
            {
                sum = sum + a;
            }
        }
        System.out.println("양수들의 합은 : " + sum);
    }
}
