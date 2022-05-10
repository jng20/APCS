/*
Team PinkLemonade:  Jacob Ng, Andrew Piatetsky, Emily Ortiz
APCS pd6
HW96: BSTs is the Perfect Place for Shade
2022-05-09
time spent: _ hrs
*/

/*
QCC: Does the first insert create the root or should the root be a fixed value?
What to do if the value already exists in tree?

*/


/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _root = new TreeNode(0);
    // _root = null;

  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    /*** YOUR IMPLEMENTATION HERE ***/
    insert(_root, newNode);

  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/


      if(stRoot.getValue() > newNode.getValue()){
          if(stRoot.getLeft() == null){
              stRoot.setLeft(newNode);
          }else{
              insert(stRoot.getLeft(), newNode);
          }
      }else if (stRoot.getValue() < newNode.getValue()){
          if(stRoot.getRight() == null){
              stRoot.setRight(newNode);
          }else{
              insert(stRoot.getRight(), newNode);
          }
      }

  }//end insert()




  /*~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~
      pre 421356
      in 123456
      post 132654
  */

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode == null) return;
    System.out.println(currNode.getValue());
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode == null) return;
    inOrderTrav(currNode.getLeft());
    System.out.println(currNode.getValue());
    inOrderTrav(currNode.getRight());

  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode == null) return;
    postOrderTrav(currNode.getLeft());
    postOrderTrav(currNode.getRight());
    System.out.println(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   *****************************************************/
  TreeNode search( int target )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    //use insert method, but instead of inserting we compare when the cargo equals our int. Then we create a pointer and point it to the node.
      return search( target, _root);
  }

  TreeNode search( int target, TreeNode current ){
    if(current == null){
        return null;
    }
    if(current.getValue() == target){
      TreeNode pointer = current;
      return pointer;
    }
    else if(current.getValue() > target){
      return search(target, current.getLeft());
    }
    else if (current.getValue() < target){
      return search(target, current.getRight());
    }else{
      return null;
    }
  }


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 1
   *****************************************************/
  public int height()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    //ask child how tall you are and add 1
      return height(_root) -1 ;
  }

  public int height(TreeNode current){
        if(current == null){
            return 0;
        }
        // if(current.getLeft() == null && current.getRight() == null){  //if leaf return 1
        //     return 1;
        // }
        //return 1 + max of left and right tree.
        else if( height( current.getLeft() ) > height( current.getRight() ) ){    //if left tree is greater
            return 1 + height( current.getLeft() );
        }else{ //if( height( current.getRight() ) > height( current.getLeft() ) ){
            return 1 + height( current.getRight() );
        }

  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   *****************************************************/
  public int numLeaves()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    //Use a traversal because but instead of going all the way until the current node is null, just check that left and right == null, then counter++
        return numLeaves(_root);
  }

  public int numLeaves(TreeNode current){
    //!left && !right
    if(current == null){
        return 0;
    }
    if(current.getLeft() == null && current.getRight() == null){  //if leaf return 1
        return 1;
    }else {                                                       //else keep going
        return numLeaves(current.getLeft()) + numLeaves(current.getRight());
    }
  }




  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();
        //BST arbol1 = new BST();
        //arbol1.insert(1);
      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );

      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");

      System.out.println( "\n-----------------------------");
      System.out.println( "Search for 5: " + arbol.search(5));

      System.out.println( "\n-----------------------------");
      System.out.println( "Search for 10: " + arbol.search(10));

      System.out.println( "\n-----------------------------");
      System.out.println( "Number of Leaves: " + arbol.numLeaves());
      System.out.println( "Should be 3");

      System.out.println( "\n-----------------------------");
      System.out.println( "Height: " + arbol.height());
      System.out.println( "Should be 3");

    //  System.out.println( "Height: " + arbol1.height());
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
