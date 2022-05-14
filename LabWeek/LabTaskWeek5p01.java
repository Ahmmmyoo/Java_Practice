import java.util.Scanner;

public class LabTaskWeek5p01
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("\nHow Many Subjects : ");
        int subs = inp.nextInt();
        int subMark[] = new int[subs];
        for(int i = 0; i < subs; i++)
        {
            do
            {
                System.out.print("\nSubject "+(i+1)+" Marks : ");
                subMark[i] = inp.nextInt();
                if((subMark[i]<1)||(subMark[i]>10))
                System.out.print("Error... Range = (1-10)\n");
            }
            while((subMark[i]<1)||(subMark[i]>10));
        }
        System.out.print("\nResults : ");
        for(int i = 0; i < subs; i++)
        {
            System.out.print("\nSubject 1 : ");
            for(int j = 0; j < subMark[i]; j++)
            {
                System.out.print("*");
            }
        }
    } 
}
