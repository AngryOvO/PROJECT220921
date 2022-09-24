import java.util.Scanner;

public class WhileSample
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하고 입력을 끝내고 싶으면 -1을 입력하세요");

        int n = sc.nextInt();
        while(n != -1)
        {
            sum = sum + n;
            count++;
            n = sc.nextInt();
        }
        System.out.print("입력된 정수의 개수 : " + count);
        System.out.println("입력된 정수의 평균 : " + (double)sum/count);
    }
}
