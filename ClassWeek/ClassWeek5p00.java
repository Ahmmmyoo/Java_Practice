import java.util.Scanner;

public class ClassWeek5p00
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        //System.out.print("\nEnter Class Name : ");
        //String className = inp.next();
        System.out.print("\nEnter No. of Objects : ");
        int classObjects = inp.nextInt();
        class className
        {
            int price = 0 ;
            int width = 0 ;
            int height = 0 ;
            int depth = 0 ;

            void volume() // added methods next week (Week6)
            {
                int volume = width*height*depth ;
                System.out.print("\nVolume : "+volume);
            }
        }
        
        //className[] ob = new className[classObjects] ;

        className[] ob ;
        ob = new className[classObjects] ;

        for(int i = 0 ; i < classObjects ; i++)
        {
            ob[i] = new className();
        }

        for(int i = 0 ; i < classObjects ; i++)
        {
            System.out.print("\nObj "+(i+1)+" Enter Price : ");
            ob[i].price = inp.nextInt() ;
            System.out.print("\nObj "+(i+1)+" Enter Width : ");
            ob[i].width = inp.nextInt();
            System.out.print("\nObj "+(i+1)+" Enter Height : ");
            ob[i].height = inp.nextInt();
            System.out.print("\nObj "+(i+1)+" Enter Depth : ");
            ob[i].depth = inp.nextInt();
        }

        for(int i = 0 ; i < classObjects ; i++)
        {
            System.out.print("\n\nObj : "+(i+1));
            System.out.print("\nPrice : "+ob[i].price);
            System.out.print("\nWidth : "+ob[i].width);
            System.out.print("\nHeight : "+ob[i].height);
            System.out.print("\nDepth : "+ob[i].depth);
            ob[i].volume();
        }
    }    
}