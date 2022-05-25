public class ArrayIntoFucrion {

    public static int func(int[] n) {
        int x = 0;
        for(int i=0; i<n.length;i++) {
            x += n[i];
        }
        return x;
    }


    public static void main(String[] args) {


        func(new int[] {2,3,5});
        func(new int[] {2,4,5,3});

    }
    
}
