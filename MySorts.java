import java.util.ArrayList;

public class MySorts {

	public static void bubbleSort( ArrayList<Comparable> data ) {
		for ( int i = 0; i < data.size() - 1; i++ ) {
			for ( int j = data.size() - 1; j > 0; j-- ) {
				if ( data.get(j).compareTo( data.get(j - 1) ) < 0 ) {
					Comparable temp = data.get(j);
					data.set( j, data.get(j - 1) );
					data.set( j - 1, temp );
				}
			}
		}
		return;
	}

	public static void selectionSort( ArrayList<Comparable> data ) {
		for ( int i = 0; i < data.size() - 1; i++ ) {
			for ( int j = data.size() - 1; j > 0; j-- ) {
				if ( data.get(j).compareTo( data.get(j - 1) ) < 0 ) {
					Comparable temp = data.get(j);
					data.set( j, data.get(j - 1) );
					data.set( j - 1, temp );
				}
			}
		}
		return;
	}

  public static void insertionSort( ArrayList<Comparable> data )
  {
    for( int partition = 0; partition < data.size() - 1; partition++ ) {
      //partition marks first item in unsorted region

      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition + 1; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( (data.get(i)).compareTo(data.get(i - 1)) < 0 ) {
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i - 1);
	  data.set(i - 1, data.get(i));
	  data.set(i, temp);
        }
        else
          break;
      }
    }
    return;
  }

  public static void main( String [] args )
  {


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      ArrayList glen1 = new ArrayList<Integer>();
      glen1.add(7);
      glen1.add(1);
      glen1.add(5);
      glen1.add(12);
      glen1.add(3);
      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);

      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSort(glen);
      System.out.println( "ArrayList glen after bubble:\n" + glen );

      System.out.println( "ArrayList glen1 before sorting:\n" + glen1 );
      selectionSort(glen1);
      System.out.println( "ArrayList glen1 after selection:\n" + glen1 );

      System.out.println( "ArrayList glen2 before sorting:\n" + glen2 );
      insertionSort(glen2);
      System.out.println( "ArrayList glen2 after insertion:\n" + glen2 );


 }
}
