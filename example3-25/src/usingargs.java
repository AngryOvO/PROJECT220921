public class usingargs
{
    public static void main(String[] args)
    {
        int sum = 0;
        double avg = 0.0;

        for(int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);

        avg = (double)sum / args.length;

        System.out.printf("%f",avg);
    }
}
