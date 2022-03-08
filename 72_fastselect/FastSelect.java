// Team Pink Lemonade (Ariella Katz, Jacob Ng, Emily Ortiz)
// APCS pd6
// HW72: So So Fast
// 2022-03-08

/*
DISCO

QCC
This is similar to binary search but we can use an unsorted list.

It doesn't matter what we use as the pivot because the S value(place of the partition) is what we care about.
To stay consistent we'll use the last index as the pivot whenever we use partition. 

ALGO 
Run partition on the array with the last index being the pivot. If S (place of the partition) = y then return the pivot value. Else:
    - If S is less than y, we know that the values on the left of s are also smaller than y so we need to look at the values to the right of s.
        -Run partition again but change the range from s to the end and subtract s from y.
    - If S is more than y, we know that the values on the right of s are also greater than y so we need to look at the values to the left of s.
        - Run partition again but change the range from beginning to s
BEST CASE SCENARIO: 
WORST CASE SCENARIO: 
Include test cases in main() method illustrating each best- and worst-case scenario.
*/

public class FastSelect{
    
     private static int[] foo = {7,1,5,12,3};
     
     public static void swap( int x, int y, int[] o ){
        int tmp = o[x];
        o[x] = o[y];
        o[y] = tmp;
     }

    //print input array 
    public static void printArr( int[] a ){
        for ( int o : a )
            System.out.print( o + " " );
            System.out.println();
    }

  //shuffle elements of input array
    public static void shuffle( int[] d ){
        int tmp;
        int swapPos;
        for( int i = 0; i < d.length; i++ ) {
            tmp = d[i];
            swapPos = i + (int)( (d.length - i) * Math.random() );
            swap( i, swapPos, d );
        }
    }
    
  //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ){
        int[] retArr = new int[s];
        for( int i = 0; i < retArr.length; i++ )
            retArr[i] = (int)( maxVal * Math.random() );
        return retArr;
    }
    
    public static int partition( int arr[], int first, int end, int pivot){
	    //printArr(arr);
	    int v = arr[pivot];
		swap(pivot, end, arr);
		int s = first;  //where the pivot will end up at the end of function aka where the array is split
		
		for(int i = 0; i < end; i++){
			if(arr[i] < v){
				swap(i, s, arr);
				s++;
			}
		}
		swap(end, s, arr);
		//printArr(arr);
		return s;
    }
    
    public static int fastSelect(int y, int array[], int first, int end, int pivot){
        int s = 0;
        int length = array.length;
        
        if(partition(array, first, end, pivot) < (y - 1)){     // y-1 because the yth element is the y - 1 index.
            s = partition(array, first, end, pivot);
            return fastSelect(y-s,array, s+1, length, length);
            
        }else if(partition(array, first, end, pivot) > (y - 1) ){    
            s = partition(array, first, end, pivot);
            return fastSelect(y, array, first, s-1, s-1);
            
        }else{
            return array[pivot];
        }
    }
    
    public static void main(String[] args){
		//partition(foo, 0, 4, 2);
		fastSelect(3, foo, 0, 4, 4);
	}
}


