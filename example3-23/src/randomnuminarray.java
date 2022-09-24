import java.util.Random;

public class randomnuminarray
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int [] a = new int[10];
        int sum = 0;
        double avg;

        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt(10);
            sum += a[i];
        }

        System.out.printf("랜덤한 정수들 ");
        for(int i = 0; i < a.length; i++)
            System.out.printf("%d ",a[i]);

        avg = (double)sum / a.length;

        System.out.printf("\n평균 : %f",avg);

    }
}
