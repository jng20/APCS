/*
Team PinkLemonade:  Jacob Ng, Andrew Piatetsky, Emily Ortiz
APCS pd6
HW102: Heap On Heapin' On
2022-05-17
*/


/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

/*
QCC
We messed up minChildPos() because we forgot to account for "-1 if no children, or if input pos is not in ArrayList"
This led to many index out of bounds errors in remove() and any call of minChildPos()

Are we supposed to get an index out of bounds error after removing 10? We assume it's ok because we are trying to print an empty arraylist.

Jacob does not code well under pressure/under time constraints. He usually misses something simple that leads to more frustration and confusion which takes longer.
*/

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
      _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
      // level-order traversal of the tree
      String retString = "";
      for (Integer i : _heap) {
          retString += i + ",";
      }
      return retString;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
      return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap AKA the root
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
      if (isEmpty()) return null;
      return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * add as leaf, then "float" it up
   */
  public void add( Integer addVal )
  {
    int posVal = _heap.size();
    int posParent = findParent(posVal);
    _heap.add(addVal);

    while (_heap.get(posParent) > _heap.get(posVal)) {
      swap(posVal, posParent);
      posVal = posParent;
      posParent = findParent(posVal);
    }

    // if ( minOf(findParent(_heap.size()-1),addVal) == addVal)
  }//O(logn)? is it logn because we only traverse logn levels at most?


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * <swap smallest and last added elements, then resort by >
   */
  public Integer removeMin()
  {
    // int posLast = _heap.size()-1;
    // int curVal = _heap.get(0);
    //
    // int smallest = _heap.get(posLast);
    //
    // // swap and remove
    // swap(posLast, curVal);
    // _heap.remove(posLast);
    //
    // // re-sort and maintain invariant
    // if (_heap.get((curVal * 2) + 1) > _heap.get((curVal * 2) + 2)) {
    //   swap(curVal, (curVal * 2) + 2);
    //   curVal = (curVal * 2) + 2;
    // }
    // else {
    //   swap(curVal, (curVal * 2) + 1);
    //   curVal = (curVal * 2) + 1;
    // }
    //
    //
    // return smallest;

    int posLast = _heap.size()-1;
    int smallest = _heap.get(0);

    // swap and remove
    swap(posLast, 0);
    _heap.remove(posLast);

    int _rootindex = 0;

    // re-sort and maintain invariant
    //compare root value with smallest child. if root value is greater than min child then swap. set rootindex to the child.
    while( minChildPos(_rootindex) != -1 && _heap.get(_rootindex) > _heap.get(minChildPos( _rootindex )) ){
      int childswap = minChildPos( _rootindex );
      swap(_rootindex, minChildPos( _rootindex ));
      _rootindex = childswap;
    }
    return smallest;
  }//O(logn)? is it logn because we only traverse logn levels at most?


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
      int indxChildLeft = (pos * 2) + 1;
      int indxChildRight = (pos * 2) + 2;

      // if (minOf(_heap.get(indxChildLeft), _heap.get(indxChildRight)) == _heap.get(indxChildLeft)) {
      //   return indxChildLeft;
      // }
      // else {
      //     return indxChildRight;
      // }
      //System.out.println(_heap.toString() + " " + indxChildLeft + " " +  indxChildRight);
      if(pos >= _heap.size()){
        return -1;
      }
      else if(indxChildLeft >= _heap.size()){
          return -1;
      }else if (indxChildRight >= _heap.size()){
          return -1;
      }
      //if the min value of left and right children is the left child, return the index of left child
      else if(minOf(_heap.get(indxChildLeft), _heap.get(indxChildRight)).equals(_heap.get(indxChildLeft)) ){
        return indxChildLeft;
      } else{
        return indxChildRight;
      }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  private Integer findParent(int childIndex) {
      return (childIndex-1) / 2;
  }



  //main method for testing
  public static void main( String[] args )
  {

      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);


      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
/*
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
