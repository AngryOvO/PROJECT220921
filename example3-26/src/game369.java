public class game369
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 100; i++)
        {
            if(i > 10)
            {
                if(((i/10) % 3 == 0 )&& (i%10)%3 == 0)
                    System.out.printf("%d 박수 짝짝\n",i);
                else if ((i/10 == 3 ) || (i%10)%3 == 0)
                    System.out.printf("%d 박수 짝\n",i);
            }
            else
            {
                if( i % 3 == 0)
                    System.out.printf("%d 박수 짝\n",i);
            }
        }
    }
}
