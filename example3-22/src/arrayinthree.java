import java.util.Scanner;

public class arrayinthree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[10];
        int [] b= new int[10];
        int count = -1;


        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] % 3 == 0)
            {
                count++;
                b[count] = a[i];
            }
        }

        System.out.printf("3의 배수는 :");
        for(int i = 0; i <= count; i++)
            System.out.printf(b[i] + " ");

    }
}
