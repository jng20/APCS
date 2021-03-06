// Clyde Sinclair
// APCS pd0
// HW68 -- recursively probing for a closed cycle
// 2022-03-01
// time spent: too many hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 *  Check if you will be placing an n*n number and if the space you are placing the number is available. If true you have found the solution.
    else
 -  check if any move is possible
 -  if none are possible, set this space to 0, "go back" and try a different move/ start the new path
 - // if there are n*n 0s on the board, a solution can't be found from that point? if the first point ends up a 0 a solution does not exist?
 -

 * DISCO
 *  Theres a solved boolean
    you don't need a return statement to recall a method for recursion
 * QCC
 *  Struggled to figure out how to go backwards and how to know if solved.
    Ran into problems because the findTour method is void
    Forgot there was a solved boolean

 * Mean execution times for boards of size n*n:
 * n=5   5.462s    across __ executions
 * n=6   4m33.505s    across __ executions
 * n=7   too many s (Over 12 minutes)    across __ executions
 * n=8   way too many s    across __ executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = (int)(Math.random() * n) +2//YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //int startY = (int)(Math.random() * n) +2//YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    // for( i=0; i < n+2; i++ ) {
    //   for( j=0; j < n+2; j++ ){
    //     tf.findTour( i+2, j+2, 1 );
    //   }
    // }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n + 4;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength][_sideLength];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    //???
    for(int col = 0; col < _sideLength; col ++){
        _board[0][col] = -1;
        _board[1][col] = -1;
        _board[_sideLength-1][col] = -1;
        _board[_sideLength-2][col] = -1;
    }

    for(int row = 0; row < _sideLength; row ++){
        _board[row][0] = -1;
        _board[row][1] = -1;
        _board[row][_sideLength-1] = -1;
        _board[row][_sideLength-2] = -1;
    }

    //---------------------------------------------------------

  }//end constructor

// counter for row
// counter for collumn
// if row is first two or last two, cell = -1
// if collumn is first two or last two, cell = -1
// else, cell = 0
  /**
   * "stringify" the board
   **/


  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength; i++ ) {
      for( j=0; j < _sideLength; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/



  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved  ) System.exit(0);                                //didn't know what was happening here until Gabriel came in

    //primary base case: tour completed
    if ( moves == (_sideLength - 4)*(_sideLength - 4) &&  _board[x][y] == 0) {              //Senpai Gabriel is goated
      //???
      _board[x][y] = moves;
      System.out.println( this ); //refresh screen
      _solved = true;
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      //???
        findTour(  x+1,  y+2, moves + 1);
        findTour(  x+1,  y-2, moves + 1);
        findTour(  x+2,  y+1, moves + 1);
        findTour(  x-2,  y+1, moves + 1);
        findTour(  x-1,  y+2, moves + 1);
        findTour(  x-1,  y-2, moves + 1);
        findTour(  x+2,  y-1, moves + 1);
        findTour(  x-2,  y-1, moves + 1);


      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      //  ???
      // for(int i=0; i < _sideLength; i++ ) {
      //   for(int j=0; j < _sideLength; j++ ){
      //       if (_board[i][j]== moves - 1){
      //           _board[i][j]= 0;
      //       }
      //   }
      // }
      _board[x][y]= 0;
      //System.out.println( this ); //refresh screen
    //  return;
    }
  }//end findTour()

}//end class TourFinder
