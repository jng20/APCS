/*
Team PinkLemonade:  Jacob Ng, Andrew Piatetsky, Emily Ortiz
APCS pd6
HW103: Erica's Friends, Hugo, and The One in the Middle
2022-05-18
*/

/*
DISCO
Balancing of trees is very important

QCC
When creating the algo, it was important to start with 2 empty heaps and adding 1 element at a time to see what our algo should be.

ALGO
1. The very first element added goes into maxheap so if maxheap.size = 0 add element to max Heap
2. If value added is greater than root of max heap, add to minheap. Else add to max heap.
3. Each heap can only be at most 1 node larger than the other. so compare size of heaps. If absolute value of ( size of minheap - size of maxheap)> 1 then
remove root of bigger heap and add to other heap. Else do nothing.
4. If the heap is 1 larger than the other heap, it's root is the median. Else, it's the average of the 2 roots.

*/


public class RunMed{

  ALHeapMax lilVals;
  ALHeapMin bigVals;

  public RunMed(){
      lilVals = new ALHeapMax();
      bigVals = new ALHeapMin();
  }

  //returns median or throws NoSuchElementException()
  public double getMedian(){
    try {
      double ret = 0.0;
      if(lilVals.size() == 0 && bigVals.size() == 0){
        return ret;
      }
      else if(lilVals.size() == bigVals.size()){
        ret = (lilVals.peekMax() + bigVals.peekMin()) / 2.0;
        return ret;
      }else if(lilVals.size() > bigVals.size()){
        ret = (double) lilVals.peekMax();
        return ret;
      }else {
        ret = (double) bigVals.peekMin();
        return ret;
      }
    }catch (Exception e) {
      System.out.println("no numbers bro " + "NoSuchElementException()");
      return 0.0;
    }
  }

  //adds newVal to appropriate heap, balances if necessary
  public void add(Integer newVal){
    if( lilVals.size() == 0 ){
      lilVals.add(newVal);
    }else if( newVal.compareTo(lilVals.peekMax()) > 0 ){
      bigVals.add(newVal);
    }else if( ( newVal.compareTo(lilVals.peekMax()) < 0 )){
      lilVals.add(newVal);
    }

    if( bigVals.size() > (lilVals.size() + 1) ){
      Integer temp = bigVals.removeMin();
      lilVals.add(temp);
    }else if (lilVals.size() > (bigVals.size() + 1)){
      Integer temp = lilVals.removeMax();
      bigVals.add(temp);
    }

  }


}
