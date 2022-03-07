// Team Blue Pandas (Jacob Ng, PreGuac, Andrew Piatetsky, Burnt Peanut, Emily Ortiz, Applesauce)
// APCS pd6
// HW71: Whut Dis.
// 2022-03-07

/*
DISCO
Absolutely nothing. Everything we hypothesized in our group was wrong. Only thing still standing is that 
we have 2 sections: 1 section full of the numbers less than what was at index c or in our code, int middle
		     1 section full of the numbers greater than what was at index c or in our code, int middle
QCC
Suspect Pivot Sort? Maybe int middle really shouldn't be the middle but the pivot? Don't know if 
int begin and begin end are correct.
Jacob - don't know what pivot sort is but heard of it and this pseudocode seems like there's a pivot.

q0: What does it do?
the list is split into 2 sections: one for values greater than arr[c] and one for values less than arr[c]

q1: What is its Big-Oh runtime?
O(n) because we have one for loop and it traverses the list once.
*/
public class Mysterion{
	
	private static int[] foo = {7,1,5,12,3};
	private static int[] foo1 = {1,2,3,4,5};
	private static int[] foo2 = {7,5,6,19,91};
	private static int[] foo3 = {7,91,78,19,91};
	private static int[] foo4 = {68,91,78,19,91};
	private static int[] foo5 = {7,1,5,12,3,22,16};
	private static int[] foo6 = {9, -3, 5, 2, 6, 8, -6, 1, 3};
	
	public static void mysterion(int[] List, int begin, int middle, int end){
	
		for(int item : List){
			System.out.print(item);
			System.out.print(", ");
		}
		System.out.println();
		
		int v = List[middle];
		int temp = 0;
		temp = List[middle];
		List[middle] = List[end];
		List[end] = temp;
		int s = begin;
		
		for(int i = 0; i < end; i++){
			if(List[i] < v){
				temp = List[i];
				List[i] = List[s];
				List[s] = temp;
				s++;
			}
		}
		temp = List[end];
		List[end] = List[s];
		List[s] = temp;
		
		for(int item : List){
			System.out.print(item);
			System.out.print(", ");
		}
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args){
		mysterion(foo, 0, 2, 4);
		mysterion(foo1, 0, 2, 4);
		mysterion(foo2, 0, 2, 4);
		mysterion(foo3, 0, 2, 4);
		mysterion(foo4, 0, 2, 4);
		mysterion(foo5, 0, 3, 6);
		mysterion(foo6, 0, 4, 8);
	}
}

