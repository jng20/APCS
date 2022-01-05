public class test{

	public static void main(String[] args){
		int[] a, b, c;
		a = new int[3];
		b = new int[3];
		a[0]= 0;
		a[1]= 1;
		a[2]= 2;
		b=a;

		for ( int i = 0; i<b.length; i++){
			System.out.println(b[i]);
		}
		System.out.println("\n");
		System.out.println( "This is the address of a: " + a);
		System.out.println( "This is the address of b: " + b);

		System.out.println("\n");
		//They have the same memory address
		System.out.println("They have the same memory address");

		System.out.println("\n");
		//change an element in b
		System.out.println("change an element in b");
		b[2]= 90000000;
		System.out.println("\n");
		System.out.println("The value of b[2]: " + b[2]);
		System.out.println("The value of a[2]: "+ a[2]);

		System.out.println("\n");
		//elements in both arrays changed even though only b[2] was changed
		System.out.println("elements in both arrays changed even though only b[2] was changed");

		System.out.println("\n");
		//a and b point to the same thing so when we did b=a we set b to point to wherever a pointed to.
		System.out.println("a and b point to the same thing so when we did b=a we set b to point to wherever a pointed to");

		System.out.println("\n");
		//Java is pass by reference then since a copy isn't made?
		System.out.println("java is pass by reference then since a copy isn't made?");

		System.out.println("\n");
		//Create a new array c with length of 5 instead of 3
		System.out.println("Create a new array c with length of 5 instead of 3");
		c = new int[5];

		System.out.println("\n");
		//Length of array c before setting c = to b
		System.out.println("This is length of array c before setting equal to b: " + c.length);

		System.out.println("\n");
		c = b;
		for (int i = 0; i < c.length; i++){
			System.out.println(c[i]);
		}

		System.out.println("\n");
		System.out.println( "This is the address of a: " + a);
                System.out.println( "This is the address of b: " + b);
		System.out.println("This is the address of c: " + c);
		System.out.println("This is now the length of c: " + c.length);

		System.out.println("\n");
		//Even though c was originally length 3, it becomes length 5.
		System.out.println("Even though c was originally length 5, it becomes length 3");
	}

}
