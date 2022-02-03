// Nacho Patcho (Gabriel Thompson and Iggy, Faiza Huda, Truthful Tom and Huebert, Jacob Ng and PreGuac)
// APCS pd8
// HW55 -- Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: .7 hrs

/*
Disco
-O(log(n)) is significantly faster than O(n)
-addLinear has the same time complexity in any case
QCC
-Why is the get operation O(1) and not O(n)? Wouldn't java have to iterate up until that index?
*/

import java.util.*;
import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables

  /*
  The point is moot because we are just initializing an ArrayList() so it will always be O(1).
  There are no input variables so you can't have a time complexity.
  */
  public OrderedArrayList()

  {
	_data = new ArrayList();
  }

  /*
  Best Case: Nothing in the ArrayList so you're just adding the brackets so constant time thus O(1).
  Worst Case: The time complexity will be O(n) with n being the length of the ArrayList so to be the worst case n has to be as big as possible.
  */
  public String toString()
  {
    String arrayString = "[";
		for ( Integer num : _data ) arrayString += num + " ,";
		arrayString += "]";
		return arrayString;
  }


  /*
  Best Case: Removing the last Item in the ArrayList will have a time complexity of O(1) because nothing gets shifted and just the item is removed.
  Worst Case: Removing the first Item in the ArrayList will have a time complexity of O(n) because every remaining item shifts left 1.
  */
  public Integer remove( int i )
  {
	Integer Value = _data.get(i);
	_data.remove(i);
	return Value;
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
        return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index

  /*
  It will always be O(n) because if you add at the beginning, you must shift everything over. If you add at the end, you must iterate through
  the list and make a comparison each time. If you add in the middle, you are making comparisions up until that point, then shifting every
  element after.
  */
  public void addLinear(Integer newVal)
  {
    for (int=0; i < _data.size() - 1; i++) {
    if (newVal < _data.get(i)) {
    _data.add(i, newVal);
    return; }
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index

  /*
  Best Case:Adding element at the end of the List because the time complexity will be O(log(n)) since binary search's time complexity is O(log(n)).
  Since we are adding the element to the end, there will be no shifting.
  Worst Case:Adding element at the beginning of the List because you are maximizing the number of halves needed in the binary search part, then you have
  to shift everything over by 1. In the end, the time complexity would be O(n) since only care about the biggest degree of n.
  */
  public void addBinary(Integer newVal)
  {
    int left = 0;
    int right = _data.length - 1;
    while (left <= right) {
        int mid = left + (right -1) / 2;
        if (_data.get(mid) == newVal) {
            _data.add(mid, newVal);}
        if (_data.get(mid) < newVal) {
            left = mid + 1;}
        else { right = mid - 1;}

    }
  }

}
