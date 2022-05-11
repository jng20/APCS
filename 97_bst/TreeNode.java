/*
Team PinkLemonade:  Jacob Ng, Andrew Piatetsky, Emily Ortiz
APCS pd6
HW97: Prune Your Tree
2022-05-11
time spent: _ hrs
*/

/*
QCC: Does the first insert create the root or should the root be a fixed value?
What to do if the value already exists in tree?

*/
/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  TreeNode( int initValue )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _cargo = initValue;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    this(initValue);
    _lt = initLeft;
    _rt = initRight;
  }


  /**
   * Returns the left subtree of this node.
   */
  TreeNode getLeft()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return _lt;
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return _rt;
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return _cargo;
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _lt = theNewLeft;
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _rt = theNewRight;
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _cargo = theNewValue;
  }

  public String toString(){
    String ret = "";
    //if( )
    String left;
    String right;
    if (_lt != null)
      left = "" + _lt.getValue();
    else
      left = "null";

    if (_rt != null)
      right = "" + _rt.getValue();
    else
      right = "null";
    ret = ret + _cargo + " \nleft node: " + left + " \nright node: " + right ;
    return ret;
  }

}//end class
