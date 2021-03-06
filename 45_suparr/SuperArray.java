/*****************************************************
  * Team Turtle Hats
  * Jacob Ng Kevin Cheng Hamim Seam
  * APCS
  * HW45 -- Array of Titanium
  * 2021-12-07
  * Time spent: 2 hrs
  *****************************************************/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

/*
Disco
-abstract methods can have parameters
-methods in the class must have same heading and parameters (with exception of parameter name)
as the methods in the interface in order for the class to override the interface?
Q/C/C
-java error class is not abstract and does not override abstract method kept popping up
-The methods that had the most problems were set(), size() and add()
-We don't know why size() had issues since they had the same headers in both files but eventually
when we fixed the other methods it went away
-Problems went away when we put in parameters for the abstract methods in the interface
-We had to change add to return a bool because add in the interface returned a bool
-intertrash is good and bad
-What is the point of an interface?
-How do we Modify main() in SuperArray to test ListInt’s methods if ListInt's methods are abstract?
*/
public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public boolean add( int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */

    set(_size, newVal);
    _size++;
    return true;
  }


  //inserts an item at index
  public boolean add( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    if(index < _size){
      _size = _size + 1;
      for (int i = _size - 1; i>index; i--){
          set(i, _data[i - 1]);
      }
      set(index, newVal);
      return true;
    }
    else{
      System.out.println("out of bounds bro");
      return false;
    }
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    //int temp = _size;
    //_size = index;
    if(index < _size){
        for (int i = index; i<_size; i++){
          set(i, _data[i + 1]);
        }
        _size = _size - 1;
    }
    else{
      System.out.println("out of bounds bro");
    }
  }


  //return number of meaningful items in _data
  public int size()
  {
    /* YOUR IMPLEMENTATION HERE */
    return _size;
  }



  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }



      SuperArray mayfield = new SuperArray();

      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);
      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);



      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);

      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);

      System.out.println(mayfield.size());

      ListInt Bob = new SuperArray();
      System.out.println(Bob.add(2));
      System.out.println(Bob);
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
