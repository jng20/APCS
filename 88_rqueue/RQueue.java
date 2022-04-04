/*
Team Pink Lemonade (Ariella Katz, Jacob Ng, Emily Ortiz, Tom, Preguac, Applesauce)
APCS pd6
HW88: BPC Kiddies Do Not Wait in Line Either
2022-04-04
time spent: 1.0 hours
*/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    //System.out.println("enqueued " + enQVal);

  }//O(1) no iteration needed


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
      sample();
      sample();
      sample();
      sample();                    //shuffle first then dequeue
      SWASHBUCKLE retVal = _front.getCargo();
      _front = _front.getNext();

      if ( _front == null ) //just moved past last node
        _end = null;      //update _end to reflect emptiness

        _size--;

      //_peek = retVal;
      return retVal;
  }//O(?)


  public SWASHBUCKLE peekFront()
  {
      return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   Pick random node from list and start new list. Remove from old list. keep going until old list is empty.
   It'd be nice if we could create a temporary queue. CAN WE MAKE A TEMPORARY QUEUE?
   ORRRRRR
   Create 2 temp link list. send all even index nodes to one temp list. send all odd index nodes to the other temp list
   **/
  public void sample ()
  {
      //RQueue<SWASHBUCKLE> temp = new RQueue<SWASHBUCKLE>();
      LLNode<SWASHBUCKLE> tmp;
      LLNode<SWASHBUCKLE> tmp2;
      int half = _size / 2;
      if(_size == 1){
        return;       //can't shuffle 1 element
      }else if(_size == 2){
        tmp = new LLNode<SWASHBUCKLE>(  _end.getCargo(), null );
        tmp2 = new LLNode<SWASHBUCKLE>(  _front.getCargo(), null );
        tmp.setNext(tmp2);
        _front = tmp;
        _end = _front.getNext();
      }else{
          // LLNode<SWASHBUCKLE> tmp = new LLNode<SWASHBUCKLE>(  _front.getCargo(), null );
          // LLNode<SWASHBUCKLE> tmp2 = new LLNode<SWASHBUCKLE>(  _front.getNext().getCargo(), null );

      }
      

  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {
    String retStr = "FRONT :: ";
    LLNode<SWASHBUCKLE> tmp = _front; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    retStr += " :: END";
    return retStr;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
