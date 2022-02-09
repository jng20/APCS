// Team Two Blue Pandas (Jacob Ng, PreGuac, Emily Ortiz, Applesauce)
// APCS pd6
// HW61: Instructions so Simple...
// 2022-02-08
// time spent: 2 hrs

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  1.Check if input array is of size 1 or less because that means it's sorted.
  2.If not,then split the array into 2 halves.
  3.Repeat step 1 for each half
  4. When both halves are sorted, merge and sort them.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int aCtr = 0;
    int bCtr = 0;
    int outputCtr = 0;
    int lengtha = a.length;
    int lengthb = b.length;
    int[] output = new int[a.length + b.length];

    // for (int i = 0; i < output.length; i++){
    //
    //   if (aCtr != lengtha){
    //     if(a[aCtr] < b[bCtr]){
    //       output[i] = a[aCtr];
    //       aCtr ++;
    //     }
    //   }else {
    //       if(bCtr != lengthb){
    //         output[i] = b[bCtr];
    //         bCtr++;
    //       }
    //   }
    // }
    while(aCtr < lengtha && bCtr < lengthb){
        if(a[aCtr] < b[bCtr]){
            output[outputCtr] = a[aCtr];
            aCtr ++;
            outputCtr++;
        }else {
              output[outputCtr] = b[bCtr];
              bCtr++;
              outputCtr++;
        }
    }

    if(aCtr == lengtha){
        for(int i = bCtr; i < lengthb; i++){
          output[outputCtr] = b[i];
          outputCtr++;
        }
    }
    else{
        for(int i = aCtr; i < lengtha; i++){
          output[outputCtr] = a[i];
          outputCtr++;
        }
    }
    return output;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
      if(arr.length <= 1){
        return arr;
      }
      int mid = arr.length/2;
      int[] firsthalf = new int[mid];
      int[] secondhalf = new int[arr.length - mid];

      for(int i = 0; i < mid; i++){
        firsthalf[i] = arr[i];
      }
      for(int i = mid; i < arr.length; i++){
        secondhalf[i-mid] = arr[i];
      }
      return merge(sort(firsthalf), sort(secondhalf));


  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );


      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nMerging arr4 and arr1: ");
      printArray( merge(arr4,arr1) );


      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
