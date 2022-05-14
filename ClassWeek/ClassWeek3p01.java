public class ClassWeek3p01
{
    public static void main(String[] args)
    {
        int i ;
        int sum ;

        System.out.println("");
        System.out.println("Program 1 : Numbers");
        for (i = 0 ; i < 15 ; i = i + 1)
        {
            sum = 0 ;
            sum = sum + i ;
            System.out.print("\t"+sum);
        }

        System.out.println("");
        System.out.println("Program 2 : Odd Numbers");
        for (i = 1 ; i < 30 ; i = i + 2)
        {
            sum = 0 ;
            sum = sum + i ;
            System.out.print("\t"+sum);
        }

        System.out.println("");
        System.out.println("Program 3 : Even Numbers");
        for (i = 0 ; i < 30 ; i = i + 2)
        {
            sum = 0 ;
            sum = sum + i ;
            System.out.print("\t"+sum);
        }

        System.out.println("");
        System.out.println("Program 4 : Series Summation");
        sum = 0 ;
        for (i = 0 ; i < 15 ; i = i + 1)
        {
            sum = sum + i ;
            System.out.print("\t"+sum);
        }
    }
}
