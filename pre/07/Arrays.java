import java.util.Random;

public class Arrays{

    public static double[] powArray(double[] a, int power){
        double[] outputs;
        outputs = new double[a.length];
        for(int i = 0; i < a.length; i++){
            outputs[i] = Math.pow(a[i], power);
            System.out.println(outputs[i]);
        }
        return outputs;
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
        }
        return a;
    }
/**
//confused how to take numb of counters as argument
HELP
shfhowheiogwje

**/
    public static int[] histogram(int counters){
        int[] scores = randomArray(counters);
        int[] counts = new int[20];
        for(int score : scores){
            counts[score]++;
        }
        /**
        for(int i = 0; i < counts.length; i++){
            System.out.println(counts[i]);
        }
        **/
        return counts;

    }

//can't use advanced for loop because we don't know index
    public static int indexOfMax(int[] a){
        int big;
        big = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > big) {
                big = i;
            }else{
                big = big;
            }
        }
        System.out.println(big);
        return big;
    }

//i got help from geeksforgeeks .geeksforgeeks
//didn't know how to write a loop to check multiples
    public static boolean[] sieve(int n){
        boolean[] primeornah = new boolean[n];
        for(int i = 0; i < n; i++){
            primeornah[i] = true;
        }
        for(int i = 0; i < n; i++){
            if(i == 0 || i == 1){
                primeornah[i] = false;
            }
            if(primeornah[i] == true){
                for(int p = i * i; p < n; p += i){
                    primeornah[p] = false;
                }
            }
//why doesn't System.out.println(i + primeornah[i]); concatenate.
            System.out.println(i);
            System.out.println(primeornah[i]);
        }
        return primeornah;
    }

    public static void main(String[] args){
          double[] values = new double[5];
          //int[] scores = randomArray(100);
          for(int i = 0; i < values.length; i++){
              values[i] = i;
          }
          //powArray(values, 3);
          //histogram(20);
          //indexOfMax(histogram(20));
          sieve(10);
    }
}
