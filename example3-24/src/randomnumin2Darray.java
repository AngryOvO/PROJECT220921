import java.util.Random;

public class randomnumin2Darray
{
    public static void main(String[] args)
    {
        int [][] a = new int [4][4];

        Random r = new Random();

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                a[i][j] = r.nextInt(10);

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
