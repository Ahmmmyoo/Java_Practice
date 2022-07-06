public class Random00 {
	public static void main(String args[]) {


		System.out.print("\nTrying someting new\n");

		System.out.println("Starting Values : a=3  b=5  c=1  x=2  y=-2  z=6");
		int a, b, c, x, y, z ;
		int ans = 0; // to store answer of each question
		int v1, v2, v3, v4;

		// Q3
		a=3; b=5; c=1; x=2; y=-2; z=6; // initializing values
		v1 = x;
		v2 = ++x;
		v3 = x--;
		v4 = x;
		System.out.println(" a:"+a+" b:"+b+" c:"+c+" x:"+x+" y:"+y+" z:"+z);
		System.out.println(" v1:"+v1+" v2:"+v2+" v3:"+v3+" v4:"+v4);
		ans = x + ++x * x-- ;
		System.out.println("Answer 3: "+ans);
		ans = v1 + v4 * v3;
		System.out.println("Answer 3:(wro) "+ans);
		ans = v1 + v2 * v3;
		System.out.println("Answer 3:(acc) "+ans);

	



	}
}