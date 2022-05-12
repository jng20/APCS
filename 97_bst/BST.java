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
 * class BST
 * v2:partial
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
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else //recurse down left subtree
        insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else //recurse down right subtree
        insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~
  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  public String inOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += inOrderTravStr( currNode.getLeft() );
    retStr += " " + currNode.getValue();
    retStr += inOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String preOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += " " + currNode.getValue();
    retStr += preOrderTravStr( currNode.getLeft() );
    retStr += preOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String postOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += postOrderTravStr( currNode.getLeft() );
    retStr += postOrderTravStr( currNode.getRight() );
    retStr += " " + currNode.getValue();
    return retStr;
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //~~~~~~~~~~~~~v~~MISC.HELPERS~~v~~~~~~~~~~~~~~~~~~~
  public boolean isLeaf( TreeNode node )
  {
    return ( node.getLeft() == null
             &&
             node.getRight() == null );
  }
  //~~~~~~~~~~~~~^~~MISC.HELPERS~~^~~~~~~~~~~~~~~~~~~~


  //overridden toString
  public String toString()
  {
    return
      " pre-order trav:" + preOrderTravStr( _root ) + '\n' +
      "  in-order trav:" + inOrderTravStr( _root ) + '\n' +
      "post-order trav:" + postOrderTravStr( _root ) + '\n' +
      "         height: " + height() + '\n' +
      "     num leaves: " + numLeaves()
      ;
  }


  /**
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   */
  TreeNode search( int target )
  {
    return search( target, _root );
  }
  TreeNode search( int target, TreeNode currNode )
  {
    if ( currNode==null || currNode.getValue()==target )
      return currNode;
    else if ( target < currNode.getValue() )
      return search( target, currNode.getLeft() );
    else if ( target > currNode.getValue() )
      return search( target, currNode.getRight() );
    else
      return null; //to get past compiler
  }


  /**
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 0
   */
  public int height()
  {
    return height( _root );
  }
  //recursive helper for height()
  public int height( TreeNode currNode )
  {
    if ( currNode==null ) //Q: Why cannot use .equals() ?
      return 0;
    if ( isLeaf(currNode) )
      return 0;
    else //height is 1 for this node + height of deepest subtree
      return 1 + Math.max( height(currNode.getLeft()),
                           height(currNode.getRight()) );
  }


  /**
   * int numLeaves()
   * returns number of leaves in tree
   */
  public int numLeaves()
  {
    return numLeaves( _root );
  }
  public int numLeaves( TreeNode currNode ) {
    int foo = 0;
    if ( currNode == null )
      return 0;
    foo += numLeaves( currNode.getLeft() );
    if ( isLeaf(currNode) )
      foo++;
    foo += numLeaves( currNode.getRight() );
    return foo;
  }


  TreeNode searchParent( int target )
  {
    return searchParent( target, _root );
  }
  TreeNode searchParent( int target, TreeNode currNode )
  {
    if(currNode.getValue() == target)
        return null;
    else if ( currNode.getLeft().getValue()==target || currNode.getRight().getValue()== target)
      return currNode;
    else if ( target < currNode.getValue() )
      return searchParent( target, currNode.getLeft() );
    else if ( target > currNode.getValue() )
      return searchParent( target, currNode.getRight() );
    else
      return null; //to get past compiler

       //to get past compiler
  }

  // static boolean isLeaf( TreeNode ask){
  //     return (ask.getLeft() == null && ask.getRight() == null);
  // }


  /**
   * TreeNode remove()
   * removes node and keeps order of binary tree
   */
  TreeNode remove( int target )
  {
    //Find node to remove
    TreeNode tar = search( target );
    TreeNode parent = searchParent( target );
    if(tar == null){
      return null;
    }
    if(parent == null){
      parent = tar;
    }
    return remove(tar, parent);

  }
  TreeNode remove( TreeNode target, TreeNode parent )
  {

      if(isLeaf(target)){                                 //leaf
        return remove0( target, parent);
      }

      //1 child
      else if(target.getLeft() != null && target.getRight() == null){
        return remove1(target, parent);
      }
      else if(target.getLeft() == null && target.getRight() != null){
        return remove1(target, parent);
      }

      //2 child
      else if(target.getLeft() != null && target.getRight() != null){
        return remove2(target, parent);
      }
      return null;

  }

  TreeNode remove0( TreeNode target, TreeNode parent ){                     //If target is a leaf, remove it      target.getLeft() == null && target.getRight() == null
        if(parent == target){
            target = null;
            _root = target;
            return target;
        }
        if(parent.getLeft() == target){
            parent.setLeft(null);
        }else{
            parent.setRight(null);
        }
        return target;                                            //return removed node
  }
  TreeNode remove1( TreeNode target, TreeNode parent ){
        if (parent == target){
            if(target.getLeft() != null) {
              //System.out.println("here");
              target = target.getLeft();
              parent = target;
              _root = target;
              //System.out.println("here");
              //System.out.println(target);
            }else{
              target = target.getRight();
              parent = target;
              _root = target;
              //System.out.println("here2");
            }
            return target;
        }
        if (target == parent.getLeft()){                      //target is left child of parent
                if(target.getLeft() != null && target.getRight() == null){       // target only has leftchild
                    parent.setLeft(target.getLeft());
                }else{
                    parent.setLeft(target.getRight());
                }
                return target;
        }
        else if (target == parent.getRight()){                      //target is right child of parent
                if(target.getLeft() == null && target.getRight() != null){       // target only has rightchild
                    parent.setRight(target.getRight());
                }else{
                    parent.setRight(target.getLeft());
                }
                return target;
        }
        return target;
  }
  TreeNode remove2( TreeNode target, TreeNode parent ){       //
    if (parent == target){
      TreeNode temp = target.getLeft();
      if(isLeaf(target.getLeft()) == true ){
          target.getLeft().setRight(target.getRight());
      }else{
          while(!isLeaf(temp)){
              temp = temp.getRight();
          }
          temp.setRight(target.getRight());
      }
      _root= target.getLeft();
    }
    else if (target == parent.getLeft()){
        TreeNode temp = target.getLeft();
        if(isLeaf(target.getLeft()) == true ){
            target.getLeft().setRight(target.getRight());
        }else{
            while(!isLeaf(temp)){
                temp = temp.getRight();
            }
            temp.setRight(target.getRight());
        }
        parent.setLeft(target.getLeft());

    }else if (target == parent.getRight()){
        TreeNode temp = target.getLeft();
        if(isLeaf(target.getLeft()) == true ){
            target.getLeft().setRight(target.getRight());
        }else{
            while(!isLeaf(temp)){
                temp = temp.getRight();
            }
            temp.setRight(target.getRight());

        }
        parent.setRight(target.getRight());
    }
    return target;

  }



//target has only 1 child that is a leaf and target is right child of parent


  //main method for testing
  public static void main( String[] args ) {

      BST arbol = new BST();

      System.out.println( "tree init'd: " + arbol );

      //inserting in this order will build a perfect tree
      /*
      arbol.insert( 3 );
      arbol.insert( 1 );
      arbol.insert( 0 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 4 );
      arbol.insert( 6 );

      */

      //insering in this order will build a linked list to left

      arbol.insert( 6 );
      arbol.insert( 5 );
      arbol.insert( 3 );
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 1 );
      arbol.insert( 0 );
        /*
      */

      System.out.println( "tree after insertions:\n" + arbol );
      System.out.println();

      System.out.println();
      for( int i=-1; i<8; i++ ) {
          System.out.println(" searching for "+i+": " + arbol.search(i) );
      }

      System.out.println();
      System.out.println( arbol );

      arbol.remove(6);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(5);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(4);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(3);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(2);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(1);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(0);
      System.out.println();
      System.out.println( arbol );
      /*
*/
  }

}//end class
