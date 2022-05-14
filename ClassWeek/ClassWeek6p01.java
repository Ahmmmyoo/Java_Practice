import java.util.Scanner;

public class ClassWeek6p01 // Constructor
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
            int price;
            int width;
            int height;
            int depth;
            
            className() // constructor
            {
                System.out.println("Constructing Object");
                price = 0;
                width = 0;
                height = 0;
                depth = 0;
            }
            className(int a, int b, int c) // for price 222
            {
                System.out.println("Constructing Object for 222"); // creating square object
                System.out.print("Enter Number : ");
                int num = inp.nextInt();
                inp.nextLine();
                price = 222;
                width = num;
                height = num;
                depth = num;
            }

            void volume() // added methods next week (Week6)
            {
                int volume = width*height*depth ;
                System.out.print("\nVolume : "+volume);
            }
            void TSArea() // total surface area
            {
                int TSArea = ((2*(height*width))+(2*(height*depth))+(2*(width*depth))) ;
                System.out.print("\nTotal Surface Area : "+TSArea);
            }
        }
        
        //className[] ob = new className[classObjects] ;

        className[] ob ;
        ob = new className[classObjects] ;

        for(int i = 0 ; i < classObjects ; i++)
        {
            ob[i] = new className();
        }
        System.out.println("");

        for(int i = 0 ; i < classObjects ; i++)
        {
            System.out.print("\nObj "+(i)+" Enter Price : ");
            ob[i].price = inp.nextInt() ;
            if(ob[i].price == 0) continue ; // skips current loop ittiration if price = 0
            if(ob[i].price == 222) {ob[i] = new className(2, 2, 2); continue; }
            System.out.print("\nObj "+(i)+" Enter Width : ");
            ob[i].width = inp.nextInt();
            System.out.print("\nObj "+(i)+" Enter Height : ");
            ob[i].height = inp.nextInt();
            System.out.print("\nObj "+(i)+" Enter Depth : ");
            ob[i].depth = inp.nextInt();
        }

        for(int i = 0 ; i < classObjects ; i++)
        {
            System.out.print("\n\nObj : "+(i));
            System.out.print("\nPrice : "+ob[i].price);
            if(ob[i].price == 0) continue ; // skips current loop ittiration if price = 0
            System.out.print("\nWidth : "+ob[i].width);
            System.out.print("\nHeight : "+ob[i].height);
            System.out.print("\nDepth : "+ob[i].depth);
            ob[i].volume();
            ob[i].TSArea();
        }
    }    
}